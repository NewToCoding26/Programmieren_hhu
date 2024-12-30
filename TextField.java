public class TextField extends Widget {

    @Override
    public int getWidth() {
        return 200; 
    }

    @Override
    public int getHeight() {
        return 25; 
    }

    @Override
    public void draw(int xOffset, int yOffset) {
        StdDraw.setPenColor(isEnabled() ? StdDraw.BLACK : StdDraw.GRAY);

        StdDraw.rectangle(
            xOffset + getWidth() / 2,
            yOffset - getHeight() / 2,
            getWidth() / 2,
            getHeight() / 2
        );

        StdDraw.line(
            xOffset + 10,
            yOffset - 5,
            xOffset + 10,
            yOffset - getHeight() + 5
        );
    }

    @Override
    public String toString() {
        return "TextField" + super.toString();
    }
}

