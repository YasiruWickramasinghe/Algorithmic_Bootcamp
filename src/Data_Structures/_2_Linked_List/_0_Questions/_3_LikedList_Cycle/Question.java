package Data_Structures._2_Linked_List._0_Questions._3_LikedList_Cycle;

public class Question {

    // https://leetcode.com/problems/linked-list-cycle
    // Amazon and Microsoft
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}

