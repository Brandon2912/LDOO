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
        
        String bdURL = "jdbc:derby://localhost:1527/TipoDeUsuarios";
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
        sql = "insert into BRANDON.USERNORMAL values ('"+ nombre +"' ,  '"+ correo +"' , '"+ contra +"' , '"+ fecha +"')";
        
        Statement stmt = conexion.createStatement();
        stmt.executeUpdate(sql);
        cerrarConexion();
        
        }catch(SQLException e){
            
        }
       return conexion;
    }
    
        public static String ConsultaNombreNORMAL(String nombre, String contraseña) throws SQLException{
            
            String sql = "SELECT * FROM BRANDON.USERNORMAL WHERE Nombre = '"+ nombre +"' AND Contra = '"+ contraseña+"'";
            String info = null;
            Connection c= abrirConexion();
            Statement a = c.createStatement();
            ResultSet respuesta = a.executeQuery(sql);
            while(respuesta.next()){
                    info = respuesta.getString("nombre");
            }
            return info;
        }
        public static String ConsultaNombreUSERINVITADO(int id, String nombre, String FR) throws SQLException{
            
            String sql = "SELECT * FROM BRANDON.USERINVITADOS WHERE ID_USER = '"+ id +" Nombre = '"+ nombre +"' AND FRegistro= '"+ FR +"'";
            String info = null;
            Connection c= abrirConexion();
            Statement a = c.createStatement();
            ResultSet respuesta = a.executeQuery(sql);
            while(respuesta.next()){
                    info = respuesta.getString("Nombre");
            }
            return info;
        }
        public static String ConsultaNombreUSUARIOADMIN(int id, int ne, String nombre) throws SQLException{
            
            String sql = "SELECT * FROM BRANDON.USERADMIN WHERE ID_USER = '"+ id +"' AND NE = '"+ ne+"' AND Nombre = '"+ nombre+"'";
            String info = null;
            Connection c= abrirConexion();
            Statement a = c.createStatement();
            ResultSet respuesta = a.executeQuery(sql);
            while(respuesta.next()){
                    info = respuesta.getString("Nombre");
            }
            return info;
        }
        
        /*
        public static String ConsultatipoUsuario(String nombre,String contraseña, String TipoUsuario) throws SQLException{
            
            String sql = "SELECT * FROM BRANDON.USUARIOS  WHERE Usuario = '"+ nombre +"' AND Contraseña = '"+ contraseña+"' AND TipoUsuario = '"+ TipoUsuario+"'";
            String info = "";
            Connection c= abrirConexion();
            Statement a = c.createStatement();
            ResultSet respuesta = a.executeQuery(sql);
            while(respuesta.next()){
                    info = respuesta.getString("TipoUsuario");
            }
            return info;
        }
        */
}
