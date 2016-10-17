/**
 *
 * $Id$
 */
package tmdl.expressions.validation;

import tmdl.expressions.TemplateExpressionBoolean;

/**
 * A sample validator interface for {@link tmdl.expressions.TemplateExpressionBooleanBinary}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TemplateExpressionBooleanBinaryValidator {
	boolean validate();

	boolean validateExp1(TemplateExpressionBoolean value);
	boolean validateExp2(TemplateExpressionBoolean value);
}
