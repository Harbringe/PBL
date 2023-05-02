import java.util.Scanner;

public class App extends User {
    App(java.lang.String first_name, java.lang.String last_name, java.lang.String user_name, java.lang.String email,
            java.lang.String pass, long phno, java.lang.String ID, int type) 
        {
            super(first_name, last_name, user_name, email, pass, phno, ID, type);
        }


    public static void Login(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name => ");
            String user_name = scanner.nextLine();

            System.out.print(" Enter password => ");
            String pass = scanner.nextLine();

        }
    }

    static User user = new User();
    public static void Registration(String name, String pass){
       
    
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print(" Enter firstName => ");
                String firstName = scanner.nextLine();
                user.set_first_name(firstName);
    
                System.out.print(" Enter lastName => ");
                String lastName = scanner.nextLine();
                user.set_last_name(lastName);
    
                System.out.print(" Enter userName => ");
                String userName = scanner.nextLine();
                user.set_user_name(userName);
    
                System.out.print(" Enter password => ");
                String password = scanner.nextLine();
                user.set_pass(password);
    
                System.out.print(" Enter emailId => ");
                String emailId = scanner.nextLine();
                user.set_email(emailId);
    
                System.out.print(" Enter phoneNo => ");
                long phoneNo = scanner.nextLong();
                user.set_phno(phoneNo);
                
                System.out.print(" Enter type => ");
                int type = scanner.nextInt();
                user.set_type(type);
            }
    }

    public static void main(String[] args){

    }
    
}
    

