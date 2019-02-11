/**
 */
package pattern.InstantiationoftheRiskManagement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pattern.HighLevelVehicleSafetyArgument.HighLevelVehicleSafetyArgumentPackage;

import pattern.HighLevelVehicleSafetyArgument.impl.HighLevelVehicleSafetyArgumentPackageImpl;

import pattern.InstantiationoftheRiskManagement.Class10;
import pattern.InstantiationoftheRiskManagement.Class14;
import pattern.InstantiationoftheRiskManagement.Class15;
import pattern.InstantiationoftheRiskManagement.Class17;
import pattern.InstantiationoftheRiskManagement.Class18;
import pattern.InstantiationoftheRiskManagement.Class19;
import pattern.InstantiationoftheRiskManagement.Class2;
import pattern.InstantiationoftheRiskManagement.Class3;
import pattern.InstantiationoftheRiskManagement.Class4;
import pattern.InstantiationoftheRiskManagement.Class5;
import pattern.InstantiationoftheRiskManagement.Class6;
import pattern.InstantiationoftheRiskManagement.Class7;
import pattern.InstantiationoftheRiskManagement.Class9;
import pattern.InstantiationoftheRiskManagement.Goal1;
import pattern.InstantiationoftheRiskManagement.Goal12;
import pattern.InstantiationoftheRiskManagement.Goal16;
import pattern.InstantiationoftheRiskManagement.Goal8;
import pattern.InstantiationoftheRiskManagement.InstantiationoftheRiskManagementFactory;
import pattern.InstantiationoftheRiskManagement.InstantiationoftheRiskManagementPackage;
import pattern.InstantiationoftheRiskManagement.Strategy11;
import pattern.InstantiationoftheRiskManagement.Strategy13;

import pattern.PredefinedSafetyRequirements.PredefinedSafetyRequirementsPackage;

import pattern.PredefinedSafetyRequirements.impl.PredefinedSafetyRequirementsPackageImpl;

import pattern.RiskReductionthroughFunctionalityRestriction.RiskReductionthroughFunctionalityRestrictionPackage;

