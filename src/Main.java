public class Main {

    public static void main(String... args) {

        Window window = new Window("window1");
        System.out.println("Area is: " + window.area());
        System.out.println("Perimeter is: " + window.perimeter());
        window.setActiveStatus(true);
        System.out.println(window);
        window.draw();

        Window window2 = new Window(
                "window2",
                "w2",
                10, 50, 50, 10,
                5, 5, 20, 20,
                "blue",
                true
        );
        window2.setColor("red");
        window2.setActiveStatus(false);
        window2.getActiveStatus();
        System.out.println(window2);
        window2.draw();

    }

}
