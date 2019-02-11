/**
 */
package pattern.InstantiationoftheRiskManagement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pattern.InstantiationoftheRiskManagement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstantiationoftheRiskManagementFactoryImpl extends EFactoryImpl implements InstantiationoftheRiskManagementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstantiationoftheRiskManagementFactory init() {
		try {
			InstantiationoftheRiskManagementFactory theInstantiationoftheRiskManagementFactory = (InstantiationoftheRiskManagementFactory)EPackage.Registry.INSTANCE.getEFactory(InstantiationoftheRiskManagementPackage.eNS_URI);
			if (theInstantiationoftheRiskManagementFactory != null) {
				return theInstantiationoftheRiskManagementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstantiationoftheRiskManagementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationoftheRiskManagementFactoryImpl() {
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
			case InstantiationoftheRiskManagementPackage.GOAL1: return createGoal1();
			case InstantiationoftheRiskManagementPackage.CLASS2: return createClass2();
			case InstantiationoftheRiskManagementPackage.CLASS3: return createClass3();
			case InstantiationoftheRiskManagementPackage.CLASS4: return createClass4();
			case InstantiationoftheRiskManagementPackage.CLASS5: return createClass5();
			case InstantiationoftheRiskManagementPackage.CLASS6: return createClass6();
			case InstantiationoftheRiskManagementPackage.CLASS7: return createClass7();
			case InstantiationoftheRiskManagementPackage.GOAL8: return createGoal8();
			case InstantiationoftheRiskManagementPackage.CLASS9: return createClass9();
			case InstantiationoftheRiskManagementPackage.CLASS10: return createClass10();
			case InstantiationoftheRiskManagementPackage.STRATEGY11: return createStrategy11();
			case InstantiationoftheRiskManagementPackage.GOAL12: return createGoal12();
			case InstantiationoftheRiskManagementPackage.STRATEGY13: return createStrategy13();
			case InstantiationoftheRiskManagementPackage.CLASS14: return createClass14();
			case InstantiationoftheRiskManagementPackage.CLASS15: return createClass15();
			case InstantiationoftheRiskManagementPackage.GOAL16: return createGoal16();
			case InstantiationoftheRiskManagementPackage.CLASS17: return createClass17();
			case InstantiationoftheRiskManagementPackage.CLASS18: return createClass18();
			case InstantiationoftheRiskManagementPackage.CLASS19: return createClass19();
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
	public Class5 createClass5() {
		Class5Impl class5 = new Class5Impl();
		return class5;
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
	public Class7 createClass7() {
		Class7Impl class7 = new Class7Impl();
		return class7;
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
	public Class9 createClass9() {
		Class9Impl class9 = new Class9Impl();
		return class9;
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
	public Strategy11 createStrategy11() {
		Strategy11Impl strategy11 = new Strategy11Impl();
		return strategy11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal12 createGoal12() {
		Goal12Impl goal12 = new Goal12Impl();
		return goal12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strategy13 createStrategy13() {
		Strategy13Impl strategy13 = new Strategy13Impl();
		return strategy13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class14 createClass14() {
		Class14Impl class14 = new Class14Impl();
		return class14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class15 createClass15() {
		Class15Impl class15 = new Class15Impl();
		return class15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal16 createGoal16() {
		Goal16Impl goal16 = new Goal16Impl();
		return goal16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class17 createClass17() {
		Class17Impl class17 = new Class17Impl();
		return class17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class18 createClass18() {
		Class18Impl class18 = new Class18Impl();
		return class18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class19 createClass19() {
		Class19Impl class19 = new Class19Impl();
		return class19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstantiationoftheRiskManagementPackage getInstantiationoftheRiskManagementPackage() {
		return (InstantiationoftheRiskManagementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstantiationoftheRiskManagementPackage getPackage() {
		return InstantiationoftheRiskManagementPackage.eINSTANCE;
	}

} //InstantiationoftheRiskManagementFactoryImpl
