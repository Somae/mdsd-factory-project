/**
 */
package de.mdelab.mltgg.productionschema2petrinet.generated.util;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG;

import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

import de.mdelab.mltgg.productionschema2petrinet.generated.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.productionschema2petrinet.generated.GeneratedPackage
 * @generated
 */
public class GeneratedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratedSwitch<Adapter> modelSwitch = new GeneratedSwitch<Adapter>() {
		@Override
		public Adapter caseproductionschema2petrinetOperationalTGG(productionschema2petrinetOperationalTGG object) {
			return createproductionschema2petrinetOperationalTGGAdapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetAxiom(productionschema2petrinetAxiom object) {
			return createproductionschema2petrinetAxiomAdapter();
		}

		@Override
		public Adapter caseproductionSchema2petrinetDisjunctiveNode(productionSchema2petrinetDisjunctiveNode object) {
			return createproductionSchema2petrinetDisjunctiveNodeAdapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetDisjunctiveNodeIn(
				productionschema2petrinetDisjunctiveNodeIn object) {
			return createproductionschema2petrinetDisjunctiveNodeInAdapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetConjunctiveNode(productionschema2petrinetConjunctiveNode object) {
			return createproductionschema2petrinetConjunctiveNodeAdapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetLink(productionschema2petrinetLink object) {
			return createproductionschema2petrinetLinkAdapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetConjunctiveNodeIn(
				productionschema2petrinetConjunctiveNodeIn object) {
			return createproductionschema2petrinetConjunctiveNodeInAdapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetDisjunctiveNodeOut(
				productionschema2petrinetDisjunctiveNodeOut object) {
			return createproductionschema2petrinetDisjunctiveNodeOutAdapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetConjunctiveNodeOut(
				productionschema2petrinetConjunctiveNodeOut object) {
			return createproductionschema2petrinetConjunctiveNodeOutAdapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetAxiom_r1(productionschema2petrinetAxiom_r1 object) {
			return createproductionschema2petrinetAxiom_r1Adapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetDisjunctiveNodeIn_r7(
				productionschema2petrinetDisjunctiveNodeIn_r7 object) {
			return createproductionschema2petrinetDisjunctiveNodeIn_r7Adapter();
		}

		@Override
		public Adapter caseproductionSchema2petrinetDisjunctiveNode_r3(
				productionSchema2petrinetDisjunctiveNode_r3 object) {
			return createproductionSchema2petrinetDisjunctiveNode_r3Adapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetConjunctiveNodeOut_r6(
				productionschema2petrinetConjunctiveNodeOut_r6 object) {
			return createproductionschema2petrinetConjunctiveNodeOut_r6Adapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetLink_r4(productionschema2petrinetLink_r4 object) {
			return createproductionschema2petrinetLink_r4Adapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetDisjunctiveNodeOut_r8(
				productionschema2petrinetDisjunctiveNodeOut_r8 object) {
			return createproductionschema2petrinetDisjunctiveNodeOut_r8Adapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetConjunctiveNodeIn_r5(
				productionschema2petrinetConjunctiveNodeIn_r5 object) {
			return createproductionschema2petrinetConjunctiveNodeIn_r5Adapter();
		}

		@Override
		public Adapter caseproductionschema2petrinetConjunctiveNode_r2(
				productionschema2petrinetConjunctiveNode_r2 object) {
			return createproductionschema2petrinetConjunctiveNode_r2Adapter();
		}

		@Override
		public Adapter caseOperationalTGG(OperationalTGG object) {
			return createOperationalTGGAdapter();
		}

		@Override
		public Adapter caseSdmOperationalTGG(SdmOperationalTGG object) {
			return createSdmOperationalTGGAdapter();
		}

		@Override
		public Adapter caseOperationalMappingGroup(OperationalMappingGroup object) {
			return createOperationalMappingGroupAdapter();
		}

		@Override
		public Adapter caseOperationalAxiomGroup(OperationalAxiomGroup object) {
			return createOperationalAxiomGroupAdapter();
		}

		@Override
		public Adapter caseOperationalRuleGroup(OperationalRuleGroup object) {
			return createOperationalRuleGroupAdapter();
		}

		@Override
		public Adapter caseOperationalMapping(OperationalMapping object) {
			return createOperationalMappingAdapter();
		}

		@Override
		public Adapter caseOperationalAxiom(OperationalAxiom object) {
			return createOperationalAxiomAdapter();
		}

		@Override
		public Adapter caseOperationalRule(OperationalRule object) {
			return createOperationalRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetOperationalTGG <em>productionschema2petrinet Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetOperationalTGG
	 * @generated
	 */
	public Adapter createproductionschema2petrinetOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetAxiom <em>productionschema2petrinet Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetAxiom
	 * @generated
	 */
	public Adapter createproductionschema2petrinetAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionSchema2petrinetDisjunctiveNode <em>production Schema2petrinet Disjunctive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionSchema2petrinetDisjunctiveNode
	 * @generated
	 */
	public Adapter createproductionSchema2petrinetDisjunctiveNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetDisjunctiveNodeIn <em>productionschema2petrinet Disjunctive Node In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetDisjunctiveNodeIn
	 * @generated
	 */
	public Adapter createproductionschema2petrinetDisjunctiveNodeInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNode <em>productionschema2petrinet Conjunctive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNode
	 * @generated
	 */
	public Adapter createproductionschema2petrinetConjunctiveNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetLink <em>productionschema2petrinet Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetLink
	 * @generated
	 */
	public Adapter createproductionschema2petrinetLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNodeIn <em>productionschema2petrinet Conjunctive Node In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNodeIn
	 * @generated
	 */
	public Adapter createproductionschema2petrinetConjunctiveNodeInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetDisjunctiveNodeOut <em>productionschema2petrinet Disjunctive Node Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetDisjunctiveNodeOut
	 * @generated
	 */
	public Adapter createproductionschema2petrinetDisjunctiveNodeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNodeOut <em>productionschema2petrinet Conjunctive Node Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNodeOut
	 * @generated
	 */
	public Adapter createproductionschema2petrinetConjunctiveNodeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetAxiom_r1 <em>productionschema2petrinet Axiom r1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetAxiom_r1
	 * @generated
	 */
	public Adapter createproductionschema2petrinetAxiom_r1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetDisjunctiveNodeIn_r7 <em>productionschema2petrinet Disjunctive Node In r7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetDisjunctiveNodeIn_r7
	 * @generated
	 */
	public Adapter createproductionschema2petrinetDisjunctiveNodeIn_r7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionSchema2petrinetDisjunctiveNode_r3 <em>production Schema2petrinet Disjunctive Node r3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionSchema2petrinetDisjunctiveNode_r3
	 * @generated
	 */
	public Adapter createproductionSchema2petrinetDisjunctiveNode_r3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNodeOut_r6 <em>productionschema2petrinet Conjunctive Node Out r6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNodeOut_r6
	 * @generated
	 */
	public Adapter createproductionschema2petrinetConjunctiveNodeOut_r6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetLink_r4 <em>productionschema2petrinet Link r4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetLink_r4
	 * @generated
	 */
	public Adapter createproductionschema2petrinetLink_r4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetDisjunctiveNodeOut_r8 <em>productionschema2petrinet Disjunctive Node Out r8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetDisjunctiveNodeOut_r8
	 * @generated
	 */
	public Adapter createproductionschema2petrinetDisjunctiveNodeOut_r8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNodeIn_r5 <em>productionschema2petrinet Conjunctive Node In r5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNodeIn_r5
	 * @generated
	 */
	public Adapter createproductionschema2petrinetConjunctiveNodeIn_r5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNode_r2 <em>productionschema2petrinet Conjunctive Node r2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.productionschema2petrinetConjunctiveNode_r2
	 * @generated
	 */
	public Adapter createproductionschema2petrinetConjunctiveNode_r2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG <em>Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG
	 * @generated
	 */
	public Adapter createOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG <em>Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG
	 * @generated
	 */
	public Adapter createSdmOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup <em>Operational Mapping Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup
	 * @generated
	 */
	public Adapter createOperationalMappingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup <em>Operational Axiom Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup
	 * @generated
	 */
	public Adapter createOperationalAxiomGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup <em>Operational Rule Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup
	 * @generated
	 */
	public Adapter createOperationalRuleGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping <em>Operational Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping
	 * @generated
	 */
	public Adapter createOperationalMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom <em>Operational Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom
	 * @generated
	 */
	public Adapter createOperationalAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalRule <em>Operational Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalRule
	 * @generated
	 */
	public Adapter createOperationalRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeneratedAdapterFactory
