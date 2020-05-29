package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyj
 * @Title: PrintListFromTailToHead
 * @create 2020-05-27 11:49
 * @ProjectName algorithm-Exercise
 * @Description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */

 class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}
public class PrintListFromTailToHead {


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        List<Integer>list=new ArrayList<>();
        while(listNode!=null){
            list.add(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }
        return list2;
    }

}
