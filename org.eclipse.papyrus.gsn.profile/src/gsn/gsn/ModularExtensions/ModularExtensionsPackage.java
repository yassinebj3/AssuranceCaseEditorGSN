/**
 */
package gsn.gsn.ModularExtensions;

import gsn.gsn.GSNPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see gsn.gsn.ModularExtensions.ModularExtensionsFactory
 * @model kind="package"
 * @generated
 */
public interface ModularExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModularExtensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gsn/ModularExtensions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsn.ModularExtensions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularExtensionsPackage eINSTANCE = gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gsn.gsn.ModularExtensions.impl.AwayGoalImpl <em>Away Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.ModularExtensions.impl.AwayGoalImpl
	 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getAwayGoal()
	 * @generated
	 */
	int AWAY_GOAL = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__BASE_CLASS = GSNPackage.CORE_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IDENTIFIER = GSNPackage.CORE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__STATEMENT = GSNPackage.CORE_ELEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__UNDEVELOPED = GSNPackage.CORE_ELEMENT__UNDEVELOPED;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__UNINSTANTIATED = GSNPackage.CORE_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Module Identifier Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__MODULE_IDENTIFIER_REFERENCE = GSNPackage.CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_FEATURE_COUNT = GSNPackage.CORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_OPERATION_COUNT = GSNPackage.CORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.ModularExtensions.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.ModularExtensions.impl.AwaySolutionImpl
	 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getAwaySolution()
	 * @generated
	 */
	int AWAY_SOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__BASE_CLASS = GSNPackage.CORE_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IDENTIFIER = GSNPackage.CORE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__STATEMENT = GSNPackage.CORE_ELEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__UNDEVELOPED = GSNPackage.CORE_ELEMENT__UNDEVELOPED;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__UNINSTANTIATED = GSNPackage.CORE_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Module Identifier Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__MODULE_IDENTIFIER_REFERENCE = GSNPackage.CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_FEATURE_COUNT = GSNPackage.CORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_OPERATION_COUNT = GSNPackage.CORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.ModularExtensions.impl.AwayContextImpl <em>Away Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.ModularExtensions.impl.AwayContextImpl
	 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getAwayContext()
	 * @generated
	 */
	int AWAY_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__BASE_CLASS = GSNPackage.CORE_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IDENTIFIER = GSNPackage.CORE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__STATEMENT = GSNPackage.CORE_ELEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__UNDEVELOPED = GSNPackage.CORE_ELEMENT__UNDEVELOPED;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__UNINSTANTIATED = GSNPackage.CORE_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Module Identifier Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__MODULE_IDENTIFIER_REFERENCE = GSNPackage.CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_FEATURE_COUNT = GSNPackage.CORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_OPERATION_COUNT = GSNPackage.CORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.ModularExtensions.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.ModularExtensions.impl.ModuleReferenceImpl
	 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getModuleReference()
	 * @generated
	 */
	int MODULE_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__BASE_CLASS = GSNPackage.CORE_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__IDENTIFIER = GSNPackage.CORE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__STATEMENT = GSNPackage.CORE_ELEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__UNDEVELOPED = GSNPackage.CORE_ELEMENT__UNDEVELOPED;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__UNINSTANTIATED = GSNPackage.CORE_ELEMENT__UNINSTANTIATED;

	/**
	 * The number of structural features of the '<em>Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE_FEATURE_COUNT = GSNPackage.CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE_OPERATION_COUNT = GSNPackage.CORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.ModularExtensions.impl.ContractModuleReferenceImpl <em>Contract Module Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.ModularExtensions.impl.ContractModuleReferenceImpl
	 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getContractModuleReference()
	 * @generated
	 */
	int CONTRACT_MODULE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__BASE_CLASS = GSNPackage.CORE_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__IDENTIFIER = GSNPackage.CORE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__STATEMENT = GSNPackage.CORE_ELEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__UNDEVELOPED = GSNPackage.CORE_ELEMENT__UNDEVELOPED;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__UNINSTANTIATED = GSNPackage.CORE_ELEMENT__UNINSTANTIATED;

	/**
	 * The number of structural features of the '<em>Contract Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE_FEATURE_COUNT = GSNPackage.CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contract Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE_OPERATION_COUNT = GSNPackage.CORE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.ModularExtensions.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.ModularExtensions.impl.ModuleImpl
	 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_IDENTIFIER = 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gsn.gsn.ModularExtensions.impl.ContractModuleImpl <em>Contract Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.gsn.ModularExtensions.impl.ContractModuleImpl
	 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getContractModule()
	 * @generated
	 */
	int CONTRACT_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__BASE_PACKAGE = MODULE__BASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__MODULE_IDENTIFIER = MODULE__MODULE_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gsn.gsn.ModularExtensions.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Goal</em>'.
	 * @see gsn.gsn.ModularExtensions.AwayGoal
	 * @generated
	 */
	EClass getAwayGoal();

	/**
	 * Returns the meta object for the attribute '{@link gsn.gsn.ModularExtensions.AwayGoal#getModuleIdentifierReference <em>Module Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier Reference</em>'.
	 * @see gsn.gsn.ModularExtensions.AwayGoal#getModuleIdentifierReference()
	 * @see #getAwayGoal()
	 * @generated
	 */
	EAttribute getAwayGoal_ModuleIdentifierReference();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.ModularExtensions.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Solution</em>'.
	 * @see gsn.gsn.ModularExtensions.AwaySolution
	 * @generated
	 */
	EClass getAwaySolution();

	/**
	 * Returns the meta object for the attribute '{@link gsn.gsn.ModularExtensions.AwaySolution#getModuleIdentifierReference <em>Module Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier Reference</em>'.
	 * @see gsn.gsn.ModularExtensions.AwaySolution#getModuleIdentifierReference()
	 * @see #getAwaySolution()
	 * @generated
	 */
	EAttribute getAwaySolution_ModuleIdentifierReference();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.ModularExtensions.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Context</em>'.
	 * @see gsn.gsn.ModularExtensions.AwayContext
	 * @generated
	 */
	EClass getAwayContext();

	/**
	 * Returns the meta object for the attribute '{@link gsn.gsn.ModularExtensions.AwayContext#getModuleIdentifierReference <em>Module Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier Reference</em>'.
	 * @see gsn.gsn.ModularExtensions.AwayContext#getModuleIdentifierReference()
	 * @see #getAwayContext()
	 * @generated
	 */
	EAttribute getAwayContext_ModuleIdentifierReference();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.ModularExtensions.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Reference</em>'.
	 * @see gsn.gsn.ModularExtensions.ModuleReference
	 * @generated
	 */
	EClass getModuleReference();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.ModularExtensions.ContractModuleReference <em>Contract Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Module Reference</em>'.
	 * @see gsn.gsn.ModularExtensions.ContractModuleReference
	 * @generated
	 */
	EClass getContractModuleReference();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.ModularExtensions.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see gsn.gsn.ModularExtensions.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference '{@link gsn.gsn.ModularExtensions.Module#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see gsn.gsn.ModularExtensions.Module#getBase_Package()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link gsn.gsn.ModularExtensions.Module#getModuleIdentifier <em>Module Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier</em>'.
	 * @see gsn.gsn.ModularExtensions.Module#getModuleIdentifier()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_ModuleIdentifier();

	/**
	 * Returns the meta object for class '{@link gsn.gsn.ModularExtensions.ContractModule <em>Contract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Module</em>'.
	 * @see gsn.gsn.ModularExtensions.ContractModule
	 * @generated
	 */
	EClass getContractModule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModularExtensionsFactory getModularExtensionsFactory();

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
		 * The meta object literal for the '{@link gsn.gsn.ModularExtensions.impl.AwayGoalImpl <em>Away Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.ModularExtensions.impl.AwayGoalImpl
		 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getAwayGoal()
		 * @generated
		 */
		EClass AWAY_GOAL = eINSTANCE.getAwayGoal();

		/**
		 * The meta object literal for the '<em><b>Module Identifier Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_GOAL__MODULE_IDENTIFIER_REFERENCE = eINSTANCE.getAwayGoal_ModuleIdentifierReference();

		/**
		 * The meta object literal for the '{@link gsn.gsn.ModularExtensions.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.ModularExtensions.impl.AwaySolutionImpl
		 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getAwaySolution()
		 * @generated
		 */
		EClass AWAY_SOLUTION = eINSTANCE.getAwaySolution();

		/**
		 * The meta object literal for the '<em><b>Module Identifier Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_SOLUTION__MODULE_IDENTIFIER_REFERENCE = eINSTANCE.getAwaySolution_ModuleIdentifierReference();

		/**
		 * The meta object literal for the '{@link gsn.gsn.ModularExtensions.impl.AwayContextImpl <em>Away Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.ModularExtensions.impl.AwayContextImpl
		 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getAwayContext()
		 * @generated
		 */
		EClass AWAY_CONTEXT = eINSTANCE.getAwayContext();

		/**
		 * The meta object literal for the '<em><b>Module Identifier Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_CONTEXT__MODULE_IDENTIFIER_REFERENCE = eINSTANCE.getAwayContext_ModuleIdentifierReference();

		/**
		 * The meta object literal for the '{@link gsn.gsn.ModularExtensions.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.ModularExtensions.impl.ModuleReferenceImpl
		 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getModuleReference()
		 * @generated
		 */
		EClass MODULE_REFERENCE = eINSTANCE.getModuleReference();

		/**
		 * The meta object literal for the '{@link gsn.gsn.ModularExtensions.impl.ContractModuleReferenceImpl <em>Contract Module Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.ModularExtensions.impl.ContractModuleReferenceImpl
		 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getContractModuleReference()
		 * @generated
		 */
		EClass CONTRACT_MODULE_REFERENCE = eINSTANCE.getContractModuleReference();

		/**
		 * The meta object literal for the '{@link gsn.gsn.ModularExtensions.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.ModularExtensions.impl.ModuleImpl
		 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__BASE_PACKAGE = eINSTANCE.getModule_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Module Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MODULE_IDENTIFIER = eINSTANCE.getModule_ModuleIdentifier();

		/**
		 * The meta object literal for the '{@link gsn.gsn.ModularExtensions.impl.ContractModuleImpl <em>Contract Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.gsn.ModularExtensions.impl.ContractModuleImpl
		 * @see gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl#getContractModule()
		 * @generated
		 */
		EClass CONTRACT_MODULE = eINSTANCE.getContractModule();

	}

} //ModularExtensionsPackage
