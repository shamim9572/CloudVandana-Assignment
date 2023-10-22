public class PangramChecker {
    public static boolean isPangram(String sentence) {
        // Remove spaces and convert the sentence to lowercase
        sentence = sentence.replaceAll(" ", "").toLowerCase();

        // Create an array to keep track of the occurrence of each letter (a-z)
        boolean[] letterPresent = new boolean[26];

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letterPresent[c - 'a'] = true;
            }
        }

        // Check if all letters (a-z) are present
        for (boolean present : letterPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog"; // Change this to your input
        boolean isPangram = isPangram(inputSentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

