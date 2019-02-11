/**
 */
package gsn.gsn.impl;

import gsn.gsn.Associations.AssociationsPackage;
import gsn.gsn.Associations.impl.AssociationsPackageImpl;
import gsn.gsn.Core.CorePackage;

import gsn.gsn.Core.impl.CorePackageImpl;

import gsn.gsn.CoreElement;
import gsn.gsn.GSNFactory;
import gsn.gsn.GSNPackage;

import gsn.gsn.ModularExtensions.ModularExtensionsPackage;
import gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl;
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
public class GSNPackageImpl extends EPackageImpl implements GSNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreElementEClass = null;

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
	 * @see gsn.gsn.GSNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GSNPackageImpl() {
		super(eNS_URI, GSNFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GSNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GSNPackage init() {
		if (isInited) return (GSNPackage)EPackage.Registry.INSTANCE.getEPackage(GSNPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGSNPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GSNPackageImpl theGSNPackage = registeredGSNPackage instanceof GSNPackageImpl ? (GSNPackageImpl)registeredGSNPackage : new GSNPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssociationsPackage.eNS_URI);
		AssociationsPackageImpl theAssociationsPackage = (AssociationsPackageImpl)(registeredPackage instanceof AssociationsPackageImpl ? registeredPackage : AssociationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModularExtensionsPackage.eNS_URI);
		ModularExtensionsPackageImpl theModularExtensionsPackage = (ModularExtensionsPackageImpl)(registeredPackage instanceof ModularExtensionsPackageImpl ? registeredPackage : ModularExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theGSNPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAssociationsPackage.createPackageContents();
		theModularExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theGSNPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAssociationsPackage.initializePackageContents();
		theModularExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGSNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GSNPackage.eNS_URI, theGSNPackage);
		return theGSNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoreElement() {
		return coreElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoreElement_Base_Class() {
		return (EReference)coreElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoreElement_Identifier() {
		return (EAttribute)coreElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoreElement_Statement() {
		return (EAttribute)coreElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoreElement_Uninstantiated() {
		return (EAttribute)coreElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoreElement_Undeveloped() {
		return (EAttribute)coreElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GSNFactory getGSNFactory() {
		return (GSNFactory)getEFactoryInstance();
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
		coreElementEClass = createEClass(CORE_ELEMENT);
		createEReference(coreElementEClass, CORE_ELEMENT__BASE_CLASS);
		createEAttribute(coreElementEClass, CORE_ELEMENT__IDENTIFIER);
		createEAttribute(coreElementEClass, CORE_ELEMENT__STATEMENT);
		createEAttribute(coreElementEClass, CORE_ELEMENT__UNDEVELOPED);
		createEAttribute(coreElementEClass, CORE_ELEMENT__UNINSTANTIATED);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		AssociationsPackage theAssociationsPackage = (AssociationsPackage)EPackage.Registry.INSTANCE.getEPackage(AssociationsPackage.eNS_URI);
		ModularExtensionsPackage theModularExtensionsPackage = (ModularExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(ModularExtensionsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theAssociationsPackage);
		getESubpackages().add(theModularExtensionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(coreElementEClass, CoreElement.class, "CoreElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoreElement_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, CoreElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoreElement_Identifier(), ecorePackage.getEString(), "Identifier", "", 1, 1, CoreElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoreElement_Statement(), ecorePackage.getEString(), "Statement", "", 1, 1, CoreElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoreElement_Undeveloped(), ecorePackage.getEBoolean(), "Undeveloped", "false", 1, 1, CoreElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoreElement_Uninstantiated(), ecorePackage.getEBoolean(), "Uninstantiated", "false", 1, 1, CoreElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GSNPackageImpl
