/**
 */
package gsn.gsn.ModularExtensions.impl;

import gsn.gsn.Associations.AssociationsPackage;

import gsn.gsn.Associations.impl.AssociationsPackageImpl;

import gsn.gsn.Core.CorePackage;

import gsn.gsn.Core.impl.CorePackageImpl;

import gsn.gsn.GSNPackage;

import gsn.gsn.ModularExtensions.AwayContext;
import gsn.gsn.ModularExtensions.AwayGoal;
import gsn.gsn.ModularExtensions.AwaySolution;
import gsn.gsn.ModularExtensions.ContractModule;
import gsn.gsn.ModularExtensions.ContractModuleReference;
import gsn.gsn.ModularExtensions.ModularExtensionsFactory;
import gsn.gsn.ModularExtensions.ModularExtensionsPackage;
import gsn.gsn.ModularExtensions.ModuleReference;

import gsn.gsn.impl.GSNPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModularExtensionsPackageImpl extends EPackageImpl implements ModularExtensionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awaySolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractModuleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractModuleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gsn.gsn.ModularExtensions.ModularExtensionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModularExtensionsPackageImpl() {
		super(eNS_URI, ModularExtensionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModularExtensionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModularExtensionsPackage init() {
		if (isInited) return (ModularExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(ModularExtensionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModularExtensionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModularExtensionsPackageImpl theModularExtensionsPackage = registeredModularExtensionsPackage instanceof ModularExtensionsPackageImpl ? (ModularExtensionsPackageImpl)registeredModularExtensionsPackage : new ModularExtensionsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GSNPackage.eNS_URI);
		GSNPackageImpl theGSNPackage = (GSNPackageImpl)(registeredPackage instanceof GSNPackageImpl ? registeredPackage : GSNPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssociationsPackage.eNS_URI);
		AssociationsPackageImpl theAssociationsPackage = (AssociationsPackageImpl)(registeredPackage instanceof AssociationsPackageImpl ? registeredPackage : AssociationsPackage.eINSTANCE);

		// Create package meta-data objects
		theModularExtensionsPackage.createPackageContents();
		theGSNPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAssociationsPackage.createPackageContents();

		// Initialize created meta-data
		theModularExtensionsPackage.initializePackageContents();
		theGSNPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAssociationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModularExtensionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModularExtensionsPackage.eNS_URI, theModularExtensionsPackage);
		return theModularExtensionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAwayGoal() {
		return awayGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwayGoal_ModuleIdentifierReference() {
		return (EAttribute)awayGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAwaySolution() {
		return awaySolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwaySolution_ModuleIdentifierReference() {
		return (EAttribute)awaySolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAwayContext() {
		return awayContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwayContext_ModuleIdentifierReference() {
		return (EAttribute)awayContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleReference() {
		return moduleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContractModuleReference() {
		return contractModuleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Base_Package() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModule_ModuleIdentifier() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContractModule() {
		return contractModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModularExtensionsFactory getModularExtensionsFactory() {
		return (ModularExtensionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		awayGoalEClass = createEClass(AWAY_GOAL);
		createEAttribute(awayGoalEClass, AWAY_GOAL__MODULE_IDENTIFIER_REFERENCE);

		awaySolutionEClass = createEClass(AWAY_SOLUTION);
		createEAttribute(awaySolutionEClass, AWAY_SOLUTION__MODULE_IDENTIFIER_REFERENCE);

		awayContextEClass = createEClass(AWAY_CONTEXT);
		createEAttribute(awayContextEClass, AWAY_CONTEXT__MODULE_IDENTIFIER_REFERENCE);

		moduleReferenceEClass = createEClass(MODULE_REFERENCE);

		contractModuleReferenceEClass = createEClass(CONTRACT_MODULE_REFERENCE);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__BASE_PACKAGE);
		createEAttribute(moduleEClass, MODULE__MODULE_IDENTIFIER);

		contractModuleEClass = createEClass(CONTRACT_MODULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GSNPackage theGSNPackage = (GSNPackage)EPackage.Registry.INSTANCE.getEPackage(GSNPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		awayGoalEClass.getESuperTypes().add(theGSNPackage.getCoreElement());
		awaySolutionEClass.getESuperTypes().add(theGSNPackage.getCoreElement());
		awayContextEClass.getESuperTypes().add(theGSNPackage.getCoreElement());
		moduleReferenceEClass.getESuperTypes().add(theGSNPackage.getCoreElement());
		contractModuleReferenceEClass.getESuperTypes().add(theGSNPackage.getCoreElement());
		contractModuleEClass.getESuperTypes().add(this.getModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(awayGoalEClass, AwayGoal.class, "AwayGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwayGoal_ModuleIdentifierReference(), ecorePackage.getEString(), "ModuleIdentifierReference", "", 1, 1, AwayGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(awaySolutionEClass, AwaySolution.class, "AwaySolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwaySolution_ModuleIdentifierReference(), ecorePackage.getEString(), "ModuleIdentifierReference", "", 1, 1, AwaySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(awayContextEClass, AwayContext.class, "AwayContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwayContext_ModuleIdentifierReference(), ecorePackage.getEString(), "ModuleIdentifierReference", "", 1, 1, AwayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(moduleReferenceEClass, ModuleReference.class, "ModuleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contractModuleReferenceEClass, ContractModuleReference.class, "ContractModuleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleEClass, gsn.gsn.ModularExtensions.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, gsn.gsn.ModularExtensions.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModule_ModuleIdentifier(), ecorePackage.getEString(), "ModuleIdentifier", "", 1, 1, gsn.gsn.ModularExtensions.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contractModuleEClass, ContractModule.class, "ContractModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ModularExtensionsPackageImpl
