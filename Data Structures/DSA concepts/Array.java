/* Array (static vs dynamic array implementation) -> array insert, insert_at, delete_at, index_of,
display, reverse array, intersect(find same elements in 2 arrays), max and min.
*/
public class Main {
    private int[] array;
    private int length;
    private int size;

    Main(int length){
        array = new int[length];
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public void resize() {
        if(array.length == size) {
            int[] newArr = new int[size * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
    }
    public void insert(int item){
        resize();
        array[size++] = item;
    }

    public void insertAt(int index,int item){
        if(index < 0 || index >size) throw new ArrayIndexOutOfBoundsException();
        resize();
        for(int i =size-1;i>=index;i--){
            array[i+1] = array[i];
        }
        array[index] = item;
        size++;
    }

    public void removeAt(int index){
        if(index<0 || index>size) throw new ArrayIndexOutOfBoundsException();
        int del = array[index];
        for(int i = index; i< size;i++){
            array[i] = array[i+1];
        }
        System.out.println("deleted item is "+del);
        size--;
    }

    public void max(){
        int max=0;
        for(int i=0;i<size;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
    public void min(){
        int min = array[0] ;
        for(int i =0;i<size;i++){
            if(array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }

    public void reverse(){
        for(int i=size-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        /*  or
        int[] newItems = new int[count];

    for (int i = 0; i < count; i++)
      newItems[i] = items[count - i - 1];

    items = newItems;
         */
    }

    public void intersect(int[] arr2){
        for(int i =0;i<5;i++){
            if(array[i] == arr2[i]){
                System.out.print(arr2[i]+" ");
            }
        }
        /*  or
        var intersection = new Array(count);

    for (int item : items)
      if (other.indexOf(item) >= 0)
        intersection.insert(item);

    return intersection;
         */
    }
    public void indexOf(int item){
        for(int i =0;i<=size-1;i++){
            if(array[i] == item)
                System.out.println(i);
        }
    }


    public static void main(String[] args) {
        Main arr = new Main(3);
        arr.insert(10);
        arr.insert(20);
        arr.insert(3);
        arr.insertAt(3,4);
        arr.insertAt(4,5);
        arr.removeAt(2);
        arr.display();
        arr.max();
        arr.reverse();
        arr.indexOf(20);
        int[] arr2 = {10,20,3,4,5};
        arr.intersect(arr2);
        arr.min();
    }

}
//Array implementation.  Time complexity - O(n),O(1).
