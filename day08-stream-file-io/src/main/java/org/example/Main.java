package org.example;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.recur(5));
        System.out.println(main.tailRecur(5, 0));
        System.out.println(main.fib(10));
    }
    /* 递归 */
    int recur(int n) {
        // 终止条件
        if (n == 0)
            return 0;
        // 递：递归调用
        int res = recur(n - 1);
        // 归：返回结果
        return n + res;
    }
    /* 尾递归 */
    int tailRecur(int n, int res) {
        // 终止条件
        if (n == 0)
            return res;
        // 尾递归调用
        return tailRecur(n - 1, res + n);
    }
    /* 斐波那契数列：递归 */
    int fib(int n) {
        // 终止条件 f(1) = 0, f(2) = 1
        if (n == 1 || n == 2)
            return n - 1;
        // 递归调用 f(n) = f(n-1) + f(n-2)
        int res = fib(n - 1) + fib(n - 2);
        // 返回结果 f(n)
        return res;
    }
}
