public class StringFundamentals {
    
    // PERSONALIZE GREETING:
    // Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
    // Use conditionals to return the proper message:
    // - If name equals owner: 'Hello boss'
    // - otherwise: 'Hello guest'
    static String greet1(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }

    //greet() version using ternary conditional operator (optimized in 1 line)
    static String greet2(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss":"guest");
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

    public static void main(String[] args) {
        String owner = "Jacob";

        System.out.println(greet1("Jacob", owner));
        System.out.println(greet1("Laura", owner));
        System.out.println(greet2("Jacob", owner));
        System.out.println(greet2("Peter", owner));

        System.out.println("-" + smash1(new String[] {"hello", "world", "this", "is", "great"}) + "-");
        System.out.println("-" + smash2(new String[] {"hello", "world", "this", "is", "great"}) + "-");
    }
}
