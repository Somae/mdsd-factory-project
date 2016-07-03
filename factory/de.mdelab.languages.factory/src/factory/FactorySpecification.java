/**
 */
package factory;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.FactorySpecification#getOwnedFactories <em>Owned Factories</em>}</li>
 *   <li>{@link factory.FactorySpecification#getOwnedEmployees <em>Owned Employees</em>}</li>
 *   <li>{@link factory.FactorySpecification#getOwnedMachines <em>Owned Machines</em>}</li>
 *   <li>{@link factory.FactorySpecification#getOwnedProducts <em>Owned Products</em>}</li>
 *   <li>{@link factory.FactorySpecification#getBusinessTypeName <em>Business Type Name</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getFactorySpecification()
 * @model
 * @generated
 */
public interface FactorySpecification extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Owned Factories</b></em>' containment reference list.
	 * The list contents are of type {@link factory.Factory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Factories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Factories</em>' containment reference list.
	 * @see factory.FactoryPackage#getFactorySpecification_OwnedFactories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Factory> getOwnedFactories();

	/**
	 * Returns the value of the '<em><b>Owned Employees</b></em>' containment reference list.
	 * The list contents are of type {@link factory.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Employees</em>' containment reference list.
	 * @see factory.FactoryPackage#getFactorySpecification_OwnedEmployees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getOwnedEmployees();

	/**
	 * Returns the value of the '<em><b>Owned Machines</b></em>' containment reference list.
	 * The list contents are of type {@link factory.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Machines</em>' containment reference list.
	 * @see factory.FactoryPackage#getFactorySpecification_OwnedMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Machine> getOwnedMachines();

	/**
	 * Returns the value of the '<em><b>Owned Products</b></em>' containment reference list.
	 * The list contents are of type {@link factory.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Products</em>' containment reference list.
	 * @see factory.FactoryPackage#getFactorySpecification_OwnedProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getOwnedProducts();

	/**
	 * Returns the value of the '<em><b>Business Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Type Name</em>' attribute.
	 * @see #setBusinessTypeName(String)
	 * @see factory.FactoryPackage#getFactorySpecification_BusinessTypeName()
	 * @model
	 * @generated
	 */
	String getBusinessTypeName();

	/**
	 * Sets the value of the '{@link factory.FactorySpecification#getBusinessTypeName <em>Business Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Type Name</em>' attribute.
	 * @see #getBusinessTypeName()
	 * @generated
	 */
	void setBusinessTypeName(String value);

} // FactorySpecification
