/**
 */
package polybot_modelling_language;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polybot_modelling_language.Scene#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends EObject {
	/**
	 * Returns the value of the '<em><b>Robot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' containment reference.
	 * @see #setRobot(Robot)
	 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getScene_Robot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Robot getRobot();

	/**
	 * Sets the value of the '{@link polybot_modelling_language.Scene#getRobot <em>Robot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot</em>' containment reference.
	 * @see #getRobot()
	 * @generated
	 */
	void setRobot(Robot value);

} // Scene
