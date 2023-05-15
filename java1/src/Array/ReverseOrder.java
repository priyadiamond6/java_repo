package Array;

public class ReverseOrder {

	

		public static void main(String[] args) {

			
			int arr [] = {2,4,5,7,3,45,66}; // length = 7
			
			System.out.println("Original Array");
			
			System.out.println();
			
			for(int i= 0 ;i<arr.length;i++) {
				
				System.out.print(arr[i]+" ");
		
			}
			
		
			System.out.println();
			
			System.out.println("Reverse Array");
			System.out.println();
			for(int j=arr.length-1;j>=0;j--) {
				
				System.out.print(arr[j]+" ");
			}
		}

	}
