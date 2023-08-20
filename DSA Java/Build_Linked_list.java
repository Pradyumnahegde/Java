import java.util.NoSuchElementException;

public class Build_Linked_list {
    private class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
    }
    private Node first;     // named head -> first and tail -> last
    private Node last;
    private int size;

    public void addFirst(int item){
        var node = new Node(item);

        if(first == null)
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }
    public void addLast(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeFirst(){
        //[10->20->30]
        if(first == null)  throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;

        size--;
    }

    public void removeLast(){
        if(first == null) throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }

        var current = first;
        while(current != null) {
            if (current.next == last) break;
            current = current.next;
        }
        last = current;
        current.next = null;

        size--;
    }
     public int indexOf(int item){  // to find index
        int index = 0;
        var current = first;
        while(current != null){
            if(current.value == item) return  index;
            current = current.next;
            index++;
        }
        return -1;
    }
        public boolean contains(int item){    // check whether the element exists or not using indexof() method
        return indexOf(item) != -1;
    }

    public static void main(String[] args) {
        var list = new Build_Linked_list();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size);
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(20));

    }

}
