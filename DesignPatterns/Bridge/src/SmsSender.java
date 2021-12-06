public class SmsSender extends MessageSenderBase {

    @Override
    public void Send(Body body) {
        System.out.println(body.getTitle() + ", SmsSender ile gönderildi.");
    }
}
