package Override;

import Inheritance.TextBox;
import Inheritance.UIControl;

public class Main {

    public static void main(String[] args) {
        var textbox = new TextBox();
        System.out.println("Hello world");
        System.out.println(textbox); // automatically calls tostring method

       // System.out.println(textbox.toString());
    }
}