/**
 */
package factory;

import productionschema.ProductionSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.Product#getConstructionProcess <em>Construction Process</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends IdentifiableElement {
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
	 * @see factory.FactoryPackage#getProduct_ConstructionProcess()
	 * @model containment="true"
	 * @generated
	 */
	ProductionSchema getConstructionProcess();

	/**
	 * Sets the value of the '{@link factory.Product#getConstructionProcess <em>Construction Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Process</em>' containment reference.
	 * @see #getConstructionProcess()
	 * @generated
	 */
	void setConstructionProcess(ProductionSchema value);

} // Product
