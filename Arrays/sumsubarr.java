package Arrays;

public class sumsubarr {

    public static void subarray(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {

                    System.out.print("(" + numbers[k] + ")");

                    sum = sum + numbers[k];
                }

                System.out.println("  Sum = " + sum);

                // Find maximum sum
                if (sum > maxSum) {
                    maxSum = sum;
                }

                // Find minimum sum
                if (sum < minSum) {
                    minSum = sum;
                }
            }

            System.out.println();
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
    }

    public static void main(String args[]) {

        int numbers[] = {2, 4, 6, 8, 10};

        subarray(numbers);
    }
}