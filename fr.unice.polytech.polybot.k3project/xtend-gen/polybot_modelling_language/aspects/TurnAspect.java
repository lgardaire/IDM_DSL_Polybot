package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import polybot_modelling_language.Turn;
import polybot_modelling_language.aspects.InstructionAspect;
import polybot_modelling_language.aspects.TurnAspectTurnAspectProperties;

@Aspect(className = Turn.class)
@SuppressWarnings("all")
public abstract class TurnAspect extends InstructionAspect {
  @Abstract
  public static boolean execute(final Turn _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.TurnAspectTurnAspectProperties _self_ = polybot_modelling_language.aspects.TurnAspectTurnAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto polybot_modelling_language.aspects.TurnAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnRightAspect
    		if (_self instanceof polybot_modelling_language.TurnRight){
    			result = polybot_modelling_language.aspects.TurnRightAspect.execute((polybot_modelling_language.TurnRight)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.TurnAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnRightAspect
    	// BeginInjectInto polybot_modelling_language.aspects.TurnAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnLeftAspect
    		if (_self instanceof polybot_modelling_language.TurnLeft){
    			result = polybot_modelling_language.aspects.TurnLeftAspect.execute((polybot_modelling_language.TurnLeft)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.TurnAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnLeftAspect
    // #DispatchPointCut_before# boolean execute(PolyRob)
    if (_self instanceof polybot_modelling_language.Turn){
    	result = polybot_modelling_language.aspects.TurnAspect._privk3_execute(_self_, (polybot_modelling_language.Turn)_self,bot);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_execute(final TurnAspectTurnAspectProperties _self_, final Turn _self, final PolyRob bot) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
