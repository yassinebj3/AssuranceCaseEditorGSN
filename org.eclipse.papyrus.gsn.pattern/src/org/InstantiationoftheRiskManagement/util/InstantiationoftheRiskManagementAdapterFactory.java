/**
 */
package org.InstantiationoftheRiskManagement.util;

import org.InstantiationoftheRiskManagement.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.InstantiationoftheRiskManagement.InstantiationoftheRiskManagementPackage
 * @generated
 */
public class InstantiationoftheRiskManagementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstantiationoftheRiskManagementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationoftheRiskManagementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InstantiationoftheRiskManagementPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationoftheRiskManagementSwitch<Adapter> modelSwitch =
		new InstantiationoftheRiskManagementSwitch<Adapter>() {
			@Override
			public Adapter caseGoal1(Goal1 object) {
				return createGoal1Adapter();
			}
			@Override
			public Adapter caseClass2(Class2 object) {
				return createClass2Adapter();
			}
			@Override
			public Adapter caseClass3(Class3 object) {
				return createClass3Adapter();
			}
			@Override
			public Adapter caseClass4(Class4 object) {
				return createClass4Adapter();
			}
			@Override
			public Adapter caseClass5(Class5 object) {
				return createClass5Adapter();
			}
			@Override
			public Adapter caseClass6(Class6 object) {
				return createClass6Adapter();
			}
			@Override
			public Adapter caseClass7(Class7 object) {
				return createClass7Adapter();
			}
			@Override
			public Adapter caseGoal8(Goal8 object) {
				return createGoal8Adapter();
			}
			@Override
			public Adapter caseClass9(Class9 object) {
				return createClass9Adapter();
			}
			@Override
			public Adapter caseClass10(Class10 object) {
				return createClass10Adapter();
			}
			@Override
			public Adapter caseStrategy11(Strategy11 object) {
				return createStrategy11Adapter();
			}
			@Override
			public Adapter caseGoal12(Goal12 object) {
				return createGoal12Adapter();
			}
			@Override
			public Adapter caseStrategy13(Strategy13 object) {
				return createStrategy13Adapter();
			}
			@Override
			public Adapter caseClass14(Class14 object) {
				return createClass14Adapter();
			}
			@Override
			public Adapter caseClass15(Class15 object) {
				return createClass15Adapter();
			}
			@Override
			public Adapter caseGoal16(Goal16 object) {
				return createGoal16Adapter();
			}
			@Override
			public Adapter caseClass17(Class17 object) {
				return createClass17Adapter();
			}
			@Override
			public Adapter caseClass18(Class18 object) {
				return createClass18Adapter();
			}
			@Override
			public Adapter caseClass19(Class19 object) {
				return createClass19Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Goal1 <em>Goal1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Goal1
	 * @generated
	 */
	public Adapter createGoal1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class2 <em>Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class2
	 * @generated
	 */
	public Adapter createClass2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class3 <em>Class3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class3
	 * @generated
	 */
	public Adapter createClass3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class4 <em>Class4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class4
	 * @generated
	 */
	public Adapter createClass4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class5 <em>Class5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class5
	 * @generated
	 */
	public Adapter createClass5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class6 <em>Class6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class6
	 * @generated
	 */
	public Adapter createClass6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class7 <em>Class7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class7
	 * @generated
	 */
	public Adapter createClass7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Goal8 <em>Goal8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Goal8
	 * @generated
	 */
	public Adapter createGoal8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class9 <em>Class9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class9
	 * @generated
	 */
	public Adapter createClass9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class10 <em>Class10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class10
	 * @generated
	 */
	public Adapter createClass10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Strategy11 <em>Strategy11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Strategy11
	 * @generated
	 */
	public Adapter createStrategy11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Goal12 <em>Goal12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Goal12
	 * @generated
	 */
	public Adapter createGoal12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Strategy13 <em>Strategy13</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Strategy13
	 * @generated
	 */
	public Adapter createStrategy13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class14 <em>Class14</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class14
	 * @generated
	 */
	public Adapter createClass14Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class15 <em>Class15</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class15
	 * @generated
	 */
	public Adapter createClass15Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Goal16 <em>Goal16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Goal16
	 * @generated
	 */
	public Adapter createGoal16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class17 <em>Class17</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class17
	 * @generated
	 */
	public Adapter createClass17Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class18 <em>Class18</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class18
	 * @generated
	 */
	public Adapter createClass18Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.InstantiationoftheRiskManagement.Class19 <em>Class19</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.InstantiationoftheRiskManagement.Class19
	 * @generated
	 */
	public Adapter createClass19Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InstantiationoftheRiskManagementAdapterFactory
