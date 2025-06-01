package Search;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = new int[10000];
        int target = 34;

        int result = linearSearch(nums, target);

        if(result == -1 ){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }

    public static int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                System.out.println(steps);
                return i;
            }
            steps++;
        }
            System.out.println(steps);
        return -1;
    }
}
