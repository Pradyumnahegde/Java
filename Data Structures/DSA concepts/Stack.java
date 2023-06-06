// building stack using arrays  // create stack, push,pop,peek,empty.

import java.util.Arrays;

public class Stack {
    private int[] stack = new int[5];
    //    public Stack(int len){      // can create a constructor for stack class
    //        stack = new int[len];
    //    }
    private int count;

    public void push(int item){
        if(count == stack.length) throw new StackOverflowError();

         stack[count] = item;  // or stack[count++] = item;
         count++;
    }
    public int pop(){
        if(count == 0) throw new IllegalStateException();

        count--;
        return stack[count];  // or stack[--count];
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(stack,0,count);     // here var is int[] type
        return Arrays.toString(content);
    }

    // display fn for stack in top to bottom order
    public void display(){
        if(count == 0) System.out.println("Stack is empty");

        System.out.println("Stack elements are:");
        int[] arr = new int[count*2];
        for(int i =count-1;i>=0;i--){
            arr[i] = stack[i];
            System.out.println("\t"+stack[i]);
        }
//        for(int i = count-1;i>=0;i--){   // or use separately
//            System.out.println(stack[i]);
//        }

    }
    public int peek(){
        if(count == 0) throw new IllegalStateException();

        return stack[count-1];
    }

    public boolean empty(){
        return count == 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack); // or System.out.println(stack.toString());
        stack.display();
        System.out.println(stack.peek());
        boolean a = stack.empty();
        System.out.println(a);
    }

}


/*      Dynamic Stacks in java
import java.util.Stack;
public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack);
        int p = stack.pop();
        System.out.println(p);
        System.out.println(stack);
        stack.push(30);
        stack.push(40);
        int a = stack.peek();
        System.out.println(a);
        boolean check = stack.empty();
        System.out.println(check);
    }
}

*/
