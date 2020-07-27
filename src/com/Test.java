package com;

/**
 * @author liuyj
 * @Title: Test
 * @create 2020-05-20 14:20
 * @ProjectName algorithm-Exercise
 * @Description: TODO
 */
public class Test {
    private static long sum(){


        //sum变量为Long与long时程序执行效率差别达数十倍之多
        long sum=0L;
        for (long i = 0L; i <=Integer.MAX_VALUE ; i++) {
            sum+=i;
        }

        return sum;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("----->"+sum());
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
