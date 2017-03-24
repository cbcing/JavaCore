package com.scujcc.david.mycodeofwork;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by David on 3/23/17.
 */

/*
 *  判断数据是否存在重复的值
 *  思想：使用HashSet
 */
public class IsRepeatInArray {
    public boolean isRepeat(int[] arr){
        boolean flag = false;
        Set<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++){
            flag = hashSet.add(arr[i]);
            if (flag == false){
                return true;        //存在重复返回true
            } else {
                return false;       //不存在重复返回false
            }
        }

        return false;
    }
}
