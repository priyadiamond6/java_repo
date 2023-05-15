package Array;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,3,4,5,22,2,3,4,6,7};
		
		System.out.println(arr.length);
		System.out.println();
		
		System.out.println("duplicate element in given array");
		
		for (int i=0; i<arr.length;i++){
			
			for  (int j=i+1; j<arr.length; j++) { 
								
				if (arr[i] == arr[j]) {
					
					System.out.println(arr[j]+" ");
				}
			}
		}
	}

}
