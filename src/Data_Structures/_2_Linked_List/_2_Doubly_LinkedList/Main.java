package Data_Structures._2_Linked_List._2_Doubly_LinkedList;

public class Main {
    public static void main(String[] args) {

        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(8, 65);

        list.display();

    }
}
