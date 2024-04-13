package com.assignment.que.one;

import java.util.Comparator;

public class Sort {

	public static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				if (c.compare(arr[j], arr[i]) < 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
		}
	}


}
