package com.arithmetic.section_2_3;

import com.arithmetic.Example;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * @author Scandinavian
 * @Description 快速排序
 * @date 2022/4/9 16:47
 */
public class Quick extends Example {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    /**
     * 快速排序
     *
     * @param a
     * @param lo 最低位 low
     * @param hi 最高位 high
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        // 将左半部分a[lo .. j-1]排序
        sort(a, lo, j - 1);
        // 将右半部分a[j+1,hi] 排序
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        //将数组切分为a[lo..i-1],a[i],a[i+1..hi]
        // 左右扫描指针
        int i = lo, j = hi + 1;
        Comparable v = a[lo];  // 切分元素
        while (true) {
            // 扫描左右，检查扫描是否结束并交换元素
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v,a[--j])){
                if (j==lo){
                    break;
                }
            }
            if (i>=j){
                break;
            }
        }
        exch(a,lo,j);
        return j;
    }


}
