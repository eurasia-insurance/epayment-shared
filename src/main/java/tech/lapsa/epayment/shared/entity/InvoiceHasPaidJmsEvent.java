package tech.lapsa.epayment.shared.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Currency;
import java.util.Optional;

import tech.lapsa.java.commons.function.MyOptionals;

public class InvoiceHasPaidJmsEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    // method *

    private String method;

    public String getMethod() {
	return method;
    }

    public void setMethod(final String method) {
	this.method = method;
    }

    // invoiceNumber *

    private String invoiceNumber;

    public String getInvoiceNumber() {
	return invoiceNumber;
    }

    public void setInvoiceNumber(final String invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
    }

    // instant *

    private Instant instant;

    public Instant getInstant() {
	return instant;
    }

    public void setInstant(final Instant instant) {
	this.instant = instant;
    }

    // amount *

    private Double amount;

    public Double getAmount() {
	return amount;
    }

    public void setAmount(final Double amount) {
	this.amount = amount;
    }

    // currency *

    private Currency currency;

    public Currency getCurrency() {
	return currency;
    }

    public void setCurrency(final Currency currency) {
	this.currency = currency;
    }

    // referenceNumber

    private String referenceNumber;

    public String getReferenceNumber() {
	return referenceNumber;
    }

    public Optional<String> optReferenceNumber() {
	return MyOptionals.of(getReferenceNumber());
    }

    public void setReferenceNumber(final String referenceNumber) {
	this.referenceNumber = referenceNumber;
    }

    // externalId

    private String externalId;

    public String getExternalId() {
	return externalId;
    }

    public Optional<String> optExternalId() {
	return MyOptionals.of(getExternalId());
    }

    public void setExternalId(final String externalId) {
	this.externalId = externalId;
    }

}
