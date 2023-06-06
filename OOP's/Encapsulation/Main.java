public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setsalary(50000);
        employee.setRate(20);
        int wage = employee.calculatewage(10);
        System.out.println(wage);
    }

}