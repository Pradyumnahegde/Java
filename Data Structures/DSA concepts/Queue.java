import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Arrays;

public class ArrayQueue {         // Implementation of queues using arrays.

    private int[] array = new int[5]; // can also use constuctor to set size or length.
    private int front,rear;
    private int size;

    public void enqueue(int item){
        if(size == array.length) throw new ArrayIndexOutOfBoundsException();   // queue is full

        array[rear++] = item;
        size++;
    }

    public void dequeue(){
        if(front == rear) throw new ArrayIndexOutOfBoundsException();    // queue is empty and dequeued index cant be refilled again in simple queues.

        int del = array[front];
        array[front] = 0;
        front++;
        size--;
        System.out.println("del = "+del);
    }

    @Override
    public String toString(){
        return  Arrays.toString(array);
    }


    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);

// also include isEmpty and peek methods.      - O(1) time complexity
    }

}
         // Java queues using ArrayDeque<> 
/*
public class Queues {
    public static void main(String[] args) {

        Queue<Integer> qu = new ArrayDeque<> ();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
        var a = qu.peek();
        System.out.println(a);
        var b = qu.poll();
        System.out.println(b);
        System.out.println(qu);

    }

}
*/
