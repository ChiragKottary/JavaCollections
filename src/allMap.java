import java.util.*;

public class allMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,11);
        map.put(2,13);
        map.put(3,14);
        map.put(4,15);
        map.put(5,15);
        map.put(6,16);
        System.out.println(map.getOrDefault(23, null));
        System.out.println(map.getOrDefault(3, null));
        //map.containsKey(5);

        Map<Integer, List<Integer>> newMap = new HashMap<>();
//VVVI thing to note

        //newMap.computeIfAbsent(23,e->new ArrayList<>()).get(10);

        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer,Integer> ent: entrySet)
        {
            System.out.println(ent);
        }
        Set<Integer> keyset = map.keySet();
//NavigableMap :ceilingEntry, floorEntry ,ceilingKey, higherKey ,firstEntry ,lastEntry
    NavigableMap<Integer,Integer> it = new TreeMap<>();
        it.put(1,11);
        it.put(2,13);
        it.put(3,14);
        it.put(4,15);
        it.put(5,15);
        it.put(6,16);

        it.ceilingEntry(1);
        it.floorEntry(3);
        it.ceilingKey(3);
        it.higherKey(5);
        it.firstEntry();
        it.lastEntry();


    }
}
