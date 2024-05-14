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

    // How good are you really?
    // You receive an array with your peers' test scores. Now calculate the average and compare your score!
    // Return true if you're better, else false!
    // Note: Your points are not included in the array of your class's points. Do not forget them when calculating the average score!
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }
        double average = sum / classPoints.length;
        return yourPoints > average;
    }

    // Will you make it?
    // Write a function that tells you if it is possible to get to the pump or not, considering 
    // the distance to the nearest pump (miles), the miles per gallon your car runs on, and the gallons of fuel left
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (distanceToPump / mpg) <= fuelLeft;
        //also: distanceToPump <= (mpg * fuelLeft);
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(betterThanAverage(new int[] {99, 45, 34, 89, 56, 67, 78, 89, 90}, 69));
    }
}
