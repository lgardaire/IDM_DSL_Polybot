/**
 */
package polybot_modelling_language;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see polybot_modelling_language.Polybot_modelling_languageFactory
 * @model kind="package"
 * @generated
 */
public interface Polybot_modelling_languagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "polybot_modelling_language";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/polybot_modelling_language";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "polybot_modelling_language";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Polybot_modelling_languagePackage eINSTANCE = polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.SceneImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 0;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__ROBOT = 0;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.InstructionImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 4;

	/**
	 * The feature id for the '<em><b>Next Instruction True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NEXT_INSTRUCTION_TRUE = 0;

	/**
	 * The feature id for the '<em><b>Next Instruction False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NEXT_INSTRUCTION_FALSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NEXT_INSTRUCTION = 3;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.MoveStraightImpl <em>Move Straight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.MoveStraightImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getMoveStraight()
	 * @generated
	 */
	int MOVE_STRAIGHT = 1;

	/**
	 * The feature id for the '<em><b>Next Instruction True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT__NEXT_INSTRUCTION_TRUE = INSTRUCTION__NEXT_INSTRUCTION_TRUE;

	/**
	 * The feature id for the '<em><b>Next Instruction False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT__NEXT_INSTRUCTION_FALSE = INSTRUCTION__NEXT_INSTRUCTION_FALSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT__NEXT_INSTRUCTION = INSTRUCTION__NEXT_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT__DISTANCE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Straight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Straight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_STRAIGHT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.TurnImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 8;

	/**
	 * The feature id for the '<em><b>Next Instruction True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__NEXT_INSTRUCTION_TRUE = INSTRUCTION__NEXT_INSTRUCTION_TRUE;

	/**
	 * The feature id for the '<em><b>Next Instruction False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__NEXT_INSTRUCTION_FALSE = INSTRUCTION__NEXT_INSTRUCTION_FALSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__NEXT_INSTRUCTION = INSTRUCTION__NEXT_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ANGLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.TurnRightImpl <em>Turn Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.TurnRightImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getTurnRight()
	 * @generated
	 */
	int TURN_RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Next Instruction True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__NEXT_INSTRUCTION_TRUE = TURN__NEXT_INSTRUCTION_TRUE;

	/**
	 * The feature id for the '<em><b>Next Instruction False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__NEXT_INSTRUCTION_FALSE = TURN__NEXT_INSTRUCTION_FALSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__NAME = TURN__NAME;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__NEXT_INSTRUCTION = TURN__NEXT_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__ANGLE = TURN__ANGLE;

	/**
	 * The number of structural features of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_FEATURE_COUNT = TURN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_OPERATION_COUNT = TURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.RobotImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 3;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__INSTRUCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__DEBUG = 1;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.ReleaseImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 5;

	/**
	 * The feature id for the '<em><b>Next Instruction True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NEXT_INSTRUCTION_TRUE = INSTRUCTION__NEXT_INSTRUCTION_TRUE;

	/**
	 * The feature id for the '<em><b>Next Instruction False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NEXT_INSTRUCTION_FALSE = INSTRUCTION__NEXT_INSTRUCTION_FALSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NEXT_INSTRUCTION = INSTRUCTION__NEXT_INSTRUCTION;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.CatchImpl <em>Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.CatchImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getCatch()
	 * @generated
	 */
	int CATCH = 6;

	/**
	 * The feature id for the '<em><b>Next Instruction True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__NEXT_INSTRUCTION_TRUE = INSTRUCTION__NEXT_INSTRUCTION_TRUE;

	/**
	 * The feature id for the '<em><b>Next Instruction False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__NEXT_INSTRUCTION_FALSE = INSTRUCTION__NEXT_INSTRUCTION_FALSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__NEXT_INSTRUCTION = INSTRUCTION__NEXT_INSTRUCTION;

	/**
	 * The number of structural features of the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.TurnLeftImpl <em>Turn Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.TurnLeftImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getTurnLeft()
	 * @generated
	 */
	int TURN_LEFT = 7;

	/**
	 * The feature id for the '<em><b>Next Instruction True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__NEXT_INSTRUCTION_TRUE = TURN__NEXT_INSTRUCTION_TRUE;

	/**
	 * The feature id for the '<em><b>Next Instruction False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__NEXT_INSTRUCTION_FALSE = TURN__NEXT_INSTRUCTION_FALSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__NAME = TURN__NAME;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__NEXT_INSTRUCTION = TURN__NEXT_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__ANGLE = TURN__ANGLE;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = TURN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_OPERATION_COUNT = TURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link polybot_modelling_language.impl.ComeHomeImpl <em>Come Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polybot_modelling_language.impl.ComeHomeImpl
	 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getComeHome()
	 * @generated
	 */
	int COME_HOME = 9;

	/**
	 * The feature id for the '<em><b>Next Instruction True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COME_HOME__NEXT_INSTRUCTION_TRUE = INSTRUCTION__NEXT_INSTRUCTION_TRUE;

	/**
	 * The feature id for the '<em><b>Next Instruction False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COME_HOME__NEXT_INSTRUCTION_FALSE = INSTRUCTION__NEXT_INSTRUCTION_FALSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COME_HOME__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COME_HOME__NEXT_INSTRUCTION = INSTRUCTION__NEXT_INSTRUCTION;

	/**
	 * The number of structural features of the '<em>Come Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COME_HOME_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Come Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COME_HOME_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see polybot_modelling_language.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the containment reference '{@link polybot_modelling_language.Scene#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Robot</em>'.
	 * @see polybot_modelling_language.Scene#getRobot()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Robot();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.MoveStraight <em>Move Straight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Straight</em>'.
	 * @see polybot_modelling_language.MoveStraight
	 * @generated
	 */
	EClass getMoveStraight();

	/**
	 * Returns the meta object for the attribute '{@link polybot_modelling_language.MoveStraight#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see polybot_modelling_language.MoveStraight#getDistance()
	 * @see #getMoveStraight()
	 * @generated
	 */
	EAttribute getMoveStraight_Distance();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Right</em>'.
	 * @see polybot_modelling_language.TurnRight
	 * @generated
	 */
	EClass getTurnRight();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see polybot_modelling_language.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link polybot_modelling_language.Robot#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see polybot_modelling_language.Robot#getInstructions()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link polybot_modelling_language.Robot#isDebug <em>Debug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug</em>'.
	 * @see polybot_modelling_language.Robot#isDebug()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Debug();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see polybot_modelling_language.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link polybot_modelling_language.Instruction#getNextInstructionTrue <em>Next Instruction True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Instruction True</em>'.
	 * @see polybot_modelling_language.Instruction#getNextInstructionTrue()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_NextInstructionTrue();

	/**
	 * Returns the meta object for the attribute '{@link polybot_modelling_language.Instruction#getNextInstructionFalse <em>Next Instruction False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Instruction False</em>'.
	 * @see polybot_modelling_language.Instruction#getNextInstructionFalse()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_NextInstructionFalse();

	/**
	 * Returns the meta object for the attribute '{@link polybot_modelling_language.Instruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see polybot_modelling_language.Instruction#getName()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Name();

	/**
	 * Returns the meta object for the attribute '{@link polybot_modelling_language.Instruction#getNextInstruction <em>Next Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Instruction</em>'.
	 * @see polybot_modelling_language.Instruction#getNextInstruction()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_NextInstruction();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see polybot_modelling_language.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.Catch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch</em>'.
	 * @see polybot_modelling_language.Catch
	 * @generated
	 */
	EClass getCatch();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left</em>'.
	 * @see polybot_modelling_language.TurnLeft
	 * @generated
	 */
	EClass getTurnLeft();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see polybot_modelling_language.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the attribute '{@link polybot_modelling_language.Turn#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see polybot_modelling_language.Turn#getAngle()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Angle();

	/**
	 * Returns the meta object for class '{@link polybot_modelling_language.ComeHome <em>Come Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Come Home</em>'.
	 * @see polybot_modelling_language.ComeHome
	 * @generated
	 */
	EClass getComeHome();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Polybot_modelling_languageFactory getPolybot_modelling_languageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.SceneImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__ROBOT = eINSTANCE.getScene_Robot();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.MoveStraightImpl <em>Move Straight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.MoveStraightImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getMoveStraight()
		 * @generated
		 */
		EClass MOVE_STRAIGHT = eINSTANCE.getMoveStraight();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_STRAIGHT__DISTANCE = eINSTANCE.getMoveStraight_Distance();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.TurnRightImpl <em>Turn Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.TurnRightImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getTurnRight()
		 * @generated
		 */
		EClass TURN_RIGHT = eINSTANCE.getTurnRight();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.RobotImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__INSTRUCTIONS = eINSTANCE.getRobot_Instructions();

		/**
		 * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__DEBUG = eINSTANCE.getRobot_Debug();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.InstructionImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Next Instruction True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__NEXT_INSTRUCTION_TRUE = eINSTANCE.getInstruction_NextInstructionTrue();

		/**
		 * The meta object literal for the '<em><b>Next Instruction False</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__NEXT_INSTRUCTION_FALSE = eINSTANCE.getInstruction_NextInstructionFalse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__NAME = eINSTANCE.getInstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Next Instruction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__NEXT_INSTRUCTION = eINSTANCE.getInstruction_NextInstruction();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.ReleaseImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.CatchImpl <em>Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.CatchImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getCatch()
		 * @generated
		 */
		EClass CATCH = eINSTANCE.getCatch();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.TurnLeftImpl <em>Turn Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.TurnLeftImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getTurnLeft()
		 * @generated
		 */
		EClass TURN_LEFT = eINSTANCE.getTurnLeft();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.TurnImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__ANGLE = eINSTANCE.getTurn_Angle();

		/**
		 * The meta object literal for the '{@link polybot_modelling_language.impl.ComeHomeImpl <em>Come Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polybot_modelling_language.impl.ComeHomeImpl
		 * @see polybot_modelling_language.impl.Polybot_modelling_languagePackageImpl#getComeHome()
		 * @generated
		 */
		EClass COME_HOME = eINSTANCE.getComeHome();

	}

} //Polybot_modelling_languagePackage
