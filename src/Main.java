import binary_search_tree.Tree;
import hashmap.CustomHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        var tree = new Tree();
//        tree.add(6L);
//        tree.add(3L);
//        tree.add(7L);
//        tree.add(5L);
//        tree.add(10L);
//        tree.add(2L);
//        tree.add(12L);
//        tree.add(9L);
//        tree.add(4L);
//
//        System.out.println(tree.order());


        CustomHashMap<Integer, Integer> customHashMap = new CustomHashMap<>();
        customHashMap.put(21, 12);
        customHashMap.put(25, 121);
        customHashMap.put(30, 151);
        customHashMap.put(33, 15);
        customHashMap.put(35, 89);

        System.out.println("value corresponding to key 21="
                + customHashMap.get(21));
        System.out.println("value corresponding to key 51="
                + customHashMap.get(51));

        System.out.print("Displaying : \n");
        customHashMap.display();

        System.out.println("\n\nvalue corresponding to key 21 removed: "
                + customHashMap.remove(21));
        System.out.println("value corresponding to key 51 removed: "
                + customHashMap.remove(51));

        System.out.print("Displaying : \n");
        customHashMap.display();

//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(12,23);
//        map.put(12,34);
//        System.out.println(map);

    }
}