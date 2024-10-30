/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        int total = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            total += i;
        }
        return total;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        int total = 0;
        int count = 0;
        int i = lowerBound;

        while (i <= upperBound) {
            total += i;
            count++;
            i++;
        }
        return count == 0 ? 0 : (double) total / count;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int total = 0;
        int count = 0;
        int i = 0;

        do {
            total += numbers[i];
            count++;
            i++;
        } while (i < numbers.length);

        return (double) total / count;
    }
}