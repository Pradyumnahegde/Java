import java.awt.*;
import java.util.Date;

public class referenceTypes {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        int a = 10;
        int b = a;
        a = 20;
                                // the value of a updated as 20 will not change value of b in primitive types
        System.out.println(b);  // the value of a is assigned to b. primitive type

        // Reference Type
        int x,y;
        Point point1 = new Point(x=1, y=1);
        Point point2 = point1;
        point1.x = 2;                         // in ref type the memory address of 1 and 2 are same as of Point(x,y)
                                                   // so the value is updated
        System.out.println(point2);                // point 1 and 2 are not independent like primitive types instead they reference to same address of Point(x,y) object.


        // primitive types work on their value (independent of memory)
        // whereas ref type work on their references or memory address (not independent)


    }
}
