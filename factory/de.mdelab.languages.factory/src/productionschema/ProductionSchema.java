/**
 */
package productionschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link productionschema.ProductionSchema#getOwnedLinkableNodes <em>Owned Linkable Nodes</em>}</li>
 *   <li>{@link productionschema.ProductionSchema#getOwnedLinks <em>Owned Links</em>}</li>
 *   <li>{@link productionschema.ProductionSchema#getOwnedMaterials <em>Owned Materials</em>}</li>
 *   <li>{@link productionschema.ProductionSchema#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see productionschema.ProductionschemaPackage#getProductionSchema()
 * @model
 * @generated
 */
public interface ProductionSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Linkable Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link productionschema.LinkableNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Linkable Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Linkable Nodes</em>' containment reference list.
	 * @see productionschema.ProductionschemaPackage#getProductionSchema_OwnedLinkableNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkableNode> getOwnedLinkableNodes();

	/**
	 * Returns the value of the '<em><b>Owned Links</b></em>' containment reference list.
	 * The list contents are of type {@link productionschema.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Links</em>' containment reference list.
	 * @see productionschema.ProductionschemaPackage#getProductionSchema_OwnedLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getOwnedLinks();

	/**
	 * Returns the value of the '<em><b>Owned Materials</b></em>' containment reference list.
	 * The list contents are of type {@link productionschema.Material}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Materials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Materials</em>' containment reference list.
	 * @see productionschema.ProductionschemaPackage#getProductionSchema_OwnedMaterials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Material> getOwnedMaterials();

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
	 * @see productionschema.ProductionschemaPackage#getProductionSchema_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link productionschema.ProductionSchema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ProductionSchema
