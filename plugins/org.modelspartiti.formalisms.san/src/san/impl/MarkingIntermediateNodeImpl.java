/**
 */
package san.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import san.CustomTypeDefinition;
import san.MarkingIntermediateNode;
import san.MarkingLeafNode;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marking Intermediate Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.MarkingIntermediateNodeImpl#getIntermediatenode <em>Intermediatenode</em>}</li>
 *   <li>{@link san.impl.MarkingIntermediateNodeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link san.impl.MarkingIntermediateNodeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link san.impl.MarkingIntermediateNodeImpl#getLeafnode <em>Leafnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkingIntermediateNodeImpl extends MarkingExtendedImpl implements MarkingIntermediateNode {
	/**
	 * The cached value of the '{@link #getIntermediatenode() <em>Intermediatenode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediatenode()
	 * @generated
	 * @ordered
	 */
	protected EList<MarkingIntermediateNode> intermediatenode;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected CustomTypeDefinition definition;

	/**
	 * The cached value of the '{@link #getLeafnode() <em>Leafnode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeafnode()
	 * @generated
	 * @ordered
	 */
	protected EList<MarkingLeafNode> leafnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkingIntermediateNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.MARKING_INTERMEDIATE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarkingIntermediateNode> getIntermediatenode() {
		if (intermediatenode == null) {
			intermediatenode = new EObjectContainmentEList<MarkingIntermediateNode>(MarkingIntermediateNode.class, this, SANPackage.MARKING_INTERMEDIATE_NODE__INTERMEDIATENODE);
		}
		return intermediatenode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.MARKING_INTERMEDIATE_NODE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTypeDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (CustomTypeDefinition)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANPackage.MARKING_INTERMEDIATE_NODE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTypeDefinition basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(CustomTypeDefinition newDefinition) {
		CustomTypeDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.MARKING_INTERMEDIATE_NODE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarkingLeafNode> getLeafnode() {
		if (leafnode == null) {
			leafnode = new EObjectContainmentEList<MarkingLeafNode>(MarkingLeafNode.class, this, SANPackage.MARKING_INTERMEDIATE_NODE__LEAFNODE);
		}
		return leafnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.MARKING_INTERMEDIATE_NODE__INTERMEDIATENODE:
				return ((InternalEList<?>)getIntermediatenode()).basicRemove(otherEnd, msgs);
			case SANPackage.MARKING_INTERMEDIATE_NODE__LEAFNODE:
				return ((InternalEList<?>)getLeafnode()).basicRemove(otherEnd, msgs);
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
			case SANPackage.MARKING_INTERMEDIATE_NODE__INTERMEDIATENODE:
				return getIntermediatenode();
			case SANPackage.MARKING_INTERMEDIATE_NODE__INDEX:
				return getIndex();
			case SANPackage.MARKING_INTERMEDIATE_NODE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case SANPackage.MARKING_INTERMEDIATE_NODE__LEAFNODE:
				return getLeafnode();
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
			case SANPackage.MARKING_INTERMEDIATE_NODE__INTERMEDIATENODE:
				getIntermediatenode().clear();
				getIntermediatenode().addAll((Collection<? extends MarkingIntermediateNode>)newValue);
				return;
			case SANPackage.MARKING_INTERMEDIATE_NODE__INDEX:
				setIndex((Integer)newValue);
				return;
			case SANPackage.MARKING_INTERMEDIATE_NODE__DEFINITION:
				setDefinition((CustomTypeDefinition)newValue);
				return;
			case SANPackage.MARKING_INTERMEDIATE_NODE__LEAFNODE:
				getLeafnode().clear();
				getLeafnode().addAll((Collection<? extends MarkingLeafNode>)newValue);
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
			case SANPackage.MARKING_INTERMEDIATE_NODE__INTERMEDIATENODE:
				getIntermediatenode().clear();
				return;
			case SANPackage.MARKING_INTERMEDIATE_NODE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case SANPackage.MARKING_INTERMEDIATE_NODE__DEFINITION:
				setDefinition((CustomTypeDefinition)null);
				return;
			case SANPackage.MARKING_INTERMEDIATE_NODE__LEAFNODE:
				getLeafnode().clear();
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
			case SANPackage.MARKING_INTERMEDIATE_NODE__INTERMEDIATENODE:
				return intermediatenode != null && !intermediatenode.isEmpty();
			case SANPackage.MARKING_INTERMEDIATE_NODE__INDEX:
				return index != INDEX_EDEFAULT;
			case SANPackage.MARKING_INTERMEDIATE_NODE__DEFINITION:
				return definition != null;
			case SANPackage.MARKING_INTERMEDIATE_NODE__LEAFNODE:
				return leafnode != null && !leafnode.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //MarkingIntermediateNodeImpl
