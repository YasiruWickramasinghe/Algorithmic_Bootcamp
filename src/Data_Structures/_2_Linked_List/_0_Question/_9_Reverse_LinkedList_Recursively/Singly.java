package Data_Structures._2_Linked_List._0_Question._9_Reverse_LinkedList_Recursively;
public class Singly {

    private Node head;
    private Node tail;
    private int size;

    public Singly() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Question 10 - recursion reverse
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {

        Singly list = new Singly();

        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        System.out.println("Before Reverse");
        list.display();
        list.reverse(list.head);
        System.out.println("After Reverse");
        list.display();
    }
}
