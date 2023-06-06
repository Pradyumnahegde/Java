import java.text.NumberFormat;

public class formattingnum {
    public static void main(String[] args) {

         NumberFormat currency = NumberFormat.getCurrencyInstance();
         String res =  currency.format(1234567.12);                // NumberFormat    .getCurrencyInstance();     Currencyformat(pass number to format);
        System.out.println(res);

        // another way of passing method       // Method Chaining

       String res1 =  NumberFormat.getCurrencyInstance().format(155500);
       // String res =  currency.format(1234567.12);                // NumberFormat    .getCurrencyInstance();     Currencyformat(pass number to format);
        System.out.println(res1);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String per = percent.format(0.5);                             //getPercentInstance();
        System.out.println(per);

        //another way   // Method Chaining

        String per1 = NumberFormat.getPercentInstance().format(0.8);
        System.out.println(per1);
    }
}
