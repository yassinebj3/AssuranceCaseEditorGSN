/**
 */
package pattern.PredefinedSafetyRequirements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pattern.PredefinedSafetyRequirements.*;

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
 * @see pattern.PredefinedSafetyRequirements.PredefinedSafetyRequirementsPackage
 * @generated
 */
public class PredefinedSafetyRequirementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PredefinedSafetyRequirementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedSafetyRequirementsSwitch() {
		if (modelPackage == null) {
			modelPackage = PredefinedSafetyRequirementsPackage.eINSTANCE;
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
			case PredefinedSafetyRequirementsPackage.GOAL1: {
				Goal1 goal1 = (Goal1)theEObject;
				T result = caseGoal1(goal1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.CLASS2: {
				Class2 class2 = (Class2)theEObject;
				T result = caseClass2(class2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.CLASS3: {
				Class3 class3 = (Class3)theEObject;
				T result = caseClass3(class3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.CLASS4: {
				Class4 class4 = (Class4)theEObject;
				T result = caseClass4(class4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.STRATEGY5: {
				Strategy5 strategy5 = (Strategy5)theEObject;
				T result = caseStrategy5(strategy5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.CLASS6: {
				Class6 class6 = (Class6)theEObject;
				T result = caseClass6(class6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.GOAL7: {
				Goal7 goal7 = (Goal7)theEObject;
				T result = caseGoal7(goal7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.GOAL8: {
				Goal8 goal8 = (Goal8)theEObject;
				T result = caseGoal8(goal8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.GOAL9: {
				Goal9 goal9 = (Goal9)theEObject;
				T result = caseGoal9(goal9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.CLASS10: {
				Class10 class10 = (Class10)theEObject;
				T result = caseClass10(class10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.CLASS11: {
				Class11 class11 = (Class11)theEObject;
				T result = caseClass11(class11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredefinedSafetyRequirementsPackage.CLASS12: {
				Class12 class12 = (Class12)theEObject;
				T result = caseClass12(class12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal1(Goal1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass2(Class2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass3(Class3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass4(Class4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy5(Strategy5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass6(Class6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal7(Goal7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal8(Goal8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal9(Goal9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass10(Class10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass11(Class11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass12(Class12 object) {
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

} //PredefinedSafetyRequirementsSwitch
