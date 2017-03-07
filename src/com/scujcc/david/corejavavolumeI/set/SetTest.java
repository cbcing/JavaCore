package com.scujcc.david.corejavavolumeI.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by David on 3/7/17.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();    //HashSet的存储使用散列表实现
        long totalTime = 0;

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String word = in.next();
            long callTime = System.currentTimeMillis();     //public static long currentTimeMillis()
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int i = 0; i <= 20 && iter.hasNext(); i++){
            System.out.println(iter.next());
        }
        System.out.print("...");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds");
    }
}
