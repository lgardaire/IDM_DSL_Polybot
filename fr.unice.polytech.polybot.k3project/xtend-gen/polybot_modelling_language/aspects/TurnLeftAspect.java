package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot_modelling_language.TurnLeft;
import polybot_modelling_language.aspects.InstructionAspect;
import polybot_modelling_language.aspects.TurnAspect;
import polybot_modelling_language.aspects.TurnLeftAspectTurnLeftAspectProperties;

@Aspect(className = TurnLeft.class)
@SuppressWarnings("all")
public class TurnLeftAspect extends TurnAspect {
  @Step
  public static boolean execute(final TurnLeft _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.TurnLeftAspectTurnLeftAspectProperties _self_ = polybot_modelling_language.aspects.TurnLeftAspectTurnLeftAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean execute(PolyRob)
    if (_self instanceof polybot_modelling_language.TurnLeft){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(polybot_modelling_language.aspects.TurnLeftAspect._privk3_execute(_self_, (polybot_modelling_language.TurnLeft)_self,bot));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {bot}, command, "TurnLeft", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_execute(final TurnLeftAspectTurnLeftAspectProperties _self_, final TurnLeft _self, final PolyRob bot) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Turn left");
      InstructionAspect.updateDisplay(_self, bot);
      float _orientation = bot.getOrientation();
      int _angle = _self.getAngle();
      double _multiply = (_angle * Math.PI);
      double _divide = (_multiply / 180);
      double orientationToReach = (_orientation + _divide);
      if ((orientationToReach > (2 * Math.PI))) {
        orientationToReach = (orientationToReach - (2 * Math.PI));
      }
      while ((Math.abs((bot.getOrientation() - orientationToReach)) > 0.05)) {
        bot.turnLeft(5, 50);
      }
      _xblockexpression = InstructionAspect.hasFoundAColorBomb(_self, bot);
    }
    return _xblockexpression;
  }
}
