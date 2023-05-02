import java.util.*;

public class User {

    private String first_name;
    private String last_name;
    private String user_name;
    private String email;
    private String pass;
    private long phno;
    private final String ID;

    // Payment method pending
    private int type;

    User(String first_name,String last_name,String user_name, String email, String pass, long phno, String ID, int type){
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
        this.email = email;
        this.pass = pass;
        this.phno = phno;
        this.ID = ID;
        this.type = type;
    }

    User(){
        
    }

    void set_first_name(String first_name){
        this.first_name=first_name;
    }   
    String get_first_name(String first_name){
        return first_name;
    }
    
    void set_last_name(String last_name){
        this.last_name=last_name;
    }   
    String get_last_name(String last_name){
        return last_name;
    }
    
    void set_user_name(String user_name){
        this.user_name=user_name;
    }   
    String get_user_name(String user_name){
        return user_name;
    }

    void set_email(String email){
        this.email=email;
    }   
    String get_email(String email){
        return email;
    }

    void set_pass(String pass){
        this.pass=pass;
    }   
    String get_pass(String pass){
        return pass;
    }

    void set_phno(long phno){
        this.phno=phno;
    }   
    long get_phno(long phno){
        return phno;
    }

    void set_type(int type){
        this.type=type;
    }   
    int get_type(int type){
        return type;
    }    
}