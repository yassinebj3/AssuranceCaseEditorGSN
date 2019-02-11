/**
 */
package gsn.gsn.ModularExtensions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gsn.gsn.ModularExtensions.ModularExtensionsPackage
 * @generated
 */
public interface ModularExtensionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularExtensionsFactory eINSTANCE = gsn.gsn.ModularExtensions.impl.ModularExtensionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Away Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Away Goal</em>'.
	 * @generated
	 */
	AwayGoal createAwayGoal();

	/**
	 * Returns a new object of class '<em>Away Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Away Solution</em>'.
	 * @generated
	 */
	AwaySolution createAwaySolution();

	/**
	 * Returns a new object of class '<em>Away Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Away Context</em>'.
	 * @generated
	 */
	AwayContext createAwayContext();

	/**
	 * Returns a new object of class '<em>Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Reference</em>'.
	 * @generated
	 */
	ModuleReference createModuleReference();

	/**
	 * Returns a new object of class '<em>Contract Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Module Reference</em>'.
	 * @generated
	 */
	ContractModuleReference createContractModuleReference();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Contract Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Module</em>'.
	 * @generated
	 */
	ContractModule createContractModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModularExtensionsPackage getModularExtensionsPackage();

} //ModularExtensionsFactory
