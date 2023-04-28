import java.util.*;

public class User {

    private String name;
    private String email;
    private String pass;
    private String phno;
    private final String ID;

    // Payment method pending
    private int type;

    User(String name, String email, String pass, String phno, String ID, int type){
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.phno = phno;
        this.ID = ID;
        this.type = type;
    }

    void setname(String name){
        this.name=name;
    }   
    String getname(String name){
        return name;
    }

    void setemail(String email){
        this.email=email;
    }   
    String getemail(String email){
        return email;
    }

    void setpass(String pass){
        this.pass=pass;
    }   
    String getpass(String pass){
        return pass;
    }

    void setphno(String phno){
        this.phno=phno;
    }   
    String getphno(String phno){
        return phno;
    }

    void settype(int type){
        this.type=type;
    }   
    int gettype(int type){
        return type;
    }    
}