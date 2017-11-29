package tech.lapsa.epayment.shared.jms;

public final class EpaymentDestinations {

    private EpaymentDestinations() {
    }

    // TODO : set params
    static {
	init();
    }

    static void init() {
	throw new RuntimeException("Parameters must set");
    }

    public static final String ACCEPT_INVOICE = "";
    public static final String PAYMENT_URI_QUALIFIER = "";

}
