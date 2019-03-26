package referenceAll;

import javax.swing.JOptionPane;

public class Main {
        
	    //Colors (H consola tou eclipse den dexetai xromata, mono gia consol ton windows
	    public static final String ANSI_RED = "\u001B[31m";
	    public static final String ANSI_GREEN = "\u001B[32m";
	    public static final String ANSI_YELLOW = "\u001B[33m";
	    public static final String ANSI_BLUE = "\u001B[34m";
	    
	public static void main(String[] args) {
		
		//Variables
		byte b = 8;
        short s = 16;
        int i = 32;
        long l = 64;
        float f = 3.14f;
        double d = 3.1415;
        char c = 'c';
        boolean bool = true;
        final double PI = 3.1415; 
         
      
		//System in/out
        System.out.println(b);
        int option = Integer.valueOf(JOptionPane.showInputDialog("Give me a number:"));
        JOptionPane.showMessageDialog(null, "One");
        JOptionPane.showInputDialog("More Products (Yes/No)");
		
		
		

	}

}
