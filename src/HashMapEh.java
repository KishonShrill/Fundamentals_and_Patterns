import java.util.HashMap;
import java.util.Map;

public class HashMapEh {
    public static void main(String[] args) {

        // Create a HashMap object called database_sheet
        HashMap<String, Integer> database_sheet = new HashMap<>();

        // Add components inside hashmap (keys, values)
        database_sheet.put("Marion", 21);
        database_sheet.put("Chriscent", 21);
        database_sheet.put("Dixie", 5);
        database_sheet.put("Cushie", 3);

        System.out.printf("Original Map: %s\n", database_sheet);

        // To access the age(value) of each name(key) use .get("key")
        int yeah = database_sheet.get("Chriscent");
        System.out.printf("\n1.) %s", yeah);

        // To remove an item, use .remove("key")
        database_sheet.remove("Chriscent");
        System.out.printf("\n2.) %s",database_sheet);

        // To get the size of list, use .size()
        int blee = database_sheet.size();
        System.out.printf("\n3.) %d\n\n", blee);

        // To print loop each keys, use an enhanced for-loop
        for (String i : database_sheet.keySet()) {
            System.out.printf("Name: %s \tAge: %d\n", i, database_sheet.get(i));
        }

        // To clear everything in the map, use .clear()
        database_sheet.clear();
        if (database_sheet.size() == 0) {
            System.out.println("\nThe hashmap is empty");
        } else {
            System.out.println("\nThe hashmap is not empty");
        }

    }
}
