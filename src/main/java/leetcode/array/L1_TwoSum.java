package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 *
 * 题目链接：https://leetcode.cn/problems/two-sum/description/
 *
 * 题目描述：
 *   给定一个整数数组 nums 和目标值 target，找出和为目标值的两个整数，返回其数组下标。
 *   每种输入只对应一个答案，同一元素不能重复使用。
 *
 * 讲解笔记：notes/05-数据结构/数组/1.数组解题方法.md
 *
 * 解题思路：
 *   1. 用哈希表记录「已遍历的值 -> 下标」；
 *   2. 遍历时查找 target - nums[i] 是否已出现，出现即得答案。
 *
 * 复杂度分析：
 *   时间复杂度 O(n)
 *   空间复杂度 O(n)
 */
public class L1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (valueToIndex.containsKey(need)) {
                return new int[]{valueToIndex.get(need), i};
            }
            valueToIndex.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        L1_TwoSum solution = new L1_TwoSum();
        System.out.println(java.util.Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));  // [0, 1]
        System.out.println(java.util.Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));        // [1, 2]
    }
}
