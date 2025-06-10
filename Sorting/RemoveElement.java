package Sorting;

class Solution {

    // Removes duplicates allowing at most two occurrences
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int idx = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;
            } else {
                count = 0;
            }

            if (count < 2) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 1, 1, 2, 2, 3};

        int newLength = sol.removeDuplicates(nums);

        System.out.println("Length after removing duplicates (max twice): " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}