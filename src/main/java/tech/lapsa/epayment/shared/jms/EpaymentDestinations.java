package tech.lapsa.epayment.shared.jms;

public final class EpaymentDestinations {

    private EpaymentDestinations() {
    }

    public static final String INVOICE_HAS_PAID = "epayment/jms/events/invoicesHasPaid";

    public static final String NOTIFIER_PAYMENTSUCCESS_REQUESTER_EMAIL = "epayment/jms/events/notifier/paymentSuccessUserEmail";
    public static final String NOTIFIER_PAYMENTLINK_REQUESTER_EMAIL = "epayment/jms/events/notifier/paymentLinkUserEmail";
}
