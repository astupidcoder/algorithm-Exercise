package com;

import java.util.Random;

/**
 * @author liuyj
 * @Title: ThreadScopeShareData
 * @create 2020-05-18 19:42
 * @ProjectName algorithm-Exercise
 * @Description: 多线程
 */
public class ThreadScopeShareData {

    private static int data=0;

    public static void main(String[] args){
        for (int i=0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int temp=new Random().nextInt();
                    System.out.println(Thread.currentThread().getName()+"哈哈"+temp);
                    data=temp;
                    new TestA().getData();
                    new TestB().getData();
                }
            }).start();
        }
    }

    static class TestA{
        public void getData(){
            System.out.println("A getData .."+Thread.currentThread().getName()+":"+data);
        }
    }

    static class TestB{
        public void getData(){
            System.out.println("B getData .."+Thread.currentThread().getName()+":"+data);
        }
    }
}
