public class BinarySearch {
    public static String binarySearch(int[] arr, int target){
        // Binary search works only on sorted arrays
        int min = 0;
        int max = arr.length - 1;
        while(min <= max){
            int mid = (min + max) / 2;
            if(arr[mid] == target){
                return String.format("Number %s found at index => %s", target, mid);
            }
            else if(arr[mid] < target){
                min = mid + 1;
            }
            else if(arr[mid] > target){
                max = mid - 1;
            }
        }
        return "Number not found!";
    }
}
// Exercise try to write the same method in a recursive way
