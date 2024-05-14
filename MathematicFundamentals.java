public class MathematicFundamentals {

    //Multiply a given number by eight if it is an even number and by nine otherwise.
    public static int simpleMultiplication(int n) {
        return (n % 2 == 0) ? n * 8 : n * 9;
    }

    //Very simple, given a number (integer / decimal / both depending on the language), find its opposite (additive inverse).
    //Examples: 1: -1 ________ 14: -14 ________ -34: 34
    public static int opposite(int number)
    {
        return number * -1;
    }

    public static void main(String[] args) {
        
    }
}
