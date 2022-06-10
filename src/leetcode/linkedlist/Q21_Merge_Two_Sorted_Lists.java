package leetcode.linkedlist;

public class Q21_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
       // 리스트가 비어있을떄

        ListNode ans = new ListNode(-198);
        ListNode ansTail = ans;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ansTail.next = list1;
                ansTail = list1;
                list1 = list1.next;
            }
            else{
                ansTail.next = list2;
                ansTail = list2;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            ansTail.next = list1;
            ansTail = list1;
            list1 = list1.next;
        }

        while (list2 != null) {
            ansTail.next = list2;
            ansTail = list2;
            list2 = list2.next;
        }
        return ans.next;
    }

}
