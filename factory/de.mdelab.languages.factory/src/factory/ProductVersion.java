/**
 */
package factory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.ProductVersion#getDescription <em>Description</em>}</li>
 *   <li>{@link factory.ProductVersion#getVersionStartYear <em>Version Start Year</em>}</li>
 *   <li>{@link factory.ProductVersion#getVersionEndYear <em>Version End Year</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getProductVersion()
 * @model
 * @generated
 */
public interface ProductVersion extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see factory.FactoryPackage#getProductVersion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link factory.ProductVersion#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Start Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Start Year</em>' attribute.
	 * @see #setVersionStartYear(int)
	 * @see factory.FactoryPackage#getProductVersion_VersionStartYear()
	 * @model
	 * @generated
	 */
	int getVersionStartYear();

	/**
	 * Sets the value of the '{@link factory.ProductVersion#getVersionStartYear <em>Version Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Start Year</em>' attribute.
	 * @see #getVersionStartYear()
	 * @generated
	 */
	void setVersionStartYear(int value);

	/**
	 * Returns the value of the '<em><b>Version End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version End Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version End Year</em>' attribute.
	 * @see #setVersionEndYear(int)
	 * @see factory.FactoryPackage#getProductVersion_VersionEndYear()
	 * @model
	 * @generated
	 */
	int getVersionEndYear();

	/**
	 * Sets the value of the '{@link factory.ProductVersion#getVersionEndYear <em>Version End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version End Year</em>' attribute.
	 * @see #getVersionEndYear()
	 * @generated
	 */
	void setVersionEndYear(int value);

} // ProductVersion
