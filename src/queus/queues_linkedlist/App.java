package queus.queues_linkedlist;

public class App {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(190);
        queue.enqueue(109);
        queue.enqueue(19);
        queue.enqueue(10);

        System.out.println(queue.size());

        while(!queue.isEmpty()) {
            int dequeueVar = queue.dequeue();
            System.out.println(dequeueVar);
        }
    }
}
