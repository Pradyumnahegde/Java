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

    public int getsalary(){
        return basesalary;
    }
    public int getrate(){
        return rate;
    }

    public int calculatewage(int extrahours){
        return basesalary + (rate*extrahours);
    }
}

// Encapsulation using private , and public class which acess the main class contents
// also we can use setters and getters methods in encapsulation
