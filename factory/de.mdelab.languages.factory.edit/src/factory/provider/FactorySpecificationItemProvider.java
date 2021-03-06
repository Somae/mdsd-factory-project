/**
 */
package factory.provider;


import factory.FactoryFactory;
import factory.FactoryPackage;
import factory.FactorySpecification;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link factory.FactorySpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FactorySpecificationItemProvider extends IdentifiableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorySpecificationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBusinessTypeNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Business Type Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessTypeNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FactorySpecification_businessTypeName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FactorySpecification_businessTypeName_feature", "_UI_FactorySpecification_type"),
				 FactoryPackage.Literals.FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FactoryPackage.Literals.FACTORY_SPECIFICATION__OWNED_FACTORIES);
			childrenFeatures.add(FactoryPackage.Literals.FACTORY_SPECIFICATION__OWNED_EMPLOYEES);
			childrenFeatures.add(FactoryPackage.Literals.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS);
			childrenFeatures.add(FactoryPackage.Literals.FACTORY_SPECIFICATION__OWNED_PRODUCTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FactorySpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FactorySpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		FactorySpecification factorySpecification = (FactorySpecification)object;
		return getString("_UI_FactorySpecification_type") + " " + factorySpecification.getId();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FactorySpecification.class)) {
			case FactoryPackage.FACTORY_SPECIFICATION__BUSINESS_TYPE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_EMPLOYEES:
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS:
			case FactoryPackage.FACTORY_SPECIFICATION__OWNED_PRODUCTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FactoryPackage.Literals.FACTORY_SPECIFICATION__OWNED_FACTORIES,
				 FactoryFactory.eINSTANCE.createFactory()));

		newChildDescriptors.add
			(createChildParameter
				(FactoryPackage.Literals.FACTORY_SPECIFICATION__OWNED_EMPLOYEES,
				 FactoryFactory.eINSTANCE.createEmployee()));

		newChildDescriptors.add
			(createChildParameter
				(FactoryPackage.Literals.FACTORY_SPECIFICATION__OWNED_PRODUCT_PARTS,
				 FactoryFactory.eINSTANCE.createProductPart()));

		newChildDescriptors.add
			(createChildParameter
				(FactoryPackage.Literals.FACTORY_SPECIFICATION__OWNED_PRODUCTS,
				 FactoryFactory.eINSTANCE.createProduct()));
	}

}
