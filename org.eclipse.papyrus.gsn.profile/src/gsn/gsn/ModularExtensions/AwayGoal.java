/**
 */
package gsn.gsn.ModularExtensions;

import gsn.gsn.CoreElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.gsn.ModularExtensions.AwayGoal#getModuleIdentifierReference <em>Module Identifier Reference</em>}</li>
 * </ul>
 *
 * @see gsn.gsn.ModularExtensions.ModularExtensionsPackage#getAwayGoal()
 * @model
 * @generated
 */
public interface AwayGoal extends CoreElement {

	/**
	 * Returns the value of the '<em><b>Module Identifier Reference</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Identifier Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Identifier Reference</em>' attribute.
	 * @see #setModuleIdentifierReference(String)
	 * @see gsn.gsn.ModularExtensions.ModularExtensionsPackage#getAwayGoal_ModuleIdentifierReference()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getModuleIdentifierReference();

	/**
	 * Sets the value of the '{@link gsn.gsn.ModularExtensions.AwayGoal#getModuleIdentifierReference <em>Module Identifier Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Identifier Reference</em>' attribute.
	 * @see #getModuleIdentifierReference()
	 * @generated
	 */
	void setModuleIdentifierReference(String value);
} // AwayGoal
