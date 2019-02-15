package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.Robot;
import polybot_modelling_language.aspects.RobotAspectRobotAspectProperties;

@SuppressWarnings("all")
public class RobotAspectRobotAspectContext {
  public final static RobotAspectRobotAspectContext INSTANCE = new RobotAspectRobotAspectContext();
  
  public static RobotAspectRobotAspectProperties getSelf(final Robot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.RobotAspectRobotAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Robot, RobotAspectRobotAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.Robot, polybot_modelling_language.aspects.RobotAspectRobotAspectProperties>();
  
  public Map<Robot, RobotAspectRobotAspectProperties> getMap() {
    return map;
  }
}
