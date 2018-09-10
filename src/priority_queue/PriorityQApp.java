package priority_queue;

public class PriorityQApp {
    public static void main(String[] args) {

        PriorityQ priorityQ = new PriorityQ(5);
        priorityQ.insert(30);
        priorityQ.insert(50);
        priorityQ.insert(10);
        priorityQ.insert(40);
        priorityQ.insert(20);

        priorityQ.peekMin();

        while(!priorityQ.isEmpty()) {
            long temp = priorityQ.remove();
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}
