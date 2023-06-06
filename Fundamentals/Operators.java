public class Operators {
    public static void main(String[] args) {
          // Operators   comparision
        int a= 10;
        int b =20;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);


        // Logical operators

        int temperature = 22;
        boolean isWarm = temperature >20 && temperature <50;
        System.out.println(isWarm);

        boolean highIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasGoodCredit || highIncome; // hasGoodCredit && highIncome
        System.out.println(isEligible);

        boolean hasCriminalRecord = true;
        boolean notElig = (hasGoodCredit && highIncome) && !hasCriminalRecord;  // use ! for not operator
        System.out.println(notElig);







    }
}