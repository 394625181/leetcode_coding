package leetcode.binarysearch;

/**
 * 704. 二分查找
 *
 * 题目链接：https://leetcode.cn/problems/binary-search/description/
 *
 * 题目描述：
 *   给定 n 个元素有序（升序）的整型数组 nums 和目标值 target，
 *   写一个函数搜索 nums 中的 target，存在则返回下标，否则返回 -1。
 *
 * 讲解笔记：notes/02-刷题技巧与技术规范/1.二分查找.md
 *
 * 解题思路：
 *   标准左闭右闭区间 [left, right] 二分：
 *   1. while (left <= right)，因为 left == right 时区间仍有效；
 *   2. nums[mid] == target 直接返回；
 *   3. 缩区间时 mid 已排除，取 mid + 1 / mid - 1。
 *
 * 复杂度分析：
 *   时间复杂度 O(log n)
 *   空间复杂度 O(1)
 */
public class L704_BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // 防溢出写法
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        L704_BinarySearch solution = new L704_BinarySearch();
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));   // 4
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));   // -1
    }
}
