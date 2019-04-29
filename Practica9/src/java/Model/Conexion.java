package Model;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Brandon
 */

public class Conexion {
    
    private static Connection conexion;

    public Conexion() {
    }
    
    
    public static Connection abrirConexion() throws SQLException{
        
        String bdURL = "jdbc:derby://localhost:1527/Usuarios";
        String username = "brandon";
        String password = "brandon";
        conexion = DriverManager.getConnection(bdURL, username, password);
     return conexion;
    }
    
    public static Connection cerrarConexion() throws SQLException{
         
        conexion.close();
        return conexion;
    }
    
    public static Connection insertar (String nombre,String correo, String contra,String fecha){
       try{
        abrirConexion();
        String sql;
        sql = "insert into Usuarios values ('"+ nombre +"' ,  '"+ correo +"' , '"+ contra +"' , '"+ fecha +"')";
        
        Statement stmt = conexion.createStatement();
        stmt.executeUpdate(sql);
        cerrarConexion();
        
        }catch(SQLException e){
            
        }
       return conexion;
    }
    
        public static String ConsultaNombre(String nombre,String contraseña) throws SQLException{
            
            String sql = "SELECT * FROM BRANDON.USUARIOS  WHERE Usuario = '"+ nombre +"' AND Contraseña = '"+ contraseña+"'";
            String info = "";
            Connection c= abrirConexion();
            Statement a = c.createStatement();
            ResultSet respuesta = a.executeQuery(sql);
            while(respuesta.next()){
                    info = respuesta.getString("usuario");
            }
            return info;
        }
}
