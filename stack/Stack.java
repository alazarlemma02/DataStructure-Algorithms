public class Stack {
    public static void main(String[] args) {
        System.out.println("Hello Stack");
    }

    /*
     * Stack and Applcations
     *  Stack is:
     *      => a linear data structure
     *      => a LIFO (Last In First Out) structure
     *      => a ordered list of similar data type
     *      => a recursive data structure
     *      => a dynamic data structure
     *      => a ADT (Abstract Data Type)
     *
     * Stack Operations
     *
     *  push() - Insert an element on top of the stack
     *  pop() - Remove an element from top of the stack
     *  peek() - Get the top element
     *  isEmpty() - Check if stack is empty
     *
     * Applications of Stack
     *
     *  Balancing of symbols
     *  Infix to Postfix / Prefix conversion
     *  Redo-Undo feature at many places like editors, photoshop
     *  Forward and backward feature in web browsers
     *  Used in many algorithms like Tower of Hanoi, tree traversals, stock span
     *  problem, histogram problem
     *
     * Implementation of Stack
     *
     *  Using Array
     *  Using Linked List
     *
     * Stack and Applications
     *
     *  1. Function Calls:
     *      - How Stack is Used:
     *          - As mentioned earlier, a stack is commonly used to manage function calls and
     *          returns in a program's memory.
     *          - Each function call creates a new frame on top of the stack, and when the
     *          function completes, its frame is popped off the stack.
     *          - This ensures proper control flow and allows for the execution of nested
     *          function calls.
     *
     *  2. Algebraic Expression Evaluation:
     *      - How Stack is Used:
     *          - In algebraic expression evaluation, a stack can be employed to handle the
     *          order of operations and manage operands and operators.
     *          - For example, during the evaluation of an infix expression to postfix or
     *          prefix notation, a stack can be used to temporarily store operators based on
     *          their precedence.
     *          - The stack allows for proper ordering of operations and simplifies the
     *          process of expression evaluation.
     *
     *  3. Backward and Forward Chaining (Inference Engines in AI):
     *      - How Stack is Used:
     *          - In rule-based systems, backward chaining and forward chaining are common
     *          inference strategies used for reasoning.
     *          - Backward Chaining:
     *              - In backward chaining, the system starts with a goal and works backward,
     *              trying to find the facts or rules that support the goal.
     *              - A stack can be used to keep track of the goals and sub-goals during the
     *              backward chaining process.
     *          - Forward Chaining:
     *              - In forward chaining, the system starts with known facts and applies rules
     *              to derive new conclusions until a goal is reached.
     *              - A stack can be used to keep track of the facts and rules that need to be
     *              applied during the forward chaining process.
     *
     *  In both chaining strategies, a stack facilitates the systematic exploration
     *  of the knowledge base and the derivation of conclusions based on the
     *  available information. It helps maintain the context and order of rule
     *  application or goal pursuit.
     *
     */
}

