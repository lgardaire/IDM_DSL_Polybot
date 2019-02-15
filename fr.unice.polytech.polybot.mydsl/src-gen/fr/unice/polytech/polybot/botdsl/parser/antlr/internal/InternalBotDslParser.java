package fr.unice.polytech.polybot.botdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.polybot.botdsl.services.BotDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBotDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'label'", "'->'", "'|'", "';'", "'Robot'", "'debug'", "'forward'", "'turnRight'", "'turnLeft'", "'catch'", "'release'", "'comeHome'", "'-'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBotDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBotDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBotDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBotDsl.g"; }



     	private BotDslGrammarAccess grammarAccess;

        public InternalBotDslParser(TokenStream input, BotDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Scene";
       	}

       	@Override
       	protected BotDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScene"
    // InternalBotDsl.g:64:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // InternalBotDsl.g:64:46: (iv_ruleScene= ruleScene EOF )
            // InternalBotDsl.g:65:2: iv_ruleScene= ruleScene EOF
            {
             newCompositeNode(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScene=ruleScene();

            state._fsp--;

             current =iv_ruleScene; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalBotDsl.g:71:1: ruleScene returns [EObject current=null] : ( (lv_robot_0_0= ruleRobot ) ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        EObject lv_robot_0_0 = null;



        	enterRule();

        try {
            // InternalBotDsl.g:77:2: ( ( (lv_robot_0_0= ruleRobot ) ) )
            // InternalBotDsl.g:78:2: ( (lv_robot_0_0= ruleRobot ) )
            {
            // InternalBotDsl.g:78:2: ( (lv_robot_0_0= ruleRobot ) )
            // InternalBotDsl.g:79:3: (lv_robot_0_0= ruleRobot )
            {
            // InternalBotDsl.g:79:3: (lv_robot_0_0= ruleRobot )
            // InternalBotDsl.g:80:4: lv_robot_0_0= ruleRobot
            {

            				newCompositeNode(grammarAccess.getSceneAccess().getRobotRobotParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_robot_0_0=ruleRobot();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSceneRule());
            				}
            				set(
            					current,
            					"robot",
            					lv_robot_0_0,
            					"fr.unice.polytech.polybot.botdsl.BotDsl.Robot");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleInstruction"
    // InternalBotDsl.g:100:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalBotDsl.g:100:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalBotDsl.g:101:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalBotDsl.g:107:1: ruleInstruction returns [EObject current=null] : ( (this_MoveStraight_0= ruleMoveStraight | this_TurnRight_1= ruleTurnRight | this_TurnLeft_2= ruleTurnLeft | this_Release_3= ruleRelease | this_Catch_4= ruleCatch | this_ComeHome_5= ruleComeHome ) (otherlv_6= 'label' ( (lv_name_7_0= ruleEString ) ) )? ( (otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) ) )? | (otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) ) )? ) otherlv_14= ';' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_MoveStraight_0 = null;

        EObject this_TurnRight_1 = null;

        EObject this_TurnLeft_2 = null;

        EObject this_Release_3 = null;

        EObject this_Catch_4 = null;

        EObject this_ComeHome_5 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_nextInstructionTrue_9_0 = null;

        AntlrDatatypeRuleToken lv_nextInstructionFalse_11_0 = null;

        AntlrDatatypeRuleToken lv_nextInstruction_13_0 = null;



        	enterRule();

        try {
            // InternalBotDsl.g:113:2: ( ( (this_MoveStraight_0= ruleMoveStraight | this_TurnRight_1= ruleTurnRight | this_TurnLeft_2= ruleTurnLeft | this_Release_3= ruleRelease | this_Catch_4= ruleCatch | this_ComeHome_5= ruleComeHome ) (otherlv_6= 'label' ( (lv_name_7_0= ruleEString ) ) )? ( (otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) ) )? | (otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) ) )? ) otherlv_14= ';' ) )
            // InternalBotDsl.g:114:2: ( (this_MoveStraight_0= ruleMoveStraight | this_TurnRight_1= ruleTurnRight | this_TurnLeft_2= ruleTurnLeft | this_Release_3= ruleRelease | this_Catch_4= ruleCatch | this_ComeHome_5= ruleComeHome ) (otherlv_6= 'label' ( (lv_name_7_0= ruleEString ) ) )? ( (otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) ) )? | (otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) ) )? ) otherlv_14= ';' )
            {
            // InternalBotDsl.g:114:2: ( (this_MoveStraight_0= ruleMoveStraight | this_TurnRight_1= ruleTurnRight | this_TurnLeft_2= ruleTurnLeft | this_Release_3= ruleRelease | this_Catch_4= ruleCatch | this_ComeHome_5= ruleComeHome ) (otherlv_6= 'label' ( (lv_name_7_0= ruleEString ) ) )? ( (otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) ) )? | (otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) ) )? ) otherlv_14= ';' )
            // InternalBotDsl.g:115:3: (this_MoveStraight_0= ruleMoveStraight | this_TurnRight_1= ruleTurnRight | this_TurnLeft_2= ruleTurnLeft | this_Release_3= ruleRelease | this_Catch_4= ruleCatch | this_ComeHome_5= ruleComeHome ) (otherlv_6= 'label' ( (lv_name_7_0= ruleEString ) ) )? ( (otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) ) )? | (otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) ) )? ) otherlv_14= ';'
            {
            // InternalBotDsl.g:115:3: (this_MoveStraight_0= ruleMoveStraight | this_TurnRight_1= ruleTurnRight | this_TurnLeft_2= ruleTurnLeft | this_Release_3= ruleRelease | this_Catch_4= ruleCatch | this_ComeHome_5= ruleComeHome )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            case 22:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBotDsl.g:116:4: this_MoveStraight_0= ruleMoveStraight
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getMoveStraightParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_MoveStraight_0=ruleMoveStraight();

                    state._fsp--;


                    				current = this_MoveStraight_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalBotDsl.g:125:4: this_TurnRight_1= ruleTurnRight
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getTurnRightParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_3);
                    this_TurnRight_1=ruleTurnRight();

                    state._fsp--;


                    				current = this_TurnRight_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalBotDsl.g:134:4: this_TurnLeft_2= ruleTurnLeft
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getTurnLeftParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_3);
                    this_TurnLeft_2=ruleTurnLeft();

                    state._fsp--;


                    				current = this_TurnLeft_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalBotDsl.g:143:4: this_Release_3= ruleRelease
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_3);
                    this_Release_3=ruleRelease();

                    state._fsp--;


                    				current = this_Release_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalBotDsl.g:152:4: this_Catch_4= ruleCatch
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getCatchParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_3);
                    this_Catch_4=ruleCatch();

                    state._fsp--;


                    				current = this_Catch_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalBotDsl.g:161:4: this_ComeHome_5= ruleComeHome
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getComeHomeParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_3);
                    this_ComeHome_5=ruleComeHome();

                    state._fsp--;


                    				current = this_ComeHome_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBotDsl.g:170:3: (otherlv_6= 'label' ( (lv_name_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBotDsl.g:171:4: otherlv_6= 'label' ( (lv_name_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getInstructionAccess().getLabelKeyword_1_0());
                    			
                    // InternalBotDsl.g:175:4: ( (lv_name_7_0= ruleEString ) )
                    // InternalBotDsl.g:176:5: (lv_name_7_0= ruleEString )
                    {
                    // InternalBotDsl.g:176:5: (lv_name_7_0= ruleEString )
                    // InternalBotDsl.g:177:6: lv_name_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_name_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstructionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"fr.unice.polytech.polybot.botdsl.BotDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBotDsl.g:195:3: ( (otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) ) )? | (otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) ) )? )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==14) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==13) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==RULE_ID) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==13) ) {
                        alt5=1;
                    }
                    else if ( (LA5_4==14) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==14) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBotDsl.g:196:4: (otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) ) )?
                    {
                    // InternalBotDsl.g:196:4: (otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==12) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalBotDsl.g:197:5: otherlv_8= '->' ( (lv_nextInstructionTrue_9_0= ruleEString ) ) otherlv_10= '|' ( (lv_nextInstructionFalse_11_0= ruleEString ) )
                            {
                            otherlv_8=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_8, grammarAccess.getInstructionAccess().getHyphenMinusGreaterThanSignKeyword_2_0_0());
                            				
                            // InternalBotDsl.g:201:5: ( (lv_nextInstructionTrue_9_0= ruleEString ) )
                            // InternalBotDsl.g:202:6: (lv_nextInstructionTrue_9_0= ruleEString )
                            {
                            // InternalBotDsl.g:202:6: (lv_nextInstructionTrue_9_0= ruleEString )
                            // InternalBotDsl.g:203:7: lv_nextInstructionTrue_9_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getInstructionAccess().getNextInstructionTrueEStringParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_nextInstructionTrue_9_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInstructionRule());
                            							}
                            							set(
                            								current,
                            								"nextInstructionTrue",
                            								lv_nextInstructionTrue_9_0,
                            								"fr.unice.polytech.polybot.botdsl.BotDsl.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_10=(Token)match(input,13,FOLLOW_4); 

                            					newLeafNode(otherlv_10, grammarAccess.getInstructionAccess().getVerticalLineKeyword_2_0_2());
                            				
                            // InternalBotDsl.g:224:5: ( (lv_nextInstructionFalse_11_0= ruleEString ) )
                            // InternalBotDsl.g:225:6: (lv_nextInstructionFalse_11_0= ruleEString )
                            {
                            // InternalBotDsl.g:225:6: (lv_nextInstructionFalse_11_0= ruleEString )
                            // InternalBotDsl.g:226:7: lv_nextInstructionFalse_11_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getInstructionAccess().getNextInstructionFalseEStringParserRuleCall_2_0_3_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_nextInstructionFalse_11_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInstructionRule());
                            							}
                            							set(
                            								current,
                            								"nextInstructionFalse",
                            								lv_nextInstructionFalse_11_0,
                            								"fr.unice.polytech.polybot.botdsl.BotDsl.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalBotDsl.g:245:4: (otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) ) )?
                    {
                    // InternalBotDsl.g:245:4: (otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==12) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalBotDsl.g:246:5: otherlv_12= '->' ( (lv_nextInstruction_13_0= ruleEString ) )
                            {
                            otherlv_12=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_12, grammarAccess.getInstructionAccess().getHyphenMinusGreaterThanSignKeyword_2_1_0());
                            				
                            // InternalBotDsl.g:250:5: ( (lv_nextInstruction_13_0= ruleEString ) )
                            // InternalBotDsl.g:251:6: (lv_nextInstruction_13_0= ruleEString )
                            {
                            // InternalBotDsl.g:251:6: (lv_nextInstruction_13_0= ruleEString )
                            // InternalBotDsl.g:252:7: lv_nextInstruction_13_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getInstructionAccess().getNextInstructionEStringParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_nextInstruction_13_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInstructionRule());
                            							}
                            							set(
                            								current,
                            								"nextInstruction",
                            								lv_nextInstruction_13_0,
                            								"fr.unice.polytech.polybot.botdsl.BotDsl.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getInstructionAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleRobot"
    // InternalBotDsl.g:279:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalBotDsl.g:279:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalBotDsl.g:280:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalBotDsl.g:286:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' ( (lv_debug_2_0= 'debug' ) )? ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_debug_2_0=null;
        EObject lv_instructions_3_0 = null;

        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalBotDsl.g:292:2: ( ( () otherlv_1= 'Robot' ( (lv_debug_2_0= 'debug' ) )? ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? ) )
            // InternalBotDsl.g:293:2: ( () otherlv_1= 'Robot' ( (lv_debug_2_0= 'debug' ) )? ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? )
            {
            // InternalBotDsl.g:293:2: ( () otherlv_1= 'Robot' ( (lv_debug_2_0= 'debug' ) )? ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )? )
            // InternalBotDsl.g:294:3: () otherlv_1= 'Robot' ( (lv_debug_2_0= 'debug' ) )? ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )?
            {
            // InternalBotDsl.g:294:3: ()
            // InternalBotDsl.g:295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            // InternalBotDsl.g:305:3: ( (lv_debug_2_0= 'debug' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBotDsl.g:306:4: (lv_debug_2_0= 'debug' )
                    {
                    // InternalBotDsl.g:306:4: (lv_debug_2_0= 'debug' )
                    // InternalBotDsl.g:307:5: lv_debug_2_0= 'debug'
                    {
                    lv_debug_2_0=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(lv_debug_2_0, grammarAccess.getRobotAccess().getDebugDebugKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRobotRule());
                    					}
                    					setWithLastConsumed(current, "debug", true, "debug");
                    				

                    }


                    }
                    break;

            }

            // InternalBotDsl.g:319:3: ( ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=17 && LA8_0<=22)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBotDsl.g:320:4: ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )*
                    {
                    // InternalBotDsl.g:320:4: ( (lv_instructions_3_0= ruleInstruction ) )
                    // InternalBotDsl.g:321:5: (lv_instructions_3_0= ruleInstruction )
                    {
                    // InternalBotDsl.g:321:5: (lv_instructions_3_0= ruleInstruction )
                    // InternalBotDsl.g:322:6: lv_instructions_3_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_instructions_3_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"instructions",
                    							lv_instructions_3_0,
                    							"fr.unice.polytech.polybot.botdsl.BotDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBotDsl.g:339:4: ( (lv_instructions_4_0= ruleInstruction ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=17 && LA7_0<=22)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBotDsl.g:340:5: (lv_instructions_4_0= ruleInstruction )
                    	    {
                    	    // InternalBotDsl.g:340:5: (lv_instructions_4_0= ruleInstruction )
                    	    // InternalBotDsl.g:341:6: lv_instructions_4_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getInstructionsInstructionParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_instructions_4_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instructions",
                    	    							lv_instructions_4_0,
                    	    							"fr.unice.polytech.polybot.botdsl.BotDsl.Instruction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMoveStraight"
    // InternalBotDsl.g:363:1: entryRuleMoveStraight returns [EObject current=null] : iv_ruleMoveStraight= ruleMoveStraight EOF ;
    public final EObject entryRuleMoveStraight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStraight = null;


        try {
            // InternalBotDsl.g:363:53: (iv_ruleMoveStraight= ruleMoveStraight EOF )
            // InternalBotDsl.g:364:2: iv_ruleMoveStraight= ruleMoveStraight EOF
            {
             newCompositeNode(grammarAccess.getMoveStraightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveStraight=ruleMoveStraight();

            state._fsp--;

             current =iv_ruleMoveStraight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveStraight"


    // $ANTLR start "ruleMoveStraight"
    // InternalBotDsl.g:370:1: ruleMoveStraight returns [EObject current=null] : (otherlv_0= 'forward' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveStraight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBotDsl.g:376:2: ( (otherlv_0= 'forward' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBotDsl.g:377:2: (otherlv_0= 'forward' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBotDsl.g:377:2: (otherlv_0= 'forward' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBotDsl.g:378:3: otherlv_0= 'forward' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveStraightAccess().getForwardKeyword_0());
            		
            // InternalBotDsl.g:382:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBotDsl.g:383:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBotDsl.g:383:4: (lv_distance_1_0= ruleEInt )
            // InternalBotDsl.g:384:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveStraightAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveStraightRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"fr.unice.polytech.polybot.botdsl.BotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveStraight"


    // $ANTLR start "entryRuleTurnRight"
    // InternalBotDsl.g:405:1: entryRuleTurnRight returns [EObject current=null] : iv_ruleTurnRight= ruleTurnRight EOF ;
    public final EObject entryRuleTurnRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnRight = null;


        try {
            // InternalBotDsl.g:405:50: (iv_ruleTurnRight= ruleTurnRight EOF )
            // InternalBotDsl.g:406:2: iv_ruleTurnRight= ruleTurnRight EOF
            {
             newCompositeNode(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnRight=ruleTurnRight();

            state._fsp--;

             current =iv_ruleTurnRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalBotDsl.g:412:1: ruleTurnRight returns [EObject current=null] : (otherlv_0= 'turnRight' ( (lv_angle_1_0= ruleEInt ) ) ) ;
    public final EObject ruleTurnRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_angle_1_0 = null;



        	enterRule();

        try {
            // InternalBotDsl.g:418:2: ( (otherlv_0= 'turnRight' ( (lv_angle_1_0= ruleEInt ) ) ) )
            // InternalBotDsl.g:419:2: (otherlv_0= 'turnRight' ( (lv_angle_1_0= ruleEInt ) ) )
            {
            // InternalBotDsl.g:419:2: (otherlv_0= 'turnRight' ( (lv_angle_1_0= ruleEInt ) ) )
            // InternalBotDsl.g:420:3: otherlv_0= 'turnRight' ( (lv_angle_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnRightAccess().getTurnRightKeyword_0());
            		
            // InternalBotDsl.g:424:3: ( (lv_angle_1_0= ruleEInt ) )
            // InternalBotDsl.g:425:4: (lv_angle_1_0= ruleEInt )
            {
            // InternalBotDsl.g:425:4: (lv_angle_1_0= ruleEInt )
            // InternalBotDsl.g:426:5: lv_angle_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTurnRightAccess().getAngleEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_angle_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnRightRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_1_0,
            						"fr.unice.polytech.polybot.botdsl.BotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "entryRuleTurnLeft"
    // InternalBotDsl.g:447:1: entryRuleTurnLeft returns [EObject current=null] : iv_ruleTurnLeft= ruleTurnLeft EOF ;
    public final EObject entryRuleTurnLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnLeft = null;


        try {
            // InternalBotDsl.g:447:49: (iv_ruleTurnLeft= ruleTurnLeft EOF )
            // InternalBotDsl.g:448:2: iv_ruleTurnLeft= ruleTurnLeft EOF
            {
             newCompositeNode(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnLeft=ruleTurnLeft();

            state._fsp--;

             current =iv_ruleTurnLeft; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalBotDsl.g:454:1: ruleTurnLeft returns [EObject current=null] : (otherlv_0= 'turnLeft' ( (lv_angle_1_0= ruleEInt ) ) ) ;
    public final EObject ruleTurnLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_angle_1_0 = null;



        	enterRule();

        try {
            // InternalBotDsl.g:460:2: ( (otherlv_0= 'turnLeft' ( (lv_angle_1_0= ruleEInt ) ) ) )
            // InternalBotDsl.g:461:2: (otherlv_0= 'turnLeft' ( (lv_angle_1_0= ruleEInt ) ) )
            {
            // InternalBotDsl.g:461:2: (otherlv_0= 'turnLeft' ( (lv_angle_1_0= ruleEInt ) ) )
            // InternalBotDsl.g:462:3: otherlv_0= 'turnLeft' ( (lv_angle_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0());
            		
            // InternalBotDsl.g:466:3: ( (lv_angle_1_0= ruleEInt ) )
            // InternalBotDsl.g:467:4: (lv_angle_1_0= ruleEInt )
            {
            // InternalBotDsl.g:467:4: (lv_angle_1_0= ruleEInt )
            // InternalBotDsl.g:468:5: lv_angle_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTurnLeftAccess().getAngleEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_angle_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnLeftRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_1_0,
            						"fr.unice.polytech.polybot.botdsl.BotDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleCatch"
    // InternalBotDsl.g:489:1: entryRuleCatch returns [EObject current=null] : iv_ruleCatch= ruleCatch EOF ;
    public final EObject entryRuleCatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatch = null;


        try {
            // InternalBotDsl.g:489:46: (iv_ruleCatch= ruleCatch EOF )
            // InternalBotDsl.g:490:2: iv_ruleCatch= ruleCatch EOF
            {
             newCompositeNode(grammarAccess.getCatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCatch=ruleCatch();

            state._fsp--;

             current =iv_ruleCatch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCatch"


    // $ANTLR start "ruleCatch"
    // InternalBotDsl.g:496:1: ruleCatch returns [EObject current=null] : ( () otherlv_1= 'catch' ) ;
    public final EObject ruleCatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBotDsl.g:502:2: ( ( () otherlv_1= 'catch' ) )
            // InternalBotDsl.g:503:2: ( () otherlv_1= 'catch' )
            {
            // InternalBotDsl.g:503:2: ( () otherlv_1= 'catch' )
            // InternalBotDsl.g:504:3: () otherlv_1= 'catch'
            {
            // InternalBotDsl.g:504:3: ()
            // InternalBotDsl.g:505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCatchAccess().getCatchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCatchAccess().getCatchKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCatch"


    // $ANTLR start "entryRuleRelease"
    // InternalBotDsl.g:519:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // InternalBotDsl.g:519:48: (iv_ruleRelease= ruleRelease EOF )
            // InternalBotDsl.g:520:2: iv_ruleRelease= ruleRelease EOF
            {
             newCompositeNode(grammarAccess.getReleaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelease=ruleRelease();

            state._fsp--;

             current =iv_ruleRelease; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // InternalBotDsl.g:526:1: ruleRelease returns [EObject current=null] : ( () otherlv_1= 'release' ) ;
    public final EObject ruleRelease() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBotDsl.g:532:2: ( ( () otherlv_1= 'release' ) )
            // InternalBotDsl.g:533:2: ( () otherlv_1= 'release' )
            {
            // InternalBotDsl.g:533:2: ( () otherlv_1= 'release' )
            // InternalBotDsl.g:534:3: () otherlv_1= 'release'
            {
            // InternalBotDsl.g:534:3: ()
            // InternalBotDsl.g:535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReleaseAccess().getReleaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReleaseAccess().getReleaseKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleComeHome"
    // InternalBotDsl.g:549:1: entryRuleComeHome returns [EObject current=null] : iv_ruleComeHome= ruleComeHome EOF ;
    public final EObject entryRuleComeHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComeHome = null;


        try {
            // InternalBotDsl.g:549:49: (iv_ruleComeHome= ruleComeHome EOF )
            // InternalBotDsl.g:550:2: iv_ruleComeHome= ruleComeHome EOF
            {
             newCompositeNode(grammarAccess.getComeHomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComeHome=ruleComeHome();

            state._fsp--;

             current =iv_ruleComeHome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComeHome"


    // $ANTLR start "ruleComeHome"
    // InternalBotDsl.g:556:1: ruleComeHome returns [EObject current=null] : ( () otherlv_1= 'comeHome' ) ;
    public final EObject ruleComeHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBotDsl.g:562:2: ( ( () otherlv_1= 'comeHome' ) )
            // InternalBotDsl.g:563:2: ( () otherlv_1= 'comeHome' )
            {
            // InternalBotDsl.g:563:2: ( () otherlv_1= 'comeHome' )
            // InternalBotDsl.g:564:3: () otherlv_1= 'comeHome'
            {
            // InternalBotDsl.g:564:3: ()
            // InternalBotDsl.g:565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComeHomeAccess().getComeHomeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getComeHomeAccess().getComeHomeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComeHome"


    // $ANTLR start "entryRuleEInt"
    // InternalBotDsl.g:579:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBotDsl.g:579:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBotDsl.g:580:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBotDsl.g:586:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBotDsl.g:592:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBotDsl.g:593:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBotDsl.g:593:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBotDsl.g:594:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBotDsl.g:594:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBotDsl.g:595:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalBotDsl.g:612:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBotDsl.g:612:47: (iv_ruleEString= ruleEString EOF )
            // InternalBotDsl.g:613:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBotDsl.g:619:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBotDsl.g:625:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBotDsl.g:626:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBotDsl.g:626:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBotDsl.g:627:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBotDsl.g:635:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007F0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});

}