/**
 */
package productionschema.tests;

import junit.textui.TestRunner;

import productionschema.ProductionSchema;
import productionschema.ProductionschemaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Production Schema</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductionSchemaTest extends IdentifiableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductionSchemaTest.class);
	}

	/**
	 * Constructs a new Production Schema test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionSchemaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Production Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProductionSchema getFixture() {
		return (ProductionSchema)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductionschemaFactory.eINSTANCE.createProductionSchema());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProductionSchemaTest
