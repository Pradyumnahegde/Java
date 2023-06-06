public class arithmetic {
    public static void main(String[] args) {
        int a=10,b=20;
        int res = a+b;
        System.out.println(res);

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double)a/(double)b);       // type casting
        System.out.println((double) a % (double)b);

        //prefix and postfix

        int x = 10;
        int y = 20;

        x++;
        System.out.println(x);
        y--;
        System.out.println(y);

        int z = x++;
        System.out.println(z);
        int u = y--;
        System.out.println(y);


        int g = 1;
        g= g+1; // or g+=1;
        System.out.println(g);


        int sum = 100;
        System.out.println(sum >100);
        System.out.println(sum<100);
        System.out.println(sum==100);


        //Operators      // BODMAS rule

        int k = 1 + 2 * 20;
        System.out.println(k);


    }
}
