package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot_modelling_language.Scene;
import polybot_modelling_language.aspects.RobotAspect;
import polybot_modelling_language.aspects.SceneAspectSceneAspectProperties;

@Aspect(className = Scene.class)
@SuppressWarnings("all")
public class SceneAspect {
  @Main
  public static void main(final Scene _self) {
    final polybot_modelling_language.aspects.SceneAspectSceneAspectProperties _self_ = polybot_modelling_language.aspects.SceneAspectSceneAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof polybot_modelling_language.Scene){
    	polybot_modelling_language.aspects.SceneAspect._privk3_main(_self_, (polybot_modelling_language.Scene)_self);
    };
  }
  
  protected static void _privk3_main(final SceneAspectSceneAspectProperties _self_, final Scene _self) {
    PolyRob bot = new PolyRob("127.0.0.1", 19997);
    bot.start();
    InputOutput.<String>println("Starting scene and bot");
    RobotAspect.executeInstructions(_self.getRobot(), bot);
    bot.stopSimulation();
  }
}
