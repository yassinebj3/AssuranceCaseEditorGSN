/**
 */
package org.HighLevelVehicleSafetyArgument.impl;

import org.HighLevelVehicleSafetyArgument.Class10;
import org.HighLevelVehicleSafetyArgument.Class11;
import org.HighLevelVehicleSafetyArgument.Class2;
import org.HighLevelVehicleSafetyArgument.Class3;
import org.HighLevelVehicleSafetyArgument.Class4;
import org.HighLevelVehicleSafetyArgument.Class7;
import org.HighLevelVehicleSafetyArgument.Class8;
import org.HighLevelVehicleSafetyArgument.Class9;
import org.HighLevelVehicleSafetyArgument.Goal1;
import org.HighLevelVehicleSafetyArgument.HighLevelVehicleSafetyArgumentFactory;
import org.HighLevelVehicleSafetyArgument.HighLevelVehicleSafetyArgumentPackage;
import org.HighLevelVehicleSafetyArgument.Strategy5;
import org.HighLevelVehicleSafetyArgument.Strategy6;

import org.InstantiationoftheRiskManagement.InstantiationoftheRiskManagementPackage;

import org.InstantiationoftheRiskManagement.impl.InstantiationoftheRiskManagementPackageImpl;

import org.PredefinedSafetyRequirements.PredefinedSafetyRequirementsPackage;

import org.PredefinedSafetyRequirements.impl.PredefinedSafetyRequirementsPackageImpl;

import org.RiskReductionthroughFunctionalityRestriction.RiskReductionthroughFunctionalityRestrictionPackage;

import org.RiskReductionthroughFunctionalityRestriction.impl.RiskReductionthroughFunctionalityRestrictionPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HighLevelVehicleSafetyArgumentPackageImpl extends EPackageImpl implements HighLevelVehicleSafetyArgumentPackage {
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
	private EClass strategy5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategy6EClass = null;

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
	private EClass class8EClass = null;

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
	private EClass class11EClass = null;

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
	 * @see org.HighLevelVehicleSafetyArgument.HighLevelVehicleSafetyArgumentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HighLevelVehicleSafetyArgumentPackageImpl() {
		super(eNS_URI, HighLevelVehicleSafetyArgumentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HighLevelVehicleSafetyArgumentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HighLevelVehicleSafetyArgumentPackage init() {
		if (isInited) return (HighLevelVehicleSafetyArgumentPackage)EPackage.Registry.INSTANCE.getEPackage(HighLevelVehicleSafetyArgumentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHighLevelVehicleSafetyArgumentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HighLevelVehicleSafetyArgumentPackageImpl theHighLevelVehicleSafetyArgumentPackage = registeredHighLevelVehicleSafetyArgumentPackage instanceof HighLevelVehicleSafetyArgumentPackageImpl ? (HighLevelVehicleSafetyArgumentPackageImpl)registeredHighLevelVehicleSafetyArgumentPackage : new HighLevelVehicleSafetyArgumentPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InstantiationoftheRiskManagementPackage.eNS_URI);
		InstantiationoftheRiskManagementPackageImpl theInstantiationoftheRiskManagementPackage = (InstantiationoftheRiskManagementPackageImpl)(registeredPackage instanceof InstantiationoftheRiskManagementPackageImpl ? registeredPackage : InstantiationoftheRiskManagementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PredefinedSafetyRequirementsPackage.eNS_URI);
		PredefinedSafetyRequirementsPackageImpl thePredefinedSafetyRequirementsPackage = (PredefinedSafetyRequirementsPackageImpl)(registeredPackage instanceof PredefinedSafetyRequirementsPackageImpl ? registeredPackage : PredefinedSafetyRequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RiskReductionthroughFunctionalityRestrictionPackage.eNS_URI);
		RiskReductionthroughFunctionalityRestrictionPackageImpl theRiskReductionthroughFunctionalityRestrictionPackage = (RiskReductionthroughFunctionalityRestrictionPackageImpl)(registeredPackage instanceof RiskReductionthroughFunctionalityRestrictionPackageImpl ? registeredPackage : RiskReductionthroughFunctionalityRestrictionPackage.eINSTANCE);

		// Create package meta-data objects
		theHighLevelVehicleSafetyArgumentPackage.createPackageContents();
		theInstantiationoftheRiskManagementPackage.createPackageContents();
		thePredefinedSafetyRequirementsPackage.createPackageContents();
		theRiskReductionthroughFunctionalityRestrictionPackage.createPackageContents();

		// Initialize created meta-data
		theHighLevelVehicleSafetyArgumentPackage.initializePackageContents();
		theInstantiationoftheRiskManagementPackage.initializePackageContents();
		thePredefinedSafetyRequirementsPackage.initializePackageContents();
		theRiskReductionthroughFunctionalityRestrictionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHighLevelVehicleSafetyArgumentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HighLevelVehicleSafetyArgumentPackage.eNS_URI, theHighLevelVehicleSafetyArgumentPackage);
		return theHighLevelVehicleSafetyArgumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal1() {
		return goal1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass2() {
		return class2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass3() {
		return class3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass4() {
		return class4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy5() {
		return strategy5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy6() {
		return strategy6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass7() {
		return class7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass8() {
		return class8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass9() {
		return class9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass10() {
		return class10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass11() {
		return class11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelVehicleSafetyArgumentFactory getHighLevelVehicleSafetyArgumentFactory() {
		return (HighLevelVehicleSafetyArgumentFactory)getEFactoryInstance();
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

		strategy5EClass = createEClass(STRATEGY5);

		strategy6EClass = createEClass(STRATEGY6);

		class7EClass = createEClass(CLASS7);

		class8EClass = createEClass(CLASS8);

		class9EClass = createEClass(CLASS9);

		class10EClass = createEClass(CLASS10);

		class11EClass = createEClass(CLASS11);
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

		initEClass(strategy5EClass, Strategy5.class, "Strategy5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategy6EClass, Strategy6.class, "Strategy6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class7EClass, Class7.class, "Class7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class8EClass, Class8.class, "Class8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class9EClass, Class9.class, "Class9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class10EClass, Class10.class, "Class10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class11EClass, Class11.class, "Class11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			   "originalName", "High Level Vehicle Safety Argument"
		   });
	}

} //HighLevelVehicleSafetyArgumentPackageImpl
