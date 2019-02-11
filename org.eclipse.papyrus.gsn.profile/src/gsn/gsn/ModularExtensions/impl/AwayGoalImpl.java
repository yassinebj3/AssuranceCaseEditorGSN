/**
 */
package gsn.gsn.ModularExtensions.impl;

import gsn.gsn.ModularExtensions.AwayGoal;
import gsn.gsn.ModularExtensions.ModularExtensionsPackage;

import gsn.gsn.impl.CoreElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Away Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gsn.gsn.ModularExtensions.impl.AwayGoalImpl#getModuleIdentifierReference <em>Module Identifier Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwayGoalImpl extends CoreElementImpl implements AwayGoal {
	/**
	 * The default value of the '{@link #getModuleIdentifierReference() <em>Module Identifier Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleIdentifierReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_IDENTIFIER_REFERENCE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getModuleIdentifierReference() <em>Module Identifier Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleIdentifierReference()
	 * @generated
	 * @ordered
	 */
	protected String moduleIdentifierReference = MODULE_IDENTIFIER_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwayGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularExtensionsPackage.Literals.AWAY_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleIdentifierReference() {
		return moduleIdentifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleIdentifierReference(String newModuleIdentifierReference) {
		String oldModuleIdentifierReference = moduleIdentifierReference;
		moduleIdentifierReference = newModuleIdentifierReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularExtensionsPackage.AWAY_GOAL__MODULE_IDENTIFIER_REFERENCE, oldModuleIdentifierReference, moduleIdentifierReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModularExtensionsPackage.AWAY_GOAL__MODULE_IDENTIFIER_REFERENCE:
				return getModuleIdentifierReference();
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
			case ModularExtensionsPackage.AWAY_GOAL__MODULE_IDENTIFIER_REFERENCE:
				setModuleIdentifierReference((String)newValue);
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
			case ModularExtensionsPackage.AWAY_GOAL__MODULE_IDENTIFIER_REFERENCE:
				setModuleIdentifierReference(MODULE_IDENTIFIER_REFERENCE_EDEFAULT);
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
			case ModularExtensionsPackage.AWAY_GOAL__MODULE_IDENTIFIER_REFERENCE:
				return MODULE_IDENTIFIER_REFERENCE_EDEFAULT == null ? moduleIdentifierReference != null : !MODULE_IDENTIFIER_REFERENCE_EDEFAULT.equals(moduleIdentifierReference);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ModuleIdentifierReference: ");
		result.append(moduleIdentifierReference);
		result.append(')');
		return result.toString();
	}

} //AwayGoalImpl
