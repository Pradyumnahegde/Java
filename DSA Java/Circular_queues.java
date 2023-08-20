import java.util.Arrays;

public class Circular {

    private int[] array = new int[5];
    private int front,rear;
    private int size;

    public void enqueue(int item){
        if(size == array.length) throw new IllegalStateException();
        array[rear] = item;
        rear =(rear +1) % array.length;
        size++;
    }

    public void dequeue(){
        int del = array[front];
        array[front] = 0;
        front = (front +1) % array.length;
        size--;
        System.out.println("del = "+del);
    }

    @Override
    public String toString(){
        return  Arrays.toString(array);
    }

    public static void main(String[] args) {

        Circular queue = new Circular();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println(queue);


    }

}

