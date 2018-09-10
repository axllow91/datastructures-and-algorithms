package sorting.selection_sort;

public class ArraySelection {
    private long[] a;
    private int nElem;

    public ArraySelection(int max) {
        a = new long[max];
        nElem = 0;
    }

    public void insert(long value) {
        a[nElem] = value;
        nElem++;
    }

    public void display() {
        for(int i =0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void selectionSort() {

        int out, in, min;

        for(out = 0; out < nElem -1; out++) { // outer loop
            min = out;                 // minimum
            for(in = out + 1; out < nElem; in++){
                if(a[in] < a[min])   // if min greater
                    min = in;       // we have a new min
            }
            swap(out,in);
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
