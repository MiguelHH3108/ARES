
package ares;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author herna
 */
public class Conexion {
    public static Connection CDB(){
        Connection con = null;
        String url = "jdbc:postgresql://localhost:5432/ares";
        String user = "postgres";
        String pass = "12345";
        
        try {
            con = DriverManager.getConnection(url,user,pass);
            
            if(con != null){
                System.out.println("Conexión correcta");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo en la conexión"
                ,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return con;
    }
}