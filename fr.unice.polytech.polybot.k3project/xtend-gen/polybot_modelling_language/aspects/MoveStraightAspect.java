package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import fr.unice.polytech.deantoni.vrep.polybot.utils.Position2D;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot_modelling_language.MoveStraight;
import polybot_modelling_language.aspects.InstructionAspect;
import polybot_modelling_language.aspects.MoveStraightAspectMoveStraightAspectProperties;

@Aspect(className = MoveStraight.class)
@SuppressWarnings("all")
public class MoveStraightAspect extends InstructionAspect {
  @Step
  public static boolean execute(final MoveStraight _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.MoveStraightAspectMoveStraightAspectProperties _self_ = polybot_modelling_language.aspects.MoveStraightAspectMoveStraightAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean execute(PolyRob)
    if (_self instanceof polybot_modelling_language.MoveStraight){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(polybot_modelling_language.aspects.MoveStraightAspect._privk3_execute(_self_, (polybot_modelling_language.MoveStraight)_self,bot));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {bot}, command, "MoveStraight", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_execute(final MoveStraightAspectMoveStraightAspectProperties _self_, final MoveStraight _self, final PolyRob bot) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Move straight");
      InstructionAspect.updateDisplay(_self, bot);
      Position2D pos = bot.getPosition();
      int _distance = _self.getDistance();
      int _multiply = (_distance * 12);
      bot.goStraight(15, _multiply);
      InstructionAspect.updateDisplay(_self, bot);
      while ((InstructionAspect.calculateDistance(_self, pos.x, pos.y, bot.getPosition().x, bot.getPosition().y) < _self.getDistance())) {
        bot.goStraight(5, 100);
      }
      double _calculateDistance = InstructionAspect.calculateDistance(_self, pos.x, pos.y, bot.getPosition().x, bot.getPosition().y);
      String _plus = ("Travelled distance : " + Integer.valueOf(((int) _calculateDistance)));
      InputOutput.<String>println(_plus);
      _xblockexpression = InstructionAspect.hasFoundAColorBomb(_self, bot);
    }
    return _xblockexpression;
  }
}
