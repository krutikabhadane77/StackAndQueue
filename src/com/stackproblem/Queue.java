//UC1 Ability to create a Queue of 56->30->70
package com.stackproblem;

import static java.lang.System.exit;

public class Queue {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node rear = null, front = null;
    private int size = 0;

    public void enqueue(int data)
    {
        Node node = new Node(data);
        System.out.println("Inserting "+data);
        if (front == null) {
            front = node;
            rear = node;
        }
        else
        {
            rear.next = node;
            rear = node;
        }
        size ++;
    }
    public int peek() {
        if (front == null)
        {
            exit(-1);
        }
        return front.data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Top element is "+queue.peek());
    }
}

