//UC1 Ability to create a Stack of 56->30->70
//UC2 Ability to peak and pop from the Stack till it is empty 56->30->70
package com.stackproblem;

import static java.lang.System.exit;

public class Stack {
    private class Node {

        int data;
        Node link;
    }
    Node top;
     Stack() {
         this.top = null;
     }
     public void push(int x)
    {
        Node temp = new Node();
        if (temp == null) {
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty() {
         return top == null;
     }
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop()
    {
        if (top == null) {
            return;
        }
        top = (top).link;
    }
    public void display()
    {
        if (top == null) {
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.link;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
        System.out.printf("\nTop element is \n", stack.peek());
        stack.pop();
        stack.pop();
        stack.display();
    }
}
