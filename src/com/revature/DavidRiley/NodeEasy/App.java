package com.revature.DavidRiley.NodeEasy;

public class App {
    static Node nodeStuff = new Node();

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // These next 4 lines set the previous and next pointers of the nodes, if applicable.
        head.next = second;

        second.prev = head;
        second.next = third;

        third.prev = second;

        // This is a custom method in the Node class that will print the values of each node in the linked list.
        nodeStuff.PrintNodeList(head);

        // This line shows the beauty of this method of creating nodes. In my head, it makes each Node in the list
        // accessible by just using .next or .previous, coupled with .data. These next few lines are examples of this.
        System.out.println(head.data); // 1
        System.out.println(head.next.data); // 2
        System.out.println(head.next.next.data); // 3
        System.out.println(head.next.prev.next.data); // 2
    }
}
