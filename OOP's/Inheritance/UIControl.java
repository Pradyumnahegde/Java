package Inheritance;
public class UIControl {

    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }
    private boolean isEnabled = true;      // private members are not inherited by subclasses, not accessible outside the class
        protected boolean ischeck = true;

    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }


}
