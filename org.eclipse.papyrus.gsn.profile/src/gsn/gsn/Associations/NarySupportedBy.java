/**
 */
package gsn.gsn.Associations;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary Supported By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.gsn.Associations.NarySupportedBy#getBase_Association <em>Base Association</em>}</li>
 * </ul>
 *
 * @see gsn.gsn.Associations.AssociationsPackage#getNarySupportedBy()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='N-arySupportedBy'"
 * @generated
 */
public interface NarySupportedBy extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see gsn.gsn.Associations.AssociationsPackage#getNarySupportedBy_Base_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link gsn.gsn.Associations.NarySupportedBy#getBase_Association <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

} // NarySupportedBy
