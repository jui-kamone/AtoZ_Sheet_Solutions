class Solution {
    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) return -1;

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
        }

        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num != max && num > secondMax) {
                secondMax = num;
            }
        }

        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }
}
