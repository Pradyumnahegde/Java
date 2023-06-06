package Inheritance;
public class TextBox extends UIControl {

        private String text = "Take Control";

    public TextBox() { // constructor
       super(true);      // super() method  - inheritance & constructors
        System.out.println("TextBox");
    }

    @Override
   public String toString(){
        return text;
   }

    public void setText(String text){
        this.text = text;
    }

    public void print(){
        System.out.println(text);
    }

}
