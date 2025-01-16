public class StringMessage implements Message {
    private final String content;

    public StringMessage(String content) {
        this.content = content;
    }

    @Override
    public byte[] getContent() {
        return content.getBytes();
    }
}