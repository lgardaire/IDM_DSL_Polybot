package polybot_modelling_language.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import polybot_modelling_language.Scene
import polybot_modelling_language.MoveStraight
import polybot_modelling_language.TurnRight
import polybot_modelling_language.Robot
import polybot_modelling_language.Instruction

import static extension polybot_modelling_language.aspects.SceneAspect.*
import static extension polybot_modelling_language.aspects.MoveStraightAspect.*
import static extension polybot_modelling_language.aspects.TurnRightAspect.*
import static extension polybot_modelling_language.aspects.RobotAspect.*
import static extension polybot_modelling_language.aspects.InstructionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob
import fr.unice.polytech.deantoni.vrep.polybot.utils.Position2D
import fr.inria.diverse.k3.al.annotationprocessor.Step
import polybot_modelling_language.GoToObject
import fr.unice.polytech.deantoni.vrep.polybot.utils.Blob
import polybot_modelling_language.Catch
import polybot_modelling_language.Release
import polybot_modelling_language.TurnLeft
import polybot_modelling_language.Turn
import polybot_modelling_language.ComeHome

@Aspect(className=Scene)
class SceneAspect {
	@Main
	def void main(){
		var bot = new PolyRob("127.0.0.1", 19997);
		bot.start();
		println("Starting scene and bot");
		_self.robot.executeInstructions(bot);
		bot.stopSimulation();
	}
}

@Aspect(className=MoveStraight)
class MoveStraightAspect extends InstructionAspect {
	@Step
	def boolean execute(PolyRob bot){
		println("Move straight")
		_self.updateDisplay(bot);
		var pos = bot.position
		bot.goStraight(15, _self.distance*12);
		_self.updateDisplay(bot);
		while(calculateDistance(_self, pos.x, pos.y, bot.position.x, bot.position.y) < _self.distance) {
			bot.goStraight(5, 100);
		}
		println("Travelled distance : "+calculateDistance(_self, pos.x, pos.y, bot.position.x, bot.position.y) as int)
		hasFoundAColorBomb(_self, bot);
	}
}

@Aspect(className=Turn)
abstract class TurnAspect extends InstructionAspect {
	def boolean execute(PolyRob bot);
}

@Aspect(className=TurnRight)
class TurnRightAspect extends TurnAspect {
	@Step
	def boolean execute(PolyRob bot){
		println("Turn right")
		_self.updateDisplay(bot);
		var double orientationToReach = bot.orientation - (_self.angle*Math.PI/180)
		if(orientationToReach < 0) orientationToReach = 2*Math.PI + orientationToReach
		while(Math.abs(bot.orientation-orientationToReach) > 0.05){
			bot.turnRight(5, 50)
		}
		hasFoundAColorBomb(_self, bot);
	}
}

@Aspect(className=TurnLeft)
class TurnLeftAspect extends TurnAspect {
	@Step
	def boolean execute(PolyRob bot){
		println("Turn left")
		_self.updateDisplay(bot);
		var double orientationToReach = bot.orientation + (_self.angle*Math.PI/180)
		if(orientationToReach > 2*Math.PI) orientationToReach = orientationToReach - 2*Math.PI
		while(Math.abs(bot.orientation-orientationToReach) > 0.05){
			bot.turnLeft(5, 50)
		}
		hasFoundAColorBomb(_self, bot);
	}
}

@Aspect(className=Robot)
class RobotAspect {
	var Position2D currentPosition = new Position2D(0, 0);
	var boolean closeMode = false;
	
	@Step
	def void executeInstructions(PolyRob bot){
		bot.debugMode = _self.debug;
		bot.debugInfos();
		bot.openGrip();
		var int compteur = 0;
		var String nextInstructionLabel;
		while(nextInstructionLabel !== "") {
			var boolean result = _self.instructions.get(compteur).execute(bot);
			if(_self.instructions.get(compteur).nextInstruction !== "next"){
				nextInstructionLabel = _self.instructions.get(compteur).nextInstruction;
			}else if(result){
				nextInstructionLabel = _self.instructions.get(compteur).nextInstructionTrue;
			} else {
				nextInstructionLabel = _self.instructions.get(compteur).nextInstructionFalse;
			}
			val String next = nextInstructionLabel;
			println(next)
			if(nextInstructionLabel == "next"){
				if(compteur == _self.instructions.size - 1){
					nextInstructionLabel = "";
				} else {
					compteur = compteur + 1;
				}
			} else if(nextInstructionLabel == "previous"){
				if(compteur == 0){
					nextInstructionLabel = "";
				} else {
					compteur = compteur - 1;
				}
			} else {
				var Instruction tmp = _self.instructions.findFirst[name == next];
				var int i = _self.instructions.indexOf(tmp)
				if(i !== -1){
					compteur = i;
				} else {
					nextInstructionLabel = "";
				}
			}
			_self.updatePosition(bot);
		}
	}
	
