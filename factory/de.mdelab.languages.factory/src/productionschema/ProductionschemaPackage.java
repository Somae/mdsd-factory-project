/**
 */
package productionschema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see productionschema.ProductionschemaFactory
 * @model kind="package"
 * @generated
 */
public interface ProductionschemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "productionschema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/languages/productionschema";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "productionschema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductionschemaPackage eINSTANCE = productionschema.impl.ProductionschemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link productionschema.impl.ProductionSchemaImpl <em>Production Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productionschema.impl.ProductionSchemaImpl
	 * @see productionschema.impl.ProductionschemaPackageImpl#getProductionSchema()
	 * @generated
	 */
	int PRODUCTION_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Owned Linkable Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES = 0;

	/**
	 * The feature id for the '<em><b>Owned Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_SCHEMA__OWNED_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Owned Materials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_SCHEMA__OWNED_MATERIALS = 2;

	/**
	 * The number of structural features of the '<em>Production Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_SCHEMA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Production Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link productionschema.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productionschema.impl.IdentifiableElementImpl
	 * @see productionschema.impl.ProductionschemaPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link productionschema.impl.LinkableNodeImpl <em>Linkable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productionschema.impl.LinkableNodeImpl
	 * @see productionschema.impl.ProductionschemaPackageImpl#getLinkableNode()
	 * @generated
	 */
	int LINKABLE_NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_NODE__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_NODE__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_NODE__INCOMING_LINKS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_NODE__OUTGOING_LINKS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linkable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_NODE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_NODE___DEGREE__BOOLEAN_BOOLEAN = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linkable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_NODE_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link productionschema.impl.ConjunctiveNodeImpl <em>Conjunctive Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productionschema.impl.ConjunctiveNodeImpl
	 * @see productionschema.impl.ProductionschemaPackageImpl#getConjunctiveNode()
	 * @generated
	 */
	int CONJUNCTIVE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTIVE_NODE__ID = LINKABLE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTIVE_NODE__LABEL = LINKABLE_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTIVE_NODE__INCOMING_LINKS = LINKABLE_NODE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTIVE_NODE__OUTGOING_LINKS = LINKABLE_NODE__OUTGOING_LINKS;

	/**
	 * The number of structural features of the '<em>Conjunctive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTIVE_NODE_FEATURE_COUNT = LINKABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTIVE_NODE___DEGREE__BOOLEAN_BOOLEAN = LINKABLE_NODE___DEGREE__BOOLEAN_BOOLEAN;

	/**
	 * The number of operations of the '<em>Conjunctive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTIVE_NODE_OPERATION_COUNT = LINKABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link productionschema.impl.DisjunctiveNodeImpl <em>Disjunctive Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productionschema.impl.DisjunctiveNodeImpl
	 * @see productionschema.impl.ProductionschemaPackageImpl#getDisjunctiveNode()
	 * @generated
	 */
	int DISJUNCTIVE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTIVE_NODE__ID = LINKABLE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTIVE_NODE__LABEL = LINKABLE_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTIVE_NODE__INCOMING_LINKS = LINKABLE_NODE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTIVE_NODE__OUTGOING_LINKS = LINKABLE_NODE__OUTGOING_LINKS;

	/**
	 * The number of structural features of the '<em>Disjunctive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTIVE_NODE_FEATURE_COUNT = LINKABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Degree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTIVE_NODE___DEGREE__BOOLEAN_BOOLEAN = LINKABLE_NODE___DEGREE__BOOLEAN_BOOLEAN;

	/**
	 * The number of operations of the '<em>Disjunctive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTIVE_NODE_OPERATION_COUNT = LINKABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link productionschema.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productionschema.impl.LinkImpl
	 * @see productionschema.impl.ProductionschemaPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE_NODE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DESTINATION_NODE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associated Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ASSOCIATED_MATERIAL = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link productionschema.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see productionschema.impl.MaterialImpl
	 * @see productionschema.impl.ProductionschemaPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link productionschema.ProductionSchema <em>Production Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Schema</em>'.
	 * @see productionschema.ProductionSchema
	 * @generated
	 */
	EClass getProductionSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link productionschema.ProductionSchema#getOwnedLinkableNodes <em>Owned Linkable Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Linkable Nodes</em>'.
	 * @see productionschema.ProductionSchema#getOwnedLinkableNodes()
	 * @see #getProductionSchema()
	 * @generated
	 */
	EReference getProductionSchema_OwnedLinkableNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link productionschema.ProductionSchema#getOwnedLinks <em>Owned Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Links</em>'.
	 * @see productionschema.ProductionSchema#getOwnedLinks()
	 * @see #getProductionSchema()
	 * @generated
	 */
	EReference getProductionSchema_OwnedLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link productionschema.ProductionSchema#getOwnedMaterials <em>Owned Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Materials</em>'.
	 * @see productionschema.ProductionSchema#getOwnedMaterials()
	 * @see #getProductionSchema()
	 * @generated
	 */
	EReference getProductionSchema_OwnedMaterials();

	/**
	 * Returns the meta object for class '{@link productionschema.ConjunctiveNode <em>Conjunctive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunctive Node</em>'.
	 * @see productionschema.ConjunctiveNode
	 * @generated
	 */
	EClass getConjunctiveNode();

	/**
	 * Returns the meta object for class '{@link productionschema.DisjunctiveNode <em>Disjunctive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunctive Node</em>'.
	 * @see productionschema.DisjunctiveNode
	 * @generated
	 */
	EClass getDisjunctiveNode();

	/**
	 * Returns the meta object for class '{@link productionschema.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see productionschema.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link productionschema.Link#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Node</em>'.
	 * @see productionschema.Link#getSourceNode()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_SourceNode();

	/**
	 * Returns the meta object for the reference '{@link productionschema.Link#getDestinationNode <em>Destination Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Node</em>'.
	 * @see productionschema.Link#getDestinationNode()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_DestinationNode();

	/**
	 * Returns the meta object for the reference '{@link productionschema.Link#getAssociatedMaterial <em>Associated Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Material</em>'.
	 * @see productionschema.Link#getAssociatedMaterial()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_AssociatedMaterial();

	/**
	 * Returns the meta object for class '{@link productionschema.LinkableNode <em>Linkable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable Node</em>'.
	 * @see productionschema.LinkableNode
	 * @generated
	 */
	EClass getLinkableNode();

	/**
	 * Returns the meta object for the reference list '{@link productionschema.LinkableNode#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see productionschema.LinkableNode#getIncomingLinks()
	 * @see #getLinkableNode()
	 * @generated
	 */
	EReference getLinkableNode_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link productionschema.LinkableNode#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see productionschema.LinkableNode#getOutgoingLinks()
	 * @see #getLinkableNode()
	 * @generated
	 */
	EReference getLinkableNode_OutgoingLinks();

	/**
	 * Returns the meta object for the '{@link productionschema.LinkableNode#degree(boolean, boolean) <em>Degree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Degree</em>' operation.
	 * @see productionschema.LinkableNode#degree(boolean, boolean)
	 * @generated
	 */
	EOperation getLinkableNode__Degree__boolean_boolean();

	/**
	 * Returns the meta object for class '{@link productionschema.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see productionschema.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link productionschema.IdentifiableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see productionschema.IdentifiableElement#getId()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link productionschema.IdentifiableElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see productionschema.IdentifiableElement#getLabel()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Label();

	/**
	 * Returns the meta object for class '{@link productionschema.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see productionschema.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductionschemaFactory getProductionschemaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link productionschema.impl.ProductionSchemaImpl <em>Production Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productionschema.impl.ProductionSchemaImpl
		 * @see productionschema.impl.ProductionschemaPackageImpl#getProductionSchema()
		 * @generated
		 */
		EClass PRODUCTION_SCHEMA = eINSTANCE.getProductionSchema();

		/**
		 * The meta object literal for the '<em><b>Owned Linkable Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES = eINSTANCE.getProductionSchema_OwnedLinkableNodes();

		/**
		 * The meta object literal for the '<em><b>Owned Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_SCHEMA__OWNED_LINKS = eINSTANCE.getProductionSchema_OwnedLinks();

		/**
		 * The meta object literal for the '<em><b>Owned Materials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_SCHEMA__OWNED_MATERIALS = eINSTANCE.getProductionSchema_OwnedMaterials();

		/**
		 * The meta object literal for the '{@link productionschema.impl.ConjunctiveNodeImpl <em>Conjunctive Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productionschema.impl.ConjunctiveNodeImpl
		 * @see productionschema.impl.ProductionschemaPackageImpl#getConjunctiveNode()
		 * @generated
		 */
		EClass CONJUNCTIVE_NODE = eINSTANCE.getConjunctiveNode();

		/**
		 * The meta object literal for the '{@link productionschema.impl.DisjunctiveNodeImpl <em>Disjunctive Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productionschema.impl.DisjunctiveNodeImpl
		 * @see productionschema.impl.ProductionschemaPackageImpl#getDisjunctiveNode()
		 * @generated
		 */
		EClass DISJUNCTIVE_NODE = eINSTANCE.getDisjunctiveNode();

		/**
		 * The meta object literal for the '{@link productionschema.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productionschema.impl.LinkImpl
		 * @see productionschema.impl.ProductionschemaPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE_NODE = eINSTANCE.getLink_SourceNode();

		/**
		 * The meta object literal for the '<em><b>Destination Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DESTINATION_NODE = eINSTANCE.getLink_DestinationNode();

		/**
		 * The meta object literal for the '<em><b>Associated Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ASSOCIATED_MATERIAL = eINSTANCE.getLink_AssociatedMaterial();

		/**
		 * The meta object literal for the '{@link productionschema.impl.LinkableNodeImpl <em>Linkable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productionschema.impl.LinkableNodeImpl
		 * @see productionschema.impl.ProductionschemaPackageImpl#getLinkableNode()
		 * @generated
		 */
		EClass LINKABLE_NODE = eINSTANCE.getLinkableNode();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKABLE_NODE__INCOMING_LINKS = eINSTANCE.getLinkableNode_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKABLE_NODE__OUTGOING_LINKS = eINSTANCE.getLinkableNode_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINKABLE_NODE___DEGREE__BOOLEAN_BOOLEAN = eINSTANCE.getLinkableNode__Degree__boolean_boolean();

		/**
		 * The meta object literal for the '{@link productionschema.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productionschema.impl.IdentifiableElementImpl
		 * @see productionschema.impl.ProductionschemaPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__LABEL = eINSTANCE.getIdentifiableElement_Label();

		/**
		 * The meta object literal for the '{@link productionschema.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see productionschema.impl.MaterialImpl
		 * @see productionschema.impl.ProductionschemaPackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

	}

} //ProductionschemaPackage
