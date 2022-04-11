package com.revature.DavidRiley.NodeEasy;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node() {

    }

    public Node(int dataToInject) {
        this.data = dataToInject;
        this.next = null;
        this.prev = null;
    }

    public int CountNodesInList(Node head) {
        Node tempNode = head;
        int nodeCount = 0;

        while (tempNode != null) {
            nodeCount++;
            tempNode = tempNode.next;
        }

        return nodeCount;
    }

    public void PrintNodeList(Node head) {
        Node tempNode = head;
        System.out.print("\nNode Count " + CountNodesInList(head) + ": ");
        while (tempNode != null) {
            if (tempNode.next == null)
                System.out.print(tempNode.data + "\n");
            else
                System.out.print(tempNode.data + ", ");
            tempNode = tempNode.next;
        }
    }
}
