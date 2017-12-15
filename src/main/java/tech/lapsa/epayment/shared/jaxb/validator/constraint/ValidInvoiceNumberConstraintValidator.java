package tech.lapsa.epayment.shared.jaxb.validator.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ValidationException;

import tech.lapsa.epayment.facade.EpaymentFacade;
import tech.lapsa.epayment.facade.EpaymentFacade.EpaymentFacadeRemote;
import tech.lapsa.epayment.shared.jaxb.validator.ValidInvoiceNumber;
import tech.lapsa.java.commons.exceptions.IllegalArgument;
import tech.lapsa.java.commons.naming.MyNaming;

public class ValidInvoiceNumberConstraintValidator implements ConstraintValidator<ValidInvoiceNumber, String> {

    @Override
    public void initialize(final ValidInvoiceNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) throws ValidationException {
	if (value == null)
	    return true;

	final EpaymentFacade epayments = MyNaming.lookupEJB(ValidationException::new,
		EpaymentFacade.APPLICATION_NAME,
		EpaymentFacade.MODULE_NAME,
		EpaymentFacadeRemote.class,
		EpaymentFacade.class);
	try {
	    return epayments.hasInvoiceWithNumber(value);
	} catch (final IllegalArgument e) {
	    return false;
	}
    }
}
