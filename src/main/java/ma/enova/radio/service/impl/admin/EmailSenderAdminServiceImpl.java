package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.EmailDetails;
import ma.enova.radio.service.facade.admin.EmailSenderAdminService;
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
    public void sendEmail(EmailDetails emailDetails) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mailMessage = new MimeMessageHelper(message, true);


        mailMessage.setFrom(emailDetails.getFrom());
        mailMessage.setSubject(emailDetails.getObjet());
        mailMessage.setText(emailDetails.getCorps());

        String[] emailAddressesToArray = emailDetails.getTo().split(";");


        InternetAddress[] toRecipients = new InternetAddress[emailAddressesToArray.length];
        for (int i = 0; i < emailAddressesToArray.length; i++) {
            toRecipients[i] = new InternetAddress(emailAddressesToArray[i].trim());
        }
        message.setRecipients(Message.RecipientType.TO, toRecipients);


        if (emailDetails.getCc() != null) {
            String[] emailAddressesCcArray = emailDetails.getCc().split(";");
            InternetAddress[] ccRecipients = new InternetAddress[emailAddressesCcArray.length];
            for (int i = 0; i < emailAddressesCcArray.length; i++) {
                ccRecipients[i] = new InternetAddress(emailAddressesCcArray[i].trim());
            }

            message.setRecipients(Message.RecipientType.CC, ccRecipients);

        }


        this.mailSender.send(message);


    }


}
