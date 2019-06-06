/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import Model.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Brandon
 */
@WebServlet(name = "InicioServlet", urlPatterns = {"/InicioServlet"})
public class InicioServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            Usuarios user = (Usuarios) session.getAttribute("usuario");
            if(user!=null){
            String EquipoFav = "TeamQueso";
            Cookie[] Cookies = request.getCookies();
            if(Cookies != null){
                for(Cookie cookieTemporal: Cookies){
                    if("EquipoFav".equals(cookieTemporal.getName())){
                        EquipoFav = cookieTemporal.getValue();
                        break;
                    }
                }
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style>");
            out.println(""
                    + "ul{\n"
                    + "                display: block;\n"
                    + "                margin: 0;\n"
                    + "                padding: 0;   \n"
                    + "            }\n"
                    + "            ul li{\n"
                    + "                float: left;\n"
                    + "                display: block;\n"
                    + "            }\n"
                    + "            ul li ul{\n"
                    + "                display: none;\n"
                    + "            }\n"
                    + "            ul li:hover ul{\n"
                    + "                display: block;\n"
                    + "                \n"
                    + "            }\n"
                    + "            ul li:hover ul li{\n"
                    + "                float: none;\n"
                    + "                \n"
                    + "            }\n"
                    + "            ul li a{\n"
                    + "                text-decoration: none;\n"
                    + "                background: red;\n"
                    + "                color: black;\n"
                    + "                display: block;\n"
                    + "                padding: 15px 70px 15px 70px;\n"
                    + "                margin-top: 1px;\n"
                    + "                margin-left: 1px;\n"
                    + "                \n"
                    + "            }\n"
                    + "            ul li:hover a{\n"
                    + "                background: aquamarine;\n"
                    + "            }\n"
                    + "            h1{\n"
                    + "                color: chartreuse;\n"
                    + "                text-align: center;\n"
                    + "            }\n"
                    + "            h2{\n"
                    + "                color: white;\n"
                    + "            }\n"
                    + "            h3{\n"
                    + "                color: deeppink;\n"
                    + "            }\n"
                    + "            p{\n"
                    + "                color: white;\n"
                    + "            }"
                    + "body{\n"
                    + "		background-image: url(\"fondo.jpg\");\n"
                    + "                text-align: center;\n"
                    + "                color: white;\n"
                    + "            }");
            out.println("</style>");
            out.println("<title>Clash Royal Esports</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br><br><br><br>");
            out.println("<img src=\"BannerCRL.jpg\" alt=\"Imagen de la CRL\" width=\"1300\" height=\"350\">\n"
                    + "        <ul>\n"
                    + "            <li><a href='index.html'>Principal</a></li>\n"
                    + "            <li><a href=\"\">Participantes</a>\n"
                    + "                <ul>\n"
                    + "                    <li><a href=\"https://esports.clashroyale.com/es/europe/teams.html\" target=\"_blank\">Equipos</a></li>\n"
                    + "                </ul>\n"
                    + "            </li>\n"
                    + "            <li><a href=\"\">Partidos </a>\n"
                    + "                <ul>\n"
                    + "                    <li><a href=\"https://esports.clashroyale.com/es/europe/schedule.html\" target=\"_blank\">Resultados</a></li>\n"
                    + "                </ul>\n"
                    + "            </li>\n"
                    + "            <li><a href=\"https://esports.clashroyale.com/es/europe/about.html\" target=\"_blank\">Sobre nosotros</a></li>\n"
                    + "            <li><a href=\"https://supercell.com/en/privacy-policy/es/\" target=\"_blank\">Politicas</a></li>\n"
                    + "            <li><a href='CerrarSessionServlet'>Cerrar Sesion</a></li>\n"
                    + "        </ul>\n"
                    + "        <br><br><br><br><br><br><br>\n"
                    + "\n"
                    + "		<h1>\n"
                    + "			\n"
                    + "				Bienvenido " + user.getNombre() + " a la pagina oficial de la crl \n"
                    + "			\n"
                    + "       <br>"
                    + "Ahora podras ver los resultados de tu equipo preferido       </h1>"
                    
                    + "<h1> Usuario: " + user.getNombre() + "</h1>");
            out.println("<h1> Password: " + user.getContra() + "</h1>");
            out.println("<h1> **Recarge la pagina para actualizar**</h1>");
            out.println("<h1> Equipo Favorito de la CRL Europa: "+EquipoFav+"</h1>");     
            out.println("</body>");
            out.println("</html>");
            }else{
                response.sendRedirect("ErrorServlet");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
