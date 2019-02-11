/**
 */
package pattern.PredefinedSafetyRequirements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pattern.PredefinedSafetyRequirements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredefinedSafetyRequirementsFactoryImpl extends EFactoryImpl implements PredefinedSafetyRequirementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PredefinedSafetyRequirementsFactory init() {
		try {
			PredefinedSafetyRequirementsFactory thePredefinedSafetyRequirementsFactory = (PredefinedSafetyRequirementsFactory)EPackage.Registry.INSTANCE.getEFactory(PredefinedSafetyRequirementsPackage.eNS_URI);
			if (thePredefinedSafetyRequirementsFactory != null) {
				return thePredefinedSafetyRequirementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PredefinedSafetyRequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedSafetyRequirementsFactoryImpl() {
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
			case PredefinedSafetyRequirementsPackage.GOAL1: return createGoal1();
			case PredefinedSafetyRequirementsPackage.CLASS2: return createClass2();
			case PredefinedSafetyRequirementsPackage.CLASS3: return createClass3();
			case PredefinedSafetyRequirementsPackage.CLASS4: return createClass4();
			case PredefinedSafetyRequirementsPackage.STRATEGY5: return createStrategy5();
			case PredefinedSafetyRequirementsPackage.CLASS6: return createClass6();
			case PredefinedSafetyRequirementsPackage.GOAL7: return createGoal7();
			case PredefinedSafetyRequirementsPackage.GOAL8: return createGoal8();
			case PredefinedSafetyRequirementsPackage.GOAL9: return createGoal9();
			case PredefinedSafetyRequirementsPackage.CLASS10: return createClass10();
			case PredefinedSafetyRequirementsPackage.CLASS11: return createClass11();
			case PredefinedSafetyRequirementsPackage.CLASS12: return createClass12();
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
	public Goal1 createGoal1() {
		Goal1Impl goal1 = new Goal1Impl();
		return goal1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class2 createClass2() {
		Class2Impl class2 = new Class2Impl();
		return class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class3 createClass3() {
		Class3Impl class3 = new Class3Impl();
		return class3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class4 createClass4() {
		Class4Impl class4 = new Class4Impl();
		return class4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strategy5 createStrategy5() {
		Strategy5Impl strategy5 = new Strategy5Impl();
		return strategy5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class6 createClass6() {
		Class6Impl class6 = new Class6Impl();
		return class6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal7 createGoal7() {
		Goal7Impl goal7 = new Goal7Impl();
		return goal7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal8 createGoal8() {
		Goal8Impl goal8 = new Goal8Impl();
		return goal8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal9 createGoal9() {
		Goal9Impl goal9 = new Goal9Impl();
		return goal9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class10 createClass10() {
		Class10Impl class10 = new Class10Impl();
		return class10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class11 createClass11() {
		Class11Impl class11 = new Class11Impl();
		return class11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class12 createClass12() {
		Class12Impl class12 = new Class12Impl();
		return class12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredefinedSafetyRequirementsPackage getPredefinedSafetyRequirementsPackage() {
		return (PredefinedSafetyRequirementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PredefinedSafetyRequirementsPackage getPackage() {
		return PredefinedSafetyRequirementsPackage.eINSTANCE;
	}

} //PredefinedSafetyRequirementsFactoryImpl
