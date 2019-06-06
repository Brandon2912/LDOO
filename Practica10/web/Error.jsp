<%-- 
    Document   : Error
    Created on : 5/06/2019, 07:12:18 PM
    Author     : Brandon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Al Ingresar</title>
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
        <img src="BannerCRL.jpg" alt="Imagen de la CRL" width="1300" height="350">
        <ul>
            <li><a href='index.html'>Principal</a></li>
            <li><a href="">Iniciar</a>
                <ul>
                    <li><a href="Registro.html">Registrarse</a></li>
                    <li><a href="LoginNormal.html">Login Usuario Normal</a></li>
                    <li><a href="LoginInvitado.html">Login Usuario Invitado</a></li>
                    <li><a href="LoginAdmin.html">Login Usuario Administrador</a></li>
                </ul>
            </li>
            <li><a href="https://esports.clashroyale.com/es/europe/about.html" target="_blank">Sobre nosotros</a></li>
            <li><a href="https://supercell.com/en/privacy-policy/es/" target="_blank">Politicas</a></li>
        </ul>
        <br><br><br><br><br><br><br>
        <h1>Error el inicarl sesion</h1>
    </body>
</html>
