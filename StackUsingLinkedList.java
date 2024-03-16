package assignment9;

public class StackUsingLinkedList {
    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(Object value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object item = top.data;
        top = top.next;
        return item;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        stack.push(-30);
        stack.push(40);
        stack.push(-5);
        System.out.println("Stack size is: "+ stack.size());
        System.out.println(stack.pop());
        System.out.println("Stack size after pop: "+ stack.size());
        System.out.println(stack.isEmpty());
    }
}
