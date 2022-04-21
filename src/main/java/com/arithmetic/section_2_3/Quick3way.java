package com.arithmetic.section_2_3;

import com.arithmetic.Example;

/**
 * @author Scandinavian
 * @Description 三向切分的快速排序
 * @date 2022/4/20 20:43
 */
public class Quick3way extends Example {
    private static void sort(Comparable[]a,int lo,int hi){
        if(hi<=lo) return;
        int lt=lo,i=lo+1,gt=hi;
        Comparable v=a[lo];
        while (i<=gt){
            int cmp=a[i].compareTo(v);
            if (cmp<0) exch(a.,lt++,i++);
            else if (cmp>0) exch(a,i,gt--);
            else i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }
}
