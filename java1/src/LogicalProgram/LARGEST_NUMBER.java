package LogicalProgram;

public class LARGEST_NUMBER {

	public static void main(String[] args) {
	int arr[] = {4, 7, 8, 11, 5, 6600, 720, 540,};
	
	int max = arr [0];
	for(int i=0; i<arr.length; i++) {
		
		if(arr[i]>max) {
			max =arr[i];
		}
		
	}
System.out.println("largest number present in given array:" +max);
	
	}

	}