import pattern.RiskReductionthroughFunctionalityRestriction.impl.RiskReductionthroughFunctionalityRestrictionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstantiationoftheRiskManagementPackageImpl extends EPackageImpl implements InstantiationoftheRiskManagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class9EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class10EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategy11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal12EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategy13EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class14EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class15EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class17EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class18EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class19EClass = null;

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
	 * @see pattern.InstantiationoftheRiskManagement.InstantiationoftheRiskManagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstantiationoftheRiskManagementPackageImpl() {
		super(eNS_URI, InstantiationoftheRiskManagementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InstantiationoftheRiskManagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstantiationoftheRiskManagementPackage init() {
		if (isInited) return (InstantiationoftheRiskManagementPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationoftheRiskManagementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInstantiationoftheRiskManagementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InstantiationoftheRiskManagementPackageImpl theInstantiationoftheRiskManagementPackage = registeredInstantiationoftheRiskManagementPackage instanceof InstantiationoftheRiskManagementPackageImpl ? (InstantiationoftheRiskManagementPackageImpl)registeredInstantiationoftheRiskManagementPackage : new InstantiationoftheRiskManagementPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HighLevelVehicleSafetyArgumentPackage.eNS_URI);
		HighLevelVehicleSafetyArgumentPackageImpl theHighLevelVehicleSafetyArgumentPackage = (HighLevelVehicleSafetyArgumentPackageImpl)(registeredPackage instanceof HighLevelVehicleSafetyArgumentPackageImpl ? registeredPackage : HighLevelVehicleSafetyArgumentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PredefinedSafetyRequirementsPackage.eNS_URI);
		PredefinedSafetyRequirementsPackageImpl thePredefinedSafetyRequirementsPackage = (PredefinedSafetyRequirementsPackageImpl)(registeredPackage instanceof PredefinedSafetyRequirementsPackageImpl ? registeredPackage : PredefinedSafetyRequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RiskReductionthroughFunctionalityRestrictionPackage.eNS_URI);
		RiskReductionthroughFunctionalityRestrictionPackageImpl theRiskReductionthroughFunctionalityRestrictionPackage = (RiskReductionthroughFunctionalityRestrictionPackageImpl)(registeredPackage instanceof RiskReductionthroughFunctionalityRestrictionPackageImpl ? registeredPackage : RiskReductionthroughFunctionalityRestrictionPackage.eINSTANCE);

		// Create package meta-data objects
		theInstantiationoftheRiskManagementPackage.createPackageContents();
		theHighLevelVehicleSafetyArgumentPackage.createPackageContents();
		thePredefinedSafetyRequirementsPackage.createPackageContents();
		theRiskReductionthroughFunctionalityRestrictionPackage.createPackageContents();

		// Initialize created meta-data
		theInstantiationoftheRiskManagementPackage.initializePackageContents();
		theHighLevelVehicleSafetyArgumentPackage.initializePackageContents();
		thePredefinedSafetyRequirementsPackage.initializePackageContents();
		theRiskReductionthroughFunctionalityRestrictionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstantiationoftheRiskManagementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstantiationoftheRiskManagementPackage.eNS_URI, theInstantiationoftheRiskManagementPackage);
		return theInstantiationoftheRiskManagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal1() {
		return goal1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass2() {
		return class2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass3() {
		return class3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass4() {
		return class4EClass;
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
	public EClass getClass6() {
		return class6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass7() {
		return class7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal8() {
		return goal8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass9() {
		return class9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass10() {
		return class10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrategy11() {
		return strategy11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal12() {
		return goal12EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrategy13() {
		return strategy13EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass14() {
		return class14EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass15() {
		return class15EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal16() {
		return goal16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass17() {
		return class17EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass18() {
		return class18EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass19() {
		return class19EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstantiationoftheRiskManagementFactory getInstantiationoftheRiskManagementFactory() {
		return (InstantiationoftheRiskManagementFactory)getEFactoryInstance();
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
		goal1EClass = createEClass(GOAL1);

		class2EClass = createEClass(CLASS2);

		class3EClass = createEClass(CLASS3);

		class4EClass = createEClass(CLASS4);

		class5EClass = createEClass(CLASS5);

		class6EClass = createEClass(CLASS6);

		class7EClass = createEClass(CLASS7);

		goal8EClass = createEClass(GOAL8);

		class9EClass = createEClass(CLASS9);

		class10EClass = createEClass(CLASS10);

		strategy11EClass = createEClass(STRATEGY11);

		goal12EClass = createEClass(GOAL12);

		strategy13EClass = createEClass(STRATEGY13);

		class14EClass = createEClass(CLASS14);

		class15EClass = createEClass(CLASS15);

		goal16EClass = createEClass(GOAL16);

		class17EClass = createEClass(CLASS17);

		class18EClass = createEClass(CLASS18);

		class19EClass = createEClass(CLASS19);
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
		initEClass(goal1EClass, Goal1.class, "Goal1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class2EClass, Class2.class, "Class2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class3EClass, Class3.class, "Class3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class4EClass, Class4.class, "Class4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class5EClass, Class5.class, "Class5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class6EClass, Class6.class, "Class6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class7EClass, Class7.class, "Class7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal8EClass, Goal8.class, "Goal8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class9EClass, Class9.class, "Class9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class10EClass, Class10.class, "Class10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategy11EClass, Strategy11.class, "Strategy11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal12EClass, Goal12.class, "Goal12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategy13EClass, Strategy13.class, "Strategy13", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class14EClass, Class14.class, "Class14", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class15EClass, Class15.class, "Class15", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal16EClass, Goal16.class, "Goal16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class17EClass, Class17.class, "Class17", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class18EClass, Class18.class, "Class18", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class19EClass, Class19.class, "Class19", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			   "originalName", "Instantiation of the Risk Management"
		   });
	}

} //InstantiationoftheRiskManagementPackageImpl
