<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
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
        <center>
		<h1>
			
				BIENVENIDO A LA PAGINA OFICIAL DE LA CRL
			
                </h1>
		
        <br><br>
        <br><br>
        <img id="CRL" src="CRL_Blanco.png" style="width:100px">
        <br>
        <button onclick="document.getElementById('CRL').src='CRL_Azul.jpg'">Cambiar Imagen Fondo Azul</button>
        <button onclick="document.getElementById('CRL').src='CRL_Blanco.png'">Cambiar Imagen Sin Fondo</button>    
        <br>
        <h2>
           ¿Que es la CRL?
        </h2>
        <p>
            La Clash royal league(CRL) es la liga por equipos oficial de Clash Royale.
            
        </p>
        <h2>
           ¿Cual es la edad minima para poder competir en la CRL?
        </h2>
        <p>
           Los participantes deberan tener mas de 16 años, a partir de marzo de 2019.
        </p>
        <h2>
           ¿El camino hacia la CRL - Que probabilidad tengo de unirme a un equipo de la CRL si consigo las 20 victorias ?
        </h2>
        <p>
            
           Conseguir las 20 victorias te dara acceso a la siguiente fase-clasificatorias online.
           los ganadores del desafio recibiran mas informacion sobre las clasificaciones online de la crl en su buzon 
           (lo puedes encontrar en la esquina superior izquierda de la pantalla  principal del juego, dentro del perfil de jugador).
           los equipos de la CRL estaran muy atentos durante toda la fase clasificatoria, 
           ¡asi que concentrate y da tú mejor esfuerzo!
            
        </p>
        <br><br>
        <h1>REGISTRATE PARA ENTERARTE DE TODAS LAS NOVEDADES</h1>
        <form action="ver.htm" method="Post"> 
            <center>
                <h2>Usuario:</h2>
            <input type="text" name="usuario">
            <br>
            <br>
            <h2>Correo:</h2>
            <input type="email" name="correo">
            <br>
            <br>
            <h2>Contraseña: </h2>
            <input type="password" name="contra">
            <br>
            <br>
            <h2>Fecha de Nacimiento:</h2>
            <input type="date" name="FNam" min="1930-03-01" max="2013-02-28">
            <br>
            <br> 
            <h2>Escribe tu opinion sobre la CRL (opcional)</h2>
            <textarea>
                
            </textarea>
            <br>
            <input type="submit" value="enviar">
            <input type="reset" value="borrar">
            <input type="hidden">
            </center>
        </form>
        </center>
        <br><br><br><br><br><br><br><br><br><br><br><br><br>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
    </body>
</html>
