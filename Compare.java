package referenceAll;

public class Compare {

	public static void main(String[] args) {
		
		int temperature=0;
		//if statement
		if(temperature <= 0) {
            System.out.println("Ice");
        }
        else if(temperature > 0 && temperature < 100){
            System.out.println("Water");
        }
        else if(temperature > 100) {
            System.out.println("Steam");
        }
	}
	
	
	
	
	

}
