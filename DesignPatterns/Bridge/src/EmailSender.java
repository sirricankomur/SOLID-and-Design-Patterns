public class EmailSender extends MessageSenderBase {
    @Override
    public void Send(Body body) {
        System.out.println(body.getTitle() + ", EmailSender ile gönderildi.");
    }
}
