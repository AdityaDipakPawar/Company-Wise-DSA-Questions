public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1,4,2};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumberCyclic(nums));
    }

    public static int missingNumber(int[] nums) {
        int x = nums.length;
        for (int i = 0; i < nums.length; i++) {
            x = x ^ i;
            x = x ^ nums[i];
        }
        return x;
    }

    public static int missingNumberCyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    public static void swap (int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
