public class StringFundamentals {
    
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

    //Ternary conditional operator version (optimized in 1 line)
    static String greet2(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss":"guest");
    }

    public static void main(String[] args) {
        String owner = "Jacob";

        System.out.println(greet1("Jacob", owner));
        System.out.println(greet1("Laura", owner));
        System.out.println(greet2("Jacob", owner));
        System.out.println(greet2("Peter", owner));
    }
}
