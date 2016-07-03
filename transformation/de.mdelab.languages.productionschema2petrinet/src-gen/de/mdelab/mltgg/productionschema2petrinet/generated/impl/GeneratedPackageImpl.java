/**
 */
package de.mdelab.mltgg.productionschema2petrinet.generated.impl;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.mdelab.mltgg.productionschema2petrinet.Productionschema2petrinetPackage;

import de.mdelab.mltgg.productionschema2petrinet.generated.GeneratedFactory;
import de.mdelab.mltgg.productionschema2petrinet.generated.GeneratedPackage;

import de.mdelab.mltgg.productionschema2petrinet.impl.Productionschema2petrinetPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratedPackageImpl extends EPackageImpl implements GeneratedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetOperationalTGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionSchema2petrinetDisjunctiveNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetDisjunctiveNodeInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetConjunctiveNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetConjunctiveNodeInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetDisjunctiveNodeOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetConjunctiveNodeOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetAxiom_r1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetDisjunctiveNodeIn_r7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionSchema2petrinetDisjunctiveNode_r3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetConjunctiveNodeOut_r6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetLink_r4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetDisjunctiveNodeOut_r8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetConjunctiveNodeIn_r5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionschema2petrinetConjunctiveNode_r2EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.mdelab.mltgg.productionschema2petrinet.generated.GeneratedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratedPackageImpl() {
		super(eNS_URI, GeneratedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GeneratedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static GeneratedPackage init() {
		if (isInited)
			return (GeneratedPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI);

		// Obtain or create and register package
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GeneratedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new GeneratedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Productionschema2petrinetPackageImpl theProductionschema2petrinetPackage = (Productionschema2petrinetPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Productionschema2petrinetPackage.eNS_URI) instanceof Productionschema2petrinetPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Productionschema2petrinetPackage.eNS_URI)
						: Productionschema2petrinetPackage.eINSTANCE);

		// Load packages
		theProductionschema2petrinetPackage.loadPackage();

		// Fix loaded packages
		theGeneratedPackage.fixPackageContents();
		theProductionschema2petrinetPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratedPackage.eNS_URI, theGeneratedPackage);
		return theGeneratedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetOperationalTGG() {
		if (productionschema2petrinetOperationalTGGEClass == null) {
			productionschema2petrinetOperationalTGGEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(0);
		}
		return productionschema2petrinetOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetAxiom() {
		if (productionschema2petrinetAxiomEClass == null) {
			productionschema2petrinetAxiomEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(1);
		}
		return productionschema2petrinetAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionSchema2petrinetDisjunctiveNode() {
		if (productionSchema2petrinetDisjunctiveNodeEClass == null) {
			productionSchema2petrinetDisjunctiveNodeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(2);
		}
		return productionSchema2petrinetDisjunctiveNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetDisjunctiveNodeIn() {
		if (productionschema2petrinetDisjunctiveNodeInEClass == null) {
			productionschema2petrinetDisjunctiveNodeInEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(3);
		}
		return productionschema2petrinetDisjunctiveNodeInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetConjunctiveNode() {
		if (productionschema2petrinetConjunctiveNodeEClass == null) {
			productionschema2petrinetConjunctiveNodeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(4);
		}
		return productionschema2petrinetConjunctiveNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetLink() {
		if (productionschema2petrinetLinkEClass == null) {
			productionschema2petrinetLinkEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(5);
		}
		return productionschema2petrinetLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetConjunctiveNodeIn() {
		if (productionschema2petrinetConjunctiveNodeInEClass == null) {
			productionschema2petrinetConjunctiveNodeInEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(6);
		}
		return productionschema2petrinetConjunctiveNodeInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetDisjunctiveNodeOut() {
		if (productionschema2petrinetDisjunctiveNodeOutEClass == null) {
			productionschema2petrinetDisjunctiveNodeOutEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(7);
		}
		return productionschema2petrinetDisjunctiveNodeOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetConjunctiveNodeOut() {
		if (productionschema2petrinetConjunctiveNodeOutEClass == null) {
			productionschema2petrinetConjunctiveNodeOutEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(8);
		}
		return productionschema2petrinetConjunctiveNodeOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetAxiom_r1() {
		if (productionschema2petrinetAxiom_r1EClass == null) {
			productionschema2petrinetAxiom_r1EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(9);
		}
		return productionschema2petrinetAxiom_r1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetAxiom_r1_AddElementActivity() {
		return (EReference) getproductionschema2petrinetAxiom_r1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetAxiom_r1_MoveElementActivity() {
		return (EReference) getproductionschema2petrinetAxiom_r1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetAxiom_r1_ChangeAttributeActivity() {
		return (EReference) getproductionschema2petrinetAxiom_r1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetAxiom_r1_TransformForwardActivity() {
		return (EReference) getproductionschema2petrinetAxiom_r1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetAxiom_r1_TransformMappingActivity() {
		return (EReference) getproductionschema2petrinetAxiom_r1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetAxiom_r1_TransformBackwardActivity() {
		return (EReference) getproductionschema2petrinetAxiom_r1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetAxiom_r1_SynchronizeForwardActivity() {
		return (EReference) getproductionschema2petrinetAxiom_r1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetAxiom_r1_SynchronizeBackwardActivity() {
		return (EReference) getproductionschema2petrinetAxiom_r1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetAxiom_r1__AddElement__EMap_EList_EList() {
		return getproductionschema2petrinetAxiom_r1().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetAxiom_r1__ChangeAttributeValues__TGGNode_EMap() {
		return getproductionschema2petrinetAxiom_r1().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetAxiom_r1__TransformForward__EList_EList_boolean() {
		return getproductionschema2petrinetAxiom_r1().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetAxiom_r1__TransformMapping__EList_EList_boolean() {
		return getproductionschema2petrinetAxiom_r1().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetAxiom_r1__TransformBackward__EList_EList_boolean() {
		return getproductionschema2petrinetAxiom_r1().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return getproductionschema2petrinetAxiom_r1().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return getproductionschema2petrinetAxiom_r1().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetDisjunctiveNodeIn_r7() {
		if (productionschema2petrinetDisjunctiveNodeIn_r7EClass == null) {
			productionschema2petrinetDisjunctiveNodeIn_r7EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(10);
		}
		return productionschema2petrinetDisjunctiveNodeIn_r7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_AddElementActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_MoveElementActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_ChangeAttributeActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_TransformForwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_TransformMappingActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_TransformBackwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_ConflictCheckForwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_ConflictCheckMappingActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_ConflictCheckBackwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_SynchronizeForwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_SynchronizeBackwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_RepairForwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeIn_r7_RepairBackwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeIn_r7().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__AddElement__EMap() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__ChangeAttributeValues__TGGNode_EMap() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__TransformForward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__TransformMapping__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__TransformBackward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__ConflictCheckForward__TGGNode() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__ConflictCheckMapping__TGGNode() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__ConflictCheckBackward__TGGNode() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__SynchronizeForward__TGGNode_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__SynchronizeBackward__TGGNode_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__RepairForward__TGGNode_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeIn_r7__RepairBackward__TGGNode_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeIn_r7().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionSchema2petrinetDisjunctiveNode_r3() {
		if (productionSchema2petrinetDisjunctiveNode_r3EClass == null) {
			productionSchema2petrinetDisjunctiveNode_r3EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(11);
		}
		return productionSchema2petrinetDisjunctiveNode_r3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_AddElementActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_MoveElementActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_ChangeAttributeActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_TransformForwardActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_TransformMappingActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_TransformBackwardActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_ConflictCheckForwardActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_ConflictCheckMappingActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_ConflictCheckBackwardActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_SynchronizeForwardActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_SynchronizeBackwardActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_RepairForwardActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionSchema2petrinetDisjunctiveNode_r3_RepairBackwardActivity() {
		return (EReference) getproductionSchema2petrinetDisjunctiveNode_r3().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__AddElement__EMap() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__ChangeAttributeValues__TGGNode_EMap() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__TransformForward__TGGNode_boolean_boolean() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__TransformMapping__TGGNode_boolean_boolean() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__TransformBackward__TGGNode_boolean_boolean() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__ConflictCheckForward__TGGNode() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__ConflictCheckMapping__TGGNode() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__ConflictCheckBackward__TGGNode() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__SynchronizeForward__TGGNode_boolean() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__SynchronizeBackward__TGGNode_boolean() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__RepairForward__TGGNode_boolean() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionSchema2petrinetDisjunctiveNode_r3__RepairBackward__TGGNode_boolean() {
		return getproductionSchema2petrinetDisjunctiveNode_r3().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetConjunctiveNodeOut_r6() {
		if (productionschema2petrinetConjunctiveNodeOut_r6EClass == null) {
			productionschema2petrinetConjunctiveNodeOut_r6EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(12);
		}
		return productionschema2petrinetConjunctiveNodeOut_r6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_AddElementActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_MoveElementActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_ChangeAttributeActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_TransformForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_TransformMappingActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_TransformBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_ConflictCheckForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_ConflictCheckMappingActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_ConflictCheckBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_SynchronizeForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_SynchronizeBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_RepairForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeOut_r6_RepairBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeOut_r6().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__AddElement__EMap() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__ChangeAttributeValues__TGGNode_EMap() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__TransformForward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__TransformMapping__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__TransformBackward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__ConflictCheckForward__TGGNode() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__ConflictCheckMapping__TGGNode() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__ConflictCheckBackward__TGGNode() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__SynchronizeForward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__SynchronizeBackward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__RepairForward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeOut_r6__RepairBackward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNodeOut_r6().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetLink_r4() {
		if (productionschema2petrinetLink_r4EClass == null) {
			productionschema2petrinetLink_r4EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(13);
		}
		return productionschema2petrinetLink_r4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_AddElementActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_MoveElementActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_ChangeAttributeActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_TransformForwardActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_TransformMappingActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_TransformBackwardActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_ConflictCheckForwardActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_ConflictCheckMappingActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_ConflictCheckBackwardActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_SynchronizeForwardActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_SynchronizeBackwardActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_RepairForwardActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetLink_r4_RepairBackwardActivity() {
		return (EReference) getproductionschema2petrinetLink_r4().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__AddElement__EMap() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__ChangeAttributeValues__TGGNode_EMap() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__TransformForward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__TransformMapping__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__TransformBackward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__ConflictCheckForward__TGGNode() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__ConflictCheckMapping__TGGNode() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__ConflictCheckBackward__TGGNode() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__SynchronizeForward__TGGNode_boolean() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__SynchronizeBackward__TGGNode_boolean() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__RepairForward__TGGNode_boolean() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetLink_r4__RepairBackward__TGGNode_boolean() {
		return getproductionschema2petrinetLink_r4().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetDisjunctiveNodeOut_r8() {
		if (productionschema2petrinetDisjunctiveNodeOut_r8EClass == null) {
			productionschema2petrinetDisjunctiveNodeOut_r8EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(14);
		}
		return productionschema2petrinetDisjunctiveNodeOut_r8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_AddElementActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_MoveElementActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_ChangeAttributeActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_TransformForwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_TransformMappingActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_TransformBackwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_ConflictCheckForwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_ConflictCheckMappingActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_ConflictCheckBackwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_SynchronizeForwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_SynchronizeBackwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_RepairForwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetDisjunctiveNodeOut_r8_RepairBackwardActivity() {
		return (EReference) getproductionschema2petrinetDisjunctiveNodeOut_r8().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__AddElement__EMap() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__ChangeAttributeValues__TGGNode_EMap() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__TransformForward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__TransformMapping__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__TransformBackward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__ConflictCheckForward__TGGNode() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__ConflictCheckMapping__TGGNode() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__ConflictCheckBackward__TGGNode() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__SynchronizeForward__TGGNode_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__SynchronizeBackward__TGGNode_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__RepairForward__TGGNode_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetDisjunctiveNodeOut_r8__RepairBackward__TGGNode_boolean() {
		return getproductionschema2petrinetDisjunctiveNodeOut_r8().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetConjunctiveNodeIn_r5() {
		if (productionschema2petrinetConjunctiveNodeIn_r5EClass == null) {
			productionschema2petrinetConjunctiveNodeIn_r5EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(15);
		}
		return productionschema2petrinetConjunctiveNodeIn_r5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_AddElementActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_MoveElementActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_ChangeAttributeActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_TransformForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_TransformMappingActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_TransformBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_ConflictCheckForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_ConflictCheckMappingActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_ConflictCheckBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_SynchronizeForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_SynchronizeBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_RepairForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNodeIn_r5_RepairBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNodeIn_r5().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__AddElement__EMap() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__ChangeAttributeValues__TGGNode_EMap() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__TransformForward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__TransformMapping__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__TransformBackward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__ConflictCheckForward__TGGNode() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__ConflictCheckMapping__TGGNode() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__ConflictCheckBackward__TGGNode() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__SynchronizeForward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__SynchronizeBackward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__RepairForward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNodeIn_r5__RepairBackward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNodeIn_r5().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getproductionschema2petrinetConjunctiveNode_r2() {
		if (productionschema2petrinetConjunctiveNode_r2EClass == null) {
			productionschema2petrinetConjunctiveNode_r2EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(16);
		}
		return productionschema2petrinetConjunctiveNode_r2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_AddElementActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_MoveElementActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_ChangeAttributeActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_TransformForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_TransformMappingActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_TransformBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_ConflictCheckForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_ConflictCheckMappingActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_ConflictCheckBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_SynchronizeForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_SynchronizeBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_RepairForwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getproductionschema2petrinetConjunctiveNode_r2_RepairBackwardActivity() {
		return (EReference) getproductionschema2petrinetConjunctiveNode_r2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__AddElement__EMap() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__ChangeAttributeValues__TGGNode_EMap() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__TransformForward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__TransformMapping__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__TransformBackward__TGGNode_boolean_boolean() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__ConflictCheckForward__TGGNode() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__ConflictCheckMapping__TGGNode() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__ConflictCheckBackward__TGGNode() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__SynchronizeForward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__SynchronizeBackward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__RepairForward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getproductionschema2petrinetConjunctiveNode_r2__RepairBackward__TGGNode_boolean() {
		return getproductionschema2petrinetConjunctiveNode_r2().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFactory getGeneratedFactory() {
		return (GeneratedFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName(
					"de.mdelab.mltgg.productionschema2petrinet.generated." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GeneratedPackageImpl
