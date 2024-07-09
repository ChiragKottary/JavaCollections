import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {

        // queue : offer, peak , poll (delete), contains
        Queue<Integer> q = new LinkedList<>();
       // System.out.println(q.isEmpty());

        q.offer(1);
        q.offer(3);
        q.offer(4);
        q.offer(43);
        q.offer(54);
        q.offer(86);
        q.offer(52);
        q.offer(75);
        q.offer(23);

        q.contains(23);

//        System.out.println(q.peek());
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);

        Stack<Integer> stack = new Stack<>();
//Stack : push , pop , peek , indexOf , contains
        stack.push(1);
        stack.push(32);
        stack.push(43);
        stack.push(23);
        stack.push(16);
        stack.push(62);
        stack.push(15);
        stack.push(64);
//        System.out.println(stack.contains(32));
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.indexOf(16));
//        System.out.println(stack);

        Deque<Integer> dq = new ArrayDeque<>();
//      deque : offerFirst , offerLast , pollFirst, pollLast , peekFirst , peekLast , contains , isEmpty
        dq.offerFirst(23);
        dq.offerFirst(35);
        dq.offerFirst(75);
        dq.offerFirst(25);
        dq.offerLast(74);
        dq.offerLast(24);
        dq.offerLast(15);
        dq.offerLast(17);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.pollFirst();
        dq.pollFirst();
        dq.pollLast();
        dq.pollLast();
        dq.contains(74);
        System.out.println( dq);
        System.out.println(dq.isEmpty());





    }
}
