import java.util.PriorityQueue;

public class proQueue {
    public static void main(String[] args) {
        /*
        In PriorityQueue if we take a wrapper class it already implements a comparable(it is natural ordering) interface 
        to override it we need to use comparator(it is total  ordering) interface 
        in this give example we have used lambda functions  we can use accordingly  
        */

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        // PriorityQueue : offer, peak , poll (delete), contains
        pq.offer(23);
        pq.offer(64);
        pq.offer(62);
        pq.offer(12);
        pq.offer(75);
        pq.offer(21);
        pq.offer(86);
        pq.offer(1);
        pq.peek();
        System.out.println(pq.peek());
        System.out.println(pq);

    }
}
