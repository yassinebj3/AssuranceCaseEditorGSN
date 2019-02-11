/**
 */
package gsn.gsn.ModularExtensions.util;

import gsn.gsn.CoreElement;

import gsn.gsn.ModularExtensions.AwayContext;
import gsn.gsn.ModularExtensions.AwayGoal;
import gsn.gsn.ModularExtensions.AwaySolution;
import gsn.gsn.ModularExtensions.ContractModule;
import gsn.gsn.ModularExtensions.ContractModuleReference;
import gsn.gsn.ModularExtensions.ModularExtensionsPackage;
import gsn.gsn.ModularExtensions.ModuleReference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gsn.gsn.ModularExtensions.ModularExtensionsPackage
 * @generated
 */
public class ModularExtensionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModularExtensionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularExtensionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ModularExtensionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModularExtensionsPackage.AWAY_GOAL: {
				AwayGoal awayGoal = (AwayGoal)theEObject;
				T result = caseAwayGoal(awayGoal);
				if (result == null) result = caseCoreElement(awayGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularExtensionsPackage.AWAY_SOLUTION: {
				AwaySolution awaySolution = (AwaySolution)theEObject;
				T result = caseAwaySolution(awaySolution);
				if (result == null) result = caseCoreElement(awaySolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularExtensionsPackage.AWAY_CONTEXT: {
				AwayContext awayContext = (AwayContext)theEObject;
				T result = caseAwayContext(awayContext);
				if (result == null) result = caseCoreElement(awayContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularExtensionsPackage.MODULE_REFERENCE: {
				ModuleReference moduleReference = (ModuleReference)theEObject;
				T result = caseModuleReference(moduleReference);
				if (result == null) result = caseCoreElement(moduleReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularExtensionsPackage.CONTRACT_MODULE_REFERENCE: {
				ContractModuleReference contractModuleReference = (ContractModuleReference)theEObject;
				T result = caseContractModuleReference(contractModuleReference);
				if (result == null) result = caseCoreElement(contractModuleReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularExtensionsPackage.MODULE: {
				gsn.gsn.ModularExtensions.Module module = (gsn.gsn.ModularExtensions.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularExtensionsPackage.CONTRACT_MODULE: {
				ContractModule contractModule = (ContractModule)theEObject;
				T result = caseContractModule(contractModule);
				if (result == null) result = caseModule(contractModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayGoal(AwayGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwaySolution(AwaySolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayContext(AwayContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleReference(ModuleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Module Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractModuleReference(ContractModuleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(gsn.gsn.ModularExtensions.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractModule(ContractModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreElement(CoreElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModularExtensionsSwitch
