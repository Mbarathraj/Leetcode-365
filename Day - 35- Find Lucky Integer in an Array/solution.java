class Solution {
    public int findLucky(int[] arr) {
        int[] counts = new int[501];
        for (int i : arr) {
            counts[i]++;
        }

        int max = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (counts[i] == i) {
                max = i;
            }
        }

        return max;
    }
}
