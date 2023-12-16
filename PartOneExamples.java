import java.lang.Math;

class PartOneExamples {
    public static void main(String[] args) {
    }

    /*------------------------------------------------------------------------ */

    /*
     * Constatnt Time O(1) - no matter how big the input is, it will always take the
     * same amount of time
     * Some examples of O(1) are:
     */

    // Example 1
    public static int returnConstant() {
        return 42;
    }

    // Example 2
    public static boolean isEmpty(int[] array) {
        if (array.length == 0) {
            return true;
        } else {
            return false;
        }
        // What do you think is the minimal way of writing the above conditional check?
    }

    // Example 3
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /*
     * In general any method that performs a constant number of operations is O(1)
     * 👀 A constant number of operation means that the number of operations doesn't
     * depend on the size of the input 👀
     */

    /*------------------------------------------------------------------------ */

    /*
     * Linear Time O(n) - the time it takes to run the method is proportional to the
     * size of the input
     * Some examples of O(n) are:
     */

    // Example 1
    public static int sum(int[] array) {
        int result = 0;
        for (int num = 0; num < array.length; num++) {
            result += num;
        }
        return result;
    }

    // Example 2
    // Dropping constants: O(2n) => O(n)
    public static void printTwice(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Example 3
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num = 0; num < array.length; num++) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Example 4
    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int num = 0; num < array.length; num++) {
            copy[num] = array[num];
        }
        return copy;
    }

    // Example 5
    // Different terms for the input
    public static void tricky1(int N, int M) {
        int a = 0, b = 0;
        for (int i = 0; i < N; i++) {
            a = (int) (a + Math.random());
        }
        for (int j = 0; j < M; j++) {
            b = (int) (b + Math.random());
        }
    }
    /*
     * What is the time complexity of the above method?
     * a. O(N) b. O(M) c. O(N+M) d. O(N*M)
     * Answer:
     */

    // Example 6
    // Different terms for the input
    public static void tricky2(int N, int M) {
        int a = 0, b = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a = (int) (a + Math.random());
                b = (int) (b + Math.random());
            }
        }
    }
    /*
     * What is the time complexity of the above method?
     * a. O(N) b. O(M) c. O(N+M) d. O(N*M)
     * Answer:
     */

    /*
     * Example 7
     * In this example, the inner loop has a fixed bound (j < 1),
     * which means it will only iterate once for each iteration of the outer loop.
     * The inner loop's behavior is effectively constant, and the overall time
     * complexity is
     * dominated by the outer loop.
     */
    public static int dominantInnerLoop(int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 1; j++) {
                sum += i;
            }
        }
        return sum;
    }
    /*
     * Using the above hint, What is the time complexity of the above method?
     * a. O(N) b. O(N^2) c. O(logn) d. O(1)
     * Answer:
     * 
     * In general any method that performs a number of operations that is
     * proportional to the size of the input is O(n)
     * 👀 A number of operations that is proportional to the size of the input means
     * that the number of operations is directly related to the size of the input 👀
     */

    /*------------------------------------------------------------------------ */

}
