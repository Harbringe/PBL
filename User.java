import java.util.*;

public class User {

<<<<<<< HEAD
    private String first_name;
    private String last_name;
    private String user_name;
=======
    private String fname;
    private String lname;
    private String username;
>>>>>>> b18f62e05276cffb02bf50e979d8ae19a05a240d
    private String email;
    private String pass;
    private long phno;
    private final String ID;

    // Payment method pending
    private int type;

<<<<<<< HEAD
    User(String first_name,String last_name,String user_name, String email, String pass, long phno, String ID, int type){
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
=======
    public User(String fname, String lname, String username,String email, String pass, String phno, String ID, int type){
        this.name = fname;
        this.lname = lname;
        this.usrname = username;
>>>>>>> b18f62e05276cffb02bf50e979d8ae19a05a240d
        this.email = email;
        this.pass = pass;
        this.phno = phno;
        this.ID = ID;
        this.type = type;
    }

<<<<<<< HEAD
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
=======
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

>>>>>>> b18f62e05276cffb02bf50e979d8ae19a05a240d

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

<<<<<<< HEAD
    void set_phno(long phno){
        this.phno=phno;
    }   
    long get_phno(long phno){
=======
    void set_phno(String phno){
        this.phno=phno;
    }   
    String get_phno(String phno){
>>>>>>> b18f62e05276cffb02bf50e979d8ae19a05a240d
        return phno;
    }

    void set_type(int type){
        this.type=type;
    }   
    int get_type(int type){
        return type;
    }    
}
