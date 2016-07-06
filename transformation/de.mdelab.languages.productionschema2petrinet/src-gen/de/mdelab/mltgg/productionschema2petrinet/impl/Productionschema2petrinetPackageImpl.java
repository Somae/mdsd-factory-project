/**
 */
package de.mdelab.mltgg.productionschema2petrinet.impl;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.mdelab.mltgg.productionschema2petrinet.Productionschema2petrinetFactory;
import de.mdelab.mltgg.productionschema2petrinet.Productionschema2petrinetPackage;

import de.mdelab.mltgg.productionschema2petrinet.generated.GeneratedPackage;

import de.mdelab.mltgg.productionschema2petrinet.generated.impl.GeneratedPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Productionschema2petrinetPackageImpl extends EPackageImpl implements Productionschema2petrinetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "productionschema2petrinet.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrConjunctiveNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrDisjunctiveNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrMaterialLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrMaterialEClass = null;

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
	 * @see de.mdelab.mltgg.productionschema2petrinet.Productionschema2petrinetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Productionschema2petrinetPackageImpl() {
		super(eNS_URI, Productionschema2petrinetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Productionschema2petrinetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Productionschema2petrinetPackage init() {
		if (isInited)
			return (Productionschema2petrinetPackage) EPackage.Registry.INSTANCE
					.getEPackage(Productionschema2petrinetPackage.eNS_URI);

		// Obtain or create and register package
		Productionschema2petrinetPackageImpl theProductionschema2petrinetPackage = (Productionschema2petrinetPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Productionschema2petrinetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Productionschema2petrinetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(GeneratedPackage.eNS_URI) instanceof GeneratedPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
						: GeneratedPackage.eINSTANCE);

		// Load packages
		theProductionschema2petrinetPackage.loadPackage();

		// Fix loaded packages
		theProductionschema2petrinetPackage.fixPackageContents();
		theGeneratedPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductionschema2petrinetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Productionschema2petrinetPackage.eNS_URI, theProductionschema2petrinetPackage);
		return theProductionschema2petrinetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrAxiom() {
		if (corrAxiomEClass == null) {
			corrAxiomEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Productionschema2petrinetPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return corrAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrConjunctiveNode() {
		if (corrConjunctiveNodeEClass == null) {
			corrConjunctiveNodeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Productionschema2petrinetPackage.eNS_URI).getEClassifiers().get(1);
		}
		return corrConjunctiveNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrDisjunctiveNode() {
		if (corrDisjunctiveNodeEClass == null) {
			corrDisjunctiveNodeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Productionschema2petrinetPackage.eNS_URI).getEClassifiers().get(2);
		}
		return corrDisjunctiveNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrMaterialLink() {
		if (corrMaterialLinkEClass == null) {
			corrMaterialLinkEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Productionschema2petrinetPackage.eNS_URI).getEClassifiers().get(3);
		}
		return corrMaterialLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrEdge() {
		if (corrEdgeEClass == null) {
			corrEdgeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Productionschema2petrinetPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return corrEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrMaterial() {
		if (corrMaterialEClass == null) {
			corrMaterialEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Productionschema2petrinetPackage.eNS_URI).getEClassifiers().get(5);
		}
		return corrMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Productionschema2petrinetFactory getProductionschema2petrinetFactory() {
		return (Productionschema2petrinetFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
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
			eClassifier.setInstanceClassName("de.mdelab.mltgg.productionschema2petrinet." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Productionschema2petrinetPackageImpl
