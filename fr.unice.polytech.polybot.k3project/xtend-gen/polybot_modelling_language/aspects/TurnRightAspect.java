package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot_modelling_language.TurnRight;
import polybot_modelling_language.aspects.InstructionAspect;
import polybot_modelling_language.aspects.TurnAspect;
import polybot_modelling_language.aspects.TurnRightAspectTurnRightAspectProperties;

@Aspect(className = TurnRight.class)
@SuppressWarnings("all")
public class TurnRightAspect extends TurnAspect {
  @Step
  public static boolean execute(final TurnRight _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.TurnRightAspectTurnRightAspectProperties _self_ = polybot_modelling_language.aspects.TurnRightAspectTurnRightAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean execute(PolyRob)
    if (_self instanceof polybot_modelling_language.TurnRight){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(polybot_modelling_language.aspects.TurnRightAspect._privk3_execute(_self_, (polybot_modelling_language.TurnRight)_self,bot));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {bot}, command, "TurnRight", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_execute(final TurnRightAspectTurnRightAspectProperties _self_, final TurnRight _self, final PolyRob bot) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Turn right");
      InstructionAspect.updateDisplay(_self, bot);
      float _orientation = bot.getOrientation();
      int _angle = _self.getAngle();
      double _multiply = (_angle * Math.PI);
      double _divide = (_multiply / 180);
      double orientationToReach = (_orientation - _divide);
      if ((orientationToReach < 0)) {
        orientationToReach = ((2 * Math.PI) + orientationToReach);
      }
      while ((Math.abs((bot.getOrientation() - orientationToReach)) > 0.05)) {
        bot.turnRight(5, 50);
      }
      _xblockexpression = InstructionAspect.hasFoundAColorBomb(_self, bot);
    }
    return _xblockexpression;
  }
}
