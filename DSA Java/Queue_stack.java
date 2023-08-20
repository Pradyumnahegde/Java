import java.util.Stack;

public class Queue_stack {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int item) {  // O(1)
        s1.push(item);
    }

    public int dequeue() {      // O(n)
        if(s1.isEmpty() && s2.isEmpty()) throw new IllegalStateException();
        if (s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());

        return s2.pop();
    }


    public static void main(String[] args) {
        Queue_stack qu = new Queue_stack();
        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        qu.dequeue();
        qu.dequeue();
        var a = qu.dequeue();
        System.out.println(a);

    }
}