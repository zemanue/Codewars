import java.util.Arrays;

public class ArrayFundamentals {
    
    // A NEEDLE IN THE HAYSTACK: 
    // Function that takes an array full of junk but containing one "needle"
    // After your function finds the needle it should return a message (as a string) that says:
    // "found the needle at position " plus the index it found the needle
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] != null && haystack[i].equals("needle")) {
                return "found the needle at position " + i;
            }
        }
            return "no needles found in the haystack ";
    }

    //REVERSED SEQUENCE:
    // Build a function that returns an array of integers from n to 1 where n > 0.
    // Example : n=5 --> [5,4,3,2,1]
    public static int[] reverse(int n){
        int[] array = new int[n];
        for (int i = 0; i < 0; i++) {
            array[i] = n - i;
        }
        return array;
    }

    // SENTENCE SMASH:
    // Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. 
    // You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. 
    // Be careful, there shouldn't be a space at the beginning or the end of the sentence!
    // Example: ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
    public static String smash1(String... words) {
        String sentence = "";
        for (int i = 0; i < words.length; i++){
            sentence += words[i] + " ";
        }
        return sentence.trim();
    }

    //smash() version using String.join() method (optimized in 1 line)
    public static String smash2(String... words) {
        return String.join(" ", words);
    }

    // COUNTING SHEEP:
    // Consider an array/list of sheep where some sheep may be missing from their place. 
    // We need a function that counts the number of sheep present in the array (true means present).
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sheepCount = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null && sheep) { // check that is not null first!
                sheepCount++;
            }
        }
        return sheepCount;
    }

        //ASCENDING ORDER (LOWEST POSSIBLE NUMBER):
    // Your task is to make a function that can take any non-negative integer as an argument and return it 
    // with its digits in ascending order. Essentially, rearrange the digits to create the lowest possible number.
    public static int sortAsc(final int num) {
        char[] numToCharArray = Integer.toString(num).toCharArray(); // convert to string and then to a character array
        Arrays.sort(numToCharArray); // sort the character array in ascendent order
        String charArrayToString = new String(numToCharArray); // create a string that represents the sequence of characters
        return Integer.valueOf(charArrayToString); // return the value of the new string
    }

    //DESCENDING ORDER (HIGHEST POSSIBLE NUMBER):
    // Same task as the previous one, but return the integer with its digits in descending order (the highest possible number)
    // public static int sortDesc(final int num) {
    //     char[] numToCharArray = Integer.toString(num).toCharArray();
    //     Arrays.sort(numToCharArray); 
    //     String charArrayToString = new String(numToCharArray); 
    //     return Integer.valueOf(charArrayToString);
    // }

    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        System.out.println(findNeedle(haystack1));
        System.out.println(findNeedle(haystack2));
        System.out.println(findNeedle(haystack3));

        System.out.println("-" + smash1(new String[] {"hello", "world", "this", "is", "great"}) + "-");
        System.out.println("-" + smash2(new String[] {"hello", "world", "this", "is", "great"}) + "-");

        System.out.println("83659 in ascending order: " + sortAsc(83659));
        System.out.println("918273645 in ascending order: " + sortAsc(918273645));
    }

}
