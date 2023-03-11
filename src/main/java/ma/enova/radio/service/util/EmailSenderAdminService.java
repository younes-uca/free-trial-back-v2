package ma.enova.radio.service.util;

import javax.mail.MessagingException;

public interface EmailSenderAdminService {
    void sendEmail(EmailMessage emailMessage) throws MessagingException;

}
