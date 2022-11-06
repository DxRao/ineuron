public class A2_P2 {
  
    /* function that consider last element as pivot,place the last element at its exact position, and place  
	smaller elements to left of last element and greater elements to right of last element.  */
	
int partition (int arr[], int start, int end)  {
  
    int lastElem = arr[end]; // last element declaration  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++){  
     
        // If current element is smaller than the last element  
        if (arr[j] < lastElem)  {
          
            i++; // increment index of smaller element  
            int temp = arr[i];  
            arr[i] = arr[j];  
            arr[j] = temp;  
        }// if  
    } // for 
    
    int temp = arr[i+1];  
    arr[i+1] = arr[end];  
    arr[end] = temp;  
    return (i + 1);
    
} // end of method 
  
	// function to implement quick sort  
void quick(int arr[], int start, int end){ // start = Starting index, end = Ending index
  
    if (start < end) { 
      
        int p = partition(arr, start, end);  //p is partitioning index  
        quick(arr, start, p - 1);  
        quick(arr, p + 1, end); 
        
    }  
}  
  
  // function to print an array  
void printArr(int arr[]) { 
      
    for (int elem:arr)  
        System.out.print(elem + " "); 
    
}  
    public static void main(String[] args) {  
    int arr[] = { 34, 5, 78, 2, 45,21, 56, 99, 61, 6 };  
    int n = arr.length;
    A2_P2 qSort = new A2_P2();  
    
    System.out.print("The order of elements before sorting the Array is: ");     
    qSort.printArr(arr);  
    qSort.quick(arr, 0, n - 1);  
    System.out.print("\nThe order of elements after sorting the Array is: ");  
    qSort.printArr(arr);  
    System.out.println();  
    }  
}  