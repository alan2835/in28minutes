package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
	SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
		
		// TODO Auto-generated constructor stub
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
	
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//Bubble Sort Algorithm
		//Quick Sort Algorithm
		
		return 3; //return index
	}
}
