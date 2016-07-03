/**
 */
package de.mdelab.mltgg.productionschema2petrinet;

import de.mdelab.mltgg.mote2.Mote2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.mdelab.mltgg.productionschema2petrinet.Productionschema2petrinetFactory
 * @model kind="package"
 * @generated
 */
public interface Productionschema2petrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "productionschema2petrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/languages/productionschema2petrinet/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "productionschema2petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Productionschema2petrinetPackage eINSTANCE = de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrAxiomImpl <em>Corr Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrAxiomImpl
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrAxiom()
	 * @generated
	 */
	int CORR_AXIOM = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrConjunctiveNodeImpl <em>Corr Conjunctive Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrConjunctiveNodeImpl
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrConjunctiveNode()
	 * @generated
	 */
	int CORR_CONJUNCTIVE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONJUNCTIVE_NODE__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONJUNCTIVE_NODE__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONJUNCTIVE_NODE__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONJUNCTIVE_NODE__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONJUNCTIVE_NODE__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONJUNCTIVE_NODE__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Conjunctive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONJUNCTIVE_NODE_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Conjunctive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONJUNCTIVE_NODE_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrDisjunctiveNodeImpl <em>Corr Disjunctive Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrDisjunctiveNodeImpl
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrDisjunctiveNode()
	 * @generated
	 */
	int CORR_DISJUNCTIVE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_DISJUNCTIVE_NODE__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_DISJUNCTIVE_NODE__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_DISJUNCTIVE_NODE__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_DISJUNCTIVE_NODE__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_DISJUNCTIVE_NODE__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_DISJUNCTIVE_NODE__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Disjunctive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_DISJUNCTIVE_NODE_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Disjunctive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_DISJUNCTIVE_NODE_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrMaterialLinkImpl <em>Corr Material Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrMaterialLinkImpl
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrMaterialLink()
	 * @generated
	 */
	int CORR_MATERIAL_LINK = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_MATERIAL_LINK__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_MATERIAL_LINK__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_MATERIAL_LINK__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_MATERIAL_LINK__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_MATERIAL_LINK__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_MATERIAL_LINK__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Material Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_MATERIAL_LINK_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Material Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_MATERIAL_LINK_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrEdgeImpl <em>Corr Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrEdgeImpl
	 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrEdge()
	 * @generated
	 */
	int CORR_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_EDGE__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_EDGE__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_EDGE__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_EDGE__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_EDGE__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_EDGE__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_EDGE_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_EDGE_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.productionschema2petrinet.CorrAxiom <em>Corr Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Axiom</em>'.
	 * @see de.mdelab.mltgg.productionschema2petrinet.CorrAxiom
	 * @generated
	 */
	EClass getCorrAxiom();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.productionschema2petrinet.CorrConjunctiveNode <em>Corr Conjunctive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Conjunctive Node</em>'.
	 * @see de.mdelab.mltgg.productionschema2petrinet.CorrConjunctiveNode
	 * @generated
	 */
	EClass getCorrConjunctiveNode();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.productionschema2petrinet.CorrDisjunctiveNode <em>Corr Disjunctive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Disjunctive Node</em>'.
	 * @see de.mdelab.mltgg.productionschema2petrinet.CorrDisjunctiveNode
	 * @generated
	 */
	EClass getCorrDisjunctiveNode();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.productionschema2petrinet.CorrMaterialLink <em>Corr Material Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Material Link</em>'.
	 * @see de.mdelab.mltgg.productionschema2petrinet.CorrMaterialLink
	 * @generated
	 */
	EClass getCorrMaterialLink();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.productionschema2petrinet.CorrEdge <em>Corr Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Edge</em>'.
	 * @see de.mdelab.mltgg.productionschema2petrinet.CorrEdge
	 * @generated
	 */
	EClass getCorrEdge();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Productionschema2petrinetFactory getProductionschema2petrinetFactory();

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
		 * The meta object literal for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrAxiomImpl <em>Corr Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrAxiomImpl
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrAxiom()
		 * @generated
		 */
		EClass CORR_AXIOM = eINSTANCE.getCorrAxiom();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrConjunctiveNodeImpl <em>Corr Conjunctive Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrConjunctiveNodeImpl
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrConjunctiveNode()
		 * @generated
		 */
		EClass CORR_CONJUNCTIVE_NODE = eINSTANCE.getCorrConjunctiveNode();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrDisjunctiveNodeImpl <em>Corr Disjunctive Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrDisjunctiveNodeImpl
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrDisjunctiveNode()
		 * @generated
		 */
		EClass CORR_DISJUNCTIVE_NODE = eINSTANCE.getCorrDisjunctiveNode();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrMaterialLinkImpl <em>Corr Material Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrMaterialLinkImpl
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrMaterialLink()
		 * @generated
		 */
		EClass CORR_MATERIAL_LINK = eINSTANCE.getCorrMaterialLink();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.productionschema2petrinet.impl.CorrEdgeImpl <em>Corr Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.CorrEdgeImpl
		 * @see de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl#getCorrEdge()
		 * @generated
		 */
		EClass CORR_EDGE = eINSTANCE.getCorrEdge();

	}

} //Productionschema2petrinetPackage
