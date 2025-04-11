public class Main {

    public static void main(String... args) {

        Window window = new Window("window1");
        System.out.println("Area is: " + window.area());
        System.out.println("Perimeter is: " + window.perimeter());
        System.out.println(window);
        window.draw();

        Window window2 = new Window("window2", "w1", true, "blue", 4, 8, 3, 6);
        System.out.println(window2);
        window2.draw();
    }

}
