package src.main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LocalRepoMap {

    private static final HashMap<String, String> map = new HashMap<>();

    public static HashMap<String, String> getMap() {
        return map;
    }

    public static void addToPhoneBook(String name, String phoneNumber) {
        map.put(name, phoneNumber);
    }

    public static void editPhoneBook(String name, String phoneNumber) {
        if (map.containsKey(name)) {
            map.put(name, phoneNumber);
        }
        addToPhoneBook(name, phoneNumber);
    }

    public static void deletePhoneBook(String name) {
        map.remove(name);
    }

    public static void findByName(String name) {
        System.out.println(map.get(name));
    }

    public static void findByPhoneNumber(String phoneNumber) {
        while (map.entrySet().iterator().hasNext()) {
            if (map.containsValue(phoneNumber)) {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                if (entrySet.size() > 0) {
                    for (Map.Entry<String, String> entry : entrySet) {
                        if (entry != null && phoneNumber.equalsIgnoreCase(entry.getValue())) {
                            System.out.println(entry.getKey());
                        }
                    }
                }
            }
        }
    }
}
/**
 * Set<Entry<String,String>> entrySet = myMap().entrySet();
 * if(entrySet!=null && entrySet.size>0) {
 * for(Entry<String,String> entry : entrySet) {
 * if(entry!=null && paramName.equalsIgnoreCase(entry.getValue())) {
 * keyForValue = entry.getKey();
 * }
 * }
 * }
 */
