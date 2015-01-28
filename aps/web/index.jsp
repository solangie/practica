<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link rel="stylesheet" type="text/css" href="Fase 3 APS\Español\css/Formularios.css"    
<script src="Fase 3 APS\Español\jquery/lib/jquery.js"></script>
	<link rel="icon" type="favicon.ico" href="Fase 3 APS\Español\imagenes/logo.png" >
	<script src="Fase 3 APS\Español\jquery/dist/jquery.validate.js"></script>
    <script src="Fase 3 APS\Español\jquery/dist/additional-methods.js"></script>
<!-- InstanceBegin template="../../Documents/CSS/Templates/usuario.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>APS Ingresar</title>
<!-- InstanceEndEditable -->
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
</head>

 <body>
<!-- InstanceBeginEditable name="EditRegion3" -->
<div id="texto">ACTIVITIES  OF  THE  POLICE  SYSTEM</div>
<div id="logo">
<img src="Fase 3 APS\Español\imagenes/logo.png" width="100px" height="100px" alt="logo"/>
</div>
 </table><img src="Fase 3 APS\Español\imagenes/linea.png" width="999" height="20" alt="linea" /></td>
    <div id="menu">Ingresar</div>
<div id="contenido">
    <form id="miFormulario" method="post" action="controlador">
            
            <label for="email">Correo:</label>
            <input id="email" type="email" name="email" class="mensaje" placeholder="ejemplo@gmail.com" maxlength="30" tabindex="1" required/>
           
            <label for="clave">Contraseña:</label>
            <input type="password" name="clave" id="clave" placeholder="abc1983" maxlength="16" tabindex="2" required/>
            
			<button type="submit" style="font-weight: bold;">Ingresar</button>
    
                        <p><a href="registro.jsp">Registrarse</a></p>
            
    
    </form>
</div>
<div id="pie"><br />
  .:: Servicio Nacional de Aprendizaje SENA ::.<br />
Centro de Servicios Financieros - Regional Distrito Capital<br />
Teléfono: (01)546 1500 Dirección: Carrera 13 No. 65 - 10</div>
<div id="DEA"></div>
	<!-- *********************************************************
	Inicio de la sección de validación. Susceptible de ser ubicada en el <head> -->
	<script>
	// Función ready que ejecuta su contenido al cargar
	$().ready(function() {
		// Validación del formulario, tener en cuenta el ID
		$("#miFormulario").validate({ // Aplicación de la funcion validate. A continuación se especifican las reglas y los mensajes
			// Aplicación de REGLAS de validación
			rules: {
			
					// Indique las reglas a validar, entre estos corchetes, separadas por comas
					// Si la regla es un parametro booleano, sólo indicar que es verdadero (true), si es numérico indicar el valor
					email: {
					required: true,
					email: true
				},
					clave: {
					required: true,
					minlength: 5
				},
			}, // Cierre de las reglas, se separa con coma de los mensajes

			// Mensajes a generar para indicar al usuario la estructura valida que debe ingresar. Se debe indicar por cada regla adicionada anteriormente para sobre escribir los mensajes por defecto (los cuales están en inglés. Se encuentran en "jquery.validate.js" línea 308)
			messages: {
			clave: {
					required: "Por favor, ingrese su contraseña", 
					minlength: "Tu contraseña debe tener al menos 5 caracteres"
			},
				email: "Introduzca una dirección de correo válida"
			} // Cierre de los mensajes
		}); // Cierre de la función validate
	}); // Cierre de la función ready
	
	// NOTA: Revise el archivo "additional-methods" (ya enlazado arriba), para obtener otros métodos de validación como "lettersonly" básico para el trabajo de su sistema de información

	</script>
<script type="text/javascript">
  </script>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>
