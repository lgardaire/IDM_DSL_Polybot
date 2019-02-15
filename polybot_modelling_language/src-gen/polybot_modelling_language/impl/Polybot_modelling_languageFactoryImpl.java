/**
 */
package polybot_modelling_language.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import polybot_modelling_language.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Polybot_modelling_languageFactoryImpl extends EFactoryImpl implements Polybot_modelling_languageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Polybot_modelling_languageFactory init() {
		try {
			Polybot_modelling_languageFactory thePolybot_modelling_languageFactory = (Polybot_modelling_languageFactory) EPackage.Registry.INSTANCE
					.getEFactory(Polybot_modelling_languagePackage.eNS_URI);
			if (thePolybot_modelling_languageFactory != null) {
				return thePolybot_modelling_languageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Polybot_modelling_languageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polybot_modelling_languageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Polybot_modelling_languagePackage.SCENE:
			return createScene();
		case Polybot_modelling_languagePackage.MOVE_STRAIGHT:
			return createMoveStraight();
		case Polybot_modelling_languagePackage.TURN_RIGHT:
			return createTurnRight();
		case Polybot_modelling_languagePackage.ROBOT:
			return createRobot();
		case Polybot_modelling_languagePackage.RELEASE:
			return createRelease();
		case Polybot_modelling_languagePackage.CATCH:
			return createCatch();
		case Polybot_modelling_languagePackage.TURN_LEFT:
			return createTurnLeft();
		case Polybot_modelling_languagePackage.COME_HOME:
			return createComeHome();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene createScene() {
		SceneImpl scene = new SceneImpl();
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveStraight createMoveStraight() {
		MoveStraightImpl moveStraight = new MoveStraightImpl();
		return moveStraight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnRight createTurnRight() {
		TurnRightImpl turnRight = new TurnRightImpl();
		return turnRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catch createCatch() {
		CatchImpl catch_ = new CatchImpl();
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnLeft createTurnLeft() {
		TurnLeftImpl turnLeft = new TurnLeftImpl();
		return turnLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComeHome createComeHome() {
		ComeHomeImpl comeHome = new ComeHomeImpl();
		return comeHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polybot_modelling_languagePackage getPolybot_modelling_languagePackage() {
		return (Polybot_modelling_languagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Polybot_modelling_languagePackage getPackage() {
		return Polybot_modelling_languagePackage.eINSTANCE;
	}

} //Polybot_modelling_languageFactoryImpl
