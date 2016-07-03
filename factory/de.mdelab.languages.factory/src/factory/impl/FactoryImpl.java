/**
 */
package factory.impl;

import factory.Employee;
import factory.Factory;
import factory.FactoryPackage;
import factory.Machine;
import factory.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.FactoryImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getLength <em>Length</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getCreatedProducts <em>Created Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends IdentifiableElementImpl implements Factory {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

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
	 * The cached value of the '{@link #getCreatedProducts() <em>Created Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> createdProducts;

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
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__ADDRESS, oldAddress, address));
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
	public EList<Product> getCreatedProducts() {
		if (createdProducts == null) {
			createdProducts = new EObjectResolvingEList<Product>(Product.class, this, FactoryPackage.FACTORY__CREATED_PRODUCTS);
		}
		return createdProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactoryPackage.FACTORY__ADDRESS:
				return getAddress();
			case FactoryPackage.FACTORY__LENGTH:
				return getLength();
			case FactoryPackage.FACTORY__WIDTH:
				return getWidth();
			case FactoryPackage.FACTORY__EMPLOYEES:
				return getEmployees();
			case FactoryPackage.FACTORY__MACHINES:
				return getMachines();
			case FactoryPackage.FACTORY__CREATED_PRODUCTS:
				return getCreatedProducts();
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
			case FactoryPackage.FACTORY__ADDRESS:
				setAddress((String)newValue);
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
			case FactoryPackage.FACTORY__CREATED_PRODUCTS:
				getCreatedProducts().clear();
				getCreatedProducts().addAll((Collection<? extends Product>)newValue);
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
			case FactoryPackage.FACTORY__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case FactoryPackage.FACTORY__CREATED_PRODUCTS:
				getCreatedProducts().clear();
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
			case FactoryPackage.FACTORY__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case FactoryPackage.FACTORY__LENGTH:
				return length != LENGTH_EDEFAULT;
			case FactoryPackage.FACTORY__WIDTH:
				return width != WIDTH_EDEFAULT;
			case FactoryPackage.FACTORY__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case FactoryPackage.FACTORY__MACHINES:
				return machines != null && !machines.isEmpty();
			case FactoryPackage.FACTORY__CREATED_PRODUCTS:
				return createdProducts != null && !createdProducts.isEmpty();
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
		result.append(" (address: ");
		result.append(address);
		result.append(", length: ");
		result.append(length);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //FactoryImpl
