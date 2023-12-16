public class PartTwoExamples {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 8));
    }

    /*------------------------------------------------------------------------ */

    /*
     * Quadratic Time O(n^2) - the time it takes to run the method is proportional
     * to the square of the size of the input
     *
     * Some examples of O(n^2) are:
     */

    // Example-1
    public static void printPairsTwice(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Pair: (" + array[i] + ", " + array[j] + ")");
            }
        }
    }

    // Example-2
    public static int countDuplicates(int[] array) {
        int count = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Example-3
    /*
     * What is the time complexity of the following method?
     */
    public static void matrixMultiplication(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrix[i][j] += matrix[i][k] * matrix[k][j];
                }
            }
        }
    }

    // Example-4
    /*
     * What is the time complexity of the following method?
     */
    public static void printSubarrays(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * In general any nested loops that iterate over the same input are O(n^2)
     * 👀 unless the inner loop is a constant number of steps.👀
     *
     */

    /*------------------------------------------------------------------------ */

    /*
     * Logarithmic Time O(log n) - the time it takes to run the method is
     * proportional to the logarithm of the size of the input
     * 👀👀 Divide and conquer algorithms are usually O(log n) 👀👀
     * Some examples of O(log n) are:
     */

    // Example-1
    public static void logarithmicLoop(int n) {
        for (int i = 1; i < n; i *= 2) {
            System.out.println("Iteration: " + i);
        }
    }

    // Example-2
    public static void logarithmicDivisionLoop(int n) {
        int i = n;
        while (i > 0) {
            System.out.println("Iteration: " + i);
            i /= 2;
        }
    }

    // Example-3
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else if (array[middle] > target) {
                right = middle - 1;
            }
        }
        return -1;
    }

    /*
     * In general any algorithm that divides the input in half every time is O(log
     * n)
     * 👀👀 Binary search is a classic example of an O(log n) algorithm 👀👀
     */

    /*------------------------------------------------------------------------ */

    /*
     * Log-Linear Time O(n log n) - the time it takes to run the method is
     * proportional to n times the logarithm of the size of the input
     * 👀👀 Most sorting algorithms are O(n log n) 👀👀
     * Examples of sorting algorithms that has O(n log n) are:
     * 1. Merge Sort
     * 2. Quick Sort
     * 3. Heap Sort ...
     * Some examples of O(n log n) are:
     */

    // Example-1
    public static void logLinearLoop(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                System.out.println("Iteration: " + i + " " + j);
            }
        }
    }

    // Example-2
    public static void logLinearDivisionLoop(int n) {
        for (int i = n; i > 1; i /= 2) {
            for (int j = 1; j < n; j++) {
                System.out.println("Iteration: " + i + " " + j);
            }
        }
    }

    // Example-3
    public static void logLinearWhileLoop(int n) {
        for (int i = 0; i < n; i++) {
            int j = n;
            while (j > 0) {
                System.out.println("Iteration: " + i + " " + j);
                j /= 2;
            }
        }
    }

    /*
     * In general any algorithm that divides the input in half every time and
     * performs a linear number of operations on each half is O(n log n)
     * 👀👀 Merge sort is a classic example of an O(n log n) algorithm 👀👀
     */



}
