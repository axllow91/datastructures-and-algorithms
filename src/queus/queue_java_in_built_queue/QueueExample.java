package queus.queue_java_in_built_queue;

import java.util.*;
import java.util.stream.Collectors;

public class QueueExample implements Comparable {
    /*
     * We insert items at the end of the queue and we remove items at the beginning of the queue
     *
     * FIFO structure - first in first out
     *
     *       we insert items here + get items here <--> | stack|
     *       we insert items here  (back)-> queue ->(front) we get the items here
     *
     *  packets: java.util.LinkedList
     *  java.util.PriorityQueue -> PriorityQueue stores its elements internally according to their natural order
     *  (if they implement Comparable)
     *
     *  add() -> we add items to our queue
     *
     *  element() -> approximately the same as peek(): we get the first item without removing it!
     *
     *  applications: breadth-first search!
     * */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.element();

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        List<Integer> lista = new ArrayList<>() {{
            add(1);
            add(3);
            add(2);
            add(5);
            add(10);
            add(4);;
        }};

        Set<Integer> bobo = lista.stream().collect(Collectors.toSet());

        lista.stream().map(String::valueOf).collect(Collectors.toList());




    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
