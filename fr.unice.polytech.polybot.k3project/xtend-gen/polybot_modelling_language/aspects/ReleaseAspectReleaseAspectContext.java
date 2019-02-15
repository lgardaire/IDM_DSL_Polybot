package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.Release;
import polybot_modelling_language.aspects.ReleaseAspectReleaseAspectProperties;

@SuppressWarnings("all")
public class ReleaseAspectReleaseAspectContext {
  public final static ReleaseAspectReleaseAspectContext INSTANCE = new ReleaseAspectReleaseAspectContext();
  
  public static ReleaseAspectReleaseAspectProperties getSelf(final Release _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.ReleaseAspectReleaseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Release, ReleaseAspectReleaseAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.Release, polybot_modelling_language.aspects.ReleaseAspectReleaseAspectProperties>();
  
  public Map<Release, ReleaseAspectReleaseAspectProperties> getMap() {
    return map;
  }
}
