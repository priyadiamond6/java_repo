package Array;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,5,7,3,4,5};
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++ ) {
			
			sum = sum+arr[i];
			
			//1
			//3
			//6
			//11
			//18
			//21
			//25
			//30
			
			System.out.println(sum);
			
		}
		 System.out.println();
		System.out.println("Sum of all the element : "+sum);
	}

}
