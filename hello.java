public class Fibonacci {

    // Function to generate Fibonacci sequence up to n numbers
    public static int[] generateFibonacci(int n) {
        int[] fibSequence = new int[n];
        if (n > 0) {
            fibSequence[0] = 0;
        }
        if (n > 1) {
            fibSequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }
        return fibSequence;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int n = 10;  // Change this value to generate more or fewer Fibonacci numbers
        int[] fibonacciNumbers = generateFibonacci(n);

        // Print the Fibonacci numbers
        for (int num : fibonacciNumbers) {
            System.out.print(num + " ");
        }
    }
}
