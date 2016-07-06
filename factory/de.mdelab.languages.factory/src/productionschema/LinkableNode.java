/**
 */
package productionschema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link productionschema.LinkableNode#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link productionschema.LinkableNode#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @see productionschema.ProductionschemaPackage#getLinkableNode()
 * @model abstract="true"
 * @generated
 */
public interface LinkableNode extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link productionschema.Link}.
	 * It is bidirectional and its opposite is '{@link productionschema.Link#getDestinationNode <em>Destination Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see productionschema.ProductionschemaPackage#getLinkableNode_IncomingLinks()
	 * @see productionschema.Link#getDestinationNode
	 * @model opposite="destinationNode"
	 * @generated
	 */
	EList<Link> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link productionschema.Link}.
	 * It is bidirectional and its opposite is '{@link productionschema.Link#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see productionschema.ProductionschemaPackage#getLinkableNode_OutgoingLinks()
	 * @see productionschema.Link#getSourceNode
	 * @model opposite="sourceNode"
	 * @generated
	 */
	EList<Link> getOutgoingLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int degree(boolean isInDegree, boolean isOutDegree);

} // LinkableNode
