import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args){

        String name = "Prad";
        System.out.println(name);

        String name1 = "Prad" + "gg";
        System.out.println(name1);

        System.out.println(name.startsWith("P"));
        System.out.println(name1.endsWith("gg"));

        System.out.println(name.length());
        System.out.println(name.charAt(0));

        System.out.println(name.indexOf("P"));

        System.out.println(name.replace("P", "B"));
        System.out.println(name);                 // Original string remains unchanged
                                    // STRING ARE IMMUTABLE(cannot change them)


        String a = "Alpha";

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        String b = "  AAA  ";
        System.out.println(b.trim());        // trims extra spaces





        // Escape Sequence      \n,  \t , \"  \"


         String seq = "\"Hello World\" \nJava\tProgram";
        System.out.println(seq);





    }
}
