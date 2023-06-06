import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is "+ age);


        System.out.print("Name : ");
        String name = scanner.nextLine().trim();       // trim can be used both ways   // .nextLine() is used for String just like nextInt
        System.out.println("Your name is "+ name);
        System.out.println(name.trim());            // trim = remove extra spaces

    }
}
