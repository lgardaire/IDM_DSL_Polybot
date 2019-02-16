package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot_modelling_language.Release;
import polybot_modelling_language.aspects.InstructionAspect;
import polybot_modelling_language.aspects.ReleaseAspectReleaseAspectProperties;

@Aspect(className = Release.class)
@SuppressWarnings("all")
public class ReleaseAspect extends InstructionAspect {
  @Step
  public static boolean execute(final Release _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.ReleaseAspectReleaseAspectProperties _self_ = polybot_modelling_language.aspects.ReleaseAspectReleaseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean execute(PolyRob)
    if (_self instanceof polybot_modelling_language.Release){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(polybot_modelling_language.aspects.ReleaseAspect._privk3_execute(_self_, (polybot_modelling_language.Release)_self,bot));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {bot}, command, "Release", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_execute(final ReleaseAspectReleaseAspectProperties _self_, final Release _self, final PolyRob bot) {
    InputOutput.<String>println("Release object");
    bot.openGrip();
    bot.goStraight(1, 2000);
    InstructionAspect.updateDisplay(_self, bot);
    int _size = bot.getViewableBlobs().size();
    return (_size == 0);
  }
}
