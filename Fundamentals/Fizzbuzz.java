/* if number is divisible by 5 print Fizz
   number is divisible by 3 print buzz
   divisible by both 5 and 3 print FizzBuzz
   any other number then return the number like 2 or 4;
 */


import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = input.nextInt();

        if(number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if(number % 5 == 0){
            System.out.println("Fizz");
        }
        else if(number % 3 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }


         // nesting if statements

//         if(number % 5 == 0){
//         if(number % 3 == 0){
//             System.out.println("FizzBuzz");
//         }
//         else{
//             System.out.println("Fizz");
//         }
//         }
//         else if(number % 3 == 0){
//             System.out.println("Buzz");
//         }
//         else{
//             System.out.println(number);
//         }







    }
}
