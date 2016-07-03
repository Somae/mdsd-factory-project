/**
 */
package de.mdelab.mltgg.productionschema2petrinet.generated.impl;

import de.mdelab.mltgg.productionschema2petrinet.generated.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratedFactoryImpl extends EFactoryImpl implements GeneratedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratedFactory init() {
		try {
			GeneratedFactory theGeneratedFactory = (GeneratedFactory) EPackage.Registry.INSTANCE
					.getEFactory(GeneratedPackage.eNS_URI);
			if (theGeneratedFactory != null) {
				return theGeneratedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_OPERATIONAL_TGG:
			return createproductionschema2petrinetOperationalTGG();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_AXIOM:
			return createproductionschema2petrinetAxiom();
		case GeneratedPackage.PRODUCTION_SCHEMA2PETRINET_DISJUNCTIVE_NODE:
			return createproductionSchema2petrinetDisjunctiveNode();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_DISJUNCTIVE_NODE_IN:
			return createproductionschema2petrinetDisjunctiveNodeIn();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE:
			return createproductionschema2petrinetConjunctiveNode();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_LINK:
			return createproductionschema2petrinetLink();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_IN:
			return createproductionschema2petrinetConjunctiveNodeIn();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_DISJUNCTIVE_NODE_OUT:
			return createproductionschema2petrinetDisjunctiveNodeOut();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_OUT:
			return createproductionschema2petrinetConjunctiveNodeOut();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_AXIOM_R1:
			return createproductionschema2petrinetAxiom_r1();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_DISJUNCTIVE_NODE_IN_R7:
			return createproductionschema2petrinetDisjunctiveNodeIn_r7();
		case GeneratedPackage.PRODUCTION_SCHEMA2PETRINET_DISJUNCTIVE_NODE_R3:
			return createproductionSchema2petrinetDisjunctiveNode_r3();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_OUT_R6:
			return createproductionschema2petrinetConjunctiveNodeOut_r6();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_LINK_R4:
			return createproductionschema2petrinetLink_r4();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_DISJUNCTIVE_NODE_OUT_R8:
			return createproductionschema2petrinetDisjunctiveNodeOut_r8();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_IN_R5:
			return createproductionschema2petrinetConjunctiveNodeIn_r5();
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_R2:
			return createproductionschema2petrinetConjunctiveNode_r2();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetOperationalTGG createproductionschema2petrinetOperationalTGG() {
		productionschema2petrinetOperationalTGGImpl productionschema2petrinetOperationalTGG = new productionschema2petrinetOperationalTGGImpl();
		return productionschema2petrinetOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetAxiom createproductionschema2petrinetAxiom() {
		productionschema2petrinetAxiomImpl productionschema2petrinetAxiom = new productionschema2petrinetAxiomImpl();
		return productionschema2petrinetAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionSchema2petrinetDisjunctiveNode createproductionSchema2petrinetDisjunctiveNode() {
		productionSchema2petrinetDisjunctiveNodeImpl productionSchema2petrinetDisjunctiveNode = new productionSchema2petrinetDisjunctiveNodeImpl();
		return productionSchema2petrinetDisjunctiveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetDisjunctiveNodeIn createproductionschema2petrinetDisjunctiveNodeIn() {
		productionschema2petrinetDisjunctiveNodeInImpl productionschema2petrinetDisjunctiveNodeIn = new productionschema2petrinetDisjunctiveNodeInImpl();
		return productionschema2petrinetDisjunctiveNodeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetConjunctiveNode createproductionschema2petrinetConjunctiveNode() {
		productionschema2petrinetConjunctiveNodeImpl productionschema2petrinetConjunctiveNode = new productionschema2petrinetConjunctiveNodeImpl();
		return productionschema2petrinetConjunctiveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetLink createproductionschema2petrinetLink() {
		productionschema2petrinetLinkImpl productionschema2petrinetLink = new productionschema2petrinetLinkImpl();
		return productionschema2petrinetLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetConjunctiveNodeIn createproductionschema2petrinetConjunctiveNodeIn() {
		productionschema2petrinetConjunctiveNodeInImpl productionschema2petrinetConjunctiveNodeIn = new productionschema2petrinetConjunctiveNodeInImpl();
		return productionschema2petrinetConjunctiveNodeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetDisjunctiveNodeOut createproductionschema2petrinetDisjunctiveNodeOut() {
		productionschema2petrinetDisjunctiveNodeOutImpl productionschema2petrinetDisjunctiveNodeOut = new productionschema2petrinetDisjunctiveNodeOutImpl();
		return productionschema2petrinetDisjunctiveNodeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetConjunctiveNodeOut createproductionschema2petrinetConjunctiveNodeOut() {
		productionschema2petrinetConjunctiveNodeOutImpl productionschema2petrinetConjunctiveNodeOut = new productionschema2petrinetConjunctiveNodeOutImpl();
		return productionschema2petrinetConjunctiveNodeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetAxiom_r1 createproductionschema2petrinetAxiom_r1() {
		productionschema2petrinetAxiom_r1Impl productionschema2petrinetAxiom_r1 = new productionschema2petrinetAxiom_r1Impl();
		return productionschema2petrinetAxiom_r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetDisjunctiveNodeIn_r7 createproductionschema2petrinetDisjunctiveNodeIn_r7() {
		productionschema2petrinetDisjunctiveNodeIn_r7Impl productionschema2petrinetDisjunctiveNodeIn_r7 = new productionschema2petrinetDisjunctiveNodeIn_r7Impl();
		return productionschema2petrinetDisjunctiveNodeIn_r7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionSchema2petrinetDisjunctiveNode_r3 createproductionSchema2petrinetDisjunctiveNode_r3() {
		productionSchema2petrinetDisjunctiveNode_r3Impl productionSchema2petrinetDisjunctiveNode_r3 = new productionSchema2petrinetDisjunctiveNode_r3Impl();
		return productionSchema2petrinetDisjunctiveNode_r3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetConjunctiveNodeOut_r6 createproductionschema2petrinetConjunctiveNodeOut_r6() {
		productionschema2petrinetConjunctiveNodeOut_r6Impl productionschema2petrinetConjunctiveNodeOut_r6 = new productionschema2petrinetConjunctiveNodeOut_r6Impl();
		return productionschema2petrinetConjunctiveNodeOut_r6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetLink_r4 createproductionschema2petrinetLink_r4() {
		productionschema2petrinetLink_r4Impl productionschema2petrinetLink_r4 = new productionschema2petrinetLink_r4Impl();
		return productionschema2petrinetLink_r4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetDisjunctiveNodeOut_r8 createproductionschema2petrinetDisjunctiveNodeOut_r8() {
		productionschema2petrinetDisjunctiveNodeOut_r8Impl productionschema2petrinetDisjunctiveNodeOut_r8 = new productionschema2petrinetDisjunctiveNodeOut_r8Impl();
		return productionschema2petrinetDisjunctiveNodeOut_r8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetConjunctiveNodeIn_r5 createproductionschema2petrinetConjunctiveNodeIn_r5() {
		productionschema2petrinetConjunctiveNodeIn_r5Impl productionschema2petrinetConjunctiveNodeIn_r5 = new productionschema2petrinetConjunctiveNodeIn_r5Impl();
		return productionschema2petrinetConjunctiveNodeIn_r5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productionschema2petrinetConjunctiveNode_r2 createproductionschema2petrinetConjunctiveNode_r2() {
		productionschema2petrinetConjunctiveNode_r2Impl productionschema2petrinetConjunctiveNode_r2 = new productionschema2petrinetConjunctiveNode_r2Impl();
		return productionschema2petrinetConjunctiveNode_r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedPackage getGeneratedPackage() {
		return (GeneratedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratedPackage getPackage() {
		return GeneratedPackage.eINSTANCE;
	}

} //GeneratedFactoryImpl
