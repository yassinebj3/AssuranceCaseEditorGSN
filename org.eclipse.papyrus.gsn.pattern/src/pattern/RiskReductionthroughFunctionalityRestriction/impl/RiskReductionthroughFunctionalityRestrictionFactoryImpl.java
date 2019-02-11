/**
 */
package pattern.RiskReductionthroughFunctionalityRestriction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pattern.RiskReductionthroughFunctionalityRestriction.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiskReductionthroughFunctionalityRestrictionFactoryImpl extends EFactoryImpl implements RiskReductionthroughFunctionalityRestrictionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RiskReductionthroughFunctionalityRestrictionFactory init() {
		try {
			RiskReductionthroughFunctionalityRestrictionFactory theRiskReductionthroughFunctionalityRestrictionFactory = (RiskReductionthroughFunctionalityRestrictionFactory)EPackage.Registry.INSTANCE.getEFactory(RiskReductionthroughFunctionalityRestrictionPackage.eNS_URI);
			if (theRiskReductionthroughFunctionalityRestrictionFactory != null) {
				return theRiskReductionthroughFunctionalityRestrictionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RiskReductionthroughFunctionalityRestrictionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskReductionthroughFunctionalityRestrictionFactoryImpl() {
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
			case RiskReductionthroughFunctionalityRestrictionPackage.CLASS1: return createClass1();
			case RiskReductionthroughFunctionalityRestrictionPackage.GOAL2: return createGoal2();
			case RiskReductionthroughFunctionalityRestrictionPackage.GOAL3: return createGoal3();
			case RiskReductionthroughFunctionalityRestrictionPackage.GOAL4: return createGoal4();
			case RiskReductionthroughFunctionalityRestrictionPackage.CLASS5: return createClass5();
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
	public Class1 createClass1() {
		Class1Impl class1 = new Class1Impl();
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal2 createGoal2() {
		Goal2Impl goal2 = new Goal2Impl();
		return goal2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal3 createGoal3() {
		Goal3Impl goal3 = new Goal3Impl();
		return goal3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal4 createGoal4() {
		Goal4Impl goal4 = new Goal4Impl();
		return goal4;
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
	public RiskReductionthroughFunctionalityRestrictionPackage getRiskReductionthroughFunctionalityRestrictionPackage() {
		return (RiskReductionthroughFunctionalityRestrictionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RiskReductionthroughFunctionalityRestrictionPackage getPackage() {
		return RiskReductionthroughFunctionalityRestrictionPackage.eINSTANCE;
	}

} //RiskReductionthroughFunctionalityRestrictionFactoryImpl
