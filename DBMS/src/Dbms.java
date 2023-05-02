import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement; 
import java.sql.PreparedStatement;

public class Dbms {

    public void update(User user, PreparedStatement statement, Connection con){
        
        try {
            String sql = "INSERT INTO table_name (id, fname, lname, email, password, phno, type, username) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);
            statement.setString(1, user.get_id());
            statement.setString(2, user.get_fname());
            statement.setString(3, user.get_lname());
            statement.setString(4, user.get_email());
            statement.setString(5, user.get_pass());
            statement.setString(6, user.get_phno());
            statement.setInt(7, user.get_type());
            statement.setString(8, user.get_username());
            statement.executeUpdate();
            System.out.println("Record created.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
    }  

    public void delete(User user, PreparedStatement statement, Connection con){
        try{     
            String sql = "DELETE FROM users WHERE id = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, user.get_id());
            statement.executeUpdate();
            System.out.println("Record deleted successfully.");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public User read(String id, Connection con){
        String SELECT_USER_BY_ID = "SELECT * FROM your-table-name WHERE ID = ?";

        User user = null;
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_USER_BY_ID)) {
            preparedStatement.setString(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    user = new User(null, null, null, null, null, null, null, -1);
                    user.set_fname(resultSet.getString("fname"));
                    user.set_lname(resultSet.getString("lname"));
                    user.set_username(resultSet.getString("username"));
                    user.set_email(resultSet.getString("email"));
                    user.set_pass(resultSet.getString("pass"));
                    user.set_phno(resultSet.getString("phno"));
                    user.set_id(resultSet.getString("id"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;    
    } 

    public void display(String id, Connection con){
        User user = read(id, con);
        System.out.println("ID: " + user.get_id());
        System.out.println("Email: " + user.get_email());
        System.out.println("First name: " + user.get_fname());
        System.out.println("Last name: " + user.get_lname());
        System.out.println("Username: " + user.get_username());
        System.out.println("Password: " + user.get_pass());
        System.out.println("Phone number: " + user.get_phno());
        System.out.println("Account type: " + user.get_type());
    }

    public void dbm(String[] args) throws SQLException {
    
        String url = "jdbc:mysql://localhost:3306/..."; 
        String uname = "YOUR_USERNAME_HERE";
        String pass = "YOUR_PASSWORD_HERE";
        String query = "SELECT * FROM users";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{

            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);

            if (!result.next()) {
                System.out.println("No data");
            } else {
                do {
                    String data = "";
                    for (int i = 1; i < 5; i++) {
                        data += result.getString(i) + " | ";
                    }
                    System.out.println(data);
                } while (result.next());
            }

        }catch(SQLException e){
            e.printStackTrace();
        }   

    }
}
