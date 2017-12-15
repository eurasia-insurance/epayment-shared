package tech.lapsa.epayment.shared.jaxb.validator.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ValidationException;

import tech.lapsa.epayment.facade.EpaymentFacade;
import tech.lapsa.epayment.shared.jaxb.validator.ValidInvoiceNumber;
import tech.lapsa.java.commons.exceptions.IllegalArgument;
import tech.lapsa.java.commons.function.MyExceptions;
import tech.lapsa.javax.cdi.commons.MyBeans;
import tech.lapsa.javax.cdi.qualifiers.QDelegateToEJB;

public class ValidInvoiceNumberConstraintValidator implements ConstraintValidator<ValidInvoiceNumber, String> {

    @Override
    public void initialize(final ValidInvoiceNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
	if (value == null)
	    return true;
	try {
	    return MyBeans.lookupCDI(EpaymentFacade.class, QDelegateToEJB.DEFAULT_INSTANCE) //
		    .orElseThrow(MyExceptions.supplier(ValidationException::new,
			    "Cannot find an instance of '%1$s'", EpaymentFacade.class)) //
		    .hasInvoiceWithNumber(value);
	} catch (final IllegalArgument e) {
	    throw new ValidationException(e);
	}
    }
}
