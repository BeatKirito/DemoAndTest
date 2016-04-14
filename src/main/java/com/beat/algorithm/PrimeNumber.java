package com.beat.algorithm;

import java.io.UnsupportedEncodingException;

/**
 * Created by beatkirito on 2016/3/24.
 */
public class PrimeNumber {

    private static final int MAX = 1000;

    //使用“筛法”打印出出1-1000的素数
    public static void printByFilter() {

        //初始化布尔数组全为true
        boolean[] isPrime = new boolean[1000];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        //从2开始遍历，直到MAX/2
        for(int i = 2; i < MAX / 2; i ++) {

            //检查当前数字是否标记为素数
            if(isPrime[i]) {

                //将当前标记为素数的倍数的标记全设置为false
                for(int j = i << 1; j <= MAX; j++) {
                    isPrime[j] = false;
                }
                System.out.println(i); //输出当前的素数
                //beatkirito@gmail.com

                String s = "这是一串字符串";
                try {
                    s.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
