package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> nums = new HashMap<>();

        nums.put(1, "One");
        nums.put(2, "Two");
        nums.put(2, "Three");

        System.out.println(nums.keySet());
        System.out.println(nums.values());

        for (Map.Entry<Integer, String> entry : nums.entrySet()) {
            System.out.println(entry.getKey());
        }
    }


}
