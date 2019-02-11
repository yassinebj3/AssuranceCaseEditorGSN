/**
 */
package gsn.gsn.Associations.util;

import gsn.gsn.Associations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gsn.gsn.Associations.AssociationsPackage
 * @generated
 */
public class AssociationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssociationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssociationsPackage.eINSTANCE;
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
	protected AssociationsSwitch<Adapter> modelSwitch =
		new AssociationsSwitch<Adapter>() {
			@Override
			public Adapter caseSupportedBy(SupportedBy object) {
				return createSupportedByAdapter();
			}
			@Override
			public Adapter caseNarySupportedBy(NarySupportedBy object) {
				return createNarySupportedByAdapter();
			}
			@Override
			public Adapter caseOptionnalSupportedBy(OptionnalSupportedBy object) {
				return createOptionnalSupportedByAdapter();
			}
			@Override
			public Adapter caseOptionnalInContextOf(OptionnalInContextOf object) {
				return createOptionnalInContextOfAdapter();
			}
			@Override
			public Adapter caseNaryInContextOf(NaryInContextOf object) {
				return createNaryInContextOfAdapter();
			}
			@Override
			public Adapter caseInContextOf(InContextOf object) {
				return createInContextOfAdapter();
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
	 * Creates a new adapter for an object of class '{@link gsn.gsn.Associations.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.Associations.SupportedBy
	 * @generated
	 */
	public Adapter createSupportedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.Associations.NarySupportedBy <em>Nary Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.Associations.NarySupportedBy
	 * @generated
	 */
	public Adapter createNarySupportedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.Associations.OptionnalSupportedBy <em>Optionnal Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.Associations.OptionnalSupportedBy
	 * @generated
	 */
	public Adapter createOptionnalSupportedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.Associations.OptionnalInContextOf <em>Optionnal In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.Associations.OptionnalInContextOf
	 * @generated
	 */
	public Adapter createOptionnalInContextOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.Associations.NaryInContextOf <em>Nary In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.Associations.NaryInContextOf
	 * @generated
	 */
	public Adapter createNaryInContextOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.gsn.Associations.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.gsn.Associations.InContextOf
	 * @generated
	 */
	public Adapter createInContextOfAdapter() {
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

} //AssociationsAdapterFactory
