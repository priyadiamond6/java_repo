package Array;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {55,2244,300,234};// 0=55, 1=2244, 2=300, 3=234
		
		int Maximum = arr[0];
		   // Maximum = 55		
		          //0<4  - true // 4 is length of array
		          //1<4   -true
		          //2<4  -true
		          //3<4  -true
		          //4<4  - false
		System.out.println(arr.length);
		
		System.out.println();
		
		for(int i=0 ;i<arr.length;i++) {
			
			    //55>55   - false
			    //2244>55 - True
			    //300>2244  -false
			    //234>2244   -false
			if(arr[i]>Maximum) {
				
				Maximum = arr[i];
			//Maximun = 2244
			}
		}
		System.out.println("Largest number in given array is : "+Maximum);
		
	}


	}


