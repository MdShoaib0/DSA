class Solution {

    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = sol.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}