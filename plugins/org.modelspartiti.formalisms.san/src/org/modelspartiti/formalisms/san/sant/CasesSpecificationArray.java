/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.formalisms.san.san.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.CasesSpecificationArray#getNumCases <em>Num Cases</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.CasesSpecificationArray#getP <em>P</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getCasesSpecificationArray()
 * @model
 * @generated
 */
public interface CasesSpecificationArray extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Num Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cases</em>' attribute.
	 * @see #setNumCases(int)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getCasesSpecificationArray_NumCases()
	 * @model required="true"
	 * @generated
	 */
	int getNumCases();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.CasesSpecificationArray#getNumCases <em>Num Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cases</em>' attribute.
	 * @see #getNumCases()
	 * @generated
	 */
	void setNumCases(int value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getCasesSpecificationArray_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getP();

} // CasesSpecificationArray
