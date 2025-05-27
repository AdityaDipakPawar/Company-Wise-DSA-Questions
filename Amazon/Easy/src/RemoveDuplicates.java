public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,2,3,3,3,3,4,5,7,7};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[i] < nums[j]) {
                swap(nums, i+1, j);
                i++;
            }
        }


        return i + 1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
