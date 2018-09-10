package array.high.array;

// demonstrates array class with high-level interface
public class HighArray {
    private long[] a;
    private int nElements;

    public HighArray(int max) {
        a = new long[max]; // create array
        nElements = 0;   // no items added yet
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElements; j++)
            if (a[j] == searchKey)
                break;
        if (j == nElements)
            return false; // no item found in the array
        else
            return true;  // found item
    }

    public void insert(long value) {
        a[nElements] = value;  // insert element into array
        nElements++;  // increase size
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElements; j++)
            if (a[j] == value)
                break;
        if (j == nElements)
            return false; // can't find it
        else {            // found it
            for (int k = j; k < nElements; k++)
                a[k] = a[k + 1]; // move items from higher position to a lower one (-1)
            nElements--;
            return true;
        }

    }

    public void display() {
        for(int j = 0; j < nElements; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }
}
