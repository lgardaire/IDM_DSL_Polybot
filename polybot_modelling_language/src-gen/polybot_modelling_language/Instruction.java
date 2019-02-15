/**
 */
package polybot_modelling_language;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polybot_modelling_language.Instruction#getNextInstructionTrue <em>Next Instruction True</em>}</li>
 *   <li>{@link polybot_modelling_language.Instruction#getNextInstructionFalse <em>Next Instruction False</em>}</li>
 *   <li>{@link polybot_modelling_language.Instruction#getName <em>Name</em>}</li>
 *   <li>{@link polybot_modelling_language.Instruction#getNextInstruction <em>Next Instruction</em>}</li>
 * </ul>
 *
 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Instruction True</b></em>' attribute.
	 * The default value is <code>"next"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Instruction True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Instruction True</em>' attribute.
	 * @see #setNextInstructionTrue(String)
	 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getInstruction_NextInstructionTrue()
	 * @model default="next"
	 * @generated
	 */
	String getNextInstructionTrue();

	/**
	 * Sets the value of the '{@link polybot_modelling_language.Instruction#getNextInstructionTrue <em>Next Instruction True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Instruction True</em>' attribute.
	 * @see #getNextInstructionTrue()
	 * @generated
	 */
	void setNextInstructionTrue(String value);

	/**
	 * Returns the value of the '<em><b>Next Instruction False</b></em>' attribute.
	 * The default value is <code>"next"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Instruction False</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Instruction False</em>' attribute.
	 * @see #setNextInstructionFalse(String)
	 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getInstruction_NextInstructionFalse()
	 * @model default="next"
	 * @generated
	 */
	String getNextInstructionFalse();

	/**
	 * Sets the value of the '{@link polybot_modelling_language.Instruction#getNextInstructionFalse <em>Next Instruction False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Instruction False</em>' attribute.
	 * @see #getNextInstructionFalse()
	 * @generated
	 */
	void setNextInstructionFalse(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getInstruction_Name()
	 * @model default="\"\""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link polybot_modelling_language.Instruction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next Instruction</b></em>' attribute.
	 * The default value is <code>"next"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Instruction</em>' attribute.
	 * @see #setNextInstruction(String)
	 * @see polybot_modelling_language.Polybot_modelling_languagePackage#getInstruction_NextInstruction()
	 * @model default="next"
	 * @generated
	 */
	String getNextInstruction();

	/**
	 * Sets the value of the '{@link polybot_modelling_language.Instruction#getNextInstruction <em>Next Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Instruction</em>' attribute.
	 * @see #getNextInstruction()
	 * @generated
	 */
	void setNextInstruction(String value);

} // Instruction
