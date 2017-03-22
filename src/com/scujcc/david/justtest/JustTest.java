package com.scujcc.david.justtest;

import java.util.Scanner;

/**
 * Created by David on 17/3/4.
 */
public class JustTest {
    public static void main(String[] args) {
        int[] time = new int[]{0,0};
        int[] detailTime = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入出发时间：");
        time[0] = scanner.nextInt();
        while(time[0] < 0 || time[0] > 2359){
            System.out.println("请重新输入出发时间:");
            time[0] = scanner.nextInt();
        }
        System.out.println("请输入到达时间：");
        time[1] = scanner.nextInt();
        while(time[1] < 0 || time[1] > 2359){
            System.out.println("请重新输入到达时间:");
            time[1] = scanner.nextInt();
        }

        detailTime = new int[]{time[0]/100, time[0]%100, time[1]/100, time[1]%100};

        System.out.println("出发时间： " + detailTime[0] + ":" + detailTime[1]);
        System.out.println("到达时间： " + detailTime[2] + ":" + detailTime[3]);
        System.out.println("共计时间： " + (detailTime[2] - detailTime[0]) + ":" + (detailTime[3] - detailTime[1]));

    }
}
