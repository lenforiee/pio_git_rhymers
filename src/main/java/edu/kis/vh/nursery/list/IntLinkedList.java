package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int EMPTY_VALUE = -1;
    Node last;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            Node node = new Node(i);
            last.setNext(node);
            node.setPrev(last);
            last = node;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}

class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return this.value;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node node) {
        this.prev = node;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}
