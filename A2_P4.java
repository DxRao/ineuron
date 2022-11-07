public class A2_P4 {  
  
	// Function to merge the SubArrays of arr[] Array  
void merge(int arr[], int beg, int mid, int end)  {  
    
    int i, j, k;  
    int n1 = mid - beg + 1;    
    int n2 = end - mid;    
      
  	// Declaration of temporary Arrays 
        int LeftArr[] = new int[n1];  
        int RightArr[] = new int[n2];  
      
    // copy data to temporary arrays  
    for (i = 0; i < n1; i++) {    
    	LeftArr[i] = arr[beg + i]; 
    }
    
    for (j = 0; j < n2; j++) {    
    	RightArr[j] = arr[mid + 1 + j];
    }
      
    i = 0;    // initial index of first sub-array  
    j = 0; 	  // initial index of second sub-array   
    k = beg;  // initial index of merged sub-array  
      
    while (i < n1 && j < n2) {   
        
        if(LeftArr[i] <= RightArr[j]) { 
        	
            arr[k] = LeftArr[i];    
            i++;    
        }    
        else {   
            
            arr[k] = RightArr[j];    
            j++;    
        }    
        k++;    
    }    
    while (i < n1) {   
        
        arr[k] = LeftArr[i];    
        i++;    
        k++;    
    }    
      
    while (j < n2) {  
        
        arr[k] = RightArr[j];    
        j++;    
        k++;    
    }    
}    
  
void mergeSort(int arr[], int beg, int end) {
 
    if (beg < end) {  
      
        int mid = (beg + end) / 2;  
        mergeSort(arr, beg, mid);  
        mergeSort(arr, mid + 1, end);  
        merge(arr, beg, mid, end);  
    }  
}  
  
   // Function to print the array 
void printArray(int arr[]) { 
   
	for (int elem:arr) { 
        System.out.print(elem + " "); 
    }
}  
  
public static void main(String args[]) { 
  
    int arr[] = { 97, 65, 32, 56, 4, 71, 2, 90, 8, 88, 24, 1, 67, 89, 13 };  
    int n = arr.length;  
    A2_P4 mSort = new A2_P4();
    
    System.out.print("The order of array elements before sorting is: ");  
    mSort.printArray(arr);  
    mSort.mergeSort(arr, 0, n - 1);  
    System.out.print("\nThe order of array elements after sorting is: ");  
    mSort.printArray(arr);  
    System.out.println("");
    
	}  
 } 