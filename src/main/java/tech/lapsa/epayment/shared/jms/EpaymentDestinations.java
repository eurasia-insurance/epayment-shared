package tech.lapsa.epayment.shared.jms;

public final class EpaymentDestinations {

    private EpaymentDestinations() {
    }

    public static final String ACCEPT_INVOICE = "epayment/jms/calls/acceptInvoice";
    public static final String SPECIFY_PAYMENT_URI = "epayment/jms/calls/specifyPaymentURI";
    public static final String COMPLETE_PAYMENT_WITH_UNKNOWN_TYPE = "epayment/jms/calls/completePaymentWithUnknownType";
    public static final String INVOICE_HAS_PAID = "epayment/jms/events/invoicesHasPaid";

}
