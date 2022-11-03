public class A2_P3_Version1 {
	public static void main(String[] args) {
		int[] arr = {30,4,5,1,6,7,8,9,10,25,12,13,14,2,35,16,17,18,19,20}; // Sorting order: 1 2 3 4 .....30 35
		
		for(int i =0; i < arr.length; i++)		
			for(int j=i+1; j < arr.length; j++) 
				if(arr[i] > arr[j]){			
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		
		System.out.print("Order of elements in ascending order in the sorted array: ");
		
		for(int x =0; x<arr.length; x++) {
			System.out.print(arr[x]+" ");
			}
	}
}
	
