package tech.lapsa.epayment.shared.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Currency;
import java.util.Optional;

import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import tech.lapsa.epayment.shared.jaxb.validator.ValidInvoiceNumber;
import tech.lapsa.java.commons.function.MyOptionals;
import tech.lapsa.javax.validation.NotEmptyString;
import tech.lapsa.javax.validation.NotNullValue;

@XmlRootElement(name = "invoiceHasPaidEvent")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlInvoiceHasPaidEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    // method *

    @XmlAttribute
    @NotNullValue
    @NotEmptyString
    private String method;

    public String getMethod() {
	return method;
    }

    public void setMethod(String method) {
	this.method = method;
    }

    // invoiceNumber *

    @XmlAttribute
    @NotNullValue
    @ValidInvoiceNumber
    private String invoiceNumber;

    public String getInvoiceNumber() {
	return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
    }

    // instant *

    @XmlAttribute
    @NotNullValue
    private Instant instant;

    public Instant getInstant() {
	return instant;
    }

    public void setInstant(Instant instant) {
	this.instant = instant;
    }

    // amount *

    @XmlAttribute
    @NotNullValue
    @Min(0)
    private Double amount;

    public Double getAmount() {
	return amount;
    }

    public void setAmount(Double amount) {
	this.amount = amount;
    }

    // currency *

    @XmlAttribute
    @NotNullValue
    private Currency currency;

    public Currency getCurrency() {
	return currency;
    }

    public void setCurrency(Currency currency) {
	this.currency = currency;
    }

    // referenceNumber

    @XmlAttribute
    private String referenceNumber;

    public String getReferenceNumber() {
	return referenceNumber;
    }

    public Optional<String> optReferenceNumber() {
	return MyOptionals.of(getReferenceNumber());
    }

    public void setReferenceNumber(String referenceNumber) {
	this.referenceNumber = referenceNumber;
    }

    // externalId

    @XmlAttribute
    private String externalId;

    public String getExternalId() {
	return externalId;
    }

    public Optional<String> optExternalId() {
	return MyOptionals.of(getExternalId());
    }

    public void setExternalId(String externalId) {
	this.externalId = externalId;
    }

}
