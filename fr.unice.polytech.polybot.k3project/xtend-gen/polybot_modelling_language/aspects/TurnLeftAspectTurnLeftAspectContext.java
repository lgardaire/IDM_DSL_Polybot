package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.TurnLeft;
import polybot_modelling_language.aspects.TurnLeftAspectTurnLeftAspectProperties;

@SuppressWarnings("all")
public class TurnLeftAspectTurnLeftAspectContext {
  public final static TurnLeftAspectTurnLeftAspectContext INSTANCE = new TurnLeftAspectTurnLeftAspectContext();
  
  public static TurnLeftAspectTurnLeftAspectProperties getSelf(final TurnLeft _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.TurnLeftAspectTurnLeftAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnLeft, TurnLeftAspectTurnLeftAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.TurnLeft, polybot_modelling_language.aspects.TurnLeftAspectTurnLeftAspectProperties>();
  
  public Map<TurnLeft, TurnLeftAspectTurnLeftAspectProperties> getMap() {
    return map;
  }
}
