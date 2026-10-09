# LeetCode Coding

LeetCode 刷题仓库：**讲解笔记（`notes/`）+ Java 题解（`src/`）**，Maven 工程，JDK 17。

## 🗂 仓库结构

```
leetcode_coding/
├── pom.xml                        # Maven 工程（JDK 17）
├── README.md                      # 本文件：总索引 + 刷题规范
├── notes/                         # 📖 讲解笔记（只读沉淀，不写代码）
│   ├── 必背算法.md
│   ├── 01-Java数据结构常用函数/    # Java API 速查（12 篇）
│   ├── 02-刷题技巧与技术规范/      # 二分、递归等套路（4 篇）
│   ├── 03-算法合集/               # 图论、排序、并查集等（11 篇）
│   ├── 04-ACM模板/                # ACM 模式 IO 模板（3 篇）
│   ├── 05-数据结构/               # 数组/链表/哈希/栈队列/字符串/单调栈/二叉树
│   └── 06-算法思想/               # 动态规划、回溯
└── src/main/java/leetcode/        # 📝 Java 题解
    ├── ProblemTemplate.java       # 题目模板（新增题目时复制）
    ├── array/                     # 数组（README = 讲解链接 + 题目进度表）
    ├── string/                    # 字符串
    ├── linkedlist/                # 链表
    ├── hashtable/                 # 哈希表
    ├── stackqueue/                # 栈和队列
    ├── monotonicstack/            # 单调栈
    ├── tree/                      # 二叉树
    ├── binarysearch/              # 二分查找
    ├── sort/                      # 排序
    ├── graph/                     # 图论（最短路/拓扑/并查集/最小生成树）
    ├── dp/                        # 动态规划
    └── backtracking/              # 回溯
```

每个专题包的 `README.md` 都是「**先讲解笔记链接、后题目列表**」的结构，刷完一道题就更新对应包的 README 进度表。

## 📚 讲解笔记总览

| 分类 | 内容 |
| --- | --- |
| [必背算法](notes/必背算法.md) | 背诵清单 |
| [01-Java数据结构常用函数](notes/01-Java数据结构常用函数/0.目录.md) | 数组/字符串/集合/Stream/转换/遍历（12 篇） |
| [02-刷题技巧与技术规范](notes/02-刷题技巧与技术规范/1.二分查找.md) | 二分查找、递归、循环数组、矩阵快速幂 |
| [03-算法合集](notes/03-算法合集/4.十大排序算法.md) | 最短路径、拓扑排序、Morris、十大排序、Manacher、字符串匹配、矩阵快速幂、最小生成树、线段树、并查集、跳表 |
| [04-ACM模板](notes/04-ACM模板/1.输入和输出.md) | ACM 模式 IO、链表、二叉树建树 |
| 05-数据结构 | [数组](notes/05-数据结构/数组/数组基础.md) · [链表](notes/05-数据结构/链表/1.链表.md) · [哈希](notes/01-Java数据结构常用函数/7.Map.md) · [栈和队列](notes/05-数据结构/栈和队列/1.滑动窗口.md) · [字符串](notes/05-数据结构/字符串/KMP%20算法.md) · [单调栈](notes/05-数据结构/单调栈/单调栈.md) · [二叉树](notes/05-数据结构/二叉树/1.二叉树概念与遍历.md) |
| 06-算法思想 | [动态规划](notes/06-算法思想/动态规划/动态规划.md) · [回溯](notes/06-算法思想/回溯算法/回溯算法.md) |

## 📝 刷题规范

### 新增一道题的流程

1. **复制模板**：复制 `src/main/java/leetcode/ProblemTemplate.java` 到对应专题包，重命名为 `L{题号}_{题目英文名}.java`（如 `L1_TwoSum.java`）
2. **填写头部注释**：题目链接、题意、解题思路、复杂度分析，有对应讲解笔记的加上笔记链接
3. **保持 LeetCode 方法签名**：核心方法签名与 LeetCode 一致，方便直接粘贴提交
4. **本地自测**：`main` 方法里跑用例验证（ACM 输入输出套路见 [notes/04-ACM模板](notes/04-ACM模板/1.输入和输出.md)）
5. **更新进度表**：在专题包的 `README.md` 题目表加一行，状态标 ✅

### 题目头部注释格式

```java
/**
 * {题号}. {题目名称}
 * 题目链接：https://leetcode.cn/problems/{slug}/description/
 * 讲解笔记：notes/05-数据结构/...（如有）
 * 解题思路：...
 * 复杂度分析：时间 O(n) / 空间 O(1)
 */
```

### 常用命令

```bash
mvn compile                                              # 编译全部
java -cp target/classes leetcode.array.L1_TwoSum         # 运行某题的本地自测
```

## ✅ 刷题进度

| 专题 | 已刷 | 代表题目 |
| --- | --- | --- |
| [数组](src/main/java/leetcode/array/README.md) | 1 | L1 两数之和 |
| [链表](src/main/java/leetcode/linkedlist/README.md) | 1 | L206 反转链表 |
| [二分查找](src/main/java/leetcode/binarysearch/README.md) | 1 | L704 二分查找 |
| [字符串](src/main/java/leetcode/string/README.md) | 0 |  |
| [哈希表](src/main/java/leetcode/hashtable/README.md) | 0 |  |
| [栈和队列](src/main/java/leetcode/stackqueue/README.md) | 0 |  |
| [单调栈](src/main/java/leetcode/monotonicstack/README.md) | 0 |  |
| [二叉树](src/main/java/leetcode/tree/README.md) | 0 |  |
| [排序](src/main/java/leetcode/sort/README.md) | 0 |  |
| [图论](src/main/java/leetcode/graph/README.md) | 0 |  |
| [动态规划](src/main/java/leetcode/dp/README.md) | 0 |  |
| [回溯](src/main/java/leetcode/backtracking/README.md) | 0 |  |
