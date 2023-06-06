public class proceduralprogramming {
    public static void main(String[] args) {
         int pay = 50000;
         int time=20, rate=10;
        int wage = calculate(pay,time,rate);
        System.out.println(wage);
    }
    public static int calculate(int pay, int time, int rate) {
        return pay+(time*rate);
    }
}
// this is example of how procedural programming works
// check Main and Employee for example of oop's encapsulation.
