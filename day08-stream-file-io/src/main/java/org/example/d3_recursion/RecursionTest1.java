package org.example.d3_recursion;
/**
 * 递归算法三要素：
 * - 递归的公式：f(n) = f(n-1)*n;
 * - 递归的终点：f(1)
 * - 递归的方向必须走向终结点
 */
public class RecursionTest1 {
    public static void main(String[] args) {
        /**
         * 问题：猴子第一天吃了总量桃子的一半加一，第二天吃了剩下的一半加一，第十天就剩一个，求总量
         * 第十天剩下1个
         * 第九天有 X 个，X / 2 -1 = 1，X = 4
         * 第八天有 Y 个，Y / 2 -1 = 4，Y = 10
         * 第n天等于第n+1的数量+1然后乘以2
         *即 f(n) = (f(N+1)+1)*2
         */
        System.out.println(f(1));
    }
    public static int f(int n) {
        // 递归终止条件
        if (n == 10) {
            return 1;
        }
        // 递归调用
        return  (f(n + 1)+ 1 )*2;
    }
}
