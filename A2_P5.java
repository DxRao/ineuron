public class A2_P5 { 
  
    void selection(int a[]){ // function to sort an array with selection sort.      
    
    	int i, j, small;  
          
        for (i = 0; i < a.length -1; i++){
        	
            small = i; //minimum element in an unsorted array  
              
            	for (j = i+1; j < a.length; j++){ 
            		if (a[j] < a[small]){  
            			small = j;
            		}//if            	
            	} // for j
            	
    // Swap the minimum element with the first element of array  
            int temp = a[small];  
            a[small] = a[i];  
            a[i] = temp;            
        } // for i
        
}// class
    
    void printArr(int a[]) { //function to print the array  
	
    for (int elem:a)  
    System.out.print(elem + " "); 
    
}  
  
    public static void main(String[] args) {  
    
    int a[] = { 91, 49, 4, 19, 10, 21 };  
    A2_P5 selSort = new A2_P5();  
    
    System.out.print("The order of elements before sorting the Array is: ");  
    selSort.printArr(a);  
    selSort.selection(a);  
    System.out.print("\nThe order of elements after sorting the Array is: ");  
    selSort.printArr(a);  
    System.out.println();  
    }  
}  