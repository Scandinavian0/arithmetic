package com.arithmetic.section_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Description:
 * @Date: 2022/3/18
 * @Author: Everglow
 */
public class ThreeSum {
    public static int count(int[] a){
        int N= a.length;
        int cnt=0;
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                for (int k=j+1;k<N;k++){
                    if(a[i]+a[j]+a[k]==0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int []a= In.readInts(args[0]);
        StdOut.print(count(a));
    }
}
