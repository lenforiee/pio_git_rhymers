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
