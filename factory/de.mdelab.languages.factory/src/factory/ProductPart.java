/**
 */
package factory;

import org.eclipse.emf.common.util.EList;

import productionschema.ProductionSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.ProductPart#getConstructionProcess <em>Construction Process</em>}</li>
 *   <li>{@link factory.ProductPart#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link factory.ProductPart#getSupportedProductVersions <em>Supported Product Versions</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getProductPart()
 * @model
 * @generated
 */
public interface ProductPart extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Construction Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Process</em>' containment reference.
	 * @see #setConstructionProcess(ProductionSchema)
	 * @see factory.FactoryPackage#getProductPart_ConstructionProcess()
	 * @model containment="true"
	 * @generated
	 */
	ProductionSchema getConstructionProcess();

	/**
	 * Sets the value of the '{@link factory.ProductPart#getConstructionProcess <em>Construction Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Process</em>' containment reference.
	 * @see #getConstructionProcess()
	 * @generated
	 */
	void setConstructionProcess(ProductionSchema value);

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
	 * @see factory.FactoryPackage#getProductPart_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link factory.ProductPart#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Supported Product Versions</b></em>' reference list.
	 * The list contents are of type {@link factory.ProductVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Product Versions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Product Versions</em>' reference list.
	 * @see factory.FactoryPackage#getProductPart_SupportedProductVersions()
	 * @model
	 * @generated
	 */
	EList<ProductVersion> getSupportedProductVersions();

} // ProductPart
