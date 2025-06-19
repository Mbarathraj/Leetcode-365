class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length / 3;

        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] > k) return new int[0][];
        }

        int[][] res = new int[len][3];
        for (int i = 0; i < len; i++) {
            res[i][0] = nums[3 * i];
            res[i][1] = nums[3 * i + 1];
            res[i][2] = nums[3 * i + 2];
        }

        return res;
    }
}
