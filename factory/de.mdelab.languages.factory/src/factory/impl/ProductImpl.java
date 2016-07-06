/**
 */
package factory.impl;

import factory.FactoryPackage;
import factory.Product;

import factory.ProductVersion;
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
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.ProductImpl#getProductionStartYear <em>Production Start Year</em>}</li>
 *   <li>{@link factory.impl.ProductImpl#getProductionEndYear <em>Production End Year</em>}</li>
 *   <li>{@link factory.impl.ProductImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link factory.impl.ProductImpl#getOwnedProductVersions <em>Owned Product Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends IdentifiableElementImpl implements Product {
	/**
	 * The default value of the '{@link #getProductionStartYear() <em>Production Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionStartYear()
	 * @generated
	 * @ordered
	 */
	protected static final int PRODUCTION_START_YEAR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getProductionStartYear() <em>Production Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionStartYear()
	 * @generated
	 * @ordered
	 */
	protected int productionStartYear = PRODUCTION_START_YEAR_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductionEndYear() <em>Production End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionEndYear()
	 * @generated
	 * @ordered
	 */
	protected static final int PRODUCTION_END_YEAR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getProductionEndYear() <em>Production End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionEndYear()
	 * @generated
	 * @ordered
	 */
	protected int productionEndYear = PRODUCTION_END_YEAR_EDEFAULT;
	/**
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected String imagePath = IMAGE_PATH_EDEFAULT;
	/**
	 * The cached value of the '{@link #getOwnedProductVersions() <em>Owned Product Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProductVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductVersion> ownedProductVersions;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProductionStartYear() {
		return productionStartYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionStartYear(int newProductionStartYear) {
		int oldProductionStartYear = productionStartYear;
		productionStartYear = newProductionStartYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT__PRODUCTION_START_YEAR, oldProductionStartYear, productionStartYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProductionEndYear() {
		return productionEndYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionEndYear(int newProductionEndYear) {
		int oldProductionEndYear = productionEndYear;
		productionEndYear = newProductionEndYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT__PRODUCTION_END_YEAR, oldProductionEndYear, productionEndYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePath(String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductVersion> getOwnedProductVersions() {
		if (ownedProductVersions == null) {
			ownedProductVersions = new EObjectContainmentEList<ProductVersion>(ProductVersion.class, this, FactoryPackage.PRODUCT__OWNED_PRODUCT_VERSIONS);
		}
		return ownedProductVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FactoryPackage.PRODUCT__OWNED_PRODUCT_VERSIONS:
				return ((InternalEList<?>)getOwnedProductVersions()).basicRemove(otherEnd, msgs);
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
			case FactoryPackage.PRODUCT__PRODUCTION_START_YEAR:
				return getProductionStartYear();
			case FactoryPackage.PRODUCT__PRODUCTION_END_YEAR:
				return getProductionEndYear();
			case FactoryPackage.PRODUCT__IMAGE_PATH:
				return getImagePath();
			case FactoryPackage.PRODUCT__OWNED_PRODUCT_VERSIONS:
				return getOwnedProductVersions();
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
			case FactoryPackage.PRODUCT__PRODUCTION_START_YEAR:
				setProductionStartYear((Integer)newValue);
				return;
			case FactoryPackage.PRODUCT__PRODUCTION_END_YEAR:
				setProductionEndYear((Integer)newValue);
				return;
			case FactoryPackage.PRODUCT__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case FactoryPackage.PRODUCT__OWNED_PRODUCT_VERSIONS:
				getOwnedProductVersions().clear();
				getOwnedProductVersions().addAll((Collection<? extends ProductVersion>)newValue);
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
			case FactoryPackage.PRODUCT__PRODUCTION_START_YEAR:
				setProductionStartYear(PRODUCTION_START_YEAR_EDEFAULT);
				return;
			case FactoryPackage.PRODUCT__PRODUCTION_END_YEAR:
				setProductionEndYear(PRODUCTION_END_YEAR_EDEFAULT);
				return;
			case FactoryPackage.PRODUCT__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case FactoryPackage.PRODUCT__OWNED_PRODUCT_VERSIONS:
				getOwnedProductVersions().clear();
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
			case FactoryPackage.PRODUCT__PRODUCTION_START_YEAR:
				return productionStartYear != PRODUCTION_START_YEAR_EDEFAULT;
			case FactoryPackage.PRODUCT__PRODUCTION_END_YEAR:
				return productionEndYear != PRODUCTION_END_YEAR_EDEFAULT;
			case FactoryPackage.PRODUCT__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case FactoryPackage.PRODUCT__OWNED_PRODUCT_VERSIONS:
				return ownedProductVersions != null && !ownedProductVersions.isEmpty();
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
		result.append(" (productionStartYear: ");
		result.append(productionStartYear);
		result.append(", productionEndYear: ");
		result.append(productionEndYear);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
