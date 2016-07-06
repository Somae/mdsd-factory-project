/**
 */
package factory.tests;

import factory.FactoryFactory;
import factory.ProductVersion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product Version</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductVersionTest extends IdentifiableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductVersionTest.class);
	}

	/**
	 * Constructs a new Product Version test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductVersionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Product Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProductVersion getFixture() {
		return (ProductVersion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createProductVersion());
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

} //ProductVersionTest
