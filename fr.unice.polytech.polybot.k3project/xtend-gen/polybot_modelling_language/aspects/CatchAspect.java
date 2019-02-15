package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot_modelling_language.Catch;
import polybot_modelling_language.aspects.CatchAspectCatchAspectProperties;
import polybot_modelling_language.aspects.InstructionAspect;

@Aspect(className = Catch.class)
@SuppressWarnings("all")
public class CatchAspect extends InstructionAspect {
  @Step
  public static boolean execute(final Catch _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.CatchAspectCatchAspectProperties _self_ = polybot_modelling_language.aspects.CatchAspectCatchAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean execute(PolyRob)
    if (_self instanceof polybot_modelling_language.Catch){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(polybot_modelling_language.aspects.CatchAspect._privk3_execute(_self_, (polybot_modelling_language.Catch)_self,bot));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {bot}, command, "Catch", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_execute(final CatchAspectCatchAspectProperties _self_, final Catch _self, final PolyRob bot) {
    InputOutput.<String>println("Catch object");
    bot.closeGrip();
    bot.goStraight(5, 2000);
    InstructionAspect.updateDisplay(_self, bot);
    return true;
  }
}
