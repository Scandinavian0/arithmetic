package com.arithmetic.section_2_2;

import com.arithmetic.Example;


/**
 * @Description: 自顶向下的归并排序
 * @Date: 2022/3/22
 * @Author: Everglow
 */
public class Merges extends Example {
    private static Comparable[] aux; // 归并所需的辅助函数

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid)                    a[k] = aux[j++];
            else if (j > hi)                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))  a[k] = aux[j++];
            else                            a[k] = aux[i++];
        }
    }

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];  // 一次行分配空间
        sort(a, 0, a.length);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        // 数组a[lo..hi]排序
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        // 递归
        // 第一个子数组
        sort(a, lo, mid);
        // 第二个子数组
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

}
