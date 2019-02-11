/**
 */
package gsn.gsn.Associations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gsn.gsn.Associations.AssociationsFactory
 * @model kind="package"
 * @generated
 */
public interface AssociationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Associations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gsn/Associations.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsn.Associations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssociationsPackage eINSTANCE = gsn.gsn.Associations.impl.AssociationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gsn.gsn.Associations.impl.SupportedByImpl <em>Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.Associations.impl.SupportedByImpl
	 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getSupportedBy()
	 * @generated
	 */
	int SUPPORTED_BY = 0;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link gsn.gsn.Associations.impl.NarySupportedByImpl <em>Nary Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.Associations.impl.NarySupportedByImpl
	 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getNarySupportedBy()
	 * @generated
	 */
	int NARY_SUPPORTED_BY = 1;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_SUPPORTED_BY__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Nary Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_SUPPORTED_BY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nary Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_SUPPORTED_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.Associations.impl.OptionnalSupportedByImpl <em>Optionnal Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.Associations.impl.OptionnalSupportedByImpl
	 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getOptionnalSupportedBy()
	 * @generated
	 */
	int OPTIONNAL_SUPPORTED_BY = 2;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONNAL_SUPPORTED_BY__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Optionnal Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONNAL_SUPPORTED_BY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Optionnal Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONNAL_SUPPORTED_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.Associations.impl.OptionnalInContextOfImpl <em>Optionnal In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.Associations.impl.OptionnalInContextOfImpl
	 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getOptionnalInContextOf()
	 * @generated
	 */
	int OPTIONNAL_IN_CONTEXT_OF = 3;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONNAL_IN_CONTEXT_OF__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Optionnal In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONNAL_IN_CONTEXT_OF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Optionnal In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONNAL_IN_CONTEXT_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.Associations.impl.NaryInContextOfImpl <em>Nary In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.Associations.impl.NaryInContextOfImpl
	 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getNaryInContextOf()
	 * @generated
	 */
	int NARY_IN_CONTEXT_OF = 4;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_IN_CONTEXT_OF__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Nary In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_IN_CONTEXT_OF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nary In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_IN_CONTEXT_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.Associations.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.Associations.impl.InContextOfImpl
	 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 5;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gsn.gsn.Associations.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported By</em>'.
	 * @see gsn.gsn.Associations.SupportedBy
	 * @generated
	 */
	EClass getSupportedBy();

	/**
	 * Returns the meta object for the reference '{@link gsn.gsn.Associations.SupportedBy#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see gsn.gsn.Associations.SupportedBy#getBase_Association()
	 * @see #getSupportedBy()
	 * @generated
	 */
	EReference getSupportedBy_Base_Association();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.Associations.NarySupportedBy <em>Nary Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nary Supported By</em>'.
	 * @see gsn.gsn.Associations.NarySupportedBy
	 * @generated
	 */
	EClass getNarySupportedBy();

	/**
	 * Returns the meta object for the reference '{@link gsn.gsn.Associations.NarySupportedBy#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see gsn.gsn.Associations.NarySupportedBy#getBase_Association()
	 * @see #getNarySupportedBy()
	 * @generated
	 */
	EReference getNarySupportedBy_Base_Association();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.Associations.OptionnalSupportedBy <em>Optionnal Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optionnal Supported By</em>'.
	 * @see gsn.gsn.Associations.OptionnalSupportedBy
	 * @generated
	 */
	EClass getOptionnalSupportedBy();

	/**
	 * Returns the meta object for the reference '{@link gsn.gsn.Associations.OptionnalSupportedBy#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see gsn.gsn.Associations.OptionnalSupportedBy#getBase_Association()
	 * @see #getOptionnalSupportedBy()
	 * @generated
	 */
	EReference getOptionnalSupportedBy_Base_Association();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.Associations.OptionnalInContextOf <em>Optionnal In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optionnal In Context Of</em>'.
	 * @see gsn.gsn.Associations.OptionnalInContextOf
	 * @generated
	 */
	EClass getOptionnalInContextOf();

	/**
	 * Returns the meta object for the reference '{@link gsn.gsn.Associations.OptionnalInContextOf#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see gsn.gsn.Associations.OptionnalInContextOf#getBase_Association()
	 * @see #getOptionnalInContextOf()
	 * @generated
	 */
	EReference getOptionnalInContextOf_Base_Association();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.Associations.NaryInContextOf <em>Nary In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nary In Context Of</em>'.
	 * @see gsn.gsn.Associations.NaryInContextOf
	 * @generated
	 */
	EClass getNaryInContextOf();

	/**
	 * Returns the meta object for the reference '{@link gsn.gsn.Associations.NaryInContextOf#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see gsn.gsn.Associations.NaryInContextOf#getBase_Association()
	 * @see #getNaryInContextOf()
	 * @generated
	 */
	EReference getNaryInContextOf_Base_Association();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.Associations.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see gsn.gsn.Associations.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the meta object for the reference '{@link gsn.gsn.Associations.InContextOf#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see gsn.gsn.Associations.InContextOf#getBase_Association()
	 * @see #getInContextOf()
	 * @generated
	 */
	EReference getInContextOf_Base_Association();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssociationsFactory getAssociationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gsn.gsn.Associations.impl.SupportedByImpl <em>Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.Associations.impl.SupportedByImpl
		 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getSupportedBy()
		 * @generated
		 */
		EClass SUPPORTED_BY = eINSTANCE.getSupportedBy();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_BY__BASE_ASSOCIATION = eINSTANCE.getSupportedBy_Base_Association();

		/**
		 * The meta object literal for the '{@link gsn.gsn.Associations.impl.NarySupportedByImpl <em>Nary Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.Associations.impl.NarySupportedByImpl
		 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getNarySupportedBy()
		 * @generated
		 */
		EClass NARY_SUPPORTED_BY = eINSTANCE.getNarySupportedBy();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARY_SUPPORTED_BY__BASE_ASSOCIATION = eINSTANCE.getNarySupportedBy_Base_Association();

		/**
		 * The meta object literal for the '{@link gsn.gsn.Associations.impl.OptionnalSupportedByImpl <em>Optionnal Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.Associations.impl.OptionnalSupportedByImpl
		 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getOptionnalSupportedBy()
		 * @generated
		 */
		EClass OPTIONNAL_SUPPORTED_BY = eINSTANCE.getOptionnalSupportedBy();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONNAL_SUPPORTED_BY__BASE_ASSOCIATION = eINSTANCE.getOptionnalSupportedBy_Base_Association();

		/**
		 * The meta object literal for the '{@link gsn.gsn.Associations.impl.OptionnalInContextOfImpl <em>Optionnal In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.Associations.impl.OptionnalInContextOfImpl
		 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getOptionnalInContextOf()
		 * @generated
		 */
		EClass OPTIONNAL_IN_CONTEXT_OF = eINSTANCE.getOptionnalInContextOf();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONNAL_IN_CONTEXT_OF__BASE_ASSOCIATION = eINSTANCE.getOptionnalInContextOf_Base_Association();

		/**
		 * The meta object literal for the '{@link gsn.gsn.Associations.impl.NaryInContextOfImpl <em>Nary In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.Associations.impl.NaryInContextOfImpl
		 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getNaryInContextOf()
		 * @generated
		 */
		EClass NARY_IN_CONTEXT_OF = eINSTANCE.getNaryInContextOf();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARY_IN_CONTEXT_OF__BASE_ASSOCIATION = eINSTANCE.getNaryInContextOf_Base_Association();

		/**
		 * The meta object literal for the '{@link gsn.gsn.Associations.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.Associations.impl.InContextOfImpl
		 * @see gsn.gsn.Associations.impl.AssociationsPackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_CONTEXT_OF__BASE_ASSOCIATION = eINSTANCE.getInContextOf_Base_Association();

	}

} //AssociationsPackage
