class Main {

    public static void main(String args[]) {
    }
    /*
     * What is time complexity?
     *
     * Time complexity is a way of describing how fast an algorithm is. It's a way
     * of measuring how many operations an algorithm needs to perform in order to
     * complete its task.
     *
     * There are two approaches of analyzing the time complexity of an algorithm:
     *
     * 1. Empirical Analysis => is a way of measuring the time complexity of an
     * algorithm by running it on a computer and measuring how long it takes to
     * complete its task.
     * Q. What do you think are the disadvantages of this approach?
     *
     * 2. Theoretical Analysis => is a way of measuring the time complexity of an
     * algorithm by counting the number of operations an algorithm needs to perform
     * in order to complete its task.
     *
     * And the method of describing how fast an algorithm is, is called Big O.
     *
     * What is Big O Notation?
     * Big O notation is a way of describing how fast an algorithm is. It's a way of
     * measuring time complexity.
     *
     * Prior to Big-O which is used to measure the worst case scenario, there are
     * other notations such as Big-Omega which is used to measure the best case
     * scenario and Big-Theta which is used to measure the average case scenario.
     *
     * 👀👀 Remember!! 👀👀
     * Big-O is used to measure the worst case scenario.
     *
     * When counting the number of operations there are rules that we need to
     * consider:
     *
     * 👀👀 Please try to read and familirize your self with the rules from your class slides 👀👀
     * 👀👀 Please try to differentiate between running time and growth rate of an algorithm 👀👀
     */

    // Q. Constant time complexity
    public static int constantTime(int[] arr) {
        return 200 * 10;
    }

    // Q. Linear time complexity
    public static void linearTime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(String.format("n: %s", arr[i]));
            System.out.println(arr[i]);
        }
    }

    // Q. Quadratic time complexity
    public static String quadraticTime(int n) { // => O(n) * O(n) => O(n2)
        int totalIteration = 0;
        for (int i = 0; i < n; i++) { // => O(n)
            for (int j = 0; j < n; j++) { // => O(n)
                System.out.println(i + " " + j);
                totalIteration += 1;
            }
        }
        return String.format("The total number of iteration taken to complete this task is %s", totalIteration);
    }

    // (3n + 2) * (2n + 2) => 6n^2 + 10n + 4 => O(n^2)

    // Q. Logarithmic time complexity
    public static String logarithmicTime(int n) {
        int totalIteration = 0;
        for (int i = n; i > 1; i = i / 2) {
            System.out.println(i);
            totalIteration += 1;
        }
        return String.format("The total number of iteration taken to complete this task is %s", totalIteration);
    }

    // In logarithmic time complexity, the input is divided into half in each
    // iteration
    // 2 ^ 3 = 8
    // log2(8) = 3
    // 2 * 2 * 2 = 8

    // Q. LogArtihmic time complexity
    public static String logArthmicTime(int n) {
        int totalIteration = 0;
        int y = n;
        while (n > 1) {
            n = n / 2; // <= focus on this line of code which divides n into half in each iteration
                       // (O(logn))
            for (int i = 1; i <= y; i++) { // <= this line uses the value of y for its iteration which has been
                                           // initially set to n (O(n))
                System.out.println(i);
                totalIteration += 1;
            }
            System.out.println("***********");
        }
        return String.format("The total number of iteration taken to complete this task is %s", totalIteration);
    }

}
