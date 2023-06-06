package DependencyInjection;

public class TaxCalculator2018 implements TaxCalculator {
    private int taxmoney;

    public TaxCalculator2018(int taxmoney){
        this.taxmoney = taxmoney;
    }

    @Override
    public int taxprint(){
        return taxmoney * 3;
    }

}