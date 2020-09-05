package leetcode.easy;

/**
 * https://leetcode.com/problems/search-insert-position/
 * Date: 2020-09-06
 */
public class Q35_search_insert_position {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Q35_search_insert_position solution = new Q35_search_insert_position();
        int result = solution.searchInsert(new int[]{1,3,5,6}, 5);
        System.out.println(result);
    }

}
