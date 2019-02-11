/**
 */
package gsn.gsn.ModularExtensions.impl;

import gsn.gsn.ModularExtensions.AwayContext;
import gsn.gsn.ModularExtensions.AwayGoal;
import gsn.gsn.ModularExtensions.AwaySolution;
import gsn.gsn.ModularExtensions.ContractModule;
import gsn.gsn.ModularExtensions.ContractModuleReference;
import gsn.gsn.ModularExtensions.ModularExtensionsFactory;
import gsn.gsn.ModularExtensions.ModularExtensionsPackage;
import gsn.gsn.ModularExtensions.ModuleReference;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModularExtensionsFactoryImpl extends EFactoryImpl implements ModularExtensionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModularExtensionsFactory init() {
		try {
			ModularExtensionsFactory theModularExtensionsFactory = (ModularExtensionsFactory)EPackage.Registry.INSTANCE.getEFactory(ModularExtensionsPackage.eNS_URI);
			if (theModularExtensionsFactory != null) {
				return theModularExtensionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModularExtensionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularExtensionsFactoryImpl() {
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
			case ModularExtensionsPackage.AWAY_GOAL: return createAwayGoal();
			case ModularExtensionsPackage.AWAY_SOLUTION: return createAwaySolution();
			case ModularExtensionsPackage.AWAY_CONTEXT: return createAwayContext();
			case ModularExtensionsPackage.MODULE_REFERENCE: return createModuleReference();
			case ModularExtensionsPackage.CONTRACT_MODULE_REFERENCE: return createContractModuleReference();
			case ModularExtensionsPackage.MODULE: return createModule();
			case ModularExtensionsPackage.CONTRACT_MODULE: return createContractModule();
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
	public AwayGoal createAwayGoal() {
		AwayGoalImpl awayGoal = new AwayGoalImpl();
		return awayGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwaySolution createAwaySolution() {
		AwaySolutionImpl awaySolution = new AwaySolutionImpl();
		return awaySolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwayContext createAwayContext() {
		AwayContextImpl awayContext = new AwayContextImpl();
		return awayContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleReference createModuleReference() {
		ModuleReferenceImpl moduleReference = new ModuleReferenceImpl();
		return moduleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractModuleReference createContractModuleReference() {
		ContractModuleReferenceImpl contractModuleReference = new ContractModuleReferenceImpl();
		return contractModuleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public gsn.gsn.ModularExtensions.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractModule createContractModule() {
		ContractModuleImpl contractModule = new ContractModuleImpl();
		return contractModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModularExtensionsPackage getModularExtensionsPackage() {
		return (ModularExtensionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModularExtensionsPackage getPackage() {
		return ModularExtensionsPackage.eINSTANCE;
	}

} //ModularExtensionsFactoryImpl
