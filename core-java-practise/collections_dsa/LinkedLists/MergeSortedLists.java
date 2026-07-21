//public class MergeSortedLists {
//
//    public static Node merge(Node a, Node b) {
//
//        Node dummy = new Node(0);
//
//        Node tail = dummy;
//
//        while (a != null && b != null) {
//
//            if (a.data <= b.data) {
//
//                tail.next = a;
//                a = a.next;
//
//            } else {
//
//                tail.next = b;
//                b = b.next;
//            }
//
//            tail = tail.next;
//        }
//
//        if (a != null)
//            tail.next = a;
//        else
//            tail.next = b;
//
//        return dummy.next;
//    }
//
//    public static void display(Node head) {
//
//        while (head != null) {
//
//            System.out.print(head.data + " -> ");
//
//            head = head.next;
//        }
//
//        System.out.println("NULL");
//    }
//
//    public static void main(String[] args) {
//
//        Node first = new Node(10);
//        first.next = new Node(30);
//        first.next.next = new Node(50);
//
//        Node second = new Node(20);
//        second.next = new Node(40);
//        second.next.next = new Node(60);
//
//        Node ans = merge(first, second);
//
//        display(ans);
//    }
//}