import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class StudentDAO {
    Connection con;
    StudentDAO() throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";
        con = DriverManager.getConnection(url, user, password);
    }
    public void insertStudent(int id, String name, int age) throws Exception {
        String query = "INSERT INTO students(id,name,age) VALUES(?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.executeUpdate();
        System.out.println("Student Inserted");
    }
    public void updateStudent(int id, int age) throws Exception {
        String query = "UPDATE students SET age=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, age);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Student Updated");
    }
}
public class Ex_32_JDBCInsertUpdate {
    public static void main(String[] args) {
        try {
            StudentDAO dao = new StudentDAO();
            dao.insertStudent(101, "Riya", 21);
            dao.updateStudent(101, 22);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}