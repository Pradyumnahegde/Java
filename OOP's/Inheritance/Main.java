package Inheritance;
public class Main {

    public static void main(String[] args) {
        var control = new TextBox();
        control.print();
        control.disable();
        System.out.println(control.isEnabled());

        var box1 = new TextBox();
        var box2 = box1;    // false for new TextBox(); as the address will be different.
        System.out.println(box1.equals(box2));
        System.out.println(box1.hashCode());
        System.out.println(box1.toString());

        // Constructors and Inheritance

        var obj = new TextBox();
        System.out.println(obj.ischeck);// can access ischeck here as same package and using protected access modifier

    }
}

