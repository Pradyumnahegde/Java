import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        int [] num = new int[5];            //Arrays old method
        num[0] = 5;
        num[1] = 4;
        num[2] = 2;
        num[3] = 1;
        num[4] = 3;
        System.out.println(num);
        System.out.println(num[0]);
        System.out.println(num[1]);

       // Arrays.toString(num);      to print arrays
        System.out.println(Arrays.toString(num));                        // Arrays.toString(array_name) is used to print elements of 1D arrays (similar to using for loop to display array elements)


        // Sorting array elements
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        //Arrays new method

        int [] arr = {1,2,3,4,5};
        System.out.println(arr.length);

        // Multi Dimensional Arrays
        System.out.print("Multi Dimensional Arrays\n");

        int arr1[][] = new int[2][2];

        arr1[0][0] = 1;
        System.out.println(arr1);
        System.out.println(arr1[0][0]);
                                                        // Arrays.deepToString(array_name); is used to print array elements of 2D Arrays.
        System.out.println(Arrays.deepToString(arr1));      //deepToString is used instead of 2 for loop to display array elements.

        int [][] arr2 = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(arr2));

        int [][] arr3 = {{1,2,3},{4,5,6}};

        for(int i = 0;i<arr3.length;i++)
            for(int j =0;j<arr3[i].length;j++)    // the length of arr at ith position should be equal to length of jth position
                System.out.println(arr3[i][j]);    // so we use j < arr[i].length



    }
}
