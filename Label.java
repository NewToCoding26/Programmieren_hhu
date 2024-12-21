public class Label extends Widget {

    private String text;
    
    public Label(String text) {
        this.text = text;
    }
    
    @Override
    public int getHeight() {
        return 20;
    }

    @Override
    public int getWidth() {
        return 8 * text.length();
    }
    
    @Override
    public void draw(int xOffset, int yOffset) {
        StdDraw.setPenColor(isEnabled() ? StdDraw.BLACK : StdDraw.GRAY);
        StdDraw.textLeft(xOffset, yOffset - getHeight() / 2, text);
    }
    
    @Override
    public String toString() {
        return "Label"  + super.toString() + "[" + text + "]";
    }

}
