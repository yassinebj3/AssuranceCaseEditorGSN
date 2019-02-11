/**
 */
package gsn.gsn.Associations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gsn.gsn.Associations.AssociationsPackage
 * @generated
 */
public interface AssociationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssociationsFactory eINSTANCE = gsn.gsn.Associations.impl.AssociationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Supported By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported By</em>'.
	 * @generated
	 */
	SupportedBy createSupportedBy();

	/**
	 * Returns a new object of class '<em>Nary Supported By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nary Supported By</em>'.
	 * @generated
	 */
	NarySupportedBy createNarySupportedBy();

	/**
	 * Returns a new object of class '<em>Optionnal Supported By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optionnal Supported By</em>'.
	 * @generated
	 */
	OptionnalSupportedBy createOptionnalSupportedBy();

	/**
	 * Returns a new object of class '<em>Optionnal In Context Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optionnal In Context Of</em>'.
	 * @generated
	 */
	OptionnalInContextOf createOptionnalInContextOf();

	/**
	 * Returns a new object of class '<em>Nary In Context Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nary In Context Of</em>'.
	 * @generated
	 */
	NaryInContextOf createNaryInContextOf();

	/**
	 * Returns a new object of class '<em>In Context Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Context Of</em>'.
	 * @generated
	 */
	InContextOf createInContextOf();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssociationsPackage getAssociationsPackage();

} //AssociationsFactory
