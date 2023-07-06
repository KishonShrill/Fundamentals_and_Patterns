package Arrays_and_Hashing.ValidAnagram;

class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int [] arr1=new int[26];
        int [] arr2=new int[26];

        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-'a']++;
            arr2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i] != arr2[i]) return false;
        }

        return true;
    }

    /*
    The iteration for the given strings s = "anagram" and t = "nagaram":

    Initialize arr1 and arr2 as arrays of size 26, representing the frequencies of letters in the alphabet.

    arr1 = [0, 0, 0, ..., 0]
    arr2 = [0, 0, 0, ..., 0]
    Iterate over each character in s and t simultaneously:

    At i = 0, s.charAt(0) = 'a', t.charAt(0) = 'n'
        Increment arr1['a' - 'a'], which is equivalent to incrementing arr1[0], so arr1[0] = 1
        Increment arr2['n' - 'a'], which is equivalent to incrementing arr2[13], so arr2[13] = 1
    At i = 1, s.charAt(1) = 'n', t.charAt(1) = 'a'
        Increment arr1['n' - 'a'], which is equivalent to incrementing arr1[13], so arr1[13] = 1
        Increment arr2['a' - 'a'], which is equivalent to incrementing arr2[0], so arr2[0] = 1
    At i = 2, s.charAt(2) = 'a', t.charAt(2) = 'g'
        Increment arr1['a' - 'a'], which is equivalent to incrementing arr1[0], so arr1[0] = 2
        Increment arr2['g' - 'a'], which is equivalent to incrementing arr2[6], so arr2[6] = 1
    At i = 3, s.charAt(3) = 'g', t.charAt(3) = 'a'
        Increment arr1['g' - 'a'], which is equivalent to incrementing arr1[6], so arr1[6] = 1
        Increment arr2['a' - 'a'], which is equivalent to incrementing arr2[0], so arr2[0] = 2
    At i = 4, s.charAt(4) = 'r', t.charAt(4) = 'r'
        Increment arr1['r' - 'a'], which is equivalent to incrementing arr1[17], so arr1[17] = 1
        Increment arr2['r' - 'a'], which is equivalent to incrementing arr2[17], so arr2[17] = 1
    At i = 5, s.charAt(5) = 'a', t.charAt(5) = 'm'
        Increment arr1['a' - 'a'], which is equivalent to incrementing arr1[0], so arr1[0] = 3
        Increment arr2['m' - 'a'], which is equivalent to incrementing arr2[12], so arr2[12] = 1

    Iterate over arr1 and arr2 from index 0 to 25:

    At i = 0, arr1[0] = 3, arr2[0] = 2
    The counts are not equal, so return false.

    The final result is false because the counts of letters in arr1 and arr2 are not equal. Therefore, the strings "anagram" and "nagaram" are not anagrams of each other.
     */
}