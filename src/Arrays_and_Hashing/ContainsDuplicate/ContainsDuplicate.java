package Arrays_and_Hashing.ContainsDuplicate;

import java.util.Arrays;

class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] == nums[i]) {return true;}
        }
        return false;
    }
}