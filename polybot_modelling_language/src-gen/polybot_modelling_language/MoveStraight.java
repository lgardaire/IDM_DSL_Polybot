/**
 */
package polybot_modelling_language;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Straight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polybot_modelling_language.MoveStraight#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getMoveStraight()
 * @model
 * @generated
 */
public interface MoveStraight extends Instruction {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getMoveStraight_Distance()
	 * @model required="true"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link polybot_modelling_language.MoveStraight#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

} // MoveStraight
