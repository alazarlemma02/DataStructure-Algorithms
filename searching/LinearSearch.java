public class LinearSearch {

    public static String linearSearch(int[] arr, int target){
        int length = arr.length;
        for(int i=0; i< length; i++){
            if (arr[i] == target){
                return String.format("Number %s found at index => %s", target, i);
            }
        }
        return "number not found";
    }

}
