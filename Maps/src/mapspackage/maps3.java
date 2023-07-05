package mapspackage;
import java.util.*;

public class maps3 {
    public static void main(String args[]) {
        String str = "FRANCE";
        char[] arr = str.toCharArray();
        int size = arr.length;
        int i = 0;

        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        while (i != size) {
            if (hmap.containsKey(arr[i]) == false) {
                hmap.put(arr[i], i);
            } else {
                int oldval = hmap.get(arr[i]);
                int newval = oldval + 1;
                hmap.put(arr[i], newval);
            }
            i++;
        }

        boolean hasDuplicate = false;

        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > 1) {
                hasDuplicate = true;
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("String is not unique");
        } else {
            System.out.println("All the values are unique");
        }
    }
}

