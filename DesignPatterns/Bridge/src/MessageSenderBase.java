public abstract class MessageSenderBase {
    public void Save() {
        System.out.println("Mesaj kaydedildi!");
    }

    public abstract void Send(Body body);
}
