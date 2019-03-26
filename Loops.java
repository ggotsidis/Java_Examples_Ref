package referenceAll;

public class Loops {

	public static void main(String[] args) {
		
		//for loop
		for(int i=0; i<10; i++) {
	        System.out.println("Hello World " +i); 
	    }
		
		//do while
		int sum=0;
		do {
            System.out.println("Hello"); 
            sum -= 5;
        }while(sum>0 && sum<100);
		
		//while
		int sum2=0;
		while (sum2 !=5) {
			 System.out.println("Hello"+sum2);
			
		}
		
	}
	
	
}
