import java.util.*;

public class User {

    private String fname;
    private String lname;
    private String username;
    private String email;
    private String pass;
    private String phno;
    private final String ID;

    // Payment method pending
    private int type;

    public User(String fname, String lname, String username,String email, String pass, String phno, String ID, int type){
        this.name = fname;
        this.lname = lname;
        this.usrname = username;
        this.email = email;
        this.pass = pass;
        this.phno = phno;
        this.ID = ID;
        this.type = type;
    }

    void set_fname(String fname){
        this.fname=fname;
    }   
    String get_fname(String fname){
        return fname;
    }
    
    void set_lname(String lname){
        this.lname=lname;
    }   
    String get_lname(String lname){
        return lname;
    }
    
    void set_username(String username){
        this.username=username;
    }   
    String get_username(String username){
        return username;
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

    void set_phno(String phno){
        this.phno=phno;
    }   
    String get_phno(String phno){
        return phno;
    }

    void set_type(int type){
        this.type=type;
    }   
    int get_type(int type){
        return type;
    }    
}
