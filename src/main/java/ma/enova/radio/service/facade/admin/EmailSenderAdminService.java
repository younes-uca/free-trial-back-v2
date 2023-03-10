package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.EmailDetails;

import javax.mail.MessagingException;

public interface EmailSenderAdminService {
    void sendEmail(EmailDetails emailDetails) throws MessagingException;

}
