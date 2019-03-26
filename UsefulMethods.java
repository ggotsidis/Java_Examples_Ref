package referenceAll;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class UsefulMethods {

	 // kane ena variable pou tha krataei panta ena sygegkrimeno erwtima SQL
    private static final String INSERT_CUSTOMERS = "INSERT INTO dbcustomers (id, name, afm) VALUES (?,?,?);";
    
    
	public static void main(String[] args) {

        //Random Generator
		Random ran = new Random();
        ran.nextInt(100);
		
		//Call a Method
        printTime(44, 68, 62);
		
        //UpperCase
        String text = new String("this is some text");
        text.toUpperCase();
        
        //Specific length
        text.substring(5, 10);
	}

	
	    //Simple method with arguments
	    static String printTime(int hour, int minutes, int seconds) {
        hour = hour%24;
        minutes = minutes%60;
        seconds = seconds%60;
        return hour+":"+minutes+":"+seconds;
    }
	
	    //Database connection method to fetch users and populate listview
	    public ArrayList<User>selectAllUsers() {
	        ArrayList<User> users = new ArrayList<>();
	        try {
	            Connection connection = DBUtils.getConnection();
	            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	             
	            ResultSet result = statement.executeQuery("SELECT id, fname, lname, email FROM users");
	             
	            result.first();
	            while (!result.isAfterLast()) {
	                User user = new User();
	                user.setId(result.getInt("id"));
	                user.setFname(result.getString("fname"));
	                user.setLname(result.getString("lname"));
	                user.setEmail(result.getString("email"));
	                 
	                users.add(user);
	                 
	                result.next();
	            }
	            statement.close();
	            connection.close();
	             
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	         
	        return users;
	    }
	
	    //EISAGOGI NEOY PELATI SE BASH DEDOMENWN
	    public void insertCustomerToDB() throws SQLException {
	    	 
	        // prospathise na syndetheis
	        try {
	            //energopoiise tin syndesi
	            Connection connection = DButils.getConnection();
	         
	            // kane ena statement kai perna tou to SQL erwtima
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMERS);
	            // toufeka ta dedomena tou customer 
	            preparedStatement.setString(1, this.accountId);
	            preparedStatement.setString(2, this.name);
	            preparedStatement.setString(3, this.afm);
	           
	            // Debug deikse ti toufekises
	            System.out.println("PreparedStatement: "+preparedStatement);
	            
	            // enhmerwse thn vasi
	            preparedStatement.executeUpdate();
	             
	            //vgale kai ena minima epityxias
	            JOptionPane.showMessageDialog(null,"Ο Πελάτης: [" + this.name + "] με ΑΦΜ: [" + this.afm +"] και αριθμό πελάτη [" + accountId + "] καταχωρήθηκε με επιτυχία!");
	             
	             
	        } catch (SQLException e) {
	 
	            // print SQL exception information
	            printSQLException(e);
	        }
	        
	         
	           // gia melontiko error handling sto catch
	    }
	     
	    // etoimi methodos gia na mas petaksei to eidos tou message se periptosi lathous sto try
	     public static void printSQLException(SQLException ex) {
	            for (Throwable e: ex) {
	                if (e instanceof SQLException) {
	                    e.printStackTrace(System.err);
	                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                    System.err.println("Message: " + e.getMessage());
	                    Throwable t = ex.getCause();
	                    while (t != null) {
	                        System.out.println("Cause: " + t);
	                        t = t.getCause();
	                    }
	                }
	            }
	        }
	         
	    
	    
	    //RANDOMIZED VALUES
	    protected String generateCustomerId() {
	         
	        String characters = "ELGR1234567890";
	         
	        StringBuilder randomized = new StringBuilder();
	         
	        Random rnd = new Random();
	         
	        while (randomized.length() < 20) { 
	            int index = (int) (rnd.nextFloat() * characters.length());
	            randomized.append(characters.charAt(index));
	        }
	         
	        String readyRandomString = randomized.toString();
	        return readyRandomString;
	 
	    }
	
}
