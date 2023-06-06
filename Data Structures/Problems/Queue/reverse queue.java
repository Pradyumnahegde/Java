import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
public class Reverse_Queue {

    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        reverse(qu);
        System.out.println(qu);
    }
    public static void reverse(Queue<Integer> input){
        Stack<Integer> stack = new Stack<>();
        while (!input.isEmpty())
            stack.push(input.remove());
        while(!stack.isEmpty())
            input.add(stack.pop());
    }
}
