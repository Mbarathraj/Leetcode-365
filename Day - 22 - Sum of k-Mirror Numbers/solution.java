class Solution {
    public long kMirror(int k, int n) {
        long sum = 0;
        for (int length = 1; n > 0; length++) {
            for (long half = (long) Math.pow(10, (length - 1) / 2); n > 0 && half < (long) Math.pow(10, (length + 1) / 2); half++) {
                long pal = createPalindrome(half, length % 2 == 1);
                if (isKPalindrome(pal, k)) {
                    sum += pal;
                    n--;
                }
            }
        }

        return sum;
    }

    // Create palindrome numerically
    private long createPalindrome(long half, boolean isOddLength) {
        long pal = half;
        if (isOddLength) half /= 10;

        while (half > 0) {
            pal = pal * 10 + half % 10;
            half /= 10;
        }

        return pal;
    }

    // Check if number is a palindrome in base-k without converting to string
    private boolean isKPalindrome(long num, int k) {
        int[] digits = new int[64];
        int len = 0;

        while (num > 0) {
            digits[len++] = (int)(num % k);
            num /= k;
        }

        for (int i = 0; i < len / 2; i++) {
            if (digits[i] != digits[len - 1 - i]) return false;
        }

        return true;
    }
}
