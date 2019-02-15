package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.TurnRight;
import polybot_modelling_language.aspects.TurnRightAspectTurnRightAspectProperties;

@SuppressWarnings("all")
public class TurnRightAspectTurnRightAspectContext {
  public final static TurnRightAspectTurnRightAspectContext INSTANCE = new TurnRightAspectTurnRightAspectContext();
  
  public static TurnRightAspectTurnRightAspectProperties getSelf(final TurnRight _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.TurnRightAspectTurnRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnRight, TurnRightAspectTurnRightAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.TurnRight, polybot_modelling_language.aspects.TurnRightAspectTurnRightAspectProperties>();
  
  public Map<TurnRight, TurnRightAspectTurnRightAspectProperties> getMap() {
    return map;
  }
}
