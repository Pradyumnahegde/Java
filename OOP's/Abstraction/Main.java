public class Main {
    public static void main(String[] args) {
        //Employee.java
        var employee = new Employee();
        employee.setsalary(50000);
        employee.setRate(20);
        int wage = employee.calculatewage(10);
        System.out.println(wage);

        int wage2 = employee.calculatewage(); // method overloading

        // Browser.java
//        var browser = new Browser();
//        browser.navigate("");
    }

}

// Abstraction and coupling // use to reduce coupling(reduce complexity by hiding unnecessary details in the program)