/**
 */
package factory.impl;

import factory.Employee;
import factory.Factory;
import factory.FactoryPackage;
import factory.Machine;
import factory.ProductPart;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import productionschema.ProductionSchema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.FactoryImpl#getProductionSchemata <em>Production Schemata</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getStreetNumber <em>Street Number</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getCity <em>City</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getLength <em>Length</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getCreatedProductParts <em>Created Product Parts</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getOwnedMachines <em>Owned Machines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends IdentifiableElementImpl implements Factory {
	/**
	 * The cached value of the '{@link #getProductionSchemata() <em>Production Schemata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionSchemata()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductionSchema> productionSchemata;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreetNumber() <em>Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetNumber() <em>Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected String streetNumber = STREET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final int POSTAL_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected int postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getMachines() <em>Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> machines;

	/**
	 * The cached value of the '{@link #getCreatedProductParts() <em>Created Product Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedProductParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductPart> createdProductParts;

	/**
	 * The cached value of the '{@link #getOwnedMachines() <em>Owned Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> ownedMachines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryPackage.Literals.FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductionSchema> getProductionSchemata() {
		if (productionSchemata == null) {
			productionSchemata = new EObjectResolvingEList<ProductionSchema>(ProductionSchema.class, this, FactoryPackage.FACTORY__PRODUCTION_SCHEMATA);
		}
		return productionSchemata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetNumber(String newStreetNumber) {
		String oldStreetNumber = streetNumber;
		streetNumber = newStreetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__STREET_NUMBER, oldStreetNumber, streetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(int newPostalCode) {
		int oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectResolvingEList<Employee>(Employee.class, this, FactoryPackage.FACTORY__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getMachines() {
		if (machines == null) {
			machines = new EObjectResolvingEList<Machine>(Machine.class, this, FactoryPackage.FACTORY__MACHINES);
		}
		return machines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductPart> getCreatedProductParts() {
		if (createdProductParts == null) {
			createdProductParts = new EObjectResolvingEList<ProductPart>(ProductPart.class, this, FactoryPackage.FACTORY__CREATED_PRODUCT_PARTS);
		}
		return createdProductParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getOwnedMachines() {
		if (ownedMachines == null) {
			ownedMachines = new EObjectContainmentEList<Machine>(Machine.class, this, FactoryPackage.FACTORY__OWNED_MACHINES);
		}
		return ownedMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FactoryPackage.FACTORY__OWNED_MACHINES:
				return ((InternalEList<?>)getOwnedMachines()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactoryPackage.FACTORY__PRODUCTION_SCHEMATA:
				return getProductionSchemata();
			case FactoryPackage.FACTORY__DESCRIPTION:
				return getDescription();
			case FactoryPackage.FACTORY__STREET_NUMBER:
				return getStreetNumber();
			case FactoryPackage.FACTORY__STREET:
				return getStreet();
			case FactoryPackage.FACTORY__CITY:
				return getCity();
			case FactoryPackage.FACTORY__POSTAL_CODE:
				return getPostalCode();
			case FactoryPackage.FACTORY__COUNTRY:
				return getCountry();
			case FactoryPackage.FACTORY__LENGTH:
				return getLength();
			case FactoryPackage.FACTORY__WIDTH:
				return getWidth();
			case FactoryPackage.FACTORY__EMPLOYEES:
				return getEmployees();
			case FactoryPackage.FACTORY__MACHINES:
				return getMachines();
			case FactoryPackage.FACTORY__CREATED_PRODUCT_PARTS:
				return getCreatedProductParts();
			case FactoryPackage.FACTORY__OWNED_MACHINES:
				return getOwnedMachines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FactoryPackage.FACTORY__PRODUCTION_SCHEMATA:
				getProductionSchemata().clear();
				getProductionSchemata().addAll((Collection<? extends ProductionSchema>)newValue);
				return;
			case FactoryPackage.FACTORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FactoryPackage.FACTORY__STREET_NUMBER:
				setStreetNumber((String)newValue);
				return;
			case FactoryPackage.FACTORY__STREET:
				setStreet((String)newValue);
				return;
			case FactoryPackage.FACTORY__CITY:
				setCity((String)newValue);
				return;
			case FactoryPackage.FACTORY__POSTAL_CODE:
				setPostalCode((Integer)newValue);
				return;
			case FactoryPackage.FACTORY__COUNTRY:
				setCountry((String)newValue);
				return;
			case FactoryPackage.FACTORY__LENGTH:
				setLength((Integer)newValue);
				return;
			case FactoryPackage.FACTORY__WIDTH:
				setWidth((Integer)newValue);
				return;
			case FactoryPackage.FACTORY__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case FactoryPackage.FACTORY__MACHINES:
				getMachines().clear();
				getMachines().addAll((Collection<? extends Machine>)newValue);
				return;
			case FactoryPackage.FACTORY__CREATED_PRODUCT_PARTS:
				getCreatedProductParts().clear();
				getCreatedProductParts().addAll((Collection<? extends ProductPart>)newValue);
				return;
			case FactoryPackage.FACTORY__OWNED_MACHINES:
				getOwnedMachines().clear();
				getOwnedMachines().addAll((Collection<? extends Machine>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FactoryPackage.FACTORY__PRODUCTION_SCHEMATA:
				getProductionSchemata().clear();
				return;
			case FactoryPackage.FACTORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FactoryPackage.FACTORY__STREET_NUMBER:
				setStreetNumber(STREET_NUMBER_EDEFAULT);
				return;
			case FactoryPackage.FACTORY__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case FactoryPackage.FACTORY__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case FactoryPackage.FACTORY__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case FactoryPackage.FACTORY__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case FactoryPackage.FACTORY__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case FactoryPackage.FACTORY__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FactoryPackage.FACTORY__EMPLOYEES:
				getEmployees().clear();
				return;
			case FactoryPackage.FACTORY__MACHINES:
				getMachines().clear();
				return;
			case FactoryPackage.FACTORY__CREATED_PRODUCT_PARTS:
				getCreatedProductParts().clear();
				return;
			case FactoryPackage.FACTORY__OWNED_MACHINES:
				getOwnedMachines().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FactoryPackage.FACTORY__PRODUCTION_SCHEMATA:
				return productionSchemata != null && !productionSchemata.isEmpty();
			case FactoryPackage.FACTORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FactoryPackage.FACTORY__STREET_NUMBER:
				return STREET_NUMBER_EDEFAULT == null ? streetNumber != null : !STREET_NUMBER_EDEFAULT.equals(streetNumber);
			case FactoryPackage.FACTORY__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case FactoryPackage.FACTORY__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case FactoryPackage.FACTORY__POSTAL_CODE:
				return postalCode != POSTAL_CODE_EDEFAULT;
			case FactoryPackage.FACTORY__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case FactoryPackage.FACTORY__LENGTH:
				return length != LENGTH_EDEFAULT;
			case FactoryPackage.FACTORY__WIDTH:
				return width != WIDTH_EDEFAULT;
			case FactoryPackage.FACTORY__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case FactoryPackage.FACTORY__MACHINES:
				return machines != null && !machines.isEmpty();
			case FactoryPackage.FACTORY__CREATED_PRODUCT_PARTS:
				return createdProductParts != null && !createdProductParts.isEmpty();
			case FactoryPackage.FACTORY__OWNED_MACHINES:
				return ownedMachines != null && !ownedMachines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", streetNumber: ");
		result.append(streetNumber);
		result.append(", street: ");
		result.append(street);
		result.append(", city: ");
		result.append(city);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", country: ");
		result.append(country);
		result.append(", length: ");
		result.append(length);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //FactoryImpl
