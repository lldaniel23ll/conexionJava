package formulario;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conetar {
    private Connection conn=null;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="";
    private static final String url="jdbc:mysql//localhost:3306/pruebas";

    public Conetar() {
        try{
            Class.forName(url);
            conn =(Connection) DriverManager.getConnection(url, user, password);
            if (conn!=null) {
                System.out.println("Conexion establecida...");
                JOptionPane.showMessageDialog(null, "Conexion establecida...");
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectar","Error",0);
            
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconetar(){
        conn=null;
        if (conn==null) {
            System.out.println("Conexion no establecida");
            JOptionPane.showMessageDialog(null, "Conexion desconectada");
        }
    }
    
}
