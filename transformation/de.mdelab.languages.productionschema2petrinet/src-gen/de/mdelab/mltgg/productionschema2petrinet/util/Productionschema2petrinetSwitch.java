/**
 */
package de.mdelab.mltgg.productionschema2petrinet.util;

import de.mdelab.mlcore.MLAnnotatedElement;

import de.mdelab.mltgg.mote2.TGGNode;

import de.mdelab.mltgg.productionschema2petrinet.*;

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
 * @see de.mdelab.mltgg.productionschema2petrinet.Productionschema2petrinetPackage
 * @generated
 */
public class Productionschema2petrinetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Productionschema2petrinetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Productionschema2petrinetSwitch() {
		if (modelPackage == null) {
			modelPackage = Productionschema2petrinetPackage.eINSTANCE;
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
		case Productionschema2petrinetPackage.CORR_AXIOM: {
			CorrAxiom corrAxiom = (CorrAxiom) theEObject;
			T result = caseCorrAxiom(corrAxiom);
			if (result == null)
				result = caseTGGNode(corrAxiom);
			if (result == null)
				result = caseMLAnnotatedElement(corrAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Productionschema2petrinetPackage.CORR_CONJUNCTIVE_NODE: {
			CorrConjunctiveNode corrConjunctiveNode = (CorrConjunctiveNode) theEObject;
			T result = caseCorrConjunctiveNode(corrConjunctiveNode);
			if (result == null)
				result = caseTGGNode(corrConjunctiveNode);
			if (result == null)
				result = caseMLAnnotatedElement(corrConjunctiveNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Productionschema2petrinetPackage.CORR_DISJUNCTIVE_NODE: {
			CorrDisjunctiveNode corrDisjunctiveNode = (CorrDisjunctiveNode) theEObject;
			T result = caseCorrDisjunctiveNode(corrDisjunctiveNode);
			if (result == null)
				result = caseTGGNode(corrDisjunctiveNode);
			if (result == null)
				result = caseMLAnnotatedElement(corrDisjunctiveNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Productionschema2petrinetPackage.CORR_MATERIAL_LINK: {
			CorrMaterialLink corrMaterialLink = (CorrMaterialLink) theEObject;
			T result = caseCorrMaterialLink(corrMaterialLink);
			if (result == null)
				result = caseTGGNode(corrMaterialLink);
			if (result == null)
				result = caseMLAnnotatedElement(corrMaterialLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Productionschema2petrinetPackage.CORR_EDGE: {
			CorrEdge corrEdge = (CorrEdge) theEObject;
			T result = caseCorrEdge(corrEdge);
			if (result == null)
				result = caseTGGNode(corrEdge);
			if (result == null)
				result = caseMLAnnotatedElement(corrEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrAxiom(CorrAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Conjunctive Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Conjunctive Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrConjunctiveNode(CorrConjunctiveNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Disjunctive Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Disjunctive Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrDisjunctiveNode(CorrDisjunctiveNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Material Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Material Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrMaterialLink(CorrMaterialLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrEdge(CorrEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Annotated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLAnnotatedElement(MLAnnotatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGNode(TGGNode object) {
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

} //Productionschema2petrinetSwitch
