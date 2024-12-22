import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            String input = scanner.nextLine();
            if (input.equals("exit 0"))
                break;

            a:
            if (input.startsWith("echo"))
                System.out.println(input.substring(5));
            else if (input.startsWith("type")) {
                if (input.startsWith("type echo") || input.startsWith("type type") || input.startsWith("type exit"))
                    System.out.println(input.substring(5) + " is a shell builtin");
                else
                    System.out.println(input.substring(5) + ": not found");
                break a;
            } else
                System.out.println(input + ": command not found");


        }
    }
}
