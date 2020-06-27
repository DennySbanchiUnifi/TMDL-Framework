/**
 */
package tmdl.core.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import tmdl.core.util.CoreAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreItemProviderAdapterFactory extends CoreAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmdl.core.ParameterSimple} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSimpleItemProvider parameterSimpleItemProvider;

	/**
	 * This creates an adapter for a {@link tmdl.core.ParameterSimple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterSimpleAdapter() {
		if (parameterSimpleItemProvider == null) {
			parameterSimpleItemProvider = new ParameterSimpleItemProvider(this);
		}

		return parameterSimpleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmdl.core.ParameterArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterArrayItemProvider parameterArrayItemProvider;

	/**
	 * This creates an adapter for a {@link tmdl.core.ParameterArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterArrayAdapter() {
		if (parameterArrayItemProvider == null) {
			parameterArrayItemProvider = new ParameterArrayItemProvider(this);
		}

		return parameterArrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmdl.core.AssignmentSimple} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentSimpleItemProvider assignmentSimpleItemProvider;

	/**
	 * This creates an adapter for a {@link tmdl.core.AssignmentSimple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentSimpleAdapter() {
		if (assignmentSimpleItemProvider == null) {
			assignmentSimpleItemProvider = new AssignmentSimpleItemProvider(this);
		}

		return assignmentSimpleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmdl.core.AssignmentArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentArrayItemProvider assignmentArrayItemProvider;

	/**
	 * This creates an adapter for a {@link tmdl.core.AssignmentArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentArrayAdapter() {
		if (assignmentArrayItemProvider == null) {
			assignmentArrayItemProvider = new AssignmentArrayItemProvider(this);
		}

		return assignmentArrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmdl.core.MultiplicityValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityValueItemProvider multiplicityValueItemProvider;

	/**
	 * This creates an adapter for a {@link tmdl.core.MultiplicityValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicityValueAdapter() {
		if (multiplicityValueItemProvider == null) {
			multiplicityValueItemProvider = new MultiplicityValueItemProvider(this);
		}

		return multiplicityValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmdl.core.MultiplicityArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityArrayItemProvider multiplicityArrayItemProvider;

	/**
	 * This creates an adapter for a {@link tmdl.core.MultiplicityArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicityArrayAdapter() {
		if (multiplicityArrayItemProvider == null) {
			multiplicityArrayItemProvider = new MultiplicityArrayItemProvider(this);
		}

		return multiplicityArrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmdl.core.MultiplicityParametric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityParametricItemProvider multiplicityParametricItemProvider;

	/**
	 * This creates an adapter for a {@link tmdl.core.MultiplicityParametric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicityParametricAdapter() {
		if (multiplicityParametricItemProvider == null) {
			multiplicityParametricItemProvider = new MultiplicityParametricItemProvider(this);
		}

		return multiplicityParametricItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (parameterSimpleItemProvider != null) parameterSimpleItemProvider.dispose();
		if (parameterArrayItemProvider != null) parameterArrayItemProvider.dispose();
		if (assignmentSimpleItemProvider != null) assignmentSimpleItemProvider.dispose();
		if (assignmentArrayItemProvider != null) assignmentArrayItemProvider.dispose();
		if (multiplicityValueItemProvider != null) multiplicityValueItemProvider.dispose();
		if (multiplicityArrayItemProvider != null) multiplicityArrayItemProvider.dispose();
		if (multiplicityParametricItemProvider != null) multiplicityParametricItemProvider.dispose();
	}

}
