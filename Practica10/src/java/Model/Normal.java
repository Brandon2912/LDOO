
package Model;

/**
 *
 * @author Brandon
 */
public class Normal implements Usuarios {
    
    private String nombre;
    private String correo;
    private String contra;
    private String FNam;
    private static Normal usuN;
    
    private Normal(){
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
    public static Normal getUserNormal() {
       if(usuN == null){
          usuN = new Normal();
       }
        return usuN;
    }
    public void SifuncionaUser(){
        System.out.println("Si funciona el usuario normal");
    }
}