package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.ComeHome;
import polybot_modelling_language.aspects.ComeHomeAspectComeHomeAspectProperties;

@SuppressWarnings("all")
public class ComeHomeAspectComeHomeAspectContext {
  public final static ComeHomeAspectComeHomeAspectContext INSTANCE = new ComeHomeAspectComeHomeAspectContext();
  
  public static ComeHomeAspectComeHomeAspectProperties getSelf(final ComeHome _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.ComeHomeAspectComeHomeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComeHome, ComeHomeAspectComeHomeAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.ComeHome, polybot_modelling_language.aspects.ComeHomeAspectComeHomeAspectProperties>();
  
  public Map<ComeHome, ComeHomeAspectComeHomeAspectProperties> getMap() {
    return map;
  }
}
