package ma.enova.radio.service.util;

import java.time.LocalDateTime;

public interface EmailMessage {
    String getFrom();

    String getObject();

    String getCorps();

    String getTo();

    String getCc();

    void setEmailSent(boolean emailSent);

    void setSendingDate(LocalDateTime sendingDate);
}
