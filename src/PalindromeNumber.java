class PalindromeNumber {
    static int originalNumber;
    static int reverseNumber;
    public static int reverseInt(int number) {
        originalNumber = number;
        reverseNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }

        return reverseNumber;
    }
    public static boolean isPalindrome(int givenNumber, int comparedNumber) {
        if (givenNumber == comparedNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int answer = reverseInt(123456789);
        System.out.println(answer);
        System.out.println(isPalindrome(originalNumber, answer));
    }
}
