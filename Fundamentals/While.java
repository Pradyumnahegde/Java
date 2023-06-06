import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        // while loop
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Input is = ");
            input = obj.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit")){
                break; }
            System.out.println(input);
        }

        String name = "";
        while(!name.equals("quit")){
            System.out.println("Input = ");
            name = obj.nextLine().toLowerCase();
            if(!name.equals("quit")){
            System.out.println(name);}
        }


        // do-while loop

//           String name = "";
//        do{
//            System.out.println("Input = ");
//            name = obj.nextLine().toLowerCase();
//            System.out.println(name);
//        }while(!name.equals("quit"));


        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        } while(i<5);

    }
}
