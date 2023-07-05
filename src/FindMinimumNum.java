public class FindMinimumNum {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
    }

    private static int findMin(int[] givenArr) {
        int firstPick = 0;
        int secondPick = givenArr.length -1;

        while (firstPick < secondPick) {
            int midPick = (int) Math.floor((firstPick+secondPick)/2);

            if (givenArr[midPick] > givenArr[secondPick]) {
                firstPick = midPick + 1;
            } else {
                secondPick = midPick;
            }
        }

        return givenArr[firstPick];
    }
}
