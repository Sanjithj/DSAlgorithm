package com.bridgelabz;

public class Sort {
	public static void selectionSort(String[] arr) {
		 for (int i = 0; i < arr.length - 1; ++i) {
		 int minIndex = i;
		 for (int j = i+1; j < arr.length; ++j) {
		 if (arr[j].compareTo(arr[minIndex])<0) {
		 minIndex = j;
		 }
		 }
		 String temp = arr[i];
		 arr[i] = arr[minIndex];
		 arr[minIndex] = temp; 
		 }
	}
}
