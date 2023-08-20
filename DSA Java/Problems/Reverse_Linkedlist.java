public class Reverse_linkedlist {
    private class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
    }
    private Node first;    
    private Node last;
    private int size;

    public void addList(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void reverseList(){
        if(first == null) return;

        var previous = first;
        var current = first.next;
        while(current!=null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }
	
    void display()
    {
        while (first != null) {
            System.out.print(first.value + " ");
            first = first.next;
        }
    }


    public static void main(String[] args) {
        var list = new Reverse_linkedlist();
        list.addList(10);
        list.addList(20);
        list.addList(30);
        list.reverseList();
        list.display();

    }

}
