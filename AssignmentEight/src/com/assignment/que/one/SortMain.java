package com.assignment.que.one;

import java.util.Comparator;

public class SortMain {

		public static void main(String[] args) {
			
			Integer arr1[]= {5,6,7,1,9,3};
			System.out.println("Before  Sort");
			for(Integer ele:arr1)
				System.out.println(ele);
			
			
			class SelectSort implements Comparator<Integer>{

				@Override
				public int compare(Integer o1, Integer o2) {
					int value=Integer.compare(o1, o2);
					return value;
				}
		
			}
				
			Comparator c=new SelectSort();
			Sort s=new Sort();
			s.selectionSort(arr1, c);
			System.out.println("After  Sort");
			for(Integer ele:arr1)
				System.out.println(ele);
		}

	}