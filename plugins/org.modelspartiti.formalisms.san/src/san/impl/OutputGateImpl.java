/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Case;
import san.OutputGate;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link san.impl.OutputGateImpl#getActivityCase <em>Activity Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputGateImpl extends GateImpl implements OutputGate {
	/**
	 * The cached value of the '{@link #getActivityCase() <em>Activity Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCase()
	 * @generated
	 * @ordered
	 */
	protected Case activityCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.OUTPUT_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case getActivityCase() {
		if (activityCase != null && activityCase.eIsProxy()) {
			InternalEObject oldActivityCase = (InternalEObject)activityCase;
			activityCase = (Case)eResolveProxy(oldActivityCase);
			if (activityCase != oldActivityCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANPackage.OUTPUT_GATE__ACTIVITY_CASE, oldActivityCase, activityCase));
			}
		}
		return activityCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case basicGetActivityCase() {
		return activityCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityCase(Case newActivityCase) {
		Case oldActivityCase = activityCase;
		activityCase = newActivityCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.OUTPUT_GATE__ACTIVITY_CASE, oldActivityCase, activityCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANPackage.OUTPUT_GATE__ACTIVITY_CASE:
				if (resolve) return getActivityCase();
				return basicGetActivityCase();
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
			case SANPackage.OUTPUT_GATE__ACTIVITY_CASE:
				setActivityCase((Case)newValue);
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
			case SANPackage.OUTPUT_GATE__ACTIVITY_CASE:
				setActivityCase((Case)null);
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
			case SANPackage.OUTPUT_GATE__ACTIVITY_CASE:
				return activityCase != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputGateImpl
