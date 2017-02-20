package by.epam.nanos;

import java.util.Random;

public class Task3 {
    private static final int numberLength = 4;
    private static final int minValue = 1000;
    private static final int maxValue = 9999;
    private static final int defaultReturnValue = -1;

    public Task3() {
        System.out.println("Task 3");

        // Calculate random number between minValue and maxValue
        Random rand = new Random();
        int longNumber = minValue + rand.nextInt(maxValue - minValue + 1);

        // Print the product
        System.out.println("Value: " + longNumber + ", Product: " + getProduct(longNumber));
    }

    static long getProduct(int number){
        long result = defaultReturnValue;
        String numberString = Integer.toString(number);

        if (numberString.length() != numberLength) {
            System.out.println("Error, input number should have four digits: " + number);
            return result;
        }

        for (int i = 0; i < numberString.length(); i++) {
            result = result + Long.parseLong(numberString.substring(i, i+1));
        }

        return result;
    }
}
