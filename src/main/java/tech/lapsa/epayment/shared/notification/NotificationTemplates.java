package tech.lapsa.epayment.shared.notification;

import java.io.InputStream;
import java.util.Locale;

import tech.lapsa.java.commons.io.MyResources;
import tech.lapsa.java.commons.localization.LocalizedElement;

public enum NotificationTemplates implements LocalizedElement {
    PAYMENT_LINK_NOTIFICATION_TEMPLATE, //
    PAYMENT_SUCCESS_TEMPLATE, //
    //
    ;

    public InputStream getResourceAsStream(final Locale locale) {
	return MyResources.getAsStream(this.getClass(), regular(locale));
    }
}
