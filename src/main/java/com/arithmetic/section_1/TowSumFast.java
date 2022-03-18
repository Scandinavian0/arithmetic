package com.arithmetic.section_1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @Description:
 * @Date: 2022/3/18
 * @Author: Everglow
 */
public class TowSumFast {
    public static int count(int [] a){
        Arrays.sort(a);
        int N=a.length;
        int cnt=0;
        for (int i=0;i<N;i++){
            if (BinarySearch.rank(-a[i],a)>i){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a= In.readInts(args[0]);
        StdOut.print(count(a));
    }

}
