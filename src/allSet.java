import java.util.*;

public class allSet {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
//      Set : add , retainAll , removeAll , addAll , contains/
// VVVI: NOTE: whenever we are using our custom class in an hashset we have to hashcode and equals method in the custom class
        s.add(3);
        s.add(4);
        s.add(6);
        s.add(5);
        s.add(7);
        s.add(12);
        s.add(3);

        s.remove(4);
        s1.add(45);
        s1.add(6);
        s1.add(5);
        s1.add(32);
        s1.add(12);

        //s.retainAll(s1); // intersection
       // s.removeAll(s1); // joins
//        s.addAll(s1); // union
//        System.out.println(s);



   //LinkedHashSet : add , retainAll , removeAll , addAll , contains
        // the difference is that it would be stored in an order as it was inserted
        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(3);
        ls.add(4);
        ls.add(6);
        ls.add(5);
        ls.add(7);
        ls.add(12);
        ls.add(3);


       SortedSet<Integer> ss = new TreeSet<>();
//SortedSet : main methods are: first() last() returns the first and last elements
        ss.add(3);
        ss.add(4);
        ss.add(6);
        ss.add(5);
        ss.add(7);
        ss.add(12);
        ss.add(3);
//        System.out.println(ss.first());

        NavigableSet<Integer> ns = new TreeSet<>();
        // NavigableSet : pollfirst , polllast , ceiling & floor (<= , >=) , higher & lower (< , >)

        ns.add(3);
        ns.add(4);
        ns.add(6);
        ns.add(5);
        ns.add(7);
        ns.add(12);
        ns.add(3);
        System.out.println(ns.ceiling(3));
        System.out.println(ns.floor(6));
        System.out.println(ns.higher(3));
        System.out.println(ns.lower(5));
        System.out.println(ns);




    }
}
