public class BinarySearch {

    /*
     * Example-1
     * Given a sorted array perform a binary search to find the index of '10'
     * show each steps
     * questions to answer:
     * * Index
     * * total number of operation taken
     *
     * a. [2, 4, 6, 8, 10, 12, 14, 16]
     *
     * b. [8, 10, 12, 14, 16, 2, 4, 6]
     */
    public static String binarySearch(int[] arr, int target) {
        // Binary search works only on sorted arrays
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == target) {
                return String.format("Number %s found at index => %s", target, mid);
            } else if (arr[mid] < target) {
                min = mid + 1;
            } else if (arr[mid] > target) {
                max = mid - 1;
            }
        }
        return "Number not found!";
    }
}
/* Home work

Try to write the same method in a recursive way

*/
