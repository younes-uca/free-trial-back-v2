package ma.enova.radio.service.util;

import ma.enova.radio.zynerator.util.DateUtil;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@Service
public class EmailSenderAdminServiceImpl implements EmailSenderAdminService {
    private JavaMailSender mailSender;

    public EmailSenderAdminServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(EmailMessage emailMessage) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper mailMessage = new MimeMessageHelper(message, true);
            mailMessage.setFrom(emailMessage.getFrom());
            mailMessage.setSubject(emailMessage.getObject());
            mailMessage.setText(emailMessage.getCorps());

            String[] emailAddressesToArray = emailMessage.getTo().split(";");

            InternetAddress[] toRecipients = new InternetAddress[emailAddressesToArray.length];
            for (int i = 0; i < emailAddressesToArray.length; i++) {
                toRecipients[i] = new InternetAddress(emailAddressesToArray[i].trim());
            }
            message.setRecipients(Message.RecipientType.TO, toRecipients);
            if (emailMessage.getCc() != null) {
                String[] emailAddressesCcArray = emailMessage.getCc().split(";");
                InternetAddress[] ccRecipients = new InternetAddress[emailAddressesCcArray.length];
                for (int i = 0; i < emailAddressesCcArray.length; i++) {
                    ccRecipients[i] = new InternetAddress(emailAddressesCcArray[i].trim());
                }
                message.setRecipients(Message.RecipientType.CC, ccRecipients);
            }

            try {
                this.mailSender.send(message);
                emailMessage.setEmailSent(true);
                emailMessage.setSendingDate(DateUtil.today);
            } catch (Exception exception) {
                emailMessage.setEmailSent(false);
                emailMessage.setSendingDate(null);
            }
        } catch (MessagingException m) {

        }


    }


}
