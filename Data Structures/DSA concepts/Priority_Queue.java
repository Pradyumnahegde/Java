import java.util.Arrays;

public class Priority_Queue {
    private int[] items = new int[5];
    private int count;

    public void add(int item){            // O(n)
        if(count == items.length) throw new IllegalStateException();
        int i;
        // this code is used to shift elements and make it in order of priority
        for(i = count -1 ; i>=0; i--){
            if(items[i] > item)
                items[i+1] = items[i];
            else
                break;
        }
        items[i+1] = item;
        count++;
    }
    public int remove(){
        return items[--count];
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        Priority_Queue qu = new Priority_Queue();
        qu.add(5);
        qu.add(3);
        qu.add(6);
        qu.add(2);
        qu.add(1);
        System.out.println(qu.remove());
        System.out.println(qu);
    }
}
