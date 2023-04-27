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



}
