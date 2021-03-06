/**
 */
package org.modelspartiti.infrastructure.tmdl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getMultiplicityValue()
 * @model
 * @generated
 */
public interface MultiplicityValue extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getMultiplicityValue_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // MultiplicityValue
