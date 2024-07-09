import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listinterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // arraylist: add , addAll , indexOf , LastIndexOf , subList , set, contains
        list.add(1);
        list.add(3);
        list.add(12);
        list.add(43);
        list.add(12);
        list.add(42);
        list.add(64);
        list.add(56);
        Integer[] arr = list.toArray(new Integer[0]);
        list.contains(23);
        System.out.println(Arrays.toString(arr));
        list.add(2,32);
        //this make a deep copy of the array
        List<Integer> list1 = new ArrayList<>(list);

        List<Integer> list3 = list.subList(2,8);
        list.set(0,100);
        System.out.println(list.lastIndexOf(32));
        System.out.println(list);
        System.out.println(list3);
        System.out.println(list1);
    }
}
