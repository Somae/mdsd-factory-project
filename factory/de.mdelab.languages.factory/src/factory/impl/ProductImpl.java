/**
 */
package factory.impl;

import factory.FactoryPackage;
import factory.Product;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import productionschema.ProductionSchema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.ProductImpl#getConstructionProcess <em>Construction Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends IdentifiableElementImpl implements Product {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS, oldConstructionProcess, newConstructionProcess);
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
				msgs = ((InternalEObject)constructionProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS, null, msgs);
			if (newConstructionProcess != null)
				msgs = ((InternalEObject)newConstructionProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS, null, msgs);
			msgs = basicSetConstructionProcess(newConstructionProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS, newConstructionProcess, newConstructionProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS:
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
			case FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS:
				return getConstructionProcess();
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
			case FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS:
				setConstructionProcess((ProductionSchema)newValue);
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
			case FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS:
				setConstructionProcess((ProductionSchema)null);
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
			case FactoryPackage.PRODUCT__CONSTRUCTION_PROCESS:
				return constructionProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
