public class Employee {
    private int basesalary;
    private int rate;

    public void setsalary(int basesalary){
        if(basesalary<= 0){
            throw new IllegalArgumentException("Error enter positive amount");
        }
        this.basesalary = basesalary;
    }
    public void setRate(int rate){
        this.rate =rate;
    }

    private int getsalary(){
        return basesalary;
    }
    private int getrate(){
        return rate;
    }

    public int calculatewage(int extrahours){
        return basesalary + (rate*extrahours);
    }

    public int calculatewage(){     // method overloading
        System.out.println("method overloading");
        return calculatewage(0);
    }
}
