public class UnderlinedLabel extends Label {

    public UnderlinedLabel(String text) {
        super(text); // Konstruktor der Oberklasse verwenden
    }

    @Override
    public void draw(int xOffset, int yOffset) {
        super.draw(xOffset, yOffset); // Text zeichnen
        // Linie unter dem Text zeichnen
        StdDraw.setPenColor(isEnabled() ? StdDraw.BLACK : StdDraw.GRAY);
        StdDraw.line(xOffset, yOffset - getHeight(), xOffset + getWidth(), yOffset - getHeight());
    }

    @Override
        public String toString() {
        String base = super.toString();
        return base.replaceFirst("Label", "UnderlinedLabel");
    }

}
