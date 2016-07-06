/**
 */
package factory.impl;

import factory.FactoryPackage;
import factory.ProductPart;
import factory.ProductVersion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import productionschema.ProductionSchema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.ProductPartImpl#getConstructionProcess <em>Construction Process</em>}</li>
 *   <li>{@link factory.impl.ProductPartImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link factory.impl.ProductPartImpl#getSupportedProductVersions <em>Supported Product Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPartImpl extends IdentifiableElementImpl implements ProductPart {
	/**
	 * The cached value of the '{@link #getConstructionProcess() <em>Construction Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionProcess()
	 * @generated
	 * @ordered
	 */
	protected ProductionSchema constructionProcess;

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
	 * The cached value of the '{@link #getSupportedProductVersions() <em>Supported Product Versions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProductVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductVersion> supportedProductVersions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryPackage.Literals.PRODUCT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionSchema getConstructionProcess() {
		return constructionProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstructionProcess(ProductionSchema newConstructionProcess, NotificationChain msgs) {
		ProductionSchema oldConstructionProcess = constructionProcess;
		constructionProcess = newConstructionProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS, oldConstructionProcess, newConstructionProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionProcess(ProductionSchema newConstructionProcess) {
		if (newConstructionProcess != constructionProcess) {
			NotificationChain msgs = null;
			if (constructionProcess != null)
				msgs = ((InternalEObject)constructionProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS, null, msgs);
			if (newConstructionProcess != null)
				msgs = ((InternalEObject)newConstructionProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS, null, msgs);
			msgs = basicSetConstructionProcess(newConstructionProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS, newConstructionProcess, newConstructionProcess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT_PART__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductVersion> getSupportedProductVersions() {
		if (supportedProductVersions == null) {
			supportedProductVersions = new EObjectResolvingEList<ProductVersion>(ProductVersion.class, this, FactoryPackage.PRODUCT_PART__SUPPORTED_PRODUCT_VERSIONS);
		}
		return supportedProductVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS:
				return basicSetConstructionProcess(null, msgs);
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
			case FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS:
				return getConstructionProcess();
			case FactoryPackage.PRODUCT_PART__IMAGE_PATH:
				return getImagePath();
			case FactoryPackage.PRODUCT_PART__SUPPORTED_PRODUCT_VERSIONS:
				return getSupportedProductVersions();
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
			case FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS:
				setConstructionProcess((ProductionSchema)newValue);
				return;
			case FactoryPackage.PRODUCT_PART__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case FactoryPackage.PRODUCT_PART__SUPPORTED_PRODUCT_VERSIONS:
				getSupportedProductVersions().clear();
				getSupportedProductVersions().addAll((Collection<? extends ProductVersion>)newValue);
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
			case FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS:
				setConstructionProcess((ProductionSchema)null);
				return;
			case FactoryPackage.PRODUCT_PART__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case FactoryPackage.PRODUCT_PART__SUPPORTED_PRODUCT_VERSIONS:
				getSupportedProductVersions().clear();
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
			case FactoryPackage.PRODUCT_PART__CONSTRUCTION_PROCESS:
				return constructionProcess != null;
			case FactoryPackage.PRODUCT_PART__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case FactoryPackage.PRODUCT_PART__SUPPORTED_PRODUCT_VERSIONS:
				return supportedProductVersions != null && !supportedProductVersions.isEmpty();
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
		result.append(" (imagePath: ");
		result.append(imagePath);
		result.append(')');
		return result.toString();
	}

} //ProductPartImpl
