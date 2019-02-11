/**
 */
package pattern.HighLevelVehicleSafetyArgument.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pattern.HighLevelVehicleSafetyArgument.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pattern.HighLevelVehicleSafetyArgument.HighLevelVehicleSafetyArgumentPackage
 * @generated
 */
public class HighLevelVehicleSafetyArgumentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HighLevelVehicleSafetyArgumentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelVehicleSafetyArgumentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HighLevelVehicleSafetyArgumentPackage.eINSTANCE;
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
	protected HighLevelVehicleSafetyArgumentSwitch<Adapter> modelSwitch =
		new HighLevelVehicleSafetyArgumentSwitch<Adapter>() {
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
			public Adapter caseStrategy5(Strategy5 object) {
				return createStrategy5Adapter();
			}
			@Override
			public Adapter caseStrategy6(Strategy6 object) {
				return createStrategy6Adapter();
			}
			@Override
			public Adapter caseClass7(Class7 object) {
				return createClass7Adapter();
			}
			@Override
			public Adapter caseClass8(Class8 object) {
				return createClass8Adapter();
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
			public Adapter caseClass11(Class11 object) {
				return createClass11Adapter();
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
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Goal1 <em>Goal1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Goal1
	 * @generated
	 */
	public Adapter createGoal1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Class2 <em>Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Class2
	 * @generated
	 */
	public Adapter createClass2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Class3 <em>Class3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Class3
	 * @generated
	 */
	public Adapter createClass3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Class4 <em>Class4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Class4
	 * @generated
	 */
	public Adapter createClass4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Strategy5 <em>Strategy5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Strategy5
	 * @generated
	 */
	public Adapter createStrategy5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Strategy6 <em>Strategy6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Strategy6
	 * @generated
	 */
	public Adapter createStrategy6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Class7 <em>Class7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Class7
	 * @generated
	 */
	public Adapter createClass7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Class8 <em>Class8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Class8
	 * @generated
	 */
	public Adapter createClass8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Class9 <em>Class9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Class9
	 * @generated
	 */
	public Adapter createClass9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Class10 <em>Class10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Class10
	 * @generated
	 */
	public Adapter createClass10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pattern.HighLevelVehicleSafetyArgument.Class11 <em>Class11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pattern.HighLevelVehicleSafetyArgument.Class11
	 * @generated
	 */
	public Adapter createClass11Adapter() {
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

} //HighLevelVehicleSafetyArgumentAdapterFactory
