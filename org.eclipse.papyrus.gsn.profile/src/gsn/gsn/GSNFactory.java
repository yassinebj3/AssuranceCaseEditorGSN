/**
 */
package gsn.gsn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gsn.gsn.GSNPackage
 * @generated
 */
public interface GSNFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GSNFactory eINSTANCE = gsn.gsn.impl.GSNFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Core Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Element</em>'.
	 * @generated
	 */
	CoreElement createCoreElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GSNPackage getGSNPackage();

} //GSNFactory
