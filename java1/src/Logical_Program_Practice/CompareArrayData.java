package Logical_Program_Practice;

import java.util.Arrays;

public class CompareArrayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {23, 60, 45};
		int arr2[] = {45, 20, 91};
		int arr3[] = {23, 60, 45};
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr2, arr3));
		System.out.println(Arrays.equals(arr3, arr1));
	}

}
