public class Car {
    //Fields or variables
    public String name;
    //public String name = " ";       // to avoid null or exception we initialise it to empty String, String name = "" ;
    int price;

    public void carName(){  // Methods
        //  or use   public void carName(String name){
           this.name = name;                               // we use this.  when name of parameter is same as field.
    }

    public void carPrice() {
        this.price = price;
    }

}
// Main.java and Car.java
