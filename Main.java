class Main{

    public static void main(String args[]){
        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        // System.out.println(constantTime(arr));
        // linearTime(arr);
        // System.out.println(quadraticTime(5));
        // System.out.println(logarithmicTime(8));
        // System.out.println(logArthmicTime(4));

    }


    // Q. Constant time complexity
    public static int constantTime(int[] arr){
        return 200 * 10;
    }

    // Q. Linear time complexity
    public static void linearTime(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(String.format("n: %s", arr[i]));
            System.out.println(arr[i]);
        }
    }

    // Q. Quadratic time complexity
    public static String quadraticTime(int n){ // => O(n) * O(n) => O(n2)
        int totalIteration = 0;
        for(int i=0;i<n;i++){ // => O(n)
            for(int j=0;j<n;j++){ // => O(n)
                System.out.println(i + " " + j);
                totalIteration+=1;
            }
        }
        return String.format("The total number of iteration taken to complete this task is %s", totalIteration);
    }

    // (3n + 2) * (2n + 2) => 6n2 + 10n + 4 => O(n2)

    // Q. Logarithmic time complexity
    public static String logarithmicTime(int n){
        int totalIteration = 0;
        for(int i=n;i>1;i=i/2){
            System.out.println(i);
            totalIteration+=1;
        }
        return String.format("The total number of iteration taken to complete this task is %s", totalIteration);
    }

    // In logarithmic time complexity, the input is divided into half in each iteration
    // 2 ^ 3 = 8
    // log2(8) = 3
    // 2 * 2 * 2 = 8

    // Q. LogArtihmic time complexity
    public static String logArthmicTime(int n){
        int totalIteration = 0;
        int y = n;
        while(n > 1){
            n = n / 2; //<= focus on this line of code which divides n into half in each iteration (O(logn))
            for(int i=1; i<=y; i++){ // <= this line uses the value of y for its iteration which has been initially set to n (O(n))
                System.out.println(i);
                totalIteration+=1;
            }
            System.out.println("***********");
        }
        return String.format("The total number of iteration taken to complete this task is %s", totalIteration);
    }


}

