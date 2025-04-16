package org.example;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    /* Write Code Here */
    public int isEvenNum(int n) {
        return n % 2 == 0? 1 : -1;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int n;
        n = Integer.parseInt(in.nextLine().trim());
        res = new Solution().isEvenNum(n);
        System.out.println(String.valueOf(res));

    }
}
