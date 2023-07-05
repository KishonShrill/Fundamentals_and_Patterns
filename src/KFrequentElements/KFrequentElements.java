package KFrequentElements;

import java.util.*;

public class KFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 1, 2};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        // Get values and get frequency
        int[] value = new int[k];
        Map<Integer, Integer> numsFrequency = new HashMap<>();
        for (int pickedNumber = 0; pickedNumber < nums.length; pickedNumber++) {
            int number = nums[pickedNumber];
            numsFrequency.put(number, numsFrequency.getOrDefault(number, 0) + 1);
        }

        List<ValueEntry> valueEntries = new ArrayList<>();
        // Create ScoreEntry objects and add them to the list
        for (Map.Entry<Integer, Integer> entry : numsFrequency.entrySet()) {
            int givenValue = entry.getKey();
            int frequency = entry.getValue();
            valueEntries.add(new ValueEntry(givenValue, frequency));
        }

        // Sort the list in descending order of values
        Collections.sort(valueEntries, Collections.reverseOrder());

        // Get the top highest value
        ValueEntry[] topScores = new ValueEntry[k];
        for (int j = 0; j < k; j++) {
            topScores[j] = valueEntries.get(j);
        }

        // Print the top 2 highest scores
        int count = 0;
        for (ValueEntry entry : topScores) {
            if (entry != null) {
                value[count] = entry.getMostFrequency();
                count++;
            }
        }

        // Debug
        System.out.println(numsFrequency);
        return value;
    }

    // Custom class to hold student name and score
    static class ValueEntry implements Comparable<ValueEntry> {
        private final int value;
        private final int frequency;

        public ValueEntry(int frequency, int value) {
            this.frequency = frequency;
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int getMostFrequency() {
            return frequency;
        }

        @Override
        public int compareTo(ValueEntry other) {
            return Integer.compare(this.value, other.value);
        }
    }
}

/*
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // If k is equal to the length of the nums array, return the nums array as is
        if (k == nums.length) {
            return nums;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find the minimum and maximum numbers in the array
        for(int num: nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }

        // Build the frequency array
        int[] freq = new int[max - min + 1];
        for(int num: nums){
            freq[num - min]++;
        }

        // Put numbers with the same frequency into buckets
        List<Integer>[] bucket = new List[nums.length + 1];
        int max_freq = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                if(bucket[freq[i]] == null) bucket[freq[i]] = new ArrayList<>();
                bucket[freq[i]].add(i + min);
                if(freq[i] > max_freq) max_freq = freq[i];
            }
        }

        // Loop through the buckets to find the top k frequent elements
        int[] res = new int[k];
        int i = 0;
        for(int j = max_freq; j >= 0 && i < k; j--){
            if(bucket[j] != null){
                for(int num : bucket[j]) {
                    if(i == k) break;
                    res[i++] = num;
                }
            }
        }

        return res;
    }
}
 */
