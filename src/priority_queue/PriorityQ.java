package priority_queue;

public class PriorityQ {
    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s) {

        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;

        if (nItems == 0)           // if no items
            queArray[nItems++] = item;  // insert at position 0 then increment
        else {
            for (j = nItems - 1; j >= 0; j--) {  // start at the end
                if (item > queArray[j])  // if new item larger
                    queArray[j + 1] = queArray[j];   // shift upward
                else
                    break;
            }
            queArray[j + 1] = item;
            nItems++;
        }
    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
