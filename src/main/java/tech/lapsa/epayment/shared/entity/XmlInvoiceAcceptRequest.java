package tech.lapsa.epayment.shared.entity;

import java.io.Serializable;
import java.util.Currency;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.lapsa.international.localization.LocalizationLanguage;
import com.lapsa.international.phone.PhoneNumber;

import tech.lapsa.java.commons.function.MyOptionals;
import tech.lapsa.java.jaxb.adapter.XmlCurrencyAdapter;
import tech.lapsa.javax.validation.NotEmptyString;
import tech.lapsa.javax.validation.NotNullValue;
import tech.lapsa.javax.validation.ValidEmail;
import tech.lapsa.kz.taxpayer.TaxpayerNumber;

@XmlRootElement(name = "acceptingInvoice")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlInvoiceAcceptRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    // items *

    @XmlElementWrapper
    @XmlElementRef
    @NotNullValue
    @Valid
    @Size(min = 1)
    protected XmlInvoicePurposeItem[] items;

    public XmlInvoicePurposeItem[] getItems() {
	return items;
    }

    public void setItems(XmlInvoicePurposeItem[] items) {
	this.items = items;
    }

    // currency *

    @XmlAttribute
    @NotNullValue
    @XmlJavaTypeAdapter(XmlCurrencyAdapter.class)
    protected Currency currency;

    public Currency getCurrency() {
	return currency;
    }

    public void setCurrency(Currency currency) {
	this.currency = currency;
    }

    // externalId *

    @XmlAttribute
    @NotNullValue
    @NotEmptyString
    protected String externalId;

    public String getExternalId() {
	return externalId;
    }

    public void setExternalId(String externalId) {
	this.externalId = externalId;
    }

    // language *

    @XmlAttribute
    @NotNullValue
    protected LocalizationLanguage language;

    public LocalizationLanguage getLanguage() {
	return language;
    }

    public void setLanguage(LocalizationLanguage language) {
	this.language = language;
    }

    // email *

    @XmlAttribute
    @NotNullValue
    @ValidEmail
    protected String email;

    private String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public Optional<String> optionalEmail() {
	return MyOptionals.of(getEmail());
    }

    // name *

    @XmlAttribute
    @NotNullValue
    @NotEmptyString
    protected String name;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    // phoneNumber *

    @XmlAttribute
    @NotNullValue
    protected PhoneNumber phoneNumber;

    public PhoneNumber getPhoneNumber() {
	return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    // taxpayerNumber

    @XmlAttribute
    protected TaxpayerNumber taxpayerNumber;

    public TaxpayerNumber getTaxpayerNumber() {
	return taxpayerNumber;
    }

    public void setTaxpayerNumber(TaxpayerNumber taxpayerNumber) {
	this.taxpayerNumber = taxpayerNumber;
    }

    public Optional<TaxpayerNumber> optionalTaxpayerNumber() {
	return MyOptionals.of(getTaxpayerNumber());
    }
}
