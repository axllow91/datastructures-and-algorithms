package queus.impl_of_queue;

// E is a generic type (class or interface) which can be a param of a class definition
// List<E> can be of any type we want (String, Integer,Double, Number, so on...)
// Generics type works with collection classes to create some algorithms
public class ArrayQueue<E> implements Queue<E>{

    // instance variables
    // generic array used for storage
    private E[] data;
    // index of the front elem
    private int f = 0;

    // current number of elem
    private int sz = 0;


    // constructors
//    public ArrayQueue() {
//        this(capacity);
//    }

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        return (sz == 0);
    }

    // inserts an element at the rear of the queue
    @Override
    public void enqueue(E e) throws IllegalStateException {
        // if queue full give a msj
        if(sz == data.length) throw new IllegalStateException("Queue is full");
        //
        int avail = (f + sz) % data.length; // modular arithmetic
        data[avail] = e;
        sz++;
    }

    // return first element of the queue
    @Override
    public E first() {
        if(isEmpty()) return null;
        return data[f];
    }

    @Override
    public E dequeue() {
        if(isEmpty()) return null;

        E answer = data[f];
        data[f] = null;  // dereference to help GC
        f = (f + 1) % data.length;   // remains one elem
        sz--;   // make the number of elem lower with 1
        return answer;
    }
}
