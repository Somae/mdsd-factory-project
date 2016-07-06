/**
 */
package factory;

import org.eclipse.emf.common.util.EList;
import productionschema.ProductionSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.Factory#getOwnedProductionSchemata <em>Owned Production Schemata</em>}</li>
 *   <li>{@link factory.Factory#getDescription <em>Description</em>}</li>
 *   <li>{@link factory.Factory#getStreetNumber <em>Street Number</em>}</li>
 *   <li>{@link factory.Factory#getStreet <em>Street</em>}</li>
 *   <li>{@link factory.Factory#getCity <em>City</em>}</li>
 *   <li>{@link factory.Factory#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link factory.Factory#getCountry <em>Country</em>}</li>
 *   <li>{@link factory.Factory#getLength <em>Length</em>}</li>
 *   <li>{@link factory.Factory#getWidth <em>Width</em>}</li>
 *   <li>{@link factory.Factory#getEmployees <em>Employees</em>}</li>
 *   <li>{@link factory.Factory#getMachines <em>Machines</em>}</li>
 *   <li>{@link factory.Factory#getCreatedProductParts <em>Created Product Parts</em>}</li>
 *   <li>{@link factory.Factory#getOwnedMachines <em>Owned Machines</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getFactory()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='factoryContainsAllPS'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot factoryContainsAllPS='createdProductParts->forAll(p|p.constructionProcesses->exists(ps | ownedProductionSchemata->includes(ps)))'"
 * @generated
 */
public interface Factory extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Owned Production Schemata</b></em>' containment reference list.
	 * The list contents are of type {@link productionschema.ProductionSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Production Schemata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Production Schemata</em>' containment reference list.
	 * @see factory.FactoryPackage#getFactory_OwnedProductionSchemata()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductionSchema> getOwnedProductionSchemata();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see factory.FactoryPackage#getFactory_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link factory.Factory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Number</em>' attribute.
	 * @see #setStreetNumber(String)
	 * @see factory.FactoryPackage#getFactory_StreetNumber()
	 * @model
	 * @generated
	 */
	String getStreetNumber();

	/**
	 * Sets the value of the '{@link factory.Factory#getStreetNumber <em>Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Number</em>' attribute.
	 * @see #getStreetNumber()
	 * @generated
	 */
	void setStreetNumber(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see factory.FactoryPackage#getFactory_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link factory.Factory#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see factory.FactoryPackage#getFactory_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link factory.Factory#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(int)
	 * @see factory.FactoryPackage#getFactory_PostalCode()
	 * @model
	 * @generated
	 */
	int getPostalCode();

	/**
	 * Sets the value of the '{@link factory.Factory#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(int value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see factory.FactoryPackage#getFactory_Country()
	 * @model
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link factory.Factory#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see factory.FactoryPackage#getFactory_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link factory.Factory#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see factory.FactoryPackage#getFactory_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link factory.Factory#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link factory.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see factory.FactoryPackage#getFactory_Employees()
	 * @model
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Machines</b></em>' reference list.
	 * The list contents are of type {@link factory.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' reference list.
	 * @see factory.FactoryPackage#getFactory_Machines()
	 * @model
	 * @generated
	 */
	EList<Machine> getMachines();

	/**
	 * Returns the value of the '<em><b>Created Product Parts</b></em>' reference list.
	 * The list contents are of type {@link factory.ProductPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Product Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Product Parts</em>' reference list.
	 * @see factory.FactoryPackage#getFactory_CreatedProductParts()
	 * @model
	 * @generated
	 */
	EList<ProductPart> getCreatedProductParts();

	/**
	 * Returns the value of the '<em><b>Owned Machines</b></em>' containment reference list.
	 * The list contents are of type {@link factory.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Machines</em>' containment reference list.
	 * @see factory.FactoryPackage#getFactory_OwnedMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Machine> getOwnedMachines();

} // Factory
