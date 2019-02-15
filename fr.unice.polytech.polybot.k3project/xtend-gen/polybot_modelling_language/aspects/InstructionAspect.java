package polybot_modelling_language.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.deantoni.vrep.polybot.robot.PolyRob;
import fr.unice.polytech.deantoni.vrep.polybot.utils.Blob;
import fr.unice.polytech.deantoni.vrep.polybot.utils.Position2D;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot_modelling_language.Instruction;
import polybot_modelling_language.aspects.InstructionAspectInstructionAspectProperties;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public abstract class InstructionAspect {
  @Abstract
  public static boolean execute(final Instruction _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.InstructionAspectInstructionAspectProperties _self_ = polybot_modelling_language.aspects.InstructionAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnLeftAspect
    		if (_self instanceof polybot_modelling_language.TurnLeft){
    			result = polybot_modelling_language.aspects.TurnLeftAspect.execute((polybot_modelling_language.TurnLeft)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnLeftAspect
    	// BeginInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.ReleaseAspect
    		if (_self instanceof polybot_modelling_language.Release){
    			result = polybot_modelling_language.aspects.ReleaseAspect.execute((polybot_modelling_language.Release)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.ReleaseAspect
    	// BeginInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnAspect
    		if (_self instanceof polybot_modelling_language.Turn){
    			result = polybot_modelling_language.aspects.TurnAspect.execute((polybot_modelling_language.Turn)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnAspect
    	// BeginInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.MoveStraightAspect
    		if (_self instanceof polybot_modelling_language.MoveStraight){
    			result = polybot_modelling_language.aspects.MoveStraightAspect.execute((polybot_modelling_language.MoveStraight)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.MoveStraightAspect
    	// BeginInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnRightAspect
    		if (_self instanceof polybot_modelling_language.TurnRight){
    			result = polybot_modelling_language.aspects.TurnRightAspect.execute((polybot_modelling_language.TurnRight)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.TurnRightAspect
    	// BeginInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.ComeHomeAspect
    		if (_self instanceof polybot_modelling_language.ComeHome){
    			result = polybot_modelling_language.aspects.ComeHomeAspect.execute((polybot_modelling_language.ComeHome)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.ComeHomeAspect
    	// BeginInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.CatchAspect
    		if (_self instanceof polybot_modelling_language.Catch){
    			result = polybot_modelling_language.aspects.CatchAspect.execute((polybot_modelling_language.Catch)_self,bot);
    		} else
    		// EndInjectInto polybot_modelling_language.aspects.InstructionAspect#boolean execute(PolyRob) from polybot_modelling_language.aspects.CatchAspect
    // #DispatchPointCut_before# boolean execute(PolyRob)
    if (_self instanceof polybot_modelling_language.Instruction){
    	result = polybot_modelling_language.aspects.InstructionAspect._privk3_execute(_self_, (polybot_modelling_language.Instruction)_self,bot);
    };
    return (boolean)result;
  }
  
  public static double calculateDistance(final Instruction _self, final int x1, final int y1, final int x2, final int y2) {
    final polybot_modelling_language.aspects.InstructionAspectInstructionAspectProperties _self_ = polybot_modelling_language.aspects.InstructionAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# double calculateDistance(int,int,int,int)
    if (_self instanceof polybot_modelling_language.Instruction){
    	result = polybot_modelling_language.aspects.InstructionAspect._privk3_calculateDistance(_self_, (polybot_modelling_language.Instruction)_self,x1,y1,x2,y2);
    };
    return (double)result;
  }
  
  public static void updateDisplay(final Instruction _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.InstructionAspectInstructionAspectProperties _self_ = polybot_modelling_language.aspects.InstructionAspectInstructionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void updateDisplay(PolyRob)
    if (_self instanceof polybot_modelling_language.Instruction){
    	polybot_modelling_language.aspects.InstructionAspect._privk3_updateDisplay(_self_, (polybot_modelling_language.Instruction)_self,bot);
    };
  }
  
  public static boolean hasFoundAColorBomb(final Instruction _self, final PolyRob bot) {
    final polybot_modelling_language.aspects.InstructionAspectInstructionAspectProperties _self_ = polybot_modelling_language.aspects.InstructionAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean hasFoundAColorBomb(PolyRob)
    if (_self instanceof polybot_modelling_language.Instruction){
    	result = polybot_modelling_language.aspects.InstructionAspect._privk3_hasFoundAColorBomb(_self_, (polybot_modelling_language.Instruction)_self,bot);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_execute(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final PolyRob bot) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static double _privk3_calculateDistance(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final int x1, final int y1, final int x2, final int y2) {
    double _pow = Math.pow((x2 - x1), 2);
    double _pow_1 = Math.pow((y2 - y1), 2);
    double _plus = (_pow + _pow_1);
    return Math.sqrt(_plus);
  }
  
  protected static void _privk3_updateDisplay(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final PolyRob bot) {
    if (bot.debugMode) {
      bot.clearDisplay();
      bot.display(_self.getName());
    }
  }
  
  protected static boolean _privk3_hasFoundAColorBomb(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final PolyRob bot) {
    boolean _xblockexpression = false;
    {
      InstructionAspect.updateDisplay(_self, bot);
      boolean hasFound = bot.hasDetectedAnObject();
      if ((!hasFound)) {
        return false;
      }
      int objDist = bot.getDetectedObjectDistance();
      InputOutput.<Integer>println(Integer.valueOf(objDist));
      if ((objDist <= 20)) {
        bot.openGrip();
      }
      double _cos = Math.cos(bot.getOrientation());
      double _multiply = (_cos * 200);
      double _plus = (bot.getPosition().x + _multiply);
      long _round = Math.round(_plus);
      double _sin = Math.sin(bot.getOrientation());
      double _multiply_1 = (_sin * 200);
      double _plus_1 = (bot.getPosition().y + _multiply_1);
      long _round_1 = Math.round(_plus_1);
      Position2D objectCoordinate = new Position2D(
        ((int) _round), 
        ((int) _round_1));
      InputOutput.<String>println(((("Object pos : " + Integer.valueOf(bot.getPosition().x)) + " ") + Integer.valueOf(bot.getPosition().y)));
      ArrayList<Blob> _viewableBlobs = bot.getViewableBlobs();
      for (final Blob b : _viewableBlobs) {
        {
          InputOutput.<String>println(((("Blob pos : " + Integer.valueOf(b.positionX)) + " ") + Integer.valueOf(b.positionY)));
          if (((Math.abs((b.positionX - bot.getPosition().x)) <= 100) && (Math.abs((b.positionY - bot.getPosition().y)) <= 100))) {
            InputOutput.<String>println("Paint bomb");
            bot.closeGrip();
            bot.goStraight(13, 3000);
            bot.closeMode = true;
            InstructionAspect.updateDisplay(_self, bot);
            return true;
          }
        }
      }
      if ((objDist > 100)) {
        return false;
      }
      InputOutput.<String>println("Wall");
      bot.turnRight(8, 1000);
      _xblockexpression = InstructionAspect.hasFoundAColorBomb(_self, bot);
    }
    return _xblockexpression;
  }
}
