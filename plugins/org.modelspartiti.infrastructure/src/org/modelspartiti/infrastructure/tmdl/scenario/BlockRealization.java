/**
 */
package org.modelspartiti.infrastructure.tmdl.scenario;

import org.eclipse.emf.ecore.EObject;

import org.modelspartiti.infrastructure.tmdl.library.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.scenario.BlockRealization#getBlock <em>Block</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.scenario.BlockRealization#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.scenario.ScenarioPackage#getBlockRealization()
 * @model
 * @generated
 */
public interface BlockRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference.
	 * @see #setBlock(Block)
	 * @see org.modelspartiti.infrastructure.tmdl.scenario.ScenarioPackage#getBlockRealization_Block()
	 * @model required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.scenario.BlockRealization#getBlock <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' reference.
	 * @see #setVariant(Variant)
	 * @see org.modelspartiti.infrastructure.tmdl.scenario.ScenarioPackage#getBlockRealization_Variant()
	 * @model required="true"
	 * @generated
	 */
	Variant getVariant();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.scenario.BlockRealization#getVariant <em>Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' reference.
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(Variant value);

} // BlockRealization
