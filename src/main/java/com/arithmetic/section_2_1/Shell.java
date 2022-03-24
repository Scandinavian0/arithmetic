package com.arithmetic.section_2_1;

import com.arithmetic.Example;

/**
 * @Description: 希尔排序
 * @Date: 2022/3/21
 * @Author: Everglow
 */
public class Shell extends Example {
    public static void sort(Comparable[] a) {
        // 将a[] 按照升序排列
        int N = a.length;
        int h = 1;
        // 使用了序列1/2（3ˆk-1),从N/3开始递减至1
        while (h < N / 3) h = 3 * h + 1; // 1,4,13,40,121,363,1093
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                // 将a[i] 插入到a[i-h]，a[i-2*h]，a[i-3*j]....之中
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
                    exch(a, j, j - h);
            }
            h = h / 3;
        }
    }

    //希尔排序算法  待排序数组array 数组元素n
    void Shell_Sort(int array[], int n) {
        //得到希尔排序增量值d
        //补充下小知识点我们是根据增量值d = n/2开始进行直接插入排序假如我们设n = 10 那么d = 5
        //第二次d = 5/2 = 2  第三趟排序 d = 1 其实这个时候增量为1的时候进行的插入排序是彻底的
        //那么肯定会有序，因此我们需要跑的次数就很清楚
        int d = n / 2;

        //增量为1以上我们就一直循环进行直接插入排序
        while (d >= 1) {
            //开始直接插入排序算法
            //我们还是假定第一个有序，因此我们开始拿到第二个元素和前面的元素一一比较
            for (int i = d; i < n; i++) {
                //定义临时内存保存当前被排序的元素
                int temp = array[i];
                //开始得到当前元素的前面的元素索引j方便后续比较啊
                int j = i - d;

                //正式通过循环进入比较的过程大战
                while (j >= 0) //我们的索引必须是大于==0的，否则就退出咯
                {
                    //前面的元素大于当前的
                    if (temp < array[j]) {
                        //开始元素移动到后面
                        array[j + d] = array[j];

                        //并且将索引按照增量值减少一格
                        j = j - d;
                    } else  // 前面的元素大于当前的元素
                    {
                        //开始将临时数据写入空出来的位置
                        array[j + d] = temp;
                        break;
                    }
                }
                //第一趟增量比较完毕，开始设置第二趟 减少增量
                d = d / 2;
            }
        }
    }
}
