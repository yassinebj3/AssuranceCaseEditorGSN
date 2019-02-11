/**
 */
package pattern.InstantiationoftheRiskManagement.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pattern.InstantiationoftheRiskManagement.*;

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
 * @see pattern.InstantiationoftheRiskManagement.InstantiationoftheRiskManagementPackage
 * @generated
 */
public class InstantiationoftheRiskManagementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstantiationoftheRiskManagementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationoftheRiskManagementSwitch() {
		if (modelPackage == null) {
			modelPackage = InstantiationoftheRiskManagementPackage.eINSTANCE;
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
			case InstantiationoftheRiskManagementPackage.GOAL1: {
				Goal1 goal1 = (Goal1)theEObject;
				T result = caseGoal1(goal1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS2: {
				Class2 class2 = (Class2)theEObject;
				T result = caseClass2(class2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS3: {
				Class3 class3 = (Class3)theEObject;
				T result = caseClass3(class3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS4: {
				Class4 class4 = (Class4)theEObject;
				T result = caseClass4(class4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS5: {
				Class5 class5 = (Class5)theEObject;
				T result = caseClass5(class5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS6: {
				Class6 class6 = (Class6)theEObject;
				T result = caseClass6(class6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS7: {
				Class7 class7 = (Class7)theEObject;
				T result = caseClass7(class7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.GOAL8: {
				Goal8 goal8 = (Goal8)theEObject;
				T result = caseGoal8(goal8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS9: {
				Class9 class9 = (Class9)theEObject;
				T result = caseClass9(class9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS10: {
				Class10 class10 = (Class10)theEObject;
				T result = caseClass10(class10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.STRATEGY11: {
				Strategy11 strategy11 = (Strategy11)theEObject;
				T result = caseStrategy11(strategy11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.GOAL12: {
				Goal12 goal12 = (Goal12)theEObject;
				T result = caseGoal12(goal12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.STRATEGY13: {
				Strategy13 strategy13 = (Strategy13)theEObject;
				T result = caseStrategy13(strategy13);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS14: {
				Class14 class14 = (Class14)theEObject;
				T result = caseClass14(class14);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS15: {
				Class15 class15 = (Class15)theEObject;
				T result = caseClass15(class15);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.GOAL16: {
				Goal16 goal16 = (Goal16)theEObject;
				T result = caseGoal16(goal16);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS17: {
				Class17 class17 = (Class17)theEObject;
				T result = caseClass17(class17);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS18: {
				Class18 class18 = (Class18)theEObject;
				T result = caseClass18(class18);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstantiationoftheRiskManagementPackage.CLASS19: {
				Class19 class19 = (Class19)theEObject;
				T result = caseClass19(class19);
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
	 * Returns the result of interpreting the object as an instance of '<em>Class5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass5(Class5 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Class7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass7(Class7 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Class9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass9(Class9 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Strategy11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy11(Strategy11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal12(Goal12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy13(Strategy13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class14</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class14</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass14(Class14 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class15</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class15</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass15(Class15 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal16(Goal16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class17</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class17</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass17(Class17 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class18</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class18</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass18(Class18 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class19</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class19</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass19(Class19 object) {
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

} //InstantiationoftheRiskManagementSwitch
