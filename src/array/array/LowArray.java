package array.array;

// demonstrates array class with low-level interface
public class LowArray {
    // reference to array a
    private long[] a;

    // create array
    public LowArray(int size) {
        a = new long[size];
    }

    // set the value of an item to the wanted index
    public void setElement(int index, long value) {
        a[index] = value;
    }

    // get value of the element
    public long getElement(int index) {
        return a[index];
    }


}
