package com;

/**
 * @author liuyj
 * @Title: ReplaceSpace
 * @create 2020-05-27 11:38
 * @ProjectName algorithm-Exercise
 * @Description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str){
       return str.toString().replace(" ","%20");
    }

   public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        sb.append("We Are Happy");
       System.out.println(replaceSpace(sb));
   }
}
