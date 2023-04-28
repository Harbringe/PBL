public class Admin extends User {
    private String adminID;
    private String adminpass;

    public Admin(String name, String email, String pass,String phno,String adminID,String adminpass){
        this.name=name;
        this.email=email;
        this.pass=pass;
        this.phno=phno;
        this.adminID=adminID;
        this.adminpass=adminpass;
    }

    public void set_adminID(String adminID) {
        this.adminID=adminID;
    }
    public String get_adminID(String adminID) {
        return adminID;
    }

    public void set_adminPass(String adminPass) {
        this.adminPass=adminPass;
    }
    public String get_adminPass(String adminPass) {
        return adminPass;
    }
}
