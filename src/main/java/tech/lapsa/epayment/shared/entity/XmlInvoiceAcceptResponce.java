package tech.lapsa.epayment.shared.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import tech.lapsa.epayment.shared.jaxb.validator.ValidInvoiceNumber;
import tech.lapsa.javax.validation.NotNullValue;

@XmlRootElement(name = "acceptingInvoiceResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlInvoiceAcceptResponce implements Serializable {

    private static final long serialVersionUID = 1L;

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

    // CONSTRUCTORS

    public XmlInvoiceAcceptResponce() {
    }

    public XmlInvoiceAcceptResponce(String invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
    }

}
