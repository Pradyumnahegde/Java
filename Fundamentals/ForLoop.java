public class ForLoop {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            System.out.println("Hello World");
        }


        System.out.println("Print in Increasing order");
        int num = 10;
        for(int i = 0;i<= num ; i++){
            System.out.println(i);
        }


        System.out.println("Print in descending order");
        for(int j = num; j > 0; j--){
            System.out.println(j);
        }

    }
}
