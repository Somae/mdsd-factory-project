/**
 */
package factory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see factory.FactoryFactory
 * @model kind="package"
 * @generated
 */
public interface FactoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "factory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/factory";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "factory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactoryPackage eINSTANCE = factory.impl.FactoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link factory.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.IdentifiableElementImpl
	 * @see factory.impl.FactoryPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factory.impl.FactorySpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.FactorySpecificationImpl
	 * @see factory.impl.FactoryPackageImpl#getFactorySpecification()
	 * @generated
	 */
	int FACTORY_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Owned Factories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION__OWNED_FACTORIES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION__OWNED_EMPLOYEES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION__OWNED_MACHINES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Product Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION__OWNED_PRODUCTS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Business Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_SPECIFICATION_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factory.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.FactoryImpl
	 * @see factory.impl.FactoryPackageImpl#getFactory()
	 * @generated
	 */
	int FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__STREET_NUMBER = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__STREET = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__CITY = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__POSTAL_CODE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__COUNTRY = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__LENGTH = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__WIDTH = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__EMPLOYEES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__MACHINES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created Product Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__CREATED_PRODUCT_PARTS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factory.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.MachineImpl
	 * @see factory.impl.FactoryPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__X = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__Y = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SIZE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factory.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.EmployeeImpl
	 * @see factory.impl.FactoryPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factory.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.ProductImpl
	 * @see factory.impl.FactoryPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Production Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCTION_START_YEAR = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Production End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCTION_END_YEAR = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IMAGE_PATH = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Product Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__OWNED_PRODUCT_VERSIONS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link factory.impl.ProductPartImpl <em>Product Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.ProductPartImpl
	 * @see factory.impl.FactoryPackageImpl#getProductPart()
	 * @generated
	 */
	int PRODUCT_PART = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PART__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PART__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Construction Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PART__CONSTRUCTION_PROCESS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PART__IMAGE_PATH = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supported Product Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PART__SUPPORTED_PRODUCT_VERSIONS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PART_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PART_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factory.impl.ProductVersionImpl <em>Product Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.ProductVersionImpl
	 * @see factory.impl.FactoryPackageImpl#getProductVersion()
	 * @generated
	 */
	int PRODUCT_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__DESCRIPTION = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__VERSION_START_YEAR = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__VERSION_END_YEAR = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link factory.FactorySpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see factory.FactorySpecification
	 * @generated
	 */
	EClass getFactorySpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.FactorySpecification#getOwnedFactories <em>Owned Factories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Factories</em>'.
	 * @see factory.FactorySpecification#getOwnedFactories()
	 * @see #getFactorySpecification()
	 * @generated
	 */
	EReference getFactorySpecification_OwnedFactories();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.FactorySpecification#getOwnedEmployees <em>Owned Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Employees</em>'.
	 * @see factory.FactorySpecification#getOwnedEmployees()
	 * @see #getFactorySpecification()
	 * @generated
	 */
	EReference getFactorySpecification_OwnedEmployees();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.FactorySpecification#getOwnedMachines <em>Owned Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Machines</em>'.
	 * @see factory.FactorySpecification#getOwnedMachines()
	 * @see #getFactorySpecification()
	 * @generated
	 */
	EReference getFactorySpecification_OwnedMachines();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.FactorySpecification#getOwnedProductParts <em>Owned Product Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Product Parts</em>'.
	 * @see factory.FactorySpecification#getOwnedProductParts()
	 * @see #getFactorySpecification()
	 * @generated
	 */
	EReference getFactorySpecification_OwnedProductParts();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.FactorySpecification#getOwnedProducts <em>Owned Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Products</em>'.
	 * @see factory.FactorySpecification#getOwnedProducts()
	 * @see #getFactorySpecification()
	 * @generated
	 */
	EReference getFactorySpecification_OwnedProducts();

	/**
	 * Returns the meta object for the attribute '{@link factory.FactorySpecification#getBusinessTypeName <em>Business Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Type Name</em>'.
	 * @see factory.FactorySpecification#getBusinessTypeName()
	 * @see #getFactorySpecification()
	 * @generated
	 */
	EAttribute getFactorySpecification_BusinessTypeName();

	/**
	 * Returns the meta object for class '{@link factory.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see factory.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the attribute '{@link factory.Factory#getStreetNumber <em>Street Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Number</em>'.
	 * @see factory.Factory#getStreetNumber()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_StreetNumber();

	/**
	 * Returns the meta object for the attribute '{@link factory.Factory#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see factory.Factory#getStreet()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Street();

	/**
	 * Returns the meta object for the attribute '{@link factory.Factory#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see factory.Factory#getCity()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_City();

	/**
	 * Returns the meta object for the attribute '{@link factory.Factory#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see factory.Factory#getPostalCode()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link factory.Factory#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see factory.Factory#getCountry()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Country();

	/**
	 * Returns the meta object for the attribute '{@link factory.Factory#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see factory.Factory#getLength()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Length();

	/**
	 * Returns the meta object for the attribute '{@link factory.Factory#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see factory.Factory#getWidth()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Width();

	/**
	 * Returns the meta object for the reference list '{@link factory.Factory#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see factory.Factory#getEmployees()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Employees();

	/**
	 * Returns the meta object for the reference list '{@link factory.Factory#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Machines</em>'.
	 * @see factory.Factory#getMachines()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Machines();

	/**
	 * Returns the meta object for the reference list '{@link factory.Factory#getCreatedProductParts <em>Created Product Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Created Product Parts</em>'.
	 * @see factory.Factory#getCreatedProductParts()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_CreatedProductParts();

	/**
	 * Returns the meta object for class '{@link factory.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see factory.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link factory.Machine#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see factory.Machine#getX()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_X();

	/**
	 * Returns the meta object for the attribute '{@link factory.Machine#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see factory.Machine#getY()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Y();

	/**
	 * Returns the meta object for the attribute '{@link factory.Machine#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see factory.Machine#getSize()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Size();

	/**
	 * Returns the meta object for class '{@link factory.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see factory.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for class '{@link factory.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see factory.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link factory.Product#getProductionStartYear <em>Production Start Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production Start Year</em>'.
	 * @see factory.Product#getProductionStartYear()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductionStartYear();

	/**
	 * Returns the meta object for the attribute '{@link factory.Product#getProductionEndYear <em>Production End Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production End Year</em>'.
	 * @see factory.Product#getProductionEndYear()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductionEndYear();

	/**
	 * Returns the meta object for the attribute '{@link factory.Product#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see factory.Product#getImagePath()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ImagePath();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.Product#getOwnedProductVersions <em>Owned Product Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Product Versions</em>'.
	 * @see factory.Product#getOwnedProductVersions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_OwnedProductVersions();

	/**
	 * Returns the meta object for class '{@link factory.ProductPart <em>Product Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Part</em>'.
	 * @see factory.ProductPart
	 * @generated
	 */
	EClass getProductPart();

	/**
	 * Returns the meta object for the containment reference '{@link factory.ProductPart#getConstructionProcess <em>Construction Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Construction Process</em>'.
	 * @see factory.ProductPart#getConstructionProcess()
	 * @see #getProductPart()
	 * @generated
	 */
	EReference getProductPart_ConstructionProcess();

	/**
	 * Returns the meta object for the attribute '{@link factory.ProductPart#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see factory.ProductPart#getImagePath()
	 * @see #getProductPart()
	 * @generated
	 */
	EAttribute getProductPart_ImagePath();

	/**
	 * Returns the meta object for the reference list '{@link factory.ProductPart#getSupportedProductVersions <em>Supported Product Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Product Versions</em>'.
	 * @see factory.ProductPart#getSupportedProductVersions()
	 * @see #getProductPart()
	 * @generated
	 */
	EReference getProductPart_SupportedProductVersions();

	/**
	 * Returns the meta object for class '{@link factory.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see factory.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link factory.IdentifiableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see factory.IdentifiableElement#getId()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link factory.IdentifiableElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see factory.IdentifiableElement#getLabel()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Label();

	/**
	 * Returns the meta object for class '{@link factory.ProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Version</em>'.
	 * @see factory.ProductVersion
	 * @generated
	 */
	EClass getProductVersion();

	/**
	 * Returns the meta object for the attribute '{@link factory.ProductVersion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see factory.ProductVersion#getDescription()
	 * @see #getProductVersion()
	 * @generated
	 */
	EAttribute getProductVersion_Description();

	/**
	 * Returns the meta object for the attribute '{@link factory.ProductVersion#getVersionStartYear <em>Version Start Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Start Year</em>'.
	 * @see factory.ProductVersion#getVersionStartYear()
	 * @see #getProductVersion()
	 * @generated
	 */
	EAttribute getProductVersion_VersionStartYear();

	/**
	 * Returns the meta object for the attribute '{@link factory.ProductVersion#getVersionEndYear <em>Version End Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version End Year</em>'.
	 * @see factory.ProductVersion#getVersionEndYear()
	 * @see #getProductVersion()
	 * @generated
	 */
	EAttribute getProductVersion_VersionEndYear();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FactoryFactory getFactoryFactory();

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
		 * The meta object literal for the '{@link factory.impl.FactorySpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.FactorySpecificationImpl
		 * @see factory.impl.FactoryPackageImpl#getFactorySpecification()
		 * @generated
		 */
		EClass FACTORY_SPECIFICATION = eINSTANCE.getFactorySpecification();

		/**
		 * The meta object literal for the '<em><b>Owned Factories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_SPECIFICATION__OWNED_FACTORIES = eINSTANCE.getFactorySpecification_OwnedFactories();

		/**
		 * The meta object literal for the '<em><b>Owned Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_SPECIFICATION__OWNED_EMPLOYEES = eINSTANCE.getFactorySpecification_OwnedEmployees();

		/**
		 * The meta object literal for the '<em><b>Owned Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_SPECIFICATION__OWNED_MACHINES = eINSTANCE.getFactorySpecification_OwnedMachines();

		/**
		 * The meta object literal for the '<em><b>Owned Product Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS = eINSTANCE.getFactorySpecification_OwnedProductParts();

		/**
		 * The meta object literal for the '<em><b>Owned Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_SPECIFICATION__OWNED_PRODUCTS = eINSTANCE.getFactorySpecification_OwnedProducts();

		/**
		 * The meta object literal for the '<em><b>Business Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME = eINSTANCE.getFactorySpecification_BusinessTypeName();

		/**
		 * The meta object literal for the '{@link factory.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.FactoryImpl
		 * @see factory.impl.FactoryPackageImpl#getFactory()
		 * @generated
		 */
		EClass FACTORY = eINSTANCE.getFactory();

		/**
		 * The meta object literal for the '<em><b>Street Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__STREET_NUMBER = eINSTANCE.getFactory_StreetNumber();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__STREET = eINSTANCE.getFactory_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__CITY = eINSTANCE.getFactory_City();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__POSTAL_CODE = eINSTANCE.getFactory_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__COUNTRY = eINSTANCE.getFactory_Country();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__LENGTH = eINSTANCE.getFactory_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__WIDTH = eINSTANCE.getFactory_Width();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__EMPLOYEES = eINSTANCE.getFactory_Employees();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__MACHINES = eINSTANCE.getFactory_Machines();

		/**
		 * The meta object literal for the '<em><b>Created Product Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__CREATED_PRODUCT_PARTS = eINSTANCE.getFactory_CreatedProductParts();

		/**
		 * The meta object literal for the '{@link factory.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.MachineImpl
		 * @see factory.impl.FactoryPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__X = eINSTANCE.getMachine_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__Y = eINSTANCE.getMachine_Y();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SIZE = eINSTANCE.getMachine_Size();

		/**
		 * The meta object literal for the '{@link factory.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.EmployeeImpl
		 * @see factory.impl.FactoryPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '{@link factory.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.ProductImpl
		 * @see factory.impl.FactoryPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Production Start Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCTION_START_YEAR = eINSTANCE.getProduct_ProductionStartYear();

		/**
		 * The meta object literal for the '<em><b>Production End Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCTION_END_YEAR = eINSTANCE.getProduct_ProductionEndYear();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__IMAGE_PATH = eINSTANCE.getProduct_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Owned Product Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__OWNED_PRODUCT_VERSIONS = eINSTANCE.getProduct_OwnedProductVersions();

		/**
		 * The meta object literal for the '{@link factory.impl.ProductPartImpl <em>Product Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.ProductPartImpl
		 * @see factory.impl.FactoryPackageImpl#getProductPart()
		 * @generated
		 */
		EClass PRODUCT_PART = eINSTANCE.getProductPart();

		/**
		 * The meta object literal for the '<em><b>Construction Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PART__CONSTRUCTION_PROCESS = eINSTANCE.getProductPart_ConstructionProcess();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PART__IMAGE_PATH = eINSTANCE.getProductPart_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Supported Product Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PART__SUPPORTED_PRODUCT_VERSIONS = eINSTANCE.getProductPart_SupportedProductVersions();

		/**
		 * The meta object literal for the '{@link factory.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.IdentifiableElementImpl
		 * @see factory.impl.FactoryPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__LABEL = eINSTANCE.getIdentifiableElement_Label();

		/**
		 * The meta object literal for the '{@link factory.impl.ProductVersionImpl <em>Product Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.ProductVersionImpl
		 * @see factory.impl.FactoryPackageImpl#getProductVersion()
		 * @generated
		 */
		EClass PRODUCT_VERSION = eINSTANCE.getProductVersion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION__DESCRIPTION = eINSTANCE.getProductVersion_Description();

		/**
		 * The meta object literal for the '<em><b>Version Start Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION__VERSION_START_YEAR = eINSTANCE.getProductVersion_VersionStartYear();

		/**
		 * The meta object literal for the '<em><b>Version End Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION__VERSION_END_YEAR = eINSTANCE.getProductVersion_VersionEndYear();

	}

} //FactoryPackage
