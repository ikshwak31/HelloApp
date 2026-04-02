public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build names
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop to append names
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", " using substring
        String names = nameBuilder.toString();
        if (names.length() > 0) {
            names = names.substring(0, names.length() - 2);
        }

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}