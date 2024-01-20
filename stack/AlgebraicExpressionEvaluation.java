public class AlgebraicExpressionEvaluation {
    public static void main(String[] args) {
        System.out.println("Hello Stack");
    }
    /*
     * operands => A, B, C, D, E, F, ...., 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, ...
     * operators => +, -, *, /, ^, ...
     *
     * Rules:
     *  1. priority of operators:
     *      ^ => highest priority
     *      *,/ => next priority
     *      +,- => lowest priority
     *  2. No two operators with the same priority can stay together in a stack coulumn, i.e.
     *      the one which came first will be popped out first
     *  3. Lowest priority can't be placed on top of highest priority
     */

    /*
     * Examples of Algebraic Expression Evaluation
     *
     * a. A + B
     * b. (A + B) * C
     * c. A + B * C
     * d. A + B * C - D
     * e. A * (B + C) -D / (E + F)
     * f. A * B + C / D - E * (F + G)
     * g. A + B * (C - D) / E + F
     * h. (A + B) * C - D * (E + F) / G
     * i. (A * B) + (C / D) - (E + F) * G
     * j. A * (B + C) - D / E + (F - G)
    */





}
