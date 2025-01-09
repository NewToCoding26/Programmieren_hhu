public class UnderlinedLabel extends Label {

    public UnderlinedLabel(String text) {
        super(text); 
    }

    @Override
    public void draw(int xOffset, int yOffset) {
        // Zeichnet den Text (Superklasse)
        super.draw(xOffset, yOffset);

        // Zeichnet die Linie unter dem Text
        StdDraw.setPenColor(isEnabled() ? StdDraw.BLACK : StdDraw.GRAY);
        StdDraw.line(
            (double) xOffset, 
            (double) (yOffset - getHeight() + 2), // Linie knapp unter dem Text
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

