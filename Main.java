import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello world!");
        System.out.print("What is your name? ");
        var name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}