# KFRequentElements Explanation
## Example
The given array has values {1, 1, 1, 2, 2, 3} and you must find the top 2 frequent numbers in the array.
   - nums[] = {1, 1, 1, 2, 2, 3};
   - k = 2;


### 1. Initialization:
- __'max = Integer.MIN_VALUE'__ and __'min = Integer.MAX_VALUE'__
- Iterating through the array, we find __'max = 3'__ and __'min = 1'__
### 2. Building the frequency array ( __'freq'__ ):
- The range of values in the __'nums'__ array is from 1 to 3, so __'freq'__ is initialized as __'int[3 - 1 + 1] = int[3]'__
- We iterate through the 'nums' array, incrementing the count in __'freq'__ for each number.
- After iterating, __'freq'__ becomes __'[0, 3, 2]'__, where __'freq[1] = 3'__ represents the frequency of 1 and __'freq[2] = 2'__ represents the frequency of 2.
### 3. Putting the numbers with the same frequency into buckets:
- We create a __'bucket'__ array of lists. Since the length of the __'nums'__ array is 6, __'bucket'__ is initialized as __'List<Integer>[6 + 1] = List<Integer>[7]'__.
- We iterate through the __'freq'__ array and for each frequency value greater than 0, we add the corresponding number to the bucket at that frequency index.
- In this case, we have __'bucket[3] = [1]'__ and __'bucket[2] = [2]'__.
### 4. Finding the top k frequent elements:
- We create the result array __'res'__ with a size of __'k'__ (2 in this case).
- Starting from the maximum frequency (3 in this case), we iterate through the buckets in reverse order.
- We check if the bucket at the current frequency is not null.
- In the first iteration, __'bucket[3]'__ is not null. We iterate through the numbers in __'bucket[3]'__ and add them to the result array __'res'__ until __'k'__ elements have been added or there are no more elements left.
- In this case, we add __'1'__ to __'res[0]'__, and since __'k = 2'__, we break out of the loop because we have added one element.
- The resulting array 'res' is __'[1, 0]'__ (assuming __'0'__ is the default value for the uninitialized elements).

Therefore, for the given input array of __'{1, 1, 1, 2, 2, 3}'__ and __'k = 2'__, the top 2 frequent elements are __'1'__ and __'0'__.