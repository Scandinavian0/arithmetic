package com.arithmetic.section_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Description: 排序模版
 * @Date: 2022/3/21
 * @Author: Everglow
 */
public abstract class Example {
//    private static boolean  ;

    public  static  void sort(Comparable[] a){};

    static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    static void exch(Comparable[] a, int i, int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    static void show(Comparable[] a){
        for (int i=0;i<a.length;i++){
            StdOut.print(a[i]+"");
        }
        StdOut.print();
    }

    public static boolean isSorted(Comparable[] a){
        // 测试数组是否有序
        for (int i=1;i<a.length;i++){
            if (less(a[i],a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a= StdIn.readAllStrings();
        sort(a);
        System.out.println(a);
        assert isSorted(a);
        show(a);
    }

}
