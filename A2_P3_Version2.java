
public class A2_P3_Version2 {

	public static void main(String[] args) {
		
		int[] arr = {30,4,5,1,6,7,8,9,10,25,12,13,14,2,35,16,17,18,19,20}; // Sorting order: 1 2 3 4 .....30 35
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 1; j < arr.length-i; j++) {
				
				if(arr[j] < arr[j-1]) {
					
					int temp;
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				
				}//if
				
			}//j
			
		}//i
			System.out.print("Order of elements after sorting in ascending order: ");
			
			for (int elem : arr) {
				
				System.out.print(elem + " ");				
			}
	}
}
