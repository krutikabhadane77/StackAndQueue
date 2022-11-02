//UC1 Ability to create a Stack of 56->30->70
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

    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
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
    }
}
