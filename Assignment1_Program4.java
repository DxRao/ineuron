
public class Assignment1_Program4 {

	public static void main(String[] args) {
		
		int n =14;
		for(int i = 0; i< n; i++) { 
			for(int j = 0; j < n; j++){
				// I
				if(  i-j >= (n-1)/2 ||  i+j >=  (n-1) +(n-1)/2){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
			}//j loop		
		
		System.out.println();
		}// for loop		

	}

}
