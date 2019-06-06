/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Brandon
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String a=request.getParameter("opcion");
            String tipoUser = request.getParameter("tipoUser");
            
            if(a!=null){
               
                if(a.equals("Registro")){
                    String usuario = request.getParameter("usuario");
                    String correo = request.getParameter("correo");
                    String contra = request.getParameter("contra");
                    String FNam = request.getParameter("FNam");
                    Usuario user =  Usuario.getUser();
                    user.setUsuario(usuario);
                    user.setCorreo(correo);
                    user.setContra(contra);
                    user.setFNam(FNam);
                    Conexion conexion = new Conexion();
                    conexion.insertar(usuario, correo, contra, FNam);
                    HttpSession session = request.getSession();
                    session.setAttribute("usuario", user);
                    response.sendRedirect("logeado.jsp");
                }      
                
                if(tipoUser.equals("Normal")){
                    String nombre = request.getParameter("nombre");
                    String contra = request.getParameter("contra");
                    String EquipoFav = request.getParameter("EquipoFav");
                            Usuarios user = Factory.construir('n');
                            user.setNombre(nombre);
                            user.setContra(contra);
                            user.SifuncionaUser();
                            Conexion conexion = new Conexion();
                            String verificar = conexion.ConsultaNombreNORMAL(nombre, contra);
                                if(nombre.equals(verificar)){
                                    HttpSession session = request.getSession();
                                    session.setAttribute("usuario", user);
                                    Cookie EFavCookie = new Cookie("EquipoFav", EquipoFav);
                                    EFavCookie.setMaxAge(365*24*60*60);
                                    response.addCookie(EFavCookie);

                                    response.sendRedirect("logeado.jsp");
                                    }else{
                                response.sendRedirect("Error.jsp");
                        }
                }
                
                 if(tipoUser.equals("Invitado")){
                    String ids = request.getParameter("ID");
                    int id = parseInt(ids);
                    String nombre = request.getParameter("nombre");
                    String FR = request.getParameter("FR");
                    String EquipoFav = request.getParameter("EquipoFav");
                    Usuarios user = Factory.construir('i');
                    user.setNombre(nombre);
                    user.setId(id);
                    user.setFr(FR);
                    user.SifuncionaUser();
                    Conexion conexion = new Conexion();
                    String verificar = conexion.ConsultaNombreUSERINVITADO(id, nombre, FR);
                     if(nombre.equals(verificar)){
                                    HttpSession session = request.getSession();
                                    session.setAttribute("usuario", user);
                                    Cookie EFavCookie = new Cookie("EquipoFav", EquipoFav);
                                    EFavCookie.setMaxAge(365*24*60*60);
                                    response.addCookie(EFavCookie);

                                    response.sendRedirect("logeado.jsp");
                                    }else{
                                response.sendRedirect("Error.jsp");
                        }
                }
                if(tipoUser.equals("Admin")){
                    String nombre = request.getParameter("nombre");
                    String Nes = request.getParameter("NE");
                    int Ne =  parseInt(Nes);
                    String Ids = request.getParameter("ID");
                    int id =  parseInt(Ids);
                    String EquipoFav = request.getParameter("EquipoFav");
                    Usuarios user = Factory.construir('a');
                    user.setNombre(nombre);
                    user.setNe(Ne);
                    user.setId(id);
                    user.SifuncionaUser();
                    Conexion conexion = new Conexion();
                    String verificar = conexion.ConsultaNombreUSUARIOADMIN( id, Ne, nombre);
                     if(nombre.equals(verificar)){
                                    HttpSession session = request.getSession();
                                    session.setAttribute("usuario", user);
                                    Cookie EFavCookie = new Cookie("EquipoFav", EquipoFav);
                                    EFavCookie.setMaxAge(365*24*60*60);
                                    response.addCookie(EFavCookie);

                                    response.sendRedirect("logeado.jsp");
                                    }else{
                                response.sendRedirect("Error.jsp");
                        }
                }
                
            }else{
                response.sendRedirect("Error.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
