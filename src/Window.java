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

    public Window(String title, String tag, int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, String color, boolean isActive) {
        this.title = title;
        this.tag = tag;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
        this.color = color;
        this.isActive = isActive;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getActiveStatus() {
        return isActive;
    }

    public void setActiveStatus(boolean active) {
        isActive = active;
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
