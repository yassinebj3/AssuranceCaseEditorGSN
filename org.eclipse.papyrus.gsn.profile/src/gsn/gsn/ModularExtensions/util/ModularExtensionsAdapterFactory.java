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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gsn.gsn.ModularExtensions.ModularExtensionsPackage
 * @generated
 */
public class ModularExtensionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModularExtensionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularExtensionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModularExtensionsPackage.eINSTANCE;
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
	protected ModularExtensionsSwitch<Adapter> modelSwitch =
		new ModularExtensionsSwitch<Adapter>() {
			@Override
			public Adapter caseAwayGoal(AwayGoal object) {
				return createAwayGoalAdapter();
			}
			@Override
			public Adapter caseAwaySolution(AwaySolution object) {
				return createAwaySolutionAdapter();
			}
			@Override
			public Adapter caseAwayContext(AwayContext object) {
				return createAwayContextAdapter();
			}
			@Override
			public Adapter caseModuleReference(ModuleReference object) {
				return createModuleReferenceAdapter();
			}
			@Override
			public Adapter caseContractModuleReference(ContractModuleReference object) {
				return createContractModuleReferenceAdapter();
			}
			@Override
			public Adapter caseModule(gsn.gsn.ModularExtensions.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseContractModule(ContractModule object) {
				return createContractModuleAdapter();
			}
			@Override
			public Adapter caseCoreElement(CoreElement object) {
				return createCoreElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link gsn.gsn.ModularExtensions.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.ModularExtensions.AwayGoal
	 * @generated
	 */
	public Adapter createAwayGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.ModularExtensions.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.ModularExtensions.AwaySolution
	 * @generated
	 */
	public Adapter createAwaySolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.ModularExtensions.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.ModularExtensions.AwayContext
	 * @generated
	 */
	public Adapter createAwayContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.ModularExtensions.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.ModularExtensions.ModuleReference
	 * @generated
	 */
	public Adapter createModuleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.ModularExtensions.ContractModuleReference <em>Contract Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.ModularExtensions.ContractModuleReference
	 * @generated
	 */
	public Adapter createContractModuleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.ModularExtensions.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.ModularExtensions.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.ModularExtensions.ContractModule <em>Contract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.ModularExtensions.ContractModule
	 * @generated
	 */
	public Adapter createContractModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.CoreElement <em>Core Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.CoreElement
	 * @generated
	 */
	public Adapter createCoreElementAdapter() {
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

} //ModularExtensionsAdapterFactory
