/**
 */
package gsn.gsn.Associations.impl;

import gsn.gsn.Associations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationsFactoryImpl extends EFactoryImpl implements AssociationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssociationsFactory init() {
		try {
			AssociationsFactory theAssociationsFactory = (AssociationsFactory)EPackage.Registry.INSTANCE.getEFactory(AssociationsPackage.eNS_URI);
			if (theAssociationsFactory != null) {
				return theAssociationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssociationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssociationsPackage.SUPPORTED_BY: return createSupportedBy();
			case AssociationsPackage.NARY_SUPPORTED_BY: return createNarySupportedBy();
			case AssociationsPackage.OPTIONNAL_SUPPORTED_BY: return createOptionnalSupportedBy();
			case AssociationsPackage.OPTIONNAL_IN_CONTEXT_OF: return createOptionnalInContextOf();
			case AssociationsPackage.NARY_IN_CONTEXT_OF: return createNaryInContextOf();
			case AssociationsPackage.IN_CONTEXT_OF: return createInContextOf();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportedBy createSupportedBy() {
		SupportedByImpl supportedBy = new SupportedByImpl();
		return supportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySupportedBy createNarySupportedBy() {
		NarySupportedByImpl narySupportedBy = new NarySupportedByImpl();
		return narySupportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionnalSupportedBy createOptionnalSupportedBy() {
		OptionnalSupportedByImpl optionnalSupportedBy = new OptionnalSupportedByImpl();
		return optionnalSupportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionnalInContextOf createOptionnalInContextOf() {
		OptionnalInContextOfImpl optionnalInContextOf = new OptionnalInContextOfImpl();
		return optionnalInContextOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryInContextOf createNaryInContextOf() {
		NaryInContextOfImpl naryInContextOf = new NaryInContextOfImpl();
		return naryInContextOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InContextOf createInContextOf() {
		InContextOfImpl inContextOf = new InContextOfImpl();
		return inContextOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationsPackage getAssociationsPackage() {
		return (AssociationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssociationsPackage getPackage() {
		return AssociationsPackage.eINSTANCE;
	}

} //AssociationsFactoryImpl
