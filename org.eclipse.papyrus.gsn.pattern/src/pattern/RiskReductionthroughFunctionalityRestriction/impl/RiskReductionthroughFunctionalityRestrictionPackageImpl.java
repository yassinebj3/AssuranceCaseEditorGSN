/**
 */
package pattern.RiskReductionthroughFunctionalityRestriction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pattern.HighLevelVehicleSafetyArgument.HighLevelVehicleSafetyArgumentPackage;

import pattern.HighLevelVehicleSafetyArgument.impl.HighLevelVehicleSafetyArgumentPackageImpl;

import pattern.InstantiationoftheRiskManagement.InstantiationoftheRiskManagementPackage;

import pattern.InstantiationoftheRiskManagement.impl.InstantiationoftheRiskManagementPackageImpl;

import pattern.PredefinedSafetyRequirements.PredefinedSafetyRequirementsPackage;

import pattern.PredefinedSafetyRequirements.impl.PredefinedSafetyRequirementsPackageImpl;

import pattern.RiskReductionthroughFunctionalityRestriction.Class1;
import pattern.RiskReductionthroughFunctionalityRestriction.Class5;
import pattern.RiskReductionthroughFunctionalityRestriction.Goal2;
import pattern.RiskReductionthroughFunctionalityRestriction.Goal3;
import pattern.RiskReductionthroughFunctionalityRestriction.Goal4;
import pattern.RiskReductionthroughFunctionalityRestriction.RiskReductionthroughFunctionalityRestrictionFactory;
import pattern.RiskReductionthroughFunctionalityRestriction.RiskReductionthroughFunctionalityRestrictionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiskReductionthroughFunctionalityRestrictionPackageImpl extends EPackageImpl implements RiskReductionthroughFunctionalityRestrictionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class5EClass = null;

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
	 * @see pattern.RiskReductionthroughFunctionalityRestriction.RiskReductionthroughFunctionalityRestrictionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RiskReductionthroughFunctionalityRestrictionPackageImpl() {
		super(eNS_URI, RiskReductionthroughFunctionalityRestrictionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RiskReductionthroughFunctionalityRestrictionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RiskReductionthroughFunctionalityRestrictionPackage init() {
		if (isInited) return (RiskReductionthroughFunctionalityRestrictionPackage)EPackage.Registry.INSTANCE.getEPackage(RiskReductionthroughFunctionalityRestrictionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRiskReductionthroughFunctionalityRestrictionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RiskReductionthroughFunctionalityRestrictionPackageImpl theRiskReductionthroughFunctionalityRestrictionPackage = registeredRiskReductionthroughFunctionalityRestrictionPackage instanceof RiskReductionthroughFunctionalityRestrictionPackageImpl ? (RiskReductionthroughFunctionalityRestrictionPackageImpl)registeredRiskReductionthroughFunctionalityRestrictionPackage : new RiskReductionthroughFunctionalityRestrictionPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HighLevelVehicleSafetyArgumentPackage.eNS_URI);
		HighLevelVehicleSafetyArgumentPackageImpl theHighLevelVehicleSafetyArgumentPackage = (HighLevelVehicleSafetyArgumentPackageImpl)(registeredPackage instanceof HighLevelVehicleSafetyArgumentPackageImpl ? registeredPackage : HighLevelVehicleSafetyArgumentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InstantiationoftheRiskManagementPackage.eNS_URI);
		InstantiationoftheRiskManagementPackageImpl theInstantiationoftheRiskManagementPackage = (InstantiationoftheRiskManagementPackageImpl)(registeredPackage instanceof InstantiationoftheRiskManagementPackageImpl ? registeredPackage : InstantiationoftheRiskManagementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PredefinedSafetyRequirementsPackage.eNS_URI);
		PredefinedSafetyRequirementsPackageImpl thePredefinedSafetyRequirementsPackage = (PredefinedSafetyRequirementsPackageImpl)(registeredPackage instanceof PredefinedSafetyRequirementsPackageImpl ? registeredPackage : PredefinedSafetyRequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRiskReductionthroughFunctionalityRestrictionPackage.createPackageContents();
		theHighLevelVehicleSafetyArgumentPackage.createPackageContents();
		theInstantiationoftheRiskManagementPackage.createPackageContents();
		thePredefinedSafetyRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theRiskReductionthroughFunctionalityRestrictionPackage.initializePackageContents();
		theHighLevelVehicleSafetyArgumentPackage.initializePackageContents();
		theInstantiationoftheRiskManagementPackage.initializePackageContents();
		thePredefinedSafetyRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRiskReductionthroughFunctionalityRestrictionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RiskReductionthroughFunctionalityRestrictionPackage.eNS_URI, theRiskReductionthroughFunctionalityRestrictionPackage);
		return theRiskReductionthroughFunctionalityRestrictionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass1() {
		return class1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal2() {
		return goal2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal3() {
		return goal3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal4() {
		return goal4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass5() {
		return class5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskReductionthroughFunctionalityRestrictionFactory getRiskReductionthroughFunctionalityRestrictionFactory() {
		return (RiskReductionthroughFunctionalityRestrictionFactory)getEFactoryInstance();
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
		class1EClass = createEClass(CLASS1);

		goal2EClass = createEClass(GOAL2);

		goal3EClass = createEClass(GOAL3);

		goal4EClass = createEClass(GOAL4);

		class5EClass = createEClass(CLASS5);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(class1EClass, Class1.class, "Class1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal2EClass, Goal2.class, "Goal2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal3EClass, Goal3.class, "Goal3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal4EClass, Goal4.class, "Goal4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class5EClass, Class5.class, "Class5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

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
		  (this,
		   source,
		   new String[] {
			   "originalName", "Risk Reduction through Functionality Restriction"
		   });
	}

} //RiskReductionthroughFunctionalityRestrictionPackageImpl
