// Question Link : https://leetcode.com/problems/linked-list-cycle/


public boolean hasCycle(ListNode head) {
        // find the cycle in Linked List we use hashing technique
        // Time Complexity is O(n) and space Complexity is O(n) 

        // HashSet<ListNode> hp = new HashSet<>();
        // while(head!=null){
        //     if (hp.contains(head)) return true;
        //     hp.add(head);
        //     head = head.next;
        // }
        // return false;


        // Using slow and fast pointer algorithm
        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null) return false;
        while (true){
            if (fast.next == null || fast.next.next == null) break;
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
