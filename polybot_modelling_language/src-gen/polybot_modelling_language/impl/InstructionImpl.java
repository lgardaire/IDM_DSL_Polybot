/**
 */
package polybot_modelling_language.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import polybot_modelling_language.Instruction;
import polybot_modelling_language.Polybot_modelling_languagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polybot_modelling_language.impl.InstructionImpl#getNextInstructionTrue <em>Next Instruction True</em>}</li>
 *   <li>{@link polybot_modelling_language.impl.InstructionImpl#getNextInstructionFalse <em>Next Instruction False</em>}</li>
 *   <li>{@link polybot_modelling_language.impl.InstructionImpl#getName <em>Name</em>}</li>
 *   <li>{@link polybot_modelling_language.impl.InstructionImpl#getNextInstruction <em>Next Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * The default value of the '{@link #getNextInstructionTrue() <em>Next Instruction True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInstructionTrue()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_INSTRUCTION_TRUE_EDEFAULT = "next";

	/**
	 * The cached value of the '{@link #getNextInstructionTrue() <em>Next Instruction True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInstructionTrue()
	 * @generated
	 * @ordered
	 */
	protected String nextInstructionTrue = NEXT_INSTRUCTION_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextInstructionFalse() <em>Next Instruction False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInstructionFalse()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_INSTRUCTION_FALSE_EDEFAULT = "next";

	/**
	 * The cached value of the '{@link #getNextInstructionFalse() <em>Next Instruction False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInstructionFalse()
	 * @generated
	 * @ordered
	 */
	protected String nextInstructionFalse = NEXT_INSTRUCTION_FALSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextInstruction() <em>Next Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_INSTRUCTION_EDEFAULT = "next";

	/**
	 * The cached value of the '{@link #getNextInstruction() <em>Next Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInstruction()
	 * @generated
	 * @ordered
	 */
	protected String nextInstruction = NEXT_INSTRUCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Polybot_modelling_languagePackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextInstructionTrue() {
		return nextInstructionTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextInstructionTrue(String newNextInstructionTrue) {
		String oldNextInstructionTrue = nextInstructionTrue;
		nextInstructionTrue = newNextInstructionTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_TRUE, oldNextInstructionTrue,
					nextInstructionTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextInstructionFalse() {
		return nextInstructionFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextInstructionFalse(String newNextInstructionFalse) {
		String oldNextInstructionFalse = nextInstructionFalse;
		nextInstructionFalse = newNextInstructionFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_FALSE, oldNextInstructionFalse,
					nextInstructionFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Polybot_modelling_languagePackage.INSTRUCTION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextInstruction() {
		return nextInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextInstruction(String newNextInstruction) {
		String oldNextInstruction = nextInstruction;
		nextInstruction = newNextInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION, oldNextInstruction,
					nextInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_TRUE:
			return getNextInstructionTrue();
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_FALSE:
			return getNextInstructionFalse();
		case Polybot_modelling_languagePackage.INSTRUCTION__NAME:
			return getName();
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION:
			return getNextInstruction();
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
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_TRUE:
			setNextInstructionTrue((String) newValue);
			return;
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_FALSE:
			setNextInstructionFalse((String) newValue);
			return;
		case Polybot_modelling_languagePackage.INSTRUCTION__NAME:
			setName((String) newValue);
			return;
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION:
			setNextInstruction((String) newValue);
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
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_TRUE:
			setNextInstructionTrue(NEXT_INSTRUCTION_TRUE_EDEFAULT);
			return;
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_FALSE:
			setNextInstructionFalse(NEXT_INSTRUCTION_FALSE_EDEFAULT);
			return;
		case Polybot_modelling_languagePackage.INSTRUCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION:
			setNextInstruction(NEXT_INSTRUCTION_EDEFAULT);
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
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_TRUE:
			return NEXT_INSTRUCTION_TRUE_EDEFAULT == null ? nextInstructionTrue != null
					: !NEXT_INSTRUCTION_TRUE_EDEFAULT.equals(nextInstructionTrue);
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION_FALSE:
			return NEXT_INSTRUCTION_FALSE_EDEFAULT == null ? nextInstructionFalse != null
					: !NEXT_INSTRUCTION_FALSE_EDEFAULT.equals(nextInstructionFalse);
		case Polybot_modelling_languagePackage.INSTRUCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Polybot_modelling_languagePackage.INSTRUCTION__NEXT_INSTRUCTION:
			return NEXT_INSTRUCTION_EDEFAULT == null ? nextInstruction != null
					: !NEXT_INSTRUCTION_EDEFAULT.equals(nextInstruction);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nextInstructionTrue: ");
		result.append(nextInstructionTrue);
		result.append(", nextInstructionFalse: ");
		result.append(nextInstructionFalse);
		result.append(", name: ");
		result.append(name);
		result.append(", nextInstruction: ");
		result.append(nextInstruction);
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
