import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSMS {
    public static void main(String[] args) {
        Twilio.init("<<ACCOUNT_SID>>", "<<AUTH_TOKEN>>");
        PhoneNumber to = new PhoneNumber("<<RECIPIENT-NUMBER>>");
        PhoneNumber from = new PhoneNumber("<<TWILIO-PHONE-NUMBER>>");
        String body = "This is a test message!";
        Message message = Message.creator(to, from, body).create();
        System.out.println(message.getSid());
    }
}

