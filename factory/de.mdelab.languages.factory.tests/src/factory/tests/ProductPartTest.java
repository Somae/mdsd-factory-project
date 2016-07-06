/**
 */
package factory.tests;

import factory.FactoryFactory;
import factory.ProductPart;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductPartTest extends IdentifiableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductPartTest.class);
	}

	/**
	 * Constructs a new Product Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Product Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProductPart getFixture() {
		return (ProductPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createProductPart());
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

} //ProductPartTest
