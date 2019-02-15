package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.Scene;
import polybot_modelling_language.aspects.SceneAspectSceneAspectProperties;

@SuppressWarnings("all")
public class SceneAspectSceneAspectContext {
  public final static SceneAspectSceneAspectContext INSTANCE = new SceneAspectSceneAspectContext();
  
  public static SceneAspectSceneAspectProperties getSelf(final Scene _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.SceneAspectSceneAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Scene, SceneAspectSceneAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.Scene, polybot_modelling_language.aspects.SceneAspectSceneAspectProperties>();
  
  public Map<Scene, SceneAspectSceneAspectProperties> getMap() {
    return map;
  }
}
