/**
 */
package factory;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.Product#getProductionStartYear <em>Production Start Year</em>}</li>
 *   <li>{@link factory.Product#getProductionEndYear <em>Production End Year</em>}</li>
 *   <li>{@link factory.Product#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link factory.Product#getOwnedProductVersions <em>Owned Product Versions</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Production Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Start Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Start Year</em>' attribute.
	 * @see #setProductionStartYear(int)
	 * @see factory.FactoryPackage#getProduct_ProductionStartYear()
	 * @model
	 * @generated
	 */
	int getProductionStartYear();

	/**
	 * Sets the value of the '{@link factory.Product#getProductionStartYear <em>Production Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Start Year</em>' attribute.
	 * @see #getProductionStartYear()
	 * @generated
	 */
	void setProductionStartYear(int value);

	/**
	 * Returns the value of the '<em><b>Production End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production End Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production End Year</em>' attribute.
	 * @see #setProductionEndYear(int)
	 * @see factory.FactoryPackage#getProduct_ProductionEndYear()
	 * @model
	 * @generated
	 */
	int getProductionEndYear();

	/**
	 * Sets the value of the '{@link factory.Product#getProductionEndYear <em>Production End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production End Year</em>' attribute.
	 * @see #getProductionEndYear()
	 * @generated
	 */
	void setProductionEndYear(int value);

	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see factory.FactoryPackage#getProduct_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link factory.Product#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Owned Product Versions</b></em>' containment reference list.
	 * The list contents are of type {@link factory.ProductVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Product Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Product Versions</em>' containment reference list.
	 * @see factory.FactoryPackage#getProduct_OwnedProductVersions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductVersion> getOwnedProductVersions();

} // Product
