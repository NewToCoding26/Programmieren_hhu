public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public int flaeche() {
        return width * height;
    }

    public int umfang() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public String getRectangleString() {
        String rectangleString = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangleString += "*";
                if (j < width - 1) {
                    rectangleString += " ";
                }
            }
            if (i < height - 1) {
                rectangleString += "\n";
            }
        }
        return rectangleString;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Rectangle square = new Rectangle(2, 2);

        System.out.println(rectangle.isSquare());
        System.out.println(rectangle.umfang()); 
        System.out.println(rectangle.flaeche());
        System.out.println(rectangle.getRectangleString());

        System.out.println(square.isSquare()); 
        System.out.println(square.getRectangleString());
    }
}
