/**
 */
package org.modelspartiti.infrastructure.tmdl.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.modelspartiti.infrastructure.tmdl.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/infrastructure/tmdl/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.ConcreteModel <em>Concrete Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.ConcreteModel
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getConcreteModel()
	 * @generated
	 */
	int CONCRETE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Concrete Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_MODEL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Templatize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_MODEL___TEMPLATIZE = 0;

	/**
	 * The number of operations of the '<em>Concrete Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.TemplateModel <em>Template Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.TemplateModel
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getTemplateModel()
	 * @generated
	 */
	int TEMPLATE_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_MODEL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Concretize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_MODEL___CONCRETIZE__ELIST = 0;

	/**
	 * The number of operations of the '<em>Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.ParameterImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.ParameterSimpleImpl <em>Parameter Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.ParameterSimpleImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getParameterSimple()
	 * @generated
	 */
	int PARAMETER_SIMPLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SIMPLE__NAME = PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>Parameter Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SIMPLE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SIMPLE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.ParameterArrayImpl <em>Parameter Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.ParameterArrayImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getParameterArray()
	 * @generated
	 */
	int PARAMETER_ARRAY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY__NAME = PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>Parameter Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 5;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentSimpleImpl <em>Assignment Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentSimpleImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getAssignmentSimple()
	 * @generated
	 */
	int ASSIGNMENT_SIMPLE = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_SIMPLE__PARAMETER = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_SIMPLE__VALUE = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_SIMPLE_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_SIMPLE_OPERATION_COUNT = ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentArrayImpl <em>Assignment Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentArrayImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getAssignmentArray()
	 * @generated
	 */
	int ASSIGNMENT_ARRAY = 7;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ARRAY__PARAMETER = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ARRAY__VALUES = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ARRAY_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ARRAY_OPERATION_COUNT = ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 8;

	/**
	 * The number of structural features of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityValueImpl <em>Multiplicity Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityValueImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getMultiplicityValue()
	 * @generated
	 */
	int MULTIPLICITY_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_VALUE__VALUE = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_VALUE_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiplicity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_VALUE_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityArrayImpl <em>Multiplicity Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityArrayImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getMultiplicityArray()
	 * @generated
	 */
	int MULTIPLICITY_ARRAY = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ARRAY__VALUES = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ARRAY_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiplicity Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ARRAY_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityParametricImpl <em>Multiplicity Parametric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityParametricImpl
	 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getMultiplicityParametric()
	 * @generated
	 */
	int MULTIPLICITY_PARAMETRIC = 11;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PARAMETRIC__PARAMETER = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Parametric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PARAMETRIC_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiplicity Parametric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PARAMETRIC_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.ConcreteModel <em>Concrete Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Model</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.ConcreteModel
	 * @generated
	 */
	EClass getConcreteModel();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.core.ConcreteModel#templatize() <em>Templatize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Templatize</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.core.ConcreteModel#templatize()
	 * @generated
	 */
	EOperation getConcreteModel__Templatize();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.TemplateModel <em>Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Model</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.TemplateModel
	 * @generated
	 */
	EClass getTemplateModel();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.core.TemplateModel#concretize(org.eclipse.emf.common.util.EList) <em>Concretize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Concretize</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.core.TemplateModel#concretize(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateModel__Concretize__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.core.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.ParameterSimple <em>Parameter Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Simple</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.ParameterSimple
	 * @generated
	 */
	EClass getParameterSimple();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.ParameterArray <em>Parameter Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Array</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.ParameterArray
	 * @generated
	 */
	EClass getParameterArray();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple <em>Assignment Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Simple</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple
	 * @generated
	 */
	EClass getAssignmentSimple();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple#getParameter()
	 * @see #getAssignmentSimple()
	 * @generated
	 */
	EReference getAssignmentSimple_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple#getValue()
	 * @see #getAssignmentSimple()
	 * @generated
	 */
	EAttribute getAssignmentSimple_Value();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentArray <em>Assignment Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Array</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.AssignmentArray
	 * @generated
	 */
	EClass getAssignmentArray();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentArray#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.AssignmentArray#getParameter()
	 * @see #getAssignmentArray()
	 * @generated
	 */
	EReference getAssignmentArray_Parameter();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentArray#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.AssignmentArray#getValues()
	 * @see #getAssignmentArray()
	 * @generated
	 */
	EAttribute getAssignmentArray_Values();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityValue <em>Multiplicity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.MultiplicityValue
	 * @generated
	 */
	EClass getMultiplicityValue();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.MultiplicityValue#getValue()
	 * @see #getMultiplicityValue()
	 * @generated
	 */
	EAttribute getMultiplicityValue_Value();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityArray <em>Multiplicity Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Array</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.MultiplicityArray
	 * @generated
	 */
	EClass getMultiplicityArray();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityArray#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.MultiplicityArray#getValues()
	 * @see #getMultiplicityArray()
	 * @generated
	 */
	EAttribute getMultiplicityArray_Values();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityParametric <em>Multiplicity Parametric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Parametric</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.MultiplicityParametric
	 * @generated
	 */
	EClass getMultiplicityParametric();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityParametric#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.core.MultiplicityParametric#getParameter()
	 * @see #getMultiplicityParametric()
	 * @generated
	 */
	EReference getMultiplicityParametric_Parameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.ConcreteModel <em>Concrete Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.ConcreteModel
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getConcreteModel()
		 * @generated
		 */
		EClass CONCRETE_MODEL = eINSTANCE.getConcreteModel();

		/**
		 * The meta object literal for the '<em><b>Templatize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONCRETE_MODEL___TEMPLATIZE = eINSTANCE.getConcreteModel__Templatize();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.TemplateModel <em>Template Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.TemplateModel
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getTemplateModel()
		 * @generated
		 */
		EClass TEMPLATE_MODEL = eINSTANCE.getTemplateModel();

		/**
		 * The meta object literal for the '<em><b>Concretize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_MODEL___CONCRETIZE__ELIST = eINSTANCE.getTemplateModel__Concretize__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.ParameterImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.ParameterSimpleImpl <em>Parameter Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.ParameterSimpleImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getParameterSimple()
		 * @generated
		 */
		EClass PARAMETER_SIMPLE = eINSTANCE.getParameterSimple();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.ParameterArrayImpl <em>Parameter Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.ParameterArrayImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getParameterArray()
		 * @generated
		 */
		EClass PARAMETER_ARRAY = eINSTANCE.getParameterArray();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentSimpleImpl <em>Assignment Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentSimpleImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getAssignmentSimple()
		 * @generated
		 */
		EClass ASSIGNMENT_SIMPLE = eINSTANCE.getAssignmentSimple();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_SIMPLE__PARAMETER = eINSTANCE.getAssignmentSimple_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_SIMPLE__VALUE = eINSTANCE.getAssignmentSimple_Value();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentArrayImpl <em>Assignment Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.AssignmentArrayImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getAssignmentArray()
		 * @generated
		 */
		EClass ASSIGNMENT_ARRAY = eINSTANCE.getAssignmentArray();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_ARRAY__PARAMETER = eINSTANCE.getAssignmentArray_Parameter();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_ARRAY__VALUES = eINSTANCE.getAssignmentArray_Values();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityValueImpl <em>Multiplicity Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityValueImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getMultiplicityValue()
		 * @generated
		 */
		EClass MULTIPLICITY_VALUE = eINSTANCE.getMultiplicityValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_VALUE__VALUE = eINSTANCE.getMultiplicityValue_Value();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityArrayImpl <em>Multiplicity Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityArrayImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getMultiplicityArray()
		 * @generated
		 */
		EClass MULTIPLICITY_ARRAY = eINSTANCE.getMultiplicityArray();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ARRAY__VALUES = eINSTANCE.getMultiplicityArray_Values();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityParametricImpl <em>Multiplicity Parametric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.MultiplicityParametricImpl
		 * @see org.modelspartiti.infrastructure.tmdl.core.impl.CorePackageImpl#getMultiplicityParametric()
		 * @generated
		 */
		EClass MULTIPLICITY_PARAMETRIC = eINSTANCE.getMultiplicityParametric();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_PARAMETRIC__PARAMETER = eINSTANCE.getMultiplicityParametric_Parameter();

	}

} //CorePackage
