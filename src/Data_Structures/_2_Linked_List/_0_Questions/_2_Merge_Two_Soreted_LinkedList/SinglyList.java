package Data_Structures._2_Linked_List._0_Questions._2_Merge_Two_Soreted_LinkedList;
public class SinglyList {

    private Node head;
    private Node tail;
    private int size;

    public SinglyList() {
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

    //Question
    // https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    public static SinglyList merge(SinglyList first, SinglyList second) {
        Node f = first.head;
        Node s = second.head;

        SinglyList ans = new SinglyList();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        //if one list is over then perform those two methods

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public static void main(String[] args) {
        SinglyList first = new SinglyList();
        SinglyList second = new SinglyList();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        System.out.println("Before Merge Two Linked List");
        first.display();
        second.display();
        System.out.println("After Merge Two Linked List");
        SinglyList ans = SinglyList.merge(first, second);
        ans.display();
    }
}
