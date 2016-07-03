/**
 */
package de.mdelab.mltgg.productionschema2petrinet.impl;

import de.mdelab.mltgg.productionschema2petrinet.*;

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
public class Productionschema2petrinetFactoryImpl extends EFactoryImpl implements Productionschema2petrinetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Productionschema2petrinetFactory init() {
		try {
			Productionschema2petrinetFactory theProductionschema2petrinetFactory = (Productionschema2petrinetFactory) EPackage.Registry.INSTANCE
					.getEFactory(Productionschema2petrinetPackage.eNS_URI);
			if (theProductionschema2petrinetFactory != null) {
				return theProductionschema2petrinetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Productionschema2petrinetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Productionschema2petrinetFactoryImpl() {
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
		case Productionschema2petrinetPackage.CORR_AXIOM:
			return createCorrAxiom();
		case Productionschema2petrinetPackage.CORR_CONJUNCTIVE_NODE:
			return createCorrConjunctiveNode();
		case Productionschema2petrinetPackage.CORR_DISJUNCTIVE_NODE:
			return createCorrDisjunctiveNode();
		case Productionschema2petrinetPackage.CORR_MATERIAL_LINK:
			return createCorrMaterialLink();
		case Productionschema2petrinetPackage.CORR_EDGE:
			return createCorrEdge();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrAxiom createCorrAxiom() {
		CorrAxiomImpl corrAxiom = new CorrAxiomImpl();
		return corrAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrConjunctiveNode createCorrConjunctiveNode() {
		CorrConjunctiveNodeImpl corrConjunctiveNode = new CorrConjunctiveNodeImpl();
		return corrConjunctiveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrDisjunctiveNode createCorrDisjunctiveNode() {
		CorrDisjunctiveNodeImpl corrDisjunctiveNode = new CorrDisjunctiveNodeImpl();
		return corrDisjunctiveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrMaterialLink createCorrMaterialLink() {
		CorrMaterialLinkImpl corrMaterialLink = new CorrMaterialLinkImpl();
		return corrMaterialLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrEdge createCorrEdge() {
		CorrEdgeImpl corrEdge = new CorrEdgeImpl();
		return corrEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Productionschema2petrinetPackage getProductionschema2petrinetPackage() {
		return (Productionschema2petrinetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Productionschema2petrinetPackage getPackage() {
		return Productionschema2petrinetPackage.eINSTANCE;
	}

} //Productionschema2petrinetFactoryImpl
