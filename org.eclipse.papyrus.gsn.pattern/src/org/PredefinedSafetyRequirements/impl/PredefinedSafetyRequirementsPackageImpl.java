/**
 */
package org.PredefinedSafetyRequirements.impl;

import org.HighLevelVehicleSafetyArgument.HighLevelVehicleSafetyArgumentPackage;

import org.HighLevelVehicleSafetyArgument.impl.HighLevelVehicleSafetyArgumentPackageImpl;

import org.InstantiationoftheRiskManagement.InstantiationoftheRiskManagementPackage;

import org.InstantiationoftheRiskManagement.impl.InstantiationoftheRiskManagementPackageImpl;

import org.PredefinedSafetyRequirements.Class10;
import org.PredefinedSafetyRequirements.Class11;
import org.PredefinedSafetyRequirements.Class12;
import org.PredefinedSafetyRequirements.Class2;
import org.PredefinedSafetyRequirements.Class3;
import org.PredefinedSafetyRequirements.Class4;
import org.PredefinedSafetyRequirements.Class6;
import org.PredefinedSafetyRequirements.Goal1;
import org.PredefinedSafetyRequirements.Goal7;
import org.PredefinedSafetyRequirements.Goal8;
import org.PredefinedSafetyRequirements.Goal9;
import org.PredefinedSafetyRequirements.PredefinedSafetyRequirementsFactory;
import org.PredefinedSafetyRequirements.PredefinedSafetyRequirementsPackage;
import org.PredefinedSafetyRequirements.Strategy5;

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
public class PredefinedSafetyRequirementsPackageImpl extends EPackageImpl implements PredefinedSafetyRequirementsPackage {
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
	private EClass class6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goal7EClass = null;

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
	private EClass goal9EClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class12EClass = null;

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
	 * @see org.PredefinedSafetyRequirements.PredefinedSafetyRequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PredefinedSafetyRequirementsPackageImpl() {
		super(eNS_URI, PredefinedSafetyRequirementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PredefinedSafetyRequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PredefinedSafetyRequirementsPackage init() {
		if (isInited) return (PredefinedSafetyRequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(PredefinedSafetyRequirementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPredefinedSafetyRequirementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PredefinedSafetyRequirementsPackageImpl thePredefinedSafetyRequirementsPackage = registeredPredefinedSafetyRequirementsPackage instanceof PredefinedSafetyRequirementsPackageImpl ? (PredefinedSafetyRequirementsPackageImpl)registeredPredefinedSafetyRequirementsPackage : new PredefinedSafetyRequirementsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HighLevelVehicleSafetyArgumentPackage.eNS_URI);
		HighLevelVehicleSafetyArgumentPackageImpl theHighLevelVehicleSafetyArgumentPackage = (HighLevelVehicleSafetyArgumentPackageImpl)(registeredPackage instanceof HighLevelVehicleSafetyArgumentPackageImpl ? registeredPackage : HighLevelVehicleSafetyArgumentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InstantiationoftheRiskManagementPackage.eNS_URI);
		InstantiationoftheRiskManagementPackageImpl theInstantiationoftheRiskManagementPackage = (InstantiationoftheRiskManagementPackageImpl)(registeredPackage instanceof InstantiationoftheRiskManagementPackageImpl ? registeredPackage : InstantiationoftheRiskManagementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RiskReductionthroughFunctionalityRestrictionPackage.eNS_URI);
		RiskReductionthroughFunctionalityRestrictionPackageImpl theRiskReductionthroughFunctionalityRestrictionPackage = (RiskReductionthroughFunctionalityRestrictionPackageImpl)(registeredPackage instanceof RiskReductionthroughFunctionalityRestrictionPackageImpl ? registeredPackage : RiskReductionthroughFunctionalityRestrictionPackage.eINSTANCE);

		// Create package meta-data objects
		thePredefinedSafetyRequirementsPackage.createPackageContents();
		theHighLevelVehicleSafetyArgumentPackage.createPackageContents();
		theInstantiationoftheRiskManagementPackage.createPackageContents();
		theRiskReductionthroughFunctionalityRestrictionPackage.createPackageContents();

		// Initialize created meta-data
		thePredefinedSafetyRequirementsPackage.initializePackageContents();
		theHighLevelVehicleSafetyArgumentPackage.initializePackageContents();
		theInstantiationoftheRiskManagementPackage.initializePackageContents();
		theRiskReductionthroughFunctionalityRestrictionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePredefinedSafetyRequirementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PredefinedSafetyRequirementsPackage.eNS_URI, thePredefinedSafetyRequirementsPackage);
		return thePredefinedSafetyRequirementsPackage;
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
	public EClass getClass6() {
		return class6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal7() {
		return goal7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal8() {
		return goal8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal9() {
		return goal9EClass;
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
	public EClass getClass12() {
		return class12EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedSafetyRequirementsFactory getPredefinedSafetyRequirementsFactory() {
		return (PredefinedSafetyRequirementsFactory)getEFactoryInstance();
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

		class6EClass = createEClass(CLASS6);

		goal7EClass = createEClass(GOAL7);

		goal8EClass = createEClass(GOAL8);

		goal9EClass = createEClass(GOAL9);

		class10EClass = createEClass(CLASS10);

		class11EClass = createEClass(CLASS11);

		class12EClass = createEClass(CLASS12);
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

		initEClass(class6EClass, Class6.class, "Class6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal7EClass, Goal7.class, "Goal7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal8EClass, Goal8.class, "Goal8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goal9EClass, Goal9.class, "Goal9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class10EClass, Class10.class, "Class10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class11EClass, Class11.class, "Class11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(class12EClass, Class12.class, "Class12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			   "originalName", "Predefined Safety Requirements"
		   });
	}

} //PredefinedSafetyRequirementsPackageImpl
