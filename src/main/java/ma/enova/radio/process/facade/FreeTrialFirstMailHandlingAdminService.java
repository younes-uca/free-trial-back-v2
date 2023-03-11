package ma.enova.radio.process.facade;

import javax.mail.MessagingException;

public interface FreeTrialFirstMailHandlingAdminService {
    public void sendFistReminderEmails() throws MessagingException;
}
