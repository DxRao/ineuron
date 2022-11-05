class Subset{
		static boolean isSubset(int arr[], int substring[]) {    
        
        int j = 0;
        
        for (int i = 0; i < substring.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (substring[i] == arr[j])
                    break;
            }//for j
 
            if (j == arr.length)
            	return false;
        }//for i
 
        return true;
        
    } //isSubset method 
}// Subset class

public class A2_P6 {	

	public static void main(String[] args) {
		
		int arr[] = { 45,67,23,5,8,0,1,99,10,79,22 };
        int substring[] = { 0,1,5,10,23,99,22};        
 
        if (Subset.isSubset(arr, substring))
            System.out.print("substring[] is a subset of arr[] ");
        else
            System.out.print("substring[] is not a subset of arr[] ");
	}
}



