import java.util.*;

public class User {
    
    public String yourName ;
    
    protected String emailId ;
    protected String passWord ;
    
    protected String yourContact = null;
    public String vehicleType ;
    
    protected String uniqueId = null;
    
    
        public void getInfo() {
            Scanner scn = new Scanner(System.in);
            
            System.out.println("Enter your Name: ");
            yourName=scn.nextLine();

            System.out.println("Enter your email.id: ");
            emailId = scn.next();

            System.out.println("Enter your password: ");
            passWord=scn.next();

            System.out.println("Enter your contact information: ");
            yourContact=scn.next();

            System.out.println("Enter your vehicle type: ");
            vehicleType=scn.next();

            System.out.println("Enter the unique ID sent to you: ");
            uniqueId=scn.next();

            scn.close(); 

    }
    public static void main(String[] args) {   
        
        User u1=new User();
        System.out.println("Please Enter your details: ");
        u1.getInfo();
}
}
