import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        System.out.print("enter choice = ");
        choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.print("You selected 1");
                break;
            case 2:
                System.out.print("You selected 2");
                break;
            default:
                System.out.println("Enter correct choice");

        }


    }
}
