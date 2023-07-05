import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {

    /*
    List<List<String>> groceryList = new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("peppers");
        produceList.add("zucchini");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");
        drinksList.add("coke");

    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);

    System.out.println(groceryList);
     */

    public static void main(String[] args) {

        List<List<String>> returnList = new ArrayList<>();
        List<String> arranger = new ArrayList<>();

        String[] anagramArray = {"eat","tea","tan","ate","nat","bat"};

        for (String transfer : anagramArray) arranger.add(transfer);

        //Compare
        while (!arranger.isEmpty()) {
            String firstPick = arranger.get(0);
            List<String> instanceList = new ArrayList<>();

            for (int picker = arranger.size() - 1; picker > 0; picker--) {
                String secondPick = arranger.get(picker);
                if (isAnagram(firstPick, secondPick)) {
                    instanceList.add(arranger.get(picker));
                    arranger.remove(picker);
                }
            }

            instanceList.add(arranger.get(0));
            arranger.remove(0);
            returnList.add(instanceList);
        }

        System.out.println(returnList);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-'a']++;
            arr2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i] != arr2[i]) return false;
        }

        return true;
    }
}
