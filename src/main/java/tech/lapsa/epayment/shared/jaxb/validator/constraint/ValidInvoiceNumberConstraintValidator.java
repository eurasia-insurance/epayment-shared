package tech.lapsa.epayment.shared.jaxb.validator.constraint;

import static tech.lapsa.java.commons.function.MyExceptions.*;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ValidationException;

import tech.lapsa.epayment.facade.EpaymentFacade;
import tech.lapsa.epayment.shared.jaxb.validator.ValidInvoiceNumber;
import tech.lapsa.javax.cdi.commons.MyBeans;

public class ValidInvoiceNumberConstraintValidator implements ConstraintValidator<ValidInvoiceNumber, String> {

    @Override
    public void initialize(final ValidInvoiceNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
	if (value == null)
	    return true;
	try {
	    return reThrowAsUnchecked(() -> {
		return MyBeans.lookup(EpaymentFacade.class) //
			.orElseThrow(
				() -> new ValidationException("Cannot find an instance of " + EpaymentFacade.class)) //
			.hasInvoiceWithNumber(value);
	    }).booleanValue();
	} catch (final IllegalArgumentException e) {
	    return false;
	}
    }
}
