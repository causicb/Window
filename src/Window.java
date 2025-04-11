public class Window {

    private String title;

    private String tag;

    private int x1, x2, x3, x4;

    private int y1, y2, y3, y4;

    private String color;

    boolean isActive;

    public Window(String title) {
        this.title = title;
        this.x1 = 0;
        this.y1 = 0;

        this.x2 = 80;
        this.y2 = 0;

        this.x3 = 80;
        this.y3 = 25;

        this.x4 = 0;
        this.y4 = 25;

        coordinatesChecker();
    }

    public void coordinatesChecker() {
        int[] xs = {x1, x2, x3, x4};
        int[] ys = {y1, y2, y3, y4};

        for (int x : xs) {
            if (x < 0) throw new IllegalArgumentException("X coordinates can't be negative");
        }

        for (int y : ys) {
            if (y < 0) throw new IllegalArgumentException("Y coordinates can't be negative");
        }
    }

    public int width() {
        return (this.x2 - this.x1);
    }

    public int height() {
        return (this.y4 - this.y1);
    }

    public double area() {
        return width() * height();
    }

    public double perimeter() {
        return 2 * (width() + height());
    }

    public void draw() {
        for (int i = 0; i < height(); i++) {
            if (i != 0) {
                System.out.println();
            }
            for (int j = 0; j < width(); j++) {
                System.out.print("*");
            }
        }
        System.out.println("\n");
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Tag: " + tag + "\n" +
                "Status: " + isActive + "\n" +
                "Coordinates: (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + "), (" + x4 + "," + y4 + ")\n";
    }

}
