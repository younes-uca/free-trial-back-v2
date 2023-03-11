package ma.enova.radio.service.impl.admin;

import ma.enova.radio.service.facade.admin.TwilioWhatsAppSenderAdminService;
import org.springframework.stereotype.Service;

@Service
public class TwilioWhatsAppSenderAdminServiceImpl implements TwilioWhatsAppSenderAdminService {
    private static final String ACCOUNT_SID = "YOUR_ACCOUNT_SID_HERE";
    private static final String AUTH_TOKEN = "YOUR_AUTH_TOKEN_HERE";

   /* @Override
    public void sendWhatsAppMessage(String toNumber, String messageBody) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Account account = Account.fetcher(ACCOUNT_SID).fetch();
        Message message = Message.creator(new PhoneNumber(toNumber), new PhoneNumber("whatsapp:+14155238886"), messageBody)
                .setMessagingServiceSid(account.getMessagingServiceSid())
                .create();
        System.out.println(message.getSid());
    }*/
}

