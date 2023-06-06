package protectedModifier;
import Inheritance.UIControl;
import Inheritance.TextBox;


public class Main {

    public static void main(String[] args) {
        // Constructors and Inheritance

       var obj = new TextBox();
        new UIControl(true);//.ischeck(); // cant access field from different package when field is modifiers as protected.
        // in protected the fields can be used my class of same package
    }
}