/**
 */
package de.mdelab.languages.productionschema.impl;

import de.mdelab.languages.productionschema.Link;
import de.mdelab.languages.productionschema.LinkableNode;
import de.mdelab.languages.productionschema.Material;
import de.mdelab.languages.productionschema.ProductionSchema;
import de.mdelab.languages.productionschema.ProductionschemaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl#getOwnedLinkableNodes <em>Owned Linkable Nodes</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl#getOwnedLinks <em>Owned Links</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl#getOwnedMaterials <em>Owned Materials</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionSchemaImpl extends MinimalEObjectImpl.Container implements ProductionSchema {
	/**
	 * The cached value of the '{@link #getOwnedLinkableNodes() <em>Owned Linkable Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLinkableNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkableNode> ownedLinkableNodes;

	/**
	 * The cached value of the '{@link #getOwnedLinks() <em>Owned Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> ownedLinks;

	/**
	 * The cached value of the '{@link #getOwnedMaterials() <em>Owned Materials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<Material> ownedMaterials;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionschemaPackage.Literals.PRODUCTION_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkableNode> getOwnedLinkableNodes() {
		if (ownedLinkableNodes == null) {
			ownedLinkableNodes = new EObjectContainmentEList<LinkableNode>(LinkableNode.class, this, ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES);
		}
		return ownedLinkableNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getOwnedLinks() {
		if (ownedLinks == null) {
			ownedLinks = new EObjectContainmentEList<Link>(Link.class, this, ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKS);
		}
		return ownedLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Material> getOwnedMaterials() {
		if (ownedMaterials == null) {
			ownedMaterials = new EObjectContainmentEList<Material>(Material.class, this, ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS);
		}
		return ownedMaterials;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionschemaPackage.PRODUCTION_SCHEMA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionschemaPackage.PRODUCTION_SCHEMA__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
				return ((InternalEList<?>)getOwnedLinkableNodes()).basicRemove(otherEnd, msgs);
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKS:
				return ((InternalEList<?>)getOwnedLinks()).basicRemove(otherEnd, msgs);
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
				return ((InternalEList<?>)getOwnedMaterials()).basicRemove(otherEnd, msgs);
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
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
				return getOwnedLinkableNodes();
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKS:
				return getOwnedLinks();
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
				return getOwnedMaterials();
			case ProductionschemaPackage.PRODUCTION_SCHEMA__DESCRIPTION:
				return getDescription();
			case ProductionschemaPackage.PRODUCTION_SCHEMA__LABEL:
				return getLabel();
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
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
				getOwnedLinkableNodes().clear();
				getOwnedLinkableNodes().addAll((Collection<? extends LinkableNode>)newValue);
				return;
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKS:
				getOwnedLinks().clear();
				getOwnedLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
				getOwnedMaterials().clear();
				getOwnedMaterials().addAll((Collection<? extends Material>)newValue);
				return;
			case ProductionschemaPackage.PRODUCTION_SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProductionschemaPackage.PRODUCTION_SCHEMA__LABEL:
				setLabel((String)newValue);
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
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
				getOwnedLinkableNodes().clear();
				return;
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKS:
				getOwnedLinks().clear();
				return;
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
				getOwnedMaterials().clear();
				return;
			case ProductionschemaPackage.PRODUCTION_SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProductionschemaPackage.PRODUCTION_SCHEMA__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
				return ownedLinkableNodes != null && !ownedLinkableNodes.isEmpty();
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKS:
				return ownedLinks != null && !ownedLinks.isEmpty();
			case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
				return ownedMaterials != null && !ownedMaterials.isEmpty();
			case ProductionschemaPackage.PRODUCTION_SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProductionschemaPackage.PRODUCTION_SCHEMA__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ProductionSchemaImpl
