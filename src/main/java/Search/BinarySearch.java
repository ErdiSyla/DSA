package Search;


public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[10000];
        int target = 26;

        int result = binarySearch(nums, target, 0, nums.length -1);

        if(result == -1 ){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] nums, int target,int start, int end){

        //Recursive form
        if(start <= end){
            int mid = (start + end) /2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                return binarySearch(nums, target, mid + 1, end);
            }else{
                return binarySearch(nums, target, start, mid -1);
            }
        }
        return -1;

        //Loop form
        /*
        int start = 0;
        int end = nums.length - 1;
        int steps = 0;
        while(start <= end){
            steps++;
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                System.out.println(steps);
                return mid;
            }else if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(steps);
        return -1;*/
    }
}
