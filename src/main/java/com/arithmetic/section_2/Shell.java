package com.arithmetic.section_2;

/**
 * @Description: 希尔排序
 * @Date: 2022/3/21
 * @Author: Everglow
 */
public class Shell extends Example{
    public static void sort(Comparable[] a){
        // 将a[] 按照升序排列
        int N=a.length;
        int h=1;
        while (h<N/3) h=3*h+1; // 1,4,13,40,121,363,1093
        while (h>=1){
            for (int i=h;i<N;i++){
                // 将a[i] 插入到a[i-h]，a[i-2*h]，a[i-3*j]....之中
                for (int j=i;j>=h&&less(a[j],a[j-h]);j-=h)
                    exch(a,j,j-h);
            }
            h=h/3;
        }
    }
}
