package tech.lapsa.epayment.shared.entity;

import java.io.Serializable;
import java.net.URI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import tech.lapsa.javax.validation.NotNullValue;
import tech.lapsa.javax.validation.ValidURI;

@XmlRootElement(name = "paymentURI")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlPaymentURIQualifierResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    // uri *

    @XmlAttribute
    @NotNullValue
    @ValidURI
    private URI uri;

    public URI getURI() {
	return uri;
    }

    public void setInvoiceNumber(URI uri) {
	this.uri = uri;
    }

    // CONSTRUCTORS

    public XmlPaymentURIQualifierResponse() {
    }

    public XmlPaymentURIQualifierResponse(URI uri) {
	this.uri = uri;
    }
}
