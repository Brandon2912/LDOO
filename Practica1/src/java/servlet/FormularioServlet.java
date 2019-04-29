/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Brandon
 */
@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class FormularioServlet extends HttpServlet {

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
            String usuario = request.getParameter("usuario");
            String correo = request.getParameter("correo");
            String contra = request.getParameter("contra");
            String FNam = request.getParameter("FNam");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<style>");
            out.println(
               " ul{\n" +
"                display: block;\n" +
"                margin: 0;\n" +
"                padding: 0;   \n" +
"            }\n" +
"            ul li{\n" +
"                float: left;\n" +
"                display: block;\n" +
"            }\n" +
"            ul li ul{\n" +
"                display: none;\n" +
"            }\n" +
"            ul li:hover ul{\n" +
"                display: block;\n" +
"                \n" +
"            }\n" +
"            ul li:hover ul li{\n" +
"                float: none;\n" +
"                \n" +
"            }\n" +
"            ul li a{\n" +
"                text-decoration: none;\n" +
"                background: red;\n" +
"                color: black;\n" +
"                display: block;\n" +
"                padding: 15px 87px 15px 87px;\n" +
"                margin-top: 1px;\n" +
"                margin-left: 1px;\n" +
"                \n" +
"            }\n" +
"            ul li:hover a{\n" +
"                background: aquamarine;\n" +
"            }\n" +
"            h1{\n" +
"                color: chartreuse;\n" +
"                text-align: center;\n" +
"            }\n" +
"            h2{\n" +
"                color: white;\n" +
"            }\n" +
"            h3{\n" +
"                color: deeppink;\n" +
"            }\n" +
"            p{\n" +
"                color: white;\n" +
"            }\n" +
              "body{\n" +
"		background-image: url(\"fondo.jpg\");\n" +
"                text-align: center;\n" +
"                color: white;\n" +
"            }");
            out.println("</style>");
            out.println("<head>");
            out.println("<title>Clash Royal Esports</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<img src=\"BannerCRL.jpg\" alt=\"Imagen de la CRL\" width=\"1300\" height=\"350\">\n" +
"        <ul>\n" +
"            <li><a href='index.html'>Principal</a></li>\n" +
"            <li><a href=\"\">Participantes</a>\n" +
"                <ul>\n" +
"                    <li><a href=\"https://esports.clashroyale.com/es/europe/teams.html\" target=\"_blank\">Equipos</a></li>\n" +
"                </ul>\n" +
"            </li>\n" +
"            <li><a href=\"\">Partidos </a>\n" +
"                <ul>\n" +
"                    <li><a href=\"https://esports.clashroyale.com/es/europe/schedule.html\" target=\"_blank\">Resultados</a></li>\n" +
"                </ul>\n" +
"            </li>\n" +
"            <li><a href=\"https://esports.clashroyale.com/es/europe/about.html\" target=\"_blank\">Sobre nosotros</a></li>\n" +
"            <li><a href=\"https://supercell.com/en/privacy-policy/es/\" target=\"_blank\">Politicas</a></li>\n" +
"        </ul>\n" +
"        <br><br><br><br><br><br><br>\n" +
"\n" +
"		<h1>\n" +
"			\n" +
"				BIENVENIDO A LA PAGINA OFICIAL DE LA CRL\n" +
"			\n" +
"                </h1>\n" +
"		\n" +
"        <br><br>");
            out.println("<h1> Usuario: " + usuario + "</h1>");
            out.println("<h1> Correo Electronico: " + correo + "</h1>");
            out.println("<h1> Password: " + contra + "</h1>");
            out.println("<h1> Fecha de nacimiento: " + FNam + "</h1>");
            out.println("<a href='index.html'><button>volver</button></a>");
            out.println("</body>");
            out.println("</html>");
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
