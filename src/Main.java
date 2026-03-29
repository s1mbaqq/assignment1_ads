import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TASK 1
        int x = sc.nextInt();
        int sumSquares = calcSquares(x);
        System.out.println("Result: " + sumSquares);

        // TASK 2
        int size = 6;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int sumFirst = sumFirstElements(numbers, k);
        System.out.println("Sum = " + sumFirst);

        // TASK 3
        int base = sc.nextInt();
        int power = sc.nextInt();

        int sumPower = (int) powerSum(base, power);
        System.out.println("Power sum: " + sumPower);

        // TASK 4
        int count = sc.nextInt();
        printReverse(sc, count);
    }

    // TASK 1
    public static int calcSquares(int n) {
        if (n <= 0) return 0;
        return n * n + calcSquares(n - 1);
    }

    // TASK 2
    public static int sumFirstElements(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumFirstElements(arr, n - 1);
    }

    // TASK 3
    public static double powerSum(int b, int n) {
        if (n == 0) return 1; // base case changed
        return Math.pow(b, n) + powerSum(b, n - 1);
    }

    // TASK 4
    public static void printReverse(Scanner sc, int n) {
        if (n == 0) return;

        int value = sc.nextInt();
        printReverse(sc, n - 1);
        System.out.print(value + " ");
    }
}
// TASK 1: calcSquares
// Time Complexity: O(n)
// Explanation: The method reduces n by 1 each time until it reaches 0.
// So total number of calls is n, and each step does simple math.

// TASK 2: sumFirstElements
// Time Complexity: O(n)
// Explanation: The function processes elements one by one using recursion.
// Number of steps equals to n elements.

// TASK 3: powerSum
// Time Complexity: O(n)
// Explanation: It recursively calculates powers from 0 to n.
// Each recursive step adds one more term to the sum.

// TASK 4: printReverse
// Time Complexity: O(n)
// Explanation: The function reads n numbers and stores them in the call stack.
// Then prints them in reverse order when recursion unwinds.
// Space Complexity is also O(n) because of recursion depth.