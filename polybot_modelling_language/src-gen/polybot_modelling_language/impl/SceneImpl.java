/**
 */
package polybot_modelling_language.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import polybot_modelling_language.Polybot_modelling_languagePackage;
import polybot_modelling_language.Robot;
import polybot_modelling_language.Scene;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polybot_modelling_language.impl.SceneImpl#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SceneImpl extends MinimalEObjectImpl.Container implements Scene {
	/**
	 * The cached value of the '{@link #getRobot() <em>Robot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobot()
	 * @generated
	 * @ordered
	 */
	protected Robot robot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Polybot_modelling_languagePackage.Literals.SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot getRobot() {
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRobot(Robot newRobot, NotificationChain msgs) {
		Robot oldRobot = robot;
		robot = newRobot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Polybot_modelling_languagePackage.SCENE__ROBOT, oldRobot, newRobot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobot(Robot newRobot) {
		if (newRobot != robot) {
			NotificationChain msgs = null;
			if (robot != null)
				msgs = ((InternalEObject) robot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Polybot_modelling_languagePackage.SCENE__ROBOT, null, msgs);
			if (newRobot != null)
				msgs = ((InternalEObject) newRobot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Polybot_modelling_languagePackage.SCENE__ROBOT, null, msgs);
			msgs = basicSetRobot(newRobot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Polybot_modelling_languagePackage.SCENE__ROBOT,
					newRobot, newRobot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Polybot_modelling_languagePackage.SCENE__ROBOT:
			return basicSetRobot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Polybot_modelling_languagePackage.SCENE__ROBOT:
			return getRobot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Polybot_modelling_languagePackage.SCENE__ROBOT:
			setRobot((Robot) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Polybot_modelling_languagePackage.SCENE__ROBOT:
			setRobot((Robot) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Polybot_modelling_languagePackage.SCENE__ROBOT:
			return robot != null;
		}
		return super.eIsSet(featureID);
	}

} //SceneImpl
