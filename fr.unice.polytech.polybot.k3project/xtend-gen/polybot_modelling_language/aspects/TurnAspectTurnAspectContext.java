package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.Turn;
import polybot_modelling_language.aspects.TurnAspectTurnAspectProperties;

@SuppressWarnings("all")
public class TurnAspectTurnAspectContext {
  public final static TurnAspectTurnAspectContext INSTANCE = new TurnAspectTurnAspectContext();
  
  public static TurnAspectTurnAspectProperties getSelf(final Turn _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.TurnAspectTurnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Turn, TurnAspectTurnAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.Turn, polybot_modelling_language.aspects.TurnAspectTurnAspectProperties>();
  
  public Map<Turn, TurnAspectTurnAspectProperties> getMap() {
    return map;
  }
}
