/**
 */
package factory.impl;

import factory.FactoryPackage;
import factory.ProductVersion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.ProductVersionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link factory.impl.ProductVersionImpl#getVersionStartYear <em>Version Start Year</em>}</li>
 *   <li>{@link factory.impl.ProductVersionImpl#getVersionEndYear <em>Version End Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductVersionImpl extends IdentifiableElementImpl implements ProductVersion {
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
	 * The default value of the '{@link #getVersionStartYear() <em>Version Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionStartYear()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_START_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersionStartYear() <em>Version Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionStartYear()
	 * @generated
	 * @ordered
	 */
	protected int versionStartYear = VERSION_START_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionEndYear() <em>Version End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionEndYear()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_END_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersionEndYear() <em>Version End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionEndYear()
	 * @generated
	 * @ordered
	 */
	protected int versionEndYear = VERSION_END_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryPackage.Literals.PRODUCT_VERSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT_VERSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersionStartYear() {
		return versionStartYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionStartYear(int newVersionStartYear) {
		int oldVersionStartYear = versionStartYear;
		versionStartYear = newVersionStartYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT_VERSION__VERSION_START_YEAR, oldVersionStartYear, versionStartYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersionEndYear() {
		return versionEndYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionEndYear(int newVersionEndYear) {
		int oldVersionEndYear = versionEndYear;
		versionEndYear = newVersionEndYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT_VERSION__VERSION_END_YEAR, oldVersionEndYear, versionEndYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactoryPackage.PRODUCT_VERSION__DESCRIPTION:
				return getDescription();
			case FactoryPackage.PRODUCT_VERSION__VERSION_START_YEAR:
				return getVersionStartYear();
			case FactoryPackage.PRODUCT_VERSION__VERSION_END_YEAR:
				return getVersionEndYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FactoryPackage.PRODUCT_VERSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FactoryPackage.PRODUCT_VERSION__VERSION_START_YEAR:
				setVersionStartYear((Integer)newValue);
				return;
			case FactoryPackage.PRODUCT_VERSION__VERSION_END_YEAR:
				setVersionEndYear((Integer)newValue);
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
			case FactoryPackage.PRODUCT_VERSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FactoryPackage.PRODUCT_VERSION__VERSION_START_YEAR:
				setVersionStartYear(VERSION_START_YEAR_EDEFAULT);
				return;
			case FactoryPackage.PRODUCT_VERSION__VERSION_END_YEAR:
				setVersionEndYear(VERSION_END_YEAR_EDEFAULT);
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
			case FactoryPackage.PRODUCT_VERSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FactoryPackage.PRODUCT_VERSION__VERSION_START_YEAR:
				return versionStartYear != VERSION_START_YEAR_EDEFAULT;
			case FactoryPackage.PRODUCT_VERSION__VERSION_END_YEAR:
				return versionEndYear != VERSION_END_YEAR_EDEFAULT;
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
		result.append(", versionStartYear: ");
		result.append(versionStartYear);
		result.append(", versionEndYear: ");
		result.append(versionEndYear);
		result.append(')');
		return result.toString();
	}

} //ProductVersionImpl
