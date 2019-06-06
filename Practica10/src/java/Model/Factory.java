/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Brandon
 */
public class Factory {
    
    public static Usuarios construir(char tipoUser){
        switch(tipoUser){
            case 'n': // CREA UN USUARIO DE TIPO NORMAL
                Normal userNormal = Normal.getUserNormal();
                return userNormal;
                
            case 'i': // CREA UN USUARIO DE TIPO INVITADO
                Invitado userInvitado = Invitado.getUserInvitado();
                return userInvitado;
                
            case 'a' : // CREA UN USUARIO DE TIPO ADMINISTRADOR
                Admin userAdmin = Admin.getUserAdmin();
                return userAdmin;
                
            default:
                
                return null;
        }
    }
}
