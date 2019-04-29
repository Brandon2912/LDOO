<%-- 
    Document   : Formulario
    Created on : 26/04/2019, 10:07:01 PM
    Author     : Brandon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clash Royal Esports</title>
    
        <style> 
            ul{
                display: block;
                margin: 0;
                padding: 0;   
            }
            ul li{
                float: left;
                display: block;
            }
            ul li ul{
                display: none;
            }
            ul li:hover ul{
                display: block;
                
            }
            ul li:hover ul li{
                float: none;
                
            }
            ul li a{
                text-decoration: none;
                background: red;
                color: black;
                display: block;
                padding: 15px 87px 15px 87px;
                margin-top: 1px;
                margin-left: 1px;
                
            }
            ul li:hover a{
                background: aquamarine;
            }
            h1{
                color: chartreuse;
                text-align: center;
            }
            h2{
                color: white;
            }
            h3{
                color: deeppink;
            }
            p{
                color: white;
            }
            body{
		background-image: url("fondo.jpg");
            }
           	
        </style>
    </head>
    <body>
        <% 
            String usuario = request.getParameter("usuario");
            String correo = request.getParameter("correo");
            String contra = request.getParameter("contra");
            String FNam = request.getParameter("FNam");        
        
        %>
        <img src="BannerCRL.jpg" alt="Imagen de la CRL" width="1300" height="350">
        <ul>
            <li><a href='index.html'>Principal</a></li>
            <li><a href="">Participantes</a>
                <ul>
                    <li><a href="https://esports.clashroyale.com/es/europe/teams.html" target="_blank">Equipos</a></li>
                </ul>
            </li>
            <li><a href="">Partidos </a>
                <ul>
                    <li><a href="https://esports.clashroyale.com/es/europe/schedule.html" target="_blank">Resultados</a></li>
                </ul>
            </li>
            <li><a href="https://esports.clashroyale.com/es/europe/about.html" target="_blank">Sobre nosotros</a></li>
            <li><a href="https://supercell.com/en/privacy-policy/es/" target="_blank">Politicas</a></li>
        </ul>
        <br><br><br><br><br><br><br>

		<h1>
			
				BIENVENIDO A LA PAGINA OFICIAL DE LA CRL
			
                </h1>
		
        <br><br>
        <h1> Usuario: <%=usuario %> </h1>
        <h1> Correo Electronico: <%=correo%> </h1>
        <h1> Password:  <%=contra%> </h1>
        <h1> Fecha de nacimiento:  <%=FNam %> </h1>
        <a href='index.html'><button><center>volver</center></button></a>
    </body>
</html>
