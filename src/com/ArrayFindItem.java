package com;

/**
 * @author admin
 * @Title: ArrayFindItem
 * @ProjectName algorithm-Exercise
 * @Description: 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @date 2020/3/12 15:23
 */

public class ArrayFindItem {
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){
                    System.out.println("找到了--"+"i=="+i+",j=="+j);
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args){
//        int [][]array={{4,1},{43,6}};
//        ArrayFindItem arrayFindItem=new ArrayFindItem();
//        arrayFindItem.Find(1,array);

        reverse(new int[]{1,2,3,4,5,6});
    }



    //数据反转输出

    public static int[] reverse(int[] list){
        int[] result=new int[list.length];
        for(int i=0;i<list.length;i++){
            result[i]=list[list.length-i-1];
        }
        for (int m:result) {
            System.out.println(m);
        }
        return result;
    }
}
