package sorting.bubble_sort;

public class ArrayBub {
    private long[] a; // ref to a
    private int nElem;

    public ArrayBub(int max) {
        a = new long[max];  // create array
        nElem = 0;  // no items in array yet
    }

    public void insert(long value) {
        a[nElem] = value;  // insert element into array
        nElem++;  // increment size
    }

    public void display() {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        int out, in; // variables for the outer and inner loop

        for(out = nElem - 1; out > 1; out--) { // outer loop (backward) -> looping from nElem - 1 to position 2 (let's the last 2 position free)
            for(in = 0; in < out; in++) {    // inner loop -> loops forward and compare 2 elements every time
                if(a[in] > a[in + 1])
                    swap(in, in + 1);
            }
        }
    }

    // swapping two variables
    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
