package com.csgso;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int array[] = { 12, 2, 14, 3, 4, 16, 7, 10, 15 };

		// int array[] = {2, 3, 4, 7, 10, 12, 14, 15, 16};

		BubbleSortDemo bubbleSort = new BubbleSortDemo();
		bubbleSort.bubbleSortArray(array);
		System.out.println("DONE");

	}

	public void bubbleSortArray(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {

			boolean isSortedArray = true;

			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j] > array[j + 1]) {
					isSortedArray = false;
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
			if (isSortedArray) {
				break;
			}
		}
		System.out.println("===Using Arrays.toString Method=====");
		System.out.println(Arrays.toString(array));

		System.out.println("\n====Using Java8 Feture========");
		Arrays.stream(array).forEach(p -> System.out.println(p));

		System.out.println("\n====Using ForEach Loop======");
		for (int n = 0; n < array.length; n++) {
			System.out.println(array[n]);
		}

	}

}
