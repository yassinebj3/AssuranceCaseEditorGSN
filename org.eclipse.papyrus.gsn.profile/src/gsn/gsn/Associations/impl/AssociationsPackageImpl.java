/**
 */
package gsn.gsn.Associations.impl;

import gsn.gsn.Associations.AssociationsFactory;
import gsn.gsn.Associations.AssociationsPackage;
import gsn.gsn.Associations.InContextOf;
import gsn.gsn.Associations.NaryInContextOf;
import gsn.gsn.Associations.NarySupportedBy;
import gsn.gsn.Associations.OptionnalInContextOf;
import gsn.gsn.Associations.OptionnalSupportedBy;
import gsn.gsn.Associations.SupportedBy;

import gsn.gsn.Core.CorePackage;

import gsn.gsn.Core.impl.CorePackageImpl;

import gsn.gsn.GSNPackage;

import gsn.gsn.ModularExtensions.ModularExtensionsPackage;
import gsn.gsn.ModularExtensions.impl.ModularExtensionsPackageImpl;
import gsn.gsn.impl.GSNPackageImpl;

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
public class AssociationsPackageImpl extends EPackageImpl implements AssociationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass narySupportedByEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionnalSupportedByEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionnalInContextOfEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naryInContextOfEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inContextOfEClass = null;

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
	 * @see gsn.gsn.Associations.AssociationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssociationsPackageImpl() {
		super(eNS_URI, AssociationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssociationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssociationsPackage init() {
		if (isInited) return (AssociationsPackage)EPackage.Registry.INSTANCE.getEPackage(AssociationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAssociationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AssociationsPackageImpl theAssociationsPackage = registeredAssociationsPackage instanceof AssociationsPackageImpl ? (AssociationsPackageImpl)registeredAssociationsPackage : new AssociationsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModularExtensionsPackage.eNS_URI);
		ModularExtensionsPackageImpl theModularExtensionsPackage = (ModularExtensionsPackageImpl)(registeredPackage instanceof ModularExtensionsPackageImpl ? registeredPackage : ModularExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theAssociationsPackage.createPackageContents();
		theGSNPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theModularExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theAssociationsPackage.initializePackageContents();
		theGSNPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theModularExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssociationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssociationsPackage.eNS_URI, theAssociationsPackage);
		return theAssociationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportedBy() {
		return supportedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportedBy_Base_Association() {
		return (EReference)supportedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNarySupportedBy() {
		return narySupportedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNarySupportedBy_Base_Association() {
		return (EReference)narySupportedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptionnalSupportedBy() {
		return optionnalSupportedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptionnalSupportedBy_Base_Association() {
		return (EReference)optionnalSupportedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptionnalInContextOf() {
		return optionnalInContextOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptionnalInContextOf_Base_Association() {
		return (EReference)optionnalInContextOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNaryInContextOf() {
		return naryInContextOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNaryInContextOf_Base_Association() {
		return (EReference)naryInContextOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInContextOf() {
		return inContextOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInContextOf_Base_Association() {
		return (EReference)inContextOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationsFactory getAssociationsFactory() {
		return (AssociationsFactory)getEFactoryInstance();
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
		supportedByEClass = createEClass(SUPPORTED_BY);
		createEReference(supportedByEClass, SUPPORTED_BY__BASE_ASSOCIATION);

		narySupportedByEClass = createEClass(NARY_SUPPORTED_BY);
		createEReference(narySupportedByEClass, NARY_SUPPORTED_BY__BASE_ASSOCIATION);

		optionnalSupportedByEClass = createEClass(OPTIONNAL_SUPPORTED_BY);
		createEReference(optionnalSupportedByEClass, OPTIONNAL_SUPPORTED_BY__BASE_ASSOCIATION);

		optionnalInContextOfEClass = createEClass(OPTIONNAL_IN_CONTEXT_OF);
		createEReference(optionnalInContextOfEClass, OPTIONNAL_IN_CONTEXT_OF__BASE_ASSOCIATION);

		naryInContextOfEClass = createEClass(NARY_IN_CONTEXT_OF);
		createEReference(naryInContextOfEClass, NARY_IN_CONTEXT_OF__BASE_ASSOCIATION);

		inContextOfEClass = createEClass(IN_CONTEXT_OF);
		createEReference(inContextOfEClass, IN_CONTEXT_OF__BASE_ASSOCIATION);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(supportedByEClass, SupportedBy.class, "SupportedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportedBy_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, SupportedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(narySupportedByEClass, NarySupportedBy.class, "NarySupportedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNarySupportedBy_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, NarySupportedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(optionnalSupportedByEClass, OptionnalSupportedBy.class, "OptionnalSupportedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionnalSupportedBy_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, OptionnalSupportedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(optionnalInContextOfEClass, OptionnalInContextOf.class, "OptionnalInContextOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionnalInContextOf_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, OptionnalInContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(naryInContextOfEClass, NaryInContextOf.class, "NaryInContextOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNaryInContextOf_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, NaryInContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inContextOfEClass, InContextOf.class, "InContextOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInContextOf_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, InContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (narySupportedByEClass,
		   source,
		   new String[] {
			   "originalName", "N-arySupportedBy"
		   });
		addAnnotation
		  (naryInContextOfEClass,
		   source,
		   new String[] {
			   "originalName", "N-aryInContextOf"
		   });
	}

} //AssociationsPackageImpl
