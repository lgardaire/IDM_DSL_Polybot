package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot_modelling_language.ComeHome;
import polybot_modelling_language.aspects.ComeHomeAspectComeHomeAspectProperties;
import polybot_modelling_language.aspects.InstructionAspect;

@Aspect(className = ComeHome.class)
@SuppressWarnings("all")
public class ComeHomeAspect extends InstructionAspect {
  @Step
  public static boolean execute(final ComeHome _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.ComeHomeAspectComeHomeAspectProperties _self_ = polybot_modelling_language.aspects.ComeHomeAspectComeHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean execute(PolyRob)
    if (_self instanceof polybot_modelling_language.ComeHome){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(polybot_modelling_language.aspects.ComeHomeAspect._privk3_execute(_self_, (polybot_modelling_language.ComeHome)_self,bot));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {bot}, command, "ComeHome", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_execute(final ComeHomeAspectComeHomeAspectProperties _self_, final ComeHome _self, final PolyRob bot) {
    InputOutput.<String>println("Come home");
    boolean robotIsOnLeftSide = true;
    double orientationToReach = 0;
    if ((bot.getPosition().y > bot.homeCoordinates.y)) {
      orientationToReach = ((3 * Math.PI) / 2);
    } else {
      orientationToReach = (Math.PI / 2);
      robotIsOnLeftSide = false;
    }
    while ((Math.abs((bot.getOrientation() - orientationToReach)) > 0.05)) {
      bot.turnRight(5, 50);
    }
    InstructionAspect.updateDisplay(_self, bot);
    int _abs = Math.abs((bot.getPosition().y - bot.homeCoordinates.y));
    int _multiply = (_abs * 12);
    bot.goStraight(15, _multiply);
    InstructionAspect.updateDisplay(_self, bot);
    while ((Math.abs((bot.getPosition().y - bot.homeCoordinates.y)) > 5)) {
      {
        bot.goStraight(5, 50);
        InputOutput.<Integer>println(Integer.valueOf(Math.abs((bot.getPosition().y - bot.homeCoordinates.y))));
      }
    }
    InstructionAspect.updateDisplay(_self, bot);
    if (robotIsOnLeftSide) {
      float _orientation = bot.getOrientation();
      double _minus = (_orientation - (Math.PI / 2));
      orientationToReach = _minus;
      while ((Math.abs((bot.getOrientation() - orientationToReach)) > 0.05)) {
        bot.turnRight(5, 50);
      }
    } else {
      float _orientation_1 = bot.getOrientation();
      double _plus = (_orientation_1 + (Math.PI / 2));
      orientationToReach = _plus;
      while ((Math.abs((bot.getOrientation() - orientationToReach)) > 0.05)) {
        bot.turnLeft(5, 50);
      }
    }
    InstructionAspect.updateDisplay(_self, bot);
    int _abs_1 = Math.abs((bot.getPosition().x - bot.homeCoordinates.x));
    int _multiply_1 = (_abs_1 * 12);
    bot.goStraight(15, _multiply_1);
    InstructionAspect.updateDisplay(_self, bot);
    while ((Math.abs((bot.getPosition().x - bot.homeCoordinates.x)) > 5)) {
      {
        bot.goStraight(5, 50);
        InputOutput.<Integer>println(Integer.valueOf(Math.abs((bot.getPosition().x - bot.homeCoordinates.x))));
      }
    }
    InstructionAspect.updateDisplay(_self, bot);
    bot.openGrip();
    bot.closeMode = false;
    bot.goStraight(1, 2000);
    InstructionAspect.updateDisplay(_self, bot);
    orientationToReach = 0;
    if ((bot.getPosition().y < bot.homeCoordinates.y)) {
      while ((Math.abs((bot.getOrientation() - orientationToReach)) > 0.1)) {
        bot.turnRight(5, 50);
      }
    } else {
      while ((Math.abs((bot.getOrientation() - orientationToReach)) > 0.1)) {
        bot.turnLeft(5, 50);
      }
    }
    InstructionAspect.updateDisplay(_self, bot);
    return (!(bot.getPosition().x > (-20)));
  }
}
