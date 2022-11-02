
public class A2_P1 {

	public static void main(String[] args) {
		
		int[] arr = {3,1,8,6,7,5,9,6,2,3,5,7,0};
		
		System.out.print("Duplicate elements in the given array are: ");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					System.out.print( arr[j] + " ");					
					
				}//if
				
			}//j
			
		}//i

	}

}
