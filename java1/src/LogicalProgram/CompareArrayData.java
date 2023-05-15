package LogicalProgram;

import java.util.Arrays;

public class CompareArrayData {

	public static void main(String[] args) {

	int arr1[] = {90, 30, 60};
	
	int arr2[] = {60, 10, 40};
	
	int arr3[] = {90, 30, 60};
	
	System.out.println(Arrays.equals(arr1, arr3));
	
	System.out.println(Arrays.equals(arr2, arr3));
	
	System.out.println(Arrays.equals(arr1, arr2));
	
	

	}

}
