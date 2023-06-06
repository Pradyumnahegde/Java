package DependencyInjection;

public class Tax {

    private TaxCalculator calculator;

//    public DependencyInjection.Tax(DependencyInjection.TaxCalculator calculator){
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator){
        var tax = calculator.taxprint();
        System.out.println(tax);
    }

//    public void setCalculator(DependencyInjection.TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

}