	def void updatePosition(PolyRob bot){
		_self.currentPosition = bot.getPosition();
	}
}

@Aspect(className=Instruction)
abstract class InstructionAspect {
	def boolean execute(PolyRob bot);
	
	def double calculateDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
	
	def void updateDisplay(PolyRob bot){
		if(bot.debugMode){
			bot.clearDisplay();
			bot.display(_self.name);
		}
	}
	
	def boolean hasFoundAColorBomb(PolyRob bot) {
		_self.updateDisplay(bot);
		var boolean hasFound = bot.hasDetectedAnObject();
		if(!hasFound) return false;
		var int objDist = bot.detectedObjectDistance;
		println(objDist)
		if(objDist <= 20) {
			bot.openGrip();
		}
		var Position2D objectCoordinate = new Position2D(
				Math.round(bot.position.x+Math.cos(bot.orientation)*200) as int,
				Math.round(bot.position.y+Math.sin(bot.orientation)*200) as int);	
		println("Object pos : "+bot.position.x+ " "+bot.position.y)
		for(Blob b: bot.viewableBlobs) {
			println("Blob pos : "+b.positionX+" "+b.positionY)
			if ((Math.abs(b.positionX - bot.position.x) <= 100) && (Math.abs(b.positionY - bot.position.y) <= 100)) {
				println("Paint bomb");
				bot.closeGrip()
				bot.goStraight(13,3000);
				bot.closeMode = true;
				_self.updateDisplay(bot);
				return true;
			}
		}
		if(objDist > 100) return false;
		println("Wall");
		bot.turnRight(8, 1000);
		hasFoundAColorBomb(_self, bot);
	}
}

@Aspect(className=ComeHome)
class ComeHomeAspect extends InstructionAspect {
	@Step
	def boolean execute(PolyRob bot){
		println("Come home")
		var boolean robotIsOnLeftSide = true;
		var double orientationToReach;
		if(bot.position.y > bot.homeCoordinates.y) {
			orientationToReach = 3 * Math.PI / 2
		} else {
			orientationToReach = Math.PI / 2
			robotIsOnLeftSide = false;
		}
		while(Math.abs(bot.orientation-orientationToReach) > 0.05){
			bot.turnRight(5, 50)
		}
		_self.updateDisplay(bot);
		bot.goStraight(15, Math.abs(bot.position.y - bot.homeCoordinates.y)*12);
		_self.updateDisplay(bot);
		while(Math.abs(bot.position.y - bot.homeCoordinates.y) > 5) {
			bot.goStraight(5, 50);
			println(Math.abs(bot.position.y - bot.homeCoordinates.y))
		}
		_self.updateDisplay(bot);
		if(robotIsOnLeftSide){
			orientationToReach = bot.orientation - Math.PI/2
			while(Math.abs(bot.orientation-orientationToReach) > 0.05){
				bot.turnRight(5, 50)
			}
		} else {
			orientationToReach = bot.orientation + Math.PI/2
			while(Math.abs(bot.orientation-orientationToReach) > 0.05){
				bot.turnLeft(5, 50)
			}
		}
		_self.updateDisplay(bot);
		bot.goStraight(15, Math.abs(bot.position.x - bot.homeCoordinates.x)*12);
		_self.updateDisplay(bot);
		while(Math.abs(bot.position.x - bot.homeCoordinates.x) > 5) {
			bot.goStraight(5, 50);
			println(Math.abs(bot.position.x - bot.homeCoordinates.x))
		}
		_self.updateDisplay(bot);
		bot.openGrip()
		bot.closeMode = false;
		bot.goStraight(1,2000);
		_self.updateDisplay(bot);
		orientationToReach = 0
		if(bot.position.y < bot.homeCoordinates.y){
			while(Math.abs(bot.orientation-orientationToReach) > 0.1){
				bot.turnRight(5, 50)
			}
		} else {
			while(Math.abs(bot.orientation-orientationToReach) > 0.1){
				bot.turnLeft(5, 50)
			}
		}
		_self.updateDisplay(bot);
		return !(bot.position.x > -20);
	}
}

@Aspect(className=Catch)
class CatchAspect extends InstructionAspect {
	@Step
	def boolean execute(PolyRob bot){
		println("Catch object")
		bot.closeGrip()
		bot.goStraight(5,2000)
		_self.updateDisplay(bot);
		return true;
	}
}

@Aspect(className=Release)
class ReleaseAspect extends InstructionAspect {
	@Step
	def boolean execute(PolyRob bot){
		println("Release object")
		bot.openGrip()
		bot.closeMode = false;
		bot.goStraight(1,2000)
		_self.updateDisplay(bot);
		return true;
	}
}



