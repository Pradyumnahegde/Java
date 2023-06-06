public class IfStatements {
    public static void main(String[] args) {

        // if, if else, else if, simplified statement, ternary operator;


        int temp = 20;

        if(temp >32)
            System.out.println("too hot , drink lot of water");
        else if (temp>25 && temp<=32)
            System.out.println("Its not hot outside");
        else
            System.out.println("Its Cold");

        // Simplifying If statements

        int pay = 100000;

        boolean salary = pay>80000;

        System.out.println(salary);

        // Ternary Operators

        int income = 200_000;
        String className =  income > 150_000 ? "First class" : "Economy";
        System.out.println(className);


    }
}
