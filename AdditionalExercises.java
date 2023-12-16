public class AdditionalExercises {
    /*
    The following are some example which their time complexity is O(1) => constant.
    Have a look to each of the example to understand how they got a constant time complexity.
    */
    // Example-1
    public static int getElement(int[] array, int index) {
        return array[index];
    }
    // Example-2
    public static int add(int a, int b) {
        return a + b;
    }
    // Example-3
    public static boolean isPositive(int num) {
        return num > 0;
    }
    // Example-4
    public static void printMessage() {
        System.out.println("Hello, constant time!");
    }
    // Example-5
    public static void assignment() {
        int x = 5;
        System.out.println("Value of x: " + x);
    }

    /*
     * The following are some example which their time complexity is O(n) => linear.
     * Have a look to each of the example to understand how they got a linear time complexity.
     * 👀 I have included one example which is not a linear time complexity, can you find it? 👀
     * If you have found it what is it's exact time complexity?
     */
    // Example-1
    public static int sum(int[] array) {
        int result = 0;
        for (int num : array) {
            result += num;
        }
        return result;
    }
    // Example-2
    public static void printFirstElement(int[] array) {
        if (array.length > 0) {
            System.out.println("First Element: " + array[0]);
        } else {
            System.out.println("Array is empty.");
        }
    }
    // Example-3
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Example-4
    public static void doubleValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
    // Example-5
    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /*
     * The following are some example which their time complexity is O(n2) => quadratic.
     * Have a look to each of the example to understand how they got a quadratic time complexity.
     * 👀 I have included one example which is not a quadratic time complexity, can you find it? 👀
     * If you have found it what is it's exact time complexity?
     */
    // Example-1
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    // Example-2
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    // Example-3
    public static void printPairs(int[] array) {
        int n = array.length;
        for(int i=0; i < n; i++) {
            System.out.println(i);
        }
        for(int j=0; j < n; j++) {
            System.out.println(j);
        }
    }
    // Example-4
    public static String concatenateStrings(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }
    // Example-5
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    /*
     * The following are some example which their time complexity is O(log n) => logarithmic.
     * Have a look to each of the example to understand how they got a logarithmic time complexity.
     * 👀 I have included one example which is not a logarithmic time complexity, can you find it? 👀
     * If you have found it what is it's exact time complexity?
     */
    // Example-1
    public static double power(double base, int exponent) {
        double result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            base *= base;
            exponent /= 2; // <= focus on this division to find the time complexity
        }
        return result;
    }
    // Example-2
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long result = 1;
        for (int i = 1; i <= n; i *= 2) { // <= focus on this itteration to find the time complexity
            result *= i;
        }
        return result;
    }
    // Example-3
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0;
        long curr = 1;
        for (int i = 2; i <= n; i *= 2) { // <= focus on this itteration to find the time complexity
            long temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }
    // Example-4
    public static void paringElements(int[] array) {
        int n = array.length;
        int i = 0;
        while (i < n) {
            int j = 1;

            while (j < n) {
                System.out.println("Pair: (" + array[i] + ", " + array[j] + ")");
                j *= 2; // <= focus on this itteration to find the time complexity-1
            }
            i++; // <= focus on this itteration to find the time complexity-2
        }
    }

    /*
     * The following are some example which their time complexity is O(n log n) => log-linear.
     * Have a look to each of the example to understand how they got a log-linear time complexity.
     * 👀 Other than those high-level sorting algorithm please provide 2 addtional examples for this time complexity 👀
     */
    // Example-1
    public static void logArthmicTime(int n){
        int y = n;
        while(n > 1){
            n = n / 2; //<= focus on this line of code which divides n into half in each iteration (O(logn))
            for(int i=1; i<=y; i++){ // <= this line uses the value of y for its iteration which has been initially set to n (O(n))
                System.out.println(i);
            }
        }
    }

}
