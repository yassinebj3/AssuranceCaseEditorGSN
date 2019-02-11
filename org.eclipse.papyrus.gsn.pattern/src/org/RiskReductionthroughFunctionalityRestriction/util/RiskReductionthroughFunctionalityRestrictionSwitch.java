/**
 */
package org.RiskReductionthroughFunctionalityRestriction.util;

import org.RiskReductionthroughFunctionalityRestriction.*;

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
 * @see org.RiskReductionthroughFunctionalityRestriction.RiskReductionthroughFunctionalityRestrictionPackage
 * @generated
 */
public class RiskReductionthroughFunctionalityRestrictionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RiskReductionthroughFunctionalityRestrictionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskReductionthroughFunctionalityRestrictionSwitch() {
		if (modelPackage == null) {
			modelPackage = RiskReductionthroughFunctionalityRestrictionPackage.eINSTANCE;
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
			case RiskReductionthroughFunctionalityRestrictionPackage.CLASS1: {
				Class1 class1 = (Class1)theEObject;
				T result = caseClass1(class1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskReductionthroughFunctionalityRestrictionPackage.GOAL2: {
				Goal2 goal2 = (Goal2)theEObject;
				T result = caseGoal2(goal2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskReductionthroughFunctionalityRestrictionPackage.GOAL3: {
				Goal3 goal3 = (Goal3)theEObject;
				T result = caseGoal3(goal3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskReductionthroughFunctionalityRestrictionPackage.GOAL4: {
				Goal4 goal4 = (Goal4)theEObject;
				T result = caseGoal4(goal4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskReductionthroughFunctionalityRestrictionPackage.CLASS5: {
				Class5 class5 = (Class5)theEObject;
				T result = caseClass5(class5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass1(Class1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal2(Goal2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal3(Goal3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal4(Goal4 object) {
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

} //RiskReductionthroughFunctionalityRestrictionSwitch
