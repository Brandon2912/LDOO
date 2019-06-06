
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
    private static Usuario user;

    private Usuario() {
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

    public static Usuario getUser() {
       if(user == null){
          user = new Usuario();
       }
        return user;
    }
}

