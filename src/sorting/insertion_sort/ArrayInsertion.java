package sorting.insertion_sort;

public class ArrayInsertion {
    private long[] a;
    private int nElem;

    public ArrayInsertion(int max) {
        a = new long[max];
        nElem = 0;
    }

    public void insert(long value) {
        a[nElem] = value;
        nElem++;
    }

    public void display() {
        for(int i = 0; i < nElem; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void insertionSort() {
        int in, out;
        for(out = 1; out < nElem; out++) {
            long temp = a[out];
            in = out;
            while(in > 0 && a[in - 1] >= temp) {
                // so here is going copy the value from a[in-1] position to a[in] position
                // practically is shifting item to the right
                a[in] = a[in - 1];
                // go left one position
                --in;
            }
            a[in] = temp;   // insert marked item
        }
    }
}
