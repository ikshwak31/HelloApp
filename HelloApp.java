public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join all names with ", "
        String names = String.join(", ", args);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}