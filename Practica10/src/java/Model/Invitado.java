package Model;
/**
 *
 * @author Brandon
 */
public class Invitado implements Usuarios{
    
    private String nombre;
    private String correo;
    private String contra;
    private String FNam;
    private String Fr;
    private int id;
    private static Invitado invitado;

    private Invitado() {
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
        this.id = id;
    }

    public void setFr(String Fr) {
        this.Fr = Fr;
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
     public static Invitado getUserInvitado() {
       if(invitado == null){
          invitado = new Invitado();
       }
        return invitado;
    }
     
    public void SifuncionaUser(){
        System.out.println("Si funciona el usuario invitado");
    }
}
