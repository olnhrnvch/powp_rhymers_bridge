package edu.kis.vh.nursery;

public class IntArrayStack {

    private static final int STACK_CAPACITY = 12;
    private static final int MAX_SIZE = 11;
    private static final int EMPTY_POSITION = -1;

    private int total = getEmptyPosition();
    private final int[] NUMBERS = new int[getStackCapacity()];

    public static int getStackCapacity() {
        return STACK_CAPACITY;
    }


    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getEmptyPosition() {
        return EMPTY_POSITION;
    }
    public int getTotal() {
        return total;
    }


    /**
     * @param in if stack is not full push new element to stack
     */
    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * @return check if last element is empty
     */
    protected boolean callCheck() {
        return total == getEmptyPosition();
    }

    /**
     * @return check if stack is full
     */
    protected boolean isFull() {
        return total == getMaxSize();
    }

    /**
     * @return if last element is not empty returns value of it
     */
    protected int peekaboo() {
        if (callCheck())
            return getEmptyPosition();
        return NUMBERS[total];
    }

    /**
     * @return  pop last element in stack
     */
    protected int countOut() {
        if (callCheck())
            return getEmptyPosition();

        return NUMBERS[total--];
    }

}