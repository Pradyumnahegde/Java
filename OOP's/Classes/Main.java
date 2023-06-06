import java.text.Format;
import java.text.NumberFormat;

//   UML - Unified modelling language
public class Main{

    public static void main(String[] args) {
        // we use var in java to make it more readable; Car is class , car is object , using var instead of Car;
        // We used Classes, objects, learnt memory allocation (java automatically deallocates memory when we exit the method)
        // also why use object-oriented over procedural (1. the program gets bloated - large and not easy to maintain 2.using oops varieties we can make programs so much more better)
// java compiler detects the type of variable by using var type.


        var car1 = new Car();
        car1.name = "Audi";
        System.out.println(car1.name);
        System.out.println(car1.name.toUpperCase());
        car1.price = 100_000;
        System.out.println(NumberFormat.getCurrencyInstance().format(car1.price));

        var car3 = new Car();
        car3.name = "Buggati";
        System.out.println(car3.name);
   // understand concept of stack and heap

    // stack stores data type variables values and heap store the address or var class declared whose value is stored in objects.
        var car2 = new Car();
      //  var carr = car2;
        car2.name = "Supra";
       // carr.name = ("supra");
        car2.price = 200000;
        System.out.println(car2.name);
        System.out.println(NumberFormat.getCurrencyInstance().format(car2.price));
        //carr.name = "supra";
        System.out.println(car2.name);

        var carnulltestcase = new Car();
        System.out.println(carnulltestcase.name); // shows null
        // to avoid null cases we initialise String types to non empty string. => ref in Car.java
    }
}
// Main.java and Car.java



// Java Memory allocation =>   Heaps and Stacks