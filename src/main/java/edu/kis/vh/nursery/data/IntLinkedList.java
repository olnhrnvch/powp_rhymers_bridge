package edu.kis.vh.nursery.data;

import edu.kis.vh.nursery.Node;

public class IntLinkedList implements DataProvider {

    private Node last;
    private int i;


    @Override
    public void countIn(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }

    }

    //CHECK IF LAST ELEMENT IS EMPTY
    @Override
    public boolean callCheck() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return EMPTY_POSITION;
        return last.value;
    }

    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY_POSITION;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}



