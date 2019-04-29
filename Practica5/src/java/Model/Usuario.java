
package Model;
/**
 *
 * @author Brandon
 */
public class Usuario {
    private String usuario;
    private String correo;
    private String contra;
    private String FNam;

    public Usuario() {
    }

    public Usuario(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public Usuario(String usuario, String correo, String contra, String FNam) {
        this.usuario = usuario;
        this.correo = correo;
        this.contra = contra;
        this.FNam = FNam;
    } 

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getUsuario() {
        return usuario;
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
    

    
}
