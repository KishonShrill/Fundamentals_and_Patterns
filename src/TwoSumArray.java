import java.util.HashMap;

class TwoSumArray {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        int diff = 0;
        for(int i = 0; i < nums.length; i++){
            diff = target - nums[i];
            if(map.get(diff) != null && map.get(diff) != i) {
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            }
        }
        System.gc();
        return ans;
    }

    /*
    the iteration step by step for the given array {2, 7, 11, 15} and the target value 9.

    Initialize the ans array to store the indices of the two numbers that sum up to the target.
    ans = [0, 0]

    Create a HashMap called map to store the numbers from the array as keys and their corresponding indices as values.

    Iterate over the array to populate the map:

    Iteration 1: nums[0] = 2
        Store 2 as the key with index 0 in the map: {2: 0}

    Iteration 2: nums[1] = 7
        Store 7 as the key with index 1 in the map: {2: 0, 7: 1}

    Iteration 3: nums[2] = 11
        Store 11 as the key with index 2 in the map: {2: 0, 7: 1, 11: 2}

    Iteration 4: nums[3] = 15
        Store 15 as the key with index 3 in the map: {2: 0, 7: 1, 11: 2, 15: 3}

    ~~ Iterate over the array again to find the two numbers that sum up to the target:

    Iteration 1: nums[0] = 2
        Calculate the difference: diff = target - nums[0] = 9 - 2 = 7
        Check if the difference (7) exists in the map and its corresponding index is not the same as the current index (0):
        Found the complement in the map at index 1.
        Update the ans array with the indices: ans = [1, 0]
        Return the ans array since we found a valid pair.

    Iteration 2: nums[1] = 7
        Calculate the difference: diff = target - nums[1] = 9 - 7 = 2
        Check if the difference (2) exists in the map and its corresponding index is not the same as the current index (1):
        Found the complement in the map at index 0.
        Update the ans array with the indices: ans = [1, 0]
        Return the ans array since we found a valid pair.
        Continue to the next iterations, but no valid pair is found.

    Return the ans array, which contains the indices of the two numbers that sum up to the target.

    ans = [1, 0]
    In this case, the returned ans array is [1, 0], which means the numbers at indices 1 and 0 in the given array {2, 7, 11, 15} add up to the target value of 9.
     */
}