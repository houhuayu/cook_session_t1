package com.atguigu.servlet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestIterator {
	
	public void listTest() {
		List list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
	}
	
	public void arrayListTest() {
		List list = new ArrayList();
	}
	
	public void setTest() {
		Set<String> set = new HashSet<String>();
		set.add("dog");
		set.add("boot");
		set.add("dog");
		set.add("array");
		set.add("cell");
		set.add("dog");
		set.add("fool");
		set.add("dog");
		System.out.println(set);
		Set<String> treeSet = new TreeSet<String>(set);
		System.out.println(treeSet);
	}
	
	public void testa() {
		String str[] = new String[10];
		str[0] = "a";
		str[9] = "b";
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	public static void main(String[] args) {
		/**
		 * set 不包含重复元素 HashSet无序   treeSet有序
		 * list 有序，可以存放重复元素  arrayList 数组形式 访问快，添加，删除慢    
		 * 		   				linkedList基于链表 访问慢 添加，删除快 
		 */
//		TestIterator t = new TestIterator();
//		t.listTest();
//		t.testa();
//		t.setTest();
		Map map = new HashMap();
		Map map2 = Collections.synchronizedMap(map);
	}

}
