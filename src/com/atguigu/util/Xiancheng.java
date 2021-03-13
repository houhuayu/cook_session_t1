package com.atguigu.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Xiancheng {
	static HashMap<Integer, Integer> table2 = new HashMap<>();
//    static Hashtable<Integer, Integer> table = new Hashtable<>();
//	Map<Integer, Integer> table = Collections.synchronizeMap(table2);
    //分别在两个子线程内对hashtable进行put,get操作
    public static void main(String[] args) {
    	Map<Integer, Integer> table = Collections.synchronizedMap(table2);
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("线程1执行");
                for (int i = 0; i < 1000; i++) {
                    table.put(i,i);
                    System.out.println("线程1---------" + table.get(500));
                }
                System.out.println("线程1---------" + table.get(500));
            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("线程2执行");
                for (int i = 1000; i < 2000; i++) {
                    table.put(i, i);
                }
                System.out.println("线程2---------" + table.get(1500));
            }
        }).start();
    }
}
