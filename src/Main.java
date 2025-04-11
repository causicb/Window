public class Main {

    public static void main(String... args) {

        Window window = new Window("window1");
        System.out.println("Area is: " + window.area());
        System.out.println("Perimeter is: " + window.perimeter());
        System.out.println(window);
        window.draw();

    }

}
