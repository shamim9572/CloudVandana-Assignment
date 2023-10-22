import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get(s.charAt(i));
            if (i < s.length() - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; // Change this to your input
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Integer equivalent of " + romanNumeral + " is " + integerEquivalent);
    }
}

