public class UnderlinedLabel extends Label {

    public UnderlinedLabel(String text) {
        super(text); 
    }

    @Override
    public void draw(int xOffset, int yOffset) {
        super.draw(xOffset, yOffset);

        StdDraw.setPenColor(isEnabled() ? StdDraw.BLACK : StdDraw.GRAY);
        StdDraw.line(
            (double) xOffset, 
            (double) (yOffset - getHeight() + 2), 
            (double) (xOffset + getWidth()), 
            (double) (yOffset - getHeight() + 2)
        );
    }


    @Override
    public String toString() {
        String base = super.toString();
        return base.replaceFirst("Label", "UnderlinedLabel");
    }
}

