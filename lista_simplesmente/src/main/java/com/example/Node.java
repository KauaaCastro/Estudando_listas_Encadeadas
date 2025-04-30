package com.example;

public class Node {
    private int number;
    private Node next;

    public Node(int number) {
        this.number = number;
        this.next = null;
    }

    public int getNumber() {
        return number;
    }

    public Node getNext() {
        return next;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
