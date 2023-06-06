public class Main {

    public static void main(String[] args) {
        Parent[] controls = {new Parent(),new Child(),new CheckBox()};  // when used abstract we cannot instantiate the abstract class or methods

        for(var control: controls){
            control.render();  // loops through all classes put in array controls
        }
    }

}