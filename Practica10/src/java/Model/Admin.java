package Model;
/**
 *
 * @author Brandon
 */
public class Admin implements Usuarios {
    
    private String nombre;
    private String correo;
    private String contra;
    private String FNam;
    private static Admin admin;

    private Admin() {
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setFNam(String FNam) {
        this.FNam = FNam;
    }
    
    public void setId(int id) {
        
    }

    public void setFr(String fr) {
        
    }

    
    public void setNe(int Ne) {
    
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContra() {
        return contra;
    }

    public String getFNam() {
        return FNam;
    }
     public static Admin getUserAdmin() {
       if(admin == null){
          admin = new Admin();
       }
        return admin;
    }
     
    public void SifuncionaUser(){
        System.out.println("Si funciona el usuario admin");
    }
}
