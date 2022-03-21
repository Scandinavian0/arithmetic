package com.arithmetic.section_2;

/**
 * @Description: 插入排序
 * @Date: 2022/3/21
 * @Author: Everglow
 */
public class Insertion extends Example{
    public static void sort(Comparable[] a){
        // 将a[] 并列排序
        int N=a.length;
        for (int i=1;i<N;i++){
            // 将a[i] 插入到a[i-1]、a[i-2]、a[i-3]、....之中
            for (int j=i;j>0&&less(a[j],a[j-1]); j--){
                exch(a,j,j-1);
            }
        }
    }
}