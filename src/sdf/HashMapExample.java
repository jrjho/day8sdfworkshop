package sdf;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public void example() {
        Map<String, Integer> phones = new HashMap<>();
        phones.put("iphone", 10);
        phones.put("Huawei", 2);
        phones.put("Oppo", 4);
        phones.put("Samsung", 20);

        System.out.println("Total phone types: " + phones.size());

        for (String key : phones.keySet()) {
            System.out.println(key + " - " + phones.get(key));
        }

        String searchString = "";
        Console con = System.console();
        // String searchString = "Oppo";

        while (!searchString.equals("quit")) {
            searchString = con.readLine("Enter searchString: ");

            if (phones.containsKey(searchString))
                System.out.println(searchString + " - " + phones.get(searchString));
            else
                System.out.println("Item not found");
        }

        phones.clear();
        System.out.println("Total phone types: " + phones.size());


    }
}
