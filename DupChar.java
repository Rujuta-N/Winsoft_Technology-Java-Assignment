import java.util.HashMap;
import java.util.Map;

public class DupChar {
    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to character array
        char[] chars = str.toCharArray();

        // Iterate through each character in the string
        for (char ch : chars) {
            // If character is already present in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If character is not present, add it to the map with count as 1
                charCountMap.put(ch, 1);
            }
        }

        
        System.out.println("Duplicate characters in the string '" + str + "' are:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        findDuplicateCharacters(inputString);
    }
}
