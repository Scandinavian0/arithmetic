package com.arithmetic.section_2_1;

import com.arithmetic.Example;

/**
 * @Description: ιζ©ζεΊ
 * @Date: 2022/3/21
 * @Author: Everglow
 */
public class Selection extends Example {
    public static void sort(Comparable[] a){
        int N=a.length;
        for (int i=0;i<N;i++){
            int min=i;
            for (int j=i+1;j<N;j++){
                if (less(a[j],a[min])) min=j;
            }
            exch(a,i,min);
        }
    }
}
