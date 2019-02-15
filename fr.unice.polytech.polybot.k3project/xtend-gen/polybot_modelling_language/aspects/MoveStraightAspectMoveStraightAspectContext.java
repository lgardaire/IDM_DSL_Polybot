package polybot_modelling_language.aspects;

import java.util.Map;
import polybot_modelling_language.MoveStraight;
import polybot_modelling_language.aspects.MoveStraightAspectMoveStraightAspectProperties;

@SuppressWarnings("all")
public class MoveStraightAspectMoveStraightAspectContext {
  public final static MoveStraightAspectMoveStraightAspectContext INSTANCE = new MoveStraightAspectMoveStraightAspectContext();
  
  public static MoveStraightAspectMoveStraightAspectProperties getSelf(final MoveStraight _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new polybot_modelling_language.aspects.MoveStraightAspectMoveStraightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MoveStraight, MoveStraightAspectMoveStraightAspectProperties> map = new java.util.WeakHashMap<polybot_modelling_language.MoveStraight, polybot_modelling_language.aspects.MoveStraightAspectMoveStraightAspectProperties>();
  
  public Map<MoveStraight, MoveStraightAspectMoveStraightAspectProperties> getMap() {
    return map;
  }
}
