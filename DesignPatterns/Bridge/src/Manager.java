public class Manager {
    public MessageSenderBase MessageSenderBase;

    public void UpdateCustomer() {
        Body body = new Body();
        body.setTitle("Üyelik Hakkında");
        MessageSenderBase.Send(body);
        System.out.println("Güncellendi.");
    }

    public MessageSenderBase getMessageSenderBase() {
        return MessageSenderBase;
    }

    public void setMessageSenderBase(MessageSenderBase messageSenderBase) {
        MessageSenderBase = messageSenderBase;
    }
}
