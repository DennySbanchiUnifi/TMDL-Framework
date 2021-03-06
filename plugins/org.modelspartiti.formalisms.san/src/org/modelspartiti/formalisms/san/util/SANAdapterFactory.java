/**
 */
package org.modelspartiti.formalisms.san.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modelspartiti.formalisms.san.*;

import org.modelspartiti.infrastructure.tmdl.core.ConcreteModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modelspartiti.formalisms.san.SANPackage
 * @generated
 */
public class SANAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SANPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SANPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SANSwitch<Adapter> modelSwitch =
		new SANSwitch<Adapter>() {
			@Override
			public Adapter caseSAN(SAN object) {
				return createSANAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseInstantaneousActivity(InstantaneousActivity object) {
				return createInstantaneousActivityAdapter();
			}
			@Override
			public Adapter caseTimedActivity(TimedActivity object) {
				return createTimedActivityAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
			}
			@Override
			public Adapter caseInputArc(InputArc object) {
				return createInputArcAdapter();
			}
			@Override
			public Adapter caseOutputArc(OutputArc object) {
				return createOutputArcAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseOutputGate(OutputGate object) {
				return createOutputGateAdapter();
			}
			@Override
			public Adapter caseInputGate(InputGate object) {
				return createInputGateAdapter();
			}
			@Override
			public Adapter caseDistribution(Distribution object) {
				return createDistributionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionText(ExpressionText object) {
				return createExpressionTextAdapter();
			}
			@Override
			public Adapter caseExpressionMarking(ExpressionMarking object) {
				return createExpressionMarkingAdapter();
			}
			@Override
			public Adapter caseExpressionVariable(ExpressionVariable object) {
				return createExpressionVariableAdapter();
			}
			@Override
			public Adapter caseMarking(Marking object) {
				return createMarkingAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseExponential(Exponential object) {
				return createExponentialAdapter();
			}
			@Override
			public Adapter caseNormal(Normal object) {
				return createNormalAdapter();
			}
			@Override
			public Adapter caseGamma(Gamma object) {
				return createGammaAdapter();
			}
			@Override
			public Adapter caseBinomial(Binomial object) {
				return createBinomialAdapter();
			}
			@Override
			public Adapter caseDeterministic(Deterministic object) {
				return createDeterministicAdapter();
			}
			@Override
			public Adapter caseLognormal(Lognormal object) {
				return createLognormalAdapter();
			}
			@Override
			public Adapter caseBeta(Beta object) {
				return createBetaAdapter();
			}
			@Override
			public Adapter caseNegativeBinomial(NegativeBinomial object) {
				return createNegativeBinomialAdapter();
			}
			@Override
			public Adapter caseGeometric(Geometric object) {
				return createGeometricAdapter();
			}
			@Override
			public Adapter caseErlang(Erlang object) {
				return createErlangAdapter();
			}
			@Override
			public Adapter caseUniform(Uniform object) {
				return createUniformAdapter();
			}
			@Override
			public Adapter caseHyperExponential(HyperExponential object) {
				return createHyperExponentialAdapter();
			}
			@Override
			public Adapter caseWeibull(Weibull object) {
				return createWeibullAdapter();
			}
			@Override
			public Adapter caseTriangular(Triangular object) {
				return createTriangularAdapter();
			}
			@Override
			public Adapter caseConditionalWeibull(ConditionalWeibull object) {
				return createConditionalWeibullAdapter();
			}
			@Override
			public Adapter caseHypoExponential(HypoExponential object) {
				return createHypoExponentialAdapter();
			}
			@Override
			public Adapter casePareto(Pareto object) {
				return createParetoAdapter();
			}
			@Override
			public Adapter caseExpressionSegment(ExpressionSegment object) {
				return createExpressionSegmentAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseComplexType(ComplexType object) {
				return createComplexTypeAdapter();
			}
			@Override
			public Adapter caseCustomTypeDefinition(CustomTypeDefinition object) {
				return createCustomTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseCustomTypeArray(CustomTypeArray object) {
				return createCustomTypeArrayAdapter();
			}
			@Override
			public Adapter caseCustomTypeStruct(CustomTypeStruct object) {
				return createCustomTypeStructAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseMarkingSimple(MarkingSimple object) {
				return createMarkingSimpleAdapter();
			}
			@Override
			public Adapter caseMarkingGlobalVariable(MarkingGlobalVariable object) {
				return createMarkingGlobalVariableAdapter();
			}
			@Override
			public Adapter caseMarkingExtended(MarkingExtended object) {
				return createMarkingExtendedAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseLeafNode(LeafNode object) {
				return createLeafNodeAdapter();
			}
			@Override
			public Adapter caseLeafNodeString(LeafNodeString object) {
				return createLeafNodeStringAdapter();
			}
			@Override
			public Adapter caseLeafNodeStruct(LeafNodeStruct object) {
				return createLeafNodeStructAdapter();
			}
			@Override
			public Adapter caseLeafNodeGlobalVariable(LeafNodeGlobalVariable object) {
				return createLeafNodeGlobalVariableAdapter();
			}
			@Override
			public Adapter caseConcreteModel(ConcreteModel object) {
				return createConcreteModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.SAN <em>SAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.SAN
	 * @generated
	 */
	public Adapter createSANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.InstantaneousActivity <em>Instantaneous Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.InstantaneousActivity
	 * @generated
	 */
	public Adapter createInstantaneousActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.TimedActivity <em>Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.TimedActivity
	 * @generated
	 */
	public Adapter createTimedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.InputArc <em>Input Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.InputArc
	 * @generated
	 */
	public Adapter createInputArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.OutputArc <em>Output Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.OutputArc
	 * @generated
	 */
	public Adapter createOutputArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.OutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.OutputGate
	 * @generated
	 */
	public Adapter createOutputGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.InputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.InputGate
	 * @generated
	 */
	public Adapter createInputGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Distribution
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.ExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.ExpressionText
	 * @generated
	 */
	public Adapter createExpressionTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.ExpressionMarking <em>Expression Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.ExpressionMarking
	 * @generated
	 */
	public Adapter createExpressionMarkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.ExpressionVariable <em>Expression Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.ExpressionVariable
	 * @generated
	 */
	public Adapter createExpressionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Marking
	 * @generated
	 */
	public Adapter createMarkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Exponential
	 * @generated
	 */
	public Adapter createExponentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Normal
	 * @generated
	 */
	public Adapter createNormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Gamma
	 * @generated
	 */
	public Adapter createGammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Binomial <em>Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Binomial
	 * @generated
	 */
	public Adapter createBinomialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Deterministic <em>Deterministic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Deterministic
	 * @generated
	 */
	public Adapter createDeterministicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Lognormal <em>Lognormal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Lognormal
	 * @generated
	 */
	public Adapter createLognormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Beta
	 * @generated
	 */
	public Adapter createBetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.NegativeBinomial <em>Negative Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.NegativeBinomial
	 * @generated
	 */
	public Adapter createNegativeBinomialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Geometric <em>Geometric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Geometric
	 * @generated
	 */
	public Adapter createGeometricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Erlang <em>Erlang</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Erlang
	 * @generated
	 */
	public Adapter createErlangAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Uniform
	 * @generated
	 */
	public Adapter createUniformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.HyperExponential <em>Hyper Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.HyperExponential
	 * @generated
	 */
	public Adapter createHyperExponentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Weibull <em>Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Weibull
	 * @generated
	 */
	public Adapter createWeibullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Triangular <em>Triangular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Triangular
	 * @generated
	 */
	public Adapter createTriangularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.ConditionalWeibull <em>Conditional Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.ConditionalWeibull
	 * @generated
	 */
	public Adapter createConditionalWeibullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.HypoExponential <em>Hypo Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.HypoExponential
	 * @generated
	 */
	public Adapter createHypoExponentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Pareto <em>Pareto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Pareto
	 * @generated
	 */
	public Adapter createParetoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.ExpressionSegment <em>Expression Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.ExpressionSegment
	 * @generated
	 */
	public Adapter createExpressionSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.CustomTypeDefinition <em>Custom Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.CustomTypeDefinition
	 * @generated
	 */
	public Adapter createCustomTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.CustomTypeArray <em>Custom Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.CustomTypeArray
	 * @generated
	 */
	public Adapter createCustomTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.CustomTypeStruct <em>Custom Type Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.CustomTypeStruct
	 * @generated
	 */
	public Adapter createCustomTypeStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.MarkingSimple <em>Marking Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.MarkingSimple
	 * @generated
	 */
	public Adapter createMarkingSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.MarkingGlobalVariable <em>Marking Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.MarkingGlobalVariable
	 * @generated
	 */
	public Adapter createMarkingGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.MarkingExtended <em>Marking Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.MarkingExtended
	 * @generated
	 */
	public Adapter createMarkingExtendedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.LeafNode <em>Leaf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.LeafNode
	 * @generated
	 */
	public Adapter createLeafNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.LeafNodeString <em>Leaf Node String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.LeafNodeString
	 * @generated
	 */
	public Adapter createLeafNodeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.LeafNodeStruct <em>Leaf Node Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.LeafNodeStruct
	 * @generated
	 */
	public Adapter createLeafNodeStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.formalisms.san.LeafNodeGlobalVariable <em>Leaf Node Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.formalisms.san.LeafNodeGlobalVariable
	 * @generated
	 */
	public Adapter createLeafNodeGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.core.ConcreteModel <em>Concrete Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.core.ConcreteModel
	 * @generated
	 */
	public Adapter createConcreteModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SANAdapterFactory
