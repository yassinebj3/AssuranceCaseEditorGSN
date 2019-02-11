/**
 */
package pattern.HighLevelVehicleSafetyArgument.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pattern.HighLevelVehicleSafetyArgument.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HighLevelVehicleSafetyArgumentFactoryImpl extends EFactoryImpl implements HighLevelVehicleSafetyArgumentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HighLevelVehicleSafetyArgumentFactory init() {
		try {
			HighLevelVehicleSafetyArgumentFactory theHighLevelVehicleSafetyArgumentFactory = (HighLevelVehicleSafetyArgumentFactory)EPackage.Registry.INSTANCE.getEFactory(HighLevelVehicleSafetyArgumentPackage.eNS_URI);
			if (theHighLevelVehicleSafetyArgumentFactory != null) {
				return theHighLevelVehicleSafetyArgumentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HighLevelVehicleSafetyArgumentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelVehicleSafetyArgumentFactoryImpl() {
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
			case HighLevelVehicleSafetyArgumentPackage.GOAL1: return createGoal1();
			case HighLevelVehicleSafetyArgumentPackage.CLASS2: return createClass2();
			case HighLevelVehicleSafetyArgumentPackage.CLASS3: return createClass3();
			case HighLevelVehicleSafetyArgumentPackage.CLASS4: return createClass4();
			case HighLevelVehicleSafetyArgumentPackage.STRATEGY5: return createStrategy5();
			case HighLevelVehicleSafetyArgumentPackage.STRATEGY6: return createStrategy6();
			case HighLevelVehicleSafetyArgumentPackage.CLASS7: return createClass7();
			case HighLevelVehicleSafetyArgumentPackage.CLASS8: return createClass8();
			case HighLevelVehicleSafetyArgumentPackage.CLASS9: return createClass9();
			case HighLevelVehicleSafetyArgumentPackage.CLASS10: return createClass10();
			case HighLevelVehicleSafetyArgumentPackage.CLASS11: return createClass11();
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
	public Strategy6 createStrategy6() {
		Strategy6Impl strategy6 = new Strategy6Impl();
		return strategy6;
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
	public Class8 createClass8() {
		Class8Impl class8 = new Class8Impl();
		return class8;
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
	public HighLevelVehicleSafetyArgumentPackage getHighLevelVehicleSafetyArgumentPackage() {
		return (HighLevelVehicleSafetyArgumentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HighLevelVehicleSafetyArgumentPackage getPackage() {
		return HighLevelVehicleSafetyArgumentPackage.eINSTANCE;
	}

} //HighLevelVehicleSafetyArgumentFactoryImpl
