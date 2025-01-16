public class SecureConnection extends Connection {
    private final Encrypter encrypter;

    public SecureConnection(Encrypter encrypter) {
        this.encrypter = encrypter;
    }

    @Override
    public byte[] convert(Message message) {
        byte[] content = message.getContent();
        encrypter.encrypt(content);
        return content;
    }
}