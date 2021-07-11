package koneksi;
import com.mysql.jdbc.Driver;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/** 
 *
 * @author Mulya
 */
public class koneksi1 {
    private static Connection koneksi1;
    public static Connection GetConnection()throws SQLException{
        if (koneksi1==null){
            Driver driver = new Driver();
            koneksi1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginprojek1","root","");
        }
        return koneksi1;
    }
}
