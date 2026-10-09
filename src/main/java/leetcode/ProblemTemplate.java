package leetcode;

/**
 * ============== 题目模板（新增题目时复制本文件到对应专题包）==============
 *
 * {题号}. {题目名称}
 *
 * 题目链接：https://leetcode.cn/problems/{slug}/description/
 *
 * 题目描述：
 *   （一两句话概括题意，约束条件里影响解法的关键点记一下）
 *
 * 讲解笔记：notes/05-数据结构/数组/1.数组解题方法.md（如有对应笔记则链接）
 *
 * 解题思路：
 *   1. ...
 *   2. ...
 *
 * 复杂度分析：
 *   时间复杂度 O(n)
 *   空间复杂度 O(1)
 *
 * 类命名规范：L{题号}_{题目英文名}，如 L1_TwoSum、L206_ReverseLinkedList
 * =====================================================================
 */
public class ProblemTemplate {

    /** 解法（核心方法保持 LeetCode 签名，方便直接粘贴提交） */
    public int[] solve(int[] nums, int target) {
        return new int[0];
    }

    /** 本地自测：跑一组用例验证（ACM 输入输出模板见 notes/04-ACM模板/） */
    public static void main(String[] args) {
        ProblemTemplate solution = new ProblemTemplate();
        // assert 或打印对比预期
        System.out.println(java.util.Arrays.toString(solution.solve(new int[]{2, 7, 11, 15}, 9)));
    }
}
