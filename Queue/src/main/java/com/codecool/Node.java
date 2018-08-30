package com.codecool;

public class Node {
    private String value;
    private int priority;
    private Node nextNode;

    public Node(String value, int priority){
        this.value = value;
        this.priority = priority;
    }

    public String getValue(){
        return this.value;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
