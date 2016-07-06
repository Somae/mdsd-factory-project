/**
 */
package factory.impl;

import factory.Employee;
import factory.Factory;
import factory.FactoryPackage;
import factory.FactorySpecification;
import factory.Product;

import factory.ProductPart;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.FactorySpecificationImpl#getOwnedFactories <em>Owned Factories</em>}</li>
 *   <li>{@link factory.impl.FactorySpecificationImpl#getOwnedEmployees <em>Owned Employees</em>}</li>
 *   <li>{@link factory.impl.FactorySpecificationImpl#getOwnedProductParts <em>Owned Product Parts</em>}</li>
 *   <li>{@link factory.impl.FactorySpecificationImpl#getOwnedProducts <em>Owned Products</em>}</li>
 *   <li>{@link factory.impl.FactorySpecificationImpl#getBusinessTypeName <em>Business Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactorySpecificationImpl extends IdentifiableElementImpl implements FactorySpecification {
	/**
	 * The cached value of the '{@link #getOwnedFactories() <em>Owned Factories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFactories()
	 * @generated
	 * @ordered
	 */
	protected EList<Factory> ownedFactories;

	/**
	 * The cached value of the '{@link #getOwnedEmployees() <em>Owned Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> ownedEmployees;

	/**
	 * The cached value of the '{@link #getOwnedProductParts() <em>Owned Product Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProductParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductPart> ownedProductParts;

	/**
	 * The cached value of the '{@link #getOwnedProducts() <em>Owned Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> ownedProducts;

	/**
	 * The default value of the '{@link #getBusinessTypeName() <em>Business Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessTypeName() <em>Business Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTypeName()
	 * @generated
	 * @ordered
	 */
	protected String businessTypeName = BUSINESS_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactorySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryPackage.Literals.FACTORY_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factory> getOwnedFactories() {
		if (ownedFactories == null) {
			ownedFactories = new EObjectContainmentEList<Factory>(Factory.class, this, FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES);
		}
		return ownedFactories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getOwnedEmployees() {
		if (ownedEmployees == null) {
			ownedEmployees = new EObjectContainmentEList<Employee>(Employee.class, this, FactoryPackage.FACTORY_SPECIFICATION__OWNED_EMPLOYEES);
		}
		return ownedEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductPart> getOwnedProductParts() {
		if (ownedProductParts == null) {
			ownedProductParts = new EObjectContainmentEList<ProductPart>(ProductPart.class, this, FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS);
		}
		return ownedProductParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getOwnedProducts() {
		if (ownedProducts == null) {
			ownedProducts = new EObjectContainmentEList<Product>(Product.class, this, FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCTS);
		}
		return ownedProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessTypeName() {
		return businessTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessTypeName(String newBusinessTypeName) {
		String oldBusinessTypeName = businessTypeName;
		businessTypeName = newBusinessTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME, oldBusinessTypeName, businessTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
				return ((InternalEList<?>)getOwnedFactories()).basicRemove(otherEnd, msgs);
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_EMPLOYEES:
				return ((InternalEList<?>)getOwnedEmployees()).basicRemove(otherEnd, msgs);
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS:
				return ((InternalEList<?>)getOwnedProductParts()).basicRemove(otherEnd, msgs);
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCTS:
				return ((InternalEList<?>)getOwnedProducts()).basicRemove(otherEnd, msgs);
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
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
				return getOwnedFactories();
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_EMPLOYEES:
				return getOwnedEmployees();
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS:
				return getOwnedProductParts();
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCTS:
				return getOwnedProducts();
			case FactoryPackage.FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME:
				return getBusinessTypeName();
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
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
				getOwnedFactories().clear();
				getOwnedFactories().addAll((Collection<? extends Factory>)newValue);
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_EMPLOYEES:
				getOwnedEmployees().clear();
				getOwnedEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS:
				getOwnedProductParts().clear();
				getOwnedProductParts().addAll((Collection<? extends ProductPart>)newValue);
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCTS:
				getOwnedProducts().clear();
				getOwnedProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME:
				setBusinessTypeName((String)newValue);
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
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
				getOwnedFactories().clear();
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_EMPLOYEES:
				getOwnedEmployees().clear();
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS:
				getOwnedProductParts().clear();
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCTS:
				getOwnedProducts().clear();
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME:
				setBusinessTypeName(BUSINESS_TYPE_NAME_EDEFAULT);
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
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
				return ownedFactories != null && !ownedFactories.isEmpty();
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_EMPLOYEES:
				return ownedEmployees != null && !ownedEmployees.isEmpty();
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS:
				return ownedProductParts != null && !ownedProductParts.isEmpty();
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCTS:
				return ownedProducts != null && !ownedProducts.isEmpty();
			case FactoryPackage.FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME:
				return BUSINESS_TYPE_NAME_EDEFAULT == null ? businessTypeName != null : !BUSINESS_TYPE_NAME_EDEFAULT.equals(businessTypeName);
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
		result.append(" (businessTypeName: ");
		result.append(businessTypeName);
		result.append(')');
		return result.toString();
	}

} //FactorySpecificationImpl
