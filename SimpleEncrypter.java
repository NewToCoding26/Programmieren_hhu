public class SimpleEncrypter implements Encrypter {
    private final byte key;

    public SimpleEncrypter(byte key) {
        this.key = key;
    }

    @Override
    public void encrypt(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] + key);
        }
    }
}
