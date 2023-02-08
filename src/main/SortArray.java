package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArray {

	public static Integer sum(List<Integer> list) {
		int s=0;
		for(int i=0;i<list.size();i++) {
			s+=list.get(i);
		}
		return s;
	}
	public static void sortMyArray(Integer[] input) { 
		List<Integer> list=Arrays.asList(input);
		List<Integer> selected1=new ArrayList<>();
		List<Integer> selected2=new ArrayList<>();
		for(Integer i:list) {
			if(sum(selected1)<sum(selected2) && selected1.size()<=list.size()/2) {
				selected1.add(i);
			}else {
				selected2.add(i);
			}
		}
		List<Integer> list1=new ArrayList<>();
		list1.addAll(selected1);
		list1.addAll(selected2);
		System.out.println(list1);
		
		System.out.println("difference between to halfs is: "+Math.abs(sum(selected1)-sum(selected2)));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr,Collections.reverseOrder());
		sortMyArray(arr);
	}
}