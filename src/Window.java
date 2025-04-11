public class Window {

    private String title;

    private String tag;

    private int x1, x2, y1, y2;

    private String color;

    boolean isActive;

    public Window(String title, String tag, boolean isActive, String color, int x1, int x2, int y1, int y2) {
        this.title = title;
        this.tag = tag;
        this.isActive = isActive;
        this.color = color;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        coordinatesChecker();
    }

    public Window(String title) {
        this.title = title;
        this.x1 = 0;
        this.x2 = 80;
        this.y1 = 0;
        this.y2 = 25;
        coordinatesChecker();
    }

    public void coordinatesChecker() {
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0 || x2 <= x1 || y2 <= y1) {
            throw new IllegalArgumentException("Coordinates must be positive and also this x2 > x1, y2 > y1");
        }
    }

    public int width() {
        return (this.x2 - this.x1);
    }

    public int height() {
        return (this.y2 - this.y1);
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
        return ("Title: " + title + "\n" + "Tag: " + tag + "\n" + "Status: " + isActive + "\n" + "(" + x1 + "," + y1 + ")" + "-" + "(" + x2 + "," + y2 + ")" + "\n");
    }

}
