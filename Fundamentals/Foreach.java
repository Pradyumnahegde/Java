public class Foreach {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

        // for each loop or range based for loop(in c++)

        for (int i : arr){
            System.out.print(i);
        }

        String[] fruits = {"Mango","Apple","Banana"};
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
