/**
 */
package de.mdelab.mltgg.productionschema2petrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.productionschema2petrinet.Productionschema2petrinetPackage
 * @generated
 */
public interface Productionschema2petrinetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Productionschema2petrinetFactory eINSTANCE = de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Axiom</em>'.
	 * @generated
	 */
	CorrAxiom createCorrAxiom();

	/**
	 * Returns a new object of class '<em>Corr Conjunctive Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Conjunctive Node</em>'.
	 * @generated
	 */
	CorrConjunctiveNode createCorrConjunctiveNode();

	/**
	 * Returns a new object of class '<em>Corr Disjunctive Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Disjunctive Node</em>'.
	 * @generated
	 */
	CorrDisjunctiveNode createCorrDisjunctiveNode();

	/**
	 * Returns a new object of class '<em>Corr Material Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Material Link</em>'.
	 * @generated
	 */
	CorrMaterialLink createCorrMaterialLink();

	/**
	 * Returns a new object of class '<em>Corr Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Edge</em>'.
	 * @generated
	 */
	CorrEdge createCorrEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Productionschema2petrinetPackage getProductionschema2petrinetPackage();

} //Productionschema2petrinetFactory
