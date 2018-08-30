package com.codecool;

public class CustomQueue {

    Node head;
    Node tail;
    int size;

    public boolean isEmpty() {
        return (head == null);
    }

    public int queueSize() {
        return size;
    }

    public Node peek() {
        return this.head;
    }

    public void dequeue() {
        Node temp = head.getNextNode();
        this.head = temp;
    }

    public void enqueue(String value, int priority) {
        Node node = new Node(value, priority);

        if(isEmpty()) {
            this.head = node;
            head.setValue(value);
            head.setPriority(priority);
            tail = head;
        } else if (head.getPriority() > priority) {
            Node temp = head;
            head = node;
            head.setNextNode(temp);
        } else {
            Node current = head.getNextNode();
            Node oneBefore = head;
            while(current != null && current.getPriority() <= priority) {
                oneBefore = current;
                current = current.getNextNode();
            }
            if (current == null) {
                this.tail = node;
            }
            oneBefore.setNextNode(node);
            node.setNextNode(current);
        }
    }
}
