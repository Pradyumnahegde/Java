package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        var cal = new TaxCalculator2018(3000);
        var report = new Tax();
       // report.show(); // constructor injector
        report.show(cal);  // method

       // report.setCalculator(new DependencyInjection.TaxCal2019());  // setter
        report.show(new TaxCal2019());  // method
    }
}

// Dependency Injection - constructor,setter,method injectors.
