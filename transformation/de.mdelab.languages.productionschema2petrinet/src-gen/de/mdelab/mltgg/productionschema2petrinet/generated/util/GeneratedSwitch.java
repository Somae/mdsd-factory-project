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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.productionschema2petrinet.generated.GeneratedPackage
 * @generated
 */
public class GeneratedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_OPERATIONAL_TGG: {
			productionschema2petrinetOperationalTGG productionschema2petrinetOperationalTGG = (productionschema2petrinetOperationalTGG) theEObject;
			T result = caseproductionschema2petrinetOperationalTGG(productionschema2petrinetOperationalTGG);
			if (result == null)
				result = caseSdmOperationalTGG(productionschema2petrinetOperationalTGG);
			if (result == null)
				result = caseOperationalTGG(productionschema2petrinetOperationalTGG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_AXIOM: {
			productionschema2petrinetAxiom productionschema2petrinetAxiom = (productionschema2petrinetAxiom) theEObject;
			T result = caseproductionschema2petrinetAxiom(productionschema2petrinetAxiom);
			if (result == null)
				result = caseOperationalAxiomGroup(productionschema2petrinetAxiom);
			if (result == null)
				result = caseOperationalMappingGroup(productionschema2petrinetAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTION_SCHEMA2PETRINET_DISJUNCTIVE_NODE: {
			productionSchema2petrinetDisjunctiveNode productionSchema2petrinetDisjunctiveNode = (productionSchema2petrinetDisjunctiveNode) theEObject;
			T result = caseproductionSchema2petrinetDisjunctiveNode(productionSchema2petrinetDisjunctiveNode);
			if (result == null)
				result = caseOperationalRuleGroup(productionSchema2petrinetDisjunctiveNode);
			if (result == null)
				result = caseOperationalMappingGroup(productionSchema2petrinetDisjunctiveNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_DISJUNCTIVE_NODE_IN: {
			productionschema2petrinetDisjunctiveNodeIn productionschema2petrinetDisjunctiveNodeIn = (productionschema2petrinetDisjunctiveNodeIn) theEObject;
			T result = caseproductionschema2petrinetDisjunctiveNodeIn(productionschema2petrinetDisjunctiveNodeIn);
			if (result == null)
				result = caseOperationalRuleGroup(productionschema2petrinetDisjunctiveNodeIn);
			if (result == null)
				result = caseOperationalMappingGroup(productionschema2petrinetDisjunctiveNodeIn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE: {
			productionschema2petrinetConjunctiveNode productionschema2petrinetConjunctiveNode = (productionschema2petrinetConjunctiveNode) theEObject;
			T result = caseproductionschema2petrinetConjunctiveNode(productionschema2petrinetConjunctiveNode);
			if (result == null)
				result = caseOperationalRuleGroup(productionschema2petrinetConjunctiveNode);
			if (result == null)
				result = caseOperationalMappingGroup(productionschema2petrinetConjunctiveNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_LINK: {
			productionschema2petrinetLink productionschema2petrinetLink = (productionschema2petrinetLink) theEObject;
			T result = caseproductionschema2petrinetLink(productionschema2petrinetLink);
			if (result == null)
				result = caseOperationalRuleGroup(productionschema2petrinetLink);
			if (result == null)
				result = caseOperationalMappingGroup(productionschema2petrinetLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_IN: {
			productionschema2petrinetConjunctiveNodeIn productionschema2petrinetConjunctiveNodeIn = (productionschema2petrinetConjunctiveNodeIn) theEObject;
			T result = caseproductionschema2petrinetConjunctiveNodeIn(productionschema2petrinetConjunctiveNodeIn);
			if (result == null)
				result = caseOperationalRuleGroup(productionschema2petrinetConjunctiveNodeIn);
			if (result == null)
				result = caseOperationalMappingGroup(productionschema2petrinetConjunctiveNodeIn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_DISJUNCTIVE_NODE_OUT: {
			productionschema2petrinetDisjunctiveNodeOut productionschema2petrinetDisjunctiveNodeOut = (productionschema2petrinetDisjunctiveNodeOut) theEObject;
			T result = caseproductionschema2petrinetDisjunctiveNodeOut(productionschema2petrinetDisjunctiveNodeOut);
			if (result == null)
				result = caseOperationalRuleGroup(productionschema2petrinetDisjunctiveNodeOut);
			if (result == null)
				result = caseOperationalMappingGroup(productionschema2petrinetDisjunctiveNodeOut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_OUT: {
			productionschema2petrinetConjunctiveNodeOut productionschema2petrinetConjunctiveNodeOut = (productionschema2petrinetConjunctiveNodeOut) theEObject;
			T result = caseproductionschema2petrinetConjunctiveNodeOut(productionschema2petrinetConjunctiveNodeOut);
			if (result == null)
				result = caseOperationalRuleGroup(productionschema2petrinetConjunctiveNodeOut);
			if (result == null)
				result = caseOperationalMappingGroup(productionschema2petrinetConjunctiveNodeOut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_AXIOM_R1: {
			productionschema2petrinetAxiom_r1 productionschema2petrinetAxiom_r1 = (productionschema2petrinetAxiom_r1) theEObject;
			T result = caseproductionschema2petrinetAxiom_r1(productionschema2petrinetAxiom_r1);
			if (result == null)
				result = caseOperationalAxiom(productionschema2petrinetAxiom_r1);
			if (result == null)
				result = caseOperationalMapping(productionschema2petrinetAxiom_r1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_DISJUNCTIVE_NODE_IN_R7: {
			productionschema2petrinetDisjunctiveNodeIn_r7 productionschema2petrinetDisjunctiveNodeIn_r7 = (productionschema2petrinetDisjunctiveNodeIn_r7) theEObject;
			T result = caseproductionschema2petrinetDisjunctiveNodeIn_r7(productionschema2petrinetDisjunctiveNodeIn_r7);
			if (result == null)
				result = caseOperationalRule(productionschema2petrinetDisjunctiveNodeIn_r7);
			if (result == null)
				result = caseOperationalMapping(productionschema2petrinetDisjunctiveNodeIn_r7);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTION_SCHEMA2PETRINET_DISJUNCTIVE_NODE_R3: {
			productionSchema2petrinetDisjunctiveNode_r3 productionSchema2petrinetDisjunctiveNode_r3 = (productionSchema2petrinetDisjunctiveNode_r3) theEObject;
			T result = caseproductionSchema2petrinetDisjunctiveNode_r3(productionSchema2petrinetDisjunctiveNode_r3);
			if (result == null)
				result = caseOperationalRule(productionSchema2petrinetDisjunctiveNode_r3);
			if (result == null)
				result = caseOperationalMapping(productionSchema2petrinetDisjunctiveNode_r3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_OUT_R6: {
			productionschema2petrinetConjunctiveNodeOut_r6 productionschema2petrinetConjunctiveNodeOut_r6 = (productionschema2petrinetConjunctiveNodeOut_r6) theEObject;
			T result = caseproductionschema2petrinetConjunctiveNodeOut_r6(
					productionschema2petrinetConjunctiveNodeOut_r6);
			if (result == null)
				result = caseOperationalRule(productionschema2petrinetConjunctiveNodeOut_r6);
			if (result == null)
				result = caseOperationalMapping(productionschema2petrinetConjunctiveNodeOut_r6);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_LINK_R4: {
			productionschema2petrinetLink_r4 productionschema2petrinetLink_r4 = (productionschema2petrinetLink_r4) theEObject;
			T result = caseproductionschema2petrinetLink_r4(productionschema2petrinetLink_r4);
			if (result == null)
				result = caseOperationalRule(productionschema2petrinetLink_r4);
			if (result == null)
				result = caseOperationalMapping(productionschema2petrinetLink_r4);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_DISJUNCTIVE_NODE_OUT_R8: {
			productionschema2petrinetDisjunctiveNodeOut_r8 productionschema2petrinetDisjunctiveNodeOut_r8 = (productionschema2petrinetDisjunctiveNodeOut_r8) theEObject;
			T result = caseproductionschema2petrinetDisjunctiveNodeOut_r8(
					productionschema2petrinetDisjunctiveNodeOut_r8);
			if (result == null)
				result = caseOperationalRule(productionschema2petrinetDisjunctiveNodeOut_r8);
			if (result == null)
				result = caseOperationalMapping(productionschema2petrinetDisjunctiveNodeOut_r8);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_IN_R5: {
			productionschema2petrinetConjunctiveNodeIn_r5 productionschema2petrinetConjunctiveNodeIn_r5 = (productionschema2petrinetConjunctiveNodeIn_r5) theEObject;
			T result = caseproductionschema2petrinetConjunctiveNodeIn_r5(productionschema2petrinetConjunctiveNodeIn_r5);
			if (result == null)
				result = caseOperationalRule(productionschema2petrinetConjunctiveNodeIn_r5);
			if (result == null)
				result = caseOperationalMapping(productionschema2petrinetConjunctiveNodeIn_r5);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PRODUCTIONSCHEMA2PETRINET_CONJUNCTIVE_NODE_R2: {
			productionschema2petrinetConjunctiveNode_r2 productionschema2petrinetConjunctiveNode_r2 = (productionschema2petrinetConjunctiveNode_r2) theEObject;
			T result = caseproductionschema2petrinetConjunctiveNode_r2(productionschema2petrinetConjunctiveNode_r2);
			if (result == null)
				result = caseOperationalRule(productionschema2petrinetConjunctiveNode_r2);
			if (result == null)
				result = caseOperationalMapping(productionschema2petrinetConjunctiveNode_r2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetOperationalTGG(productionschema2petrinetOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetAxiom(productionschema2petrinetAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>production Schema2petrinet Disjunctive Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>production Schema2petrinet Disjunctive Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionSchema2petrinetDisjunctiveNode(productionSchema2petrinetDisjunctiveNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Disjunctive Node In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Disjunctive Node In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetDisjunctiveNodeIn(productionschema2petrinetDisjunctiveNodeIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetConjunctiveNode(productionschema2petrinetConjunctiveNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetLink(productionschema2petrinetLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetConjunctiveNodeIn(productionschema2petrinetConjunctiveNodeIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Disjunctive Node Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Disjunctive Node Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetDisjunctiveNodeOut(productionschema2petrinetDisjunctiveNodeOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetConjunctiveNodeOut(productionschema2petrinetConjunctiveNodeOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Axiom r1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Axiom r1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetAxiom_r1(productionschema2petrinetAxiom_r1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Disjunctive Node In r7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Disjunctive Node In r7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetDisjunctiveNodeIn_r7(productionschema2petrinetDisjunctiveNodeIn_r7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>production Schema2petrinet Disjunctive Node r3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>production Schema2petrinet Disjunctive Node r3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionSchema2petrinetDisjunctiveNode_r3(productionSchema2petrinetDisjunctiveNode_r3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node Out r6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node Out r6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetConjunctiveNodeOut_r6(productionschema2petrinetConjunctiveNodeOut_r6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Link r4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Link r4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetLink_r4(productionschema2petrinetLink_r4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Disjunctive Node Out r8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Disjunctive Node Out r8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetDisjunctiveNodeOut_r8(productionschema2petrinetDisjunctiveNodeOut_r8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node In r5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node In r5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetConjunctiveNodeIn_r5(productionschema2petrinetConjunctiveNodeIn_r5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node r2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>productionschema2petrinet Conjunctive Node r2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproductionschema2petrinetConjunctiveNode_r2(productionschema2petrinetConjunctiveNode_r2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalTGG(OperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdmOperationalTGG(SdmOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMappingGroup(OperationalMappingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiomGroup(OperationalAxiomGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRuleGroup(OperationalRuleGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMapping(OperationalMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiom(OperationalAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRule(OperationalRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GeneratedSwitch
