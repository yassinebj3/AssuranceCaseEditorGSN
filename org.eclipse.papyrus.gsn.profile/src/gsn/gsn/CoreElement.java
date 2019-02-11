/**
 */
package gsn.gsn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.gsn.CoreElement#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link gsn.gsn.CoreElement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link gsn.gsn.CoreElement#getStatement <em>Statement</em>}</li>
 *   <li>{@link gsn.gsn.CoreElement#isUndeveloped <em>Undeveloped</em>}</li>
 *   <li>{@link gsn.gsn.CoreElement#isUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @see gsn.gsn.GSNPackage#getCoreElement()
 * @model
 * @generated
 */
public interface CoreElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see gsn.gsn.GSNPackage#getCoreElement_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link gsn.gsn.CoreElement#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see gsn.gsn.GSNPackage#getCoreElement_Identifier()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link gsn.gsn.CoreElement#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see gsn.gsn.GSNPackage#getCoreElement_Statement()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link gsn.gsn.CoreElement#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Uninstantiated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uninstantiated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uninstantiated</em>' attribute.
	 * @see #setUninstantiated(boolean)
	 * @see gsn.gsn.GSNPackage#getCoreElement_Uninstantiated()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isUninstantiated();

	/**
	 * Sets the value of the '{@link gsn.gsn.CoreElement#isUninstantiated <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uninstantiated</em>' attribute.
	 * @see #isUninstantiated()
	 * @generated
	 */
	void setUninstantiated(boolean value);

	/**
	 * Returns the value of the '<em><b>Undeveloped</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undeveloped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undeveloped</em>' attribute.
	 * @see #setUndeveloped(boolean)
	 * @see gsn.gsn.GSNPackage#getCoreElement_Undeveloped()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isUndeveloped();

	/**
	 * Sets the value of the '{@link gsn.gsn.CoreElement#isUndeveloped <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeveloped</em>' attribute.
	 * @see #isUndeveloped()
	 * @generated
	 */
	void setUndeveloped(boolean value);

} // CoreElement
