package polybot_modelling_language.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import fr.unice.polytech.deantoni.vrep.polybot.utils.Position2D;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import polybot_modelling_language.Instruction;
import polybot_modelling_language.Robot;
import polybot_modelling_language.aspects.InstructionAspect;
import polybot_modelling_language.aspects.RobotAspectRobotAspectProperties;

@Aspect(className = Robot.class)
@SuppressWarnings("all")
public class RobotAspect {
  @Step
  public static void executeInstructions(final Robot _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.RobotAspectRobotAspectProperties _self_ = polybot_modelling_language.aspects.RobotAspectRobotAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void executeInstructions(PolyRob)
    if (_self instanceof polybot_modelling_language.Robot){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			polybot_modelling_language.aspects.RobotAspect._privk3_executeInstructions(_self_, (polybot_modelling_language.Robot)_self,bot);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {bot}, command, "Robot", "executeInstructions");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static void updatePosition(final Robot _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.RobotAspectRobotAspectProperties _self_ = polybot_modelling_language.aspects.RobotAspectRobotAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void updatePosition(PolyRob)
    if (_self instanceof polybot_modelling_language.Robot){
    	polybot_modelling_language.aspects.RobotAspect._privk3_updatePosition(_self_, (polybot_modelling_language.Robot)_self,bot);
    };
  }
  
  private static Position2D currentPosition(final Robot _self) {
    final polybot_modelling_language.aspects.RobotAspectRobotAspectProperties _self_ = polybot_modelling_language.aspects.RobotAspectRobotAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Position2D currentPosition()
    if (_self instanceof polybot_modelling_language.Robot){
    	result = polybot_modelling_language.aspects.RobotAspect._privk3_currentPosition(_self_, (polybot_modelling_language.Robot)_self);
    };
    return (fr.unice.polytech.deantoni.vrep.polybot.utils.Position2D)result;
  }
  
  private static void currentPosition(final Robot _self, final Position2D currentPosition) {
    final polybot_modelling_language.aspects.RobotAspectRobotAspectProperties _self_ = polybot_modelling_language.aspects.RobotAspectRobotAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentPosition(Position2D)
    if (_self instanceof polybot_modelling_language.Robot){
    	polybot_modelling_language.aspects.RobotAspect._privk3_currentPosition(_self_, (polybot_modelling_language.Robot)_self,currentPosition);
    };
  }
  
  protected static void _privk3_executeInstructions(final RobotAspectRobotAspectProperties _self_, final Robot _self, final PolyRob bot) {
    bot.debugMode = _self.isDebug();
    bot.debugInfos();
    bot.openGrip();
    int compteur = 0;
    String nextInstructionLabel = null;
    while ((nextInstructionLabel != "")) {
      {
        boolean result = InstructionAspect.execute(_self.getInstructions().get(compteur), bot);
        String _nextInstruction = _self.getInstructions().get(compteur).getNextInstruction();
        boolean _tripleNotEquals = (_nextInstruction != "next");
        if (_tripleNotEquals) {
          nextInstructionLabel = _self.getInstructions().get(compteur).getNextInstruction();
        } else {
          if (result) {
            nextInstructionLabel = _self.getInstructions().get(compteur).getNextInstructionTrue();
          } else {
            nextInstructionLabel = _self.getInstructions().get(compteur).getNextInstructionFalse();
          }
        }
        final String next = nextInstructionLabel;
        InputOutput.<String>println(next);
        boolean _equals = Objects.equal(nextInstructionLabel, "next");
        if (_equals) {
          int _size = _self.getInstructions().size();
          int _minus = (_size - 1);
          boolean _equals_1 = (compteur == _minus);
          if (_equals_1) {
            nextInstructionLabel = "";
          } else {
            compteur = (compteur + 1);
          }
        } else {
          boolean _equals_2 = Objects.equal(nextInstructionLabel, "previous");
          if (_equals_2) {
            if ((compteur == 0)) {
              nextInstructionLabel = "";
            } else {
              compteur = (compteur - 1);
            }
          } else {
            final Function1<Instruction, Boolean> _function = new Function1<Instruction, Boolean>() {
              @Override
              public Boolean apply(final Instruction it) {
                String _name = it.getName();
                return Boolean.valueOf(Objects.equal(_name, next));
              }
            };
            Instruction tmp = IterableExtensions.<Instruction>findFirst(_self.getInstructions(), _function);
            int i = _self.getInstructions().indexOf(tmp);
            if ((i != (-1))) {
              compteur = i;
            } else {
              nextInstructionLabel = "";
            }
          }
        }
        RobotAspect.updatePosition(_self, bot);
      }
    }
  }
  
  protected static void _privk3_updatePosition(final RobotAspectRobotAspectProperties _self_, final Robot _self, final PolyRob bot) {
    RobotAspect.currentPosition(_self, bot.getPosition());
  }
  
  protected static Position2D _privk3_currentPosition(final RobotAspectRobotAspectProperties _self_, final Robot _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentPosition") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.unice.polytech.deantoni.vrep.polybot.utils.Position2D) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentPosition;
  }
  
  protected static void _privk3_currentPosition(final RobotAspectRobotAspectProperties _self_, final Robot _self, final Position2D currentPosition) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentPosition")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentPosition);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentPosition = currentPosition;
    }
  }
}
