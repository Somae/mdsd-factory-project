/**
 */
package productionschema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link productionschema.Link#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link productionschema.Link#getDestinationNode <em>Destination Node</em>}</li>
 *   <li>{@link productionschema.Link#getAssociatedMaterial <em>Associated Material</em>}</li>
 * </ul>
 *
 * @see productionschema.ProductionschemaPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link productionschema.LinkableNode#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Node</em>' reference.
	 * @see #setSourceNode(LinkableNode)
	 * @see productionschema.ProductionschemaPackage#getLink_SourceNode()
	 * @see productionschema.LinkableNode#getOutgoingLinks
	 * @model opposite="outgoingLinks" required="true"
	 * @generated
	 */
	LinkableNode getSourceNode();

	/**
	 * Sets the value of the '{@link productionschema.Link#getSourceNode <em>Source Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node</em>' reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(LinkableNode value);

	/**
	 * Returns the value of the '<em><b>Destination Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link productionschema.LinkableNode#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Node</em>' reference.
	 * @see #setDestinationNode(LinkableNode)
	 * @see productionschema.ProductionschemaPackage#getLink_DestinationNode()
	 * @see productionschema.LinkableNode#getIncomingLinks
	 * @model opposite="incomingLinks" required="true"
	 * @generated
	 */
	LinkableNode getDestinationNode();

	/**
	 * Sets the value of the '{@link productionschema.Link#getDestinationNode <em>Destination Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Node</em>' reference.
	 * @see #getDestinationNode()
	 * @generated
	 */
	void setDestinationNode(LinkableNode value);

	/**
	 * Returns the value of the '<em><b>Associated Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Material</em>' reference.
	 * @see #setAssociatedMaterial(Material)
	 * @see productionschema.ProductionschemaPackage#getLink_AssociatedMaterial()
	 * @model
	 * @generated
	 */
	Material getAssociatedMaterial();

	/**
	 * Sets the value of the '{@link productionschema.Link#getAssociatedMaterial <em>Associated Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Material</em>' reference.
	 * @see #getAssociatedMaterial()
	 * @generated
	 */
	void setAssociatedMaterial(Material value);

} // Link
