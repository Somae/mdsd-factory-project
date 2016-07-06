/**
 */
package factory.util;

import factory.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see factory.FactoryPackage
 * @generated
 */
public class FactoryValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FactoryValidator INSTANCE = new FactoryValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "factory";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FactoryPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FactoryPackage.FACTORY_SPECIFICATION:
				return validateFactorySpecification((FactorySpecification)value, diagnostics, context);
			case FactoryPackage.FACTORY:
				return validateFactory((Factory)value, diagnostics, context);
			case FactoryPackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case FactoryPackage.EMPLOYEE:
				return validateEmployee((Employee)value, diagnostics, context);
			case FactoryPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case FactoryPackage.PRODUCT_PART:
				return validateProductPart((ProductPart)value, diagnostics, context);
			case FactoryPackage.IDENTIFIABLE_ELEMENT:
				return validateIdentifiableElement((IdentifiableElement)value, diagnostics, context);
			case FactoryPackage.PRODUCT_VERSION:
				return validateProductVersion((ProductVersion)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactorySpecification(FactorySpecification factorySpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(factorySpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactory(Factory factory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(factory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(factory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(factory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(factory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(factory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(factory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(factory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(factory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(factory, diagnostics, context);
		if (result || diagnostics != null) result &= validateFactory_factoryContainsAllPS(factory, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the factoryContainsAllPS constraint of '<em>Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FACTORY__FACTORY_CONTAINS_ALL_PS__EEXPRESSION = "createdProductParts->forAll(p|p.constructionProcesses->exists(ps | ownedProductionSchemata->includes(ps)))";

	/**
	 * Validates the factoryContainsAllPS constraint of '<em>Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactory_factoryContainsAllPS(Factory factory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FactoryPackage.Literals.FACTORY,
				 factory,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "factoryContainsAllPS",
				 FACTORY__FACTORY_CONTAINS_ALL_PS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(employee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductPart(ProductPart productPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiableElement(IdentifiableElement identifiableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductVersion(ProductVersion productVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productVersion, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FactoryValidator
