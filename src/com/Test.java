package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author liuyj
 * @Title: Test
 * @create 2020-05-20 14:20
 * @ProjectName algorithm-Exercise
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        String  str="1243";
        Objects.equals(str,"222");
        Integer a=233;
        a.equals(22);
        Map<String,Object> map=new HashMap<>(1);
        map.put("a",1);
        map.put("3",3);
       System.out.println(map.get("3"));
       System.out.println(map.get("a"));
    }
}
