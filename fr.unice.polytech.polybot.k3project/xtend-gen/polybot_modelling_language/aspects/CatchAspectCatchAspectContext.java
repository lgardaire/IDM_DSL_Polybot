package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.Catch;
import polybot_modelling_language.aspects.CatchAspectCatchAspectProperties;

@SuppressWarnings("all")
public class CatchAspectCatchAspectContext {
  public final static CatchAspectCatchAspectContext INSTANCE = new CatchAspectCatchAspectContext();
  
  public static CatchAspectCatchAspectProperties getSelf(final Catch _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.CatchAspectCatchAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Catch, CatchAspectCatchAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.Catch, polybot_modelling_language.aspects.CatchAspectCatchAspectProperties>();
  
  public Map<Catch, CatchAspectCatchAspectProperties> getMap() {
    return map;
  }
}
