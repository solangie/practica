<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link rel="stylesheet" type="text/css" href="Fase 3 APS\Español\css/Formularios.css"    
	<link rel="icon" type="favicon.ico" href="Fase 3 APS\Español\imagenes/logo.png" >
        <script type="text/javascript" src="Fase 3 APS\Español\validacion\validaciones.js"></script>
	<script src="Fase 3 APS\Español\SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
	<link href="Fase 3 APS\Español\SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" >
</script>
<!-- InstanceBegin template="../../Documents/CSS/Templates/usuario.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<link rel="icon" type="favicon.ico" href="imagenes/logo.png" />
<title>APS Registrate</title>
<!-- InstanceEndEditable -->
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
</head>

<body>
<!-- InstanceBeginEditable name="EditRegion3" -->
<div id="texto">ACTIVITIES  OF  THE  POLICE  SYSTEM</div>
<div id="logo">
<img src="Fase 3 APS\Español\imagenes\logo.png" width="100px" height="100px" alt="logo"/>
</div>
 </table><img src="Fase 3 APS\Español\imagenes/linea.png" width="999" height="20" alt="linea" /></td>
<div id="menu">Registrate</div>
<div id="contenido">
    
    <form id="miFormulario" method="post" action="controlador"

        method="post" onsubmit="return validarForma(this);">
       
    <tr>
     <td class="oce-first">
                    	
         Tipo documento: 
     </td>
    <td>
     <select name="tipo" class="default">
     <option value="">Seleccionar</option>
     <option value="1">Cedula de ciudadania</option>
     <option value="2">Cedula extrangera</option>
							
      </select>
     </td>
    </tr>   
       
    <tr>
     <td class="oce-first">
                    	Documento: 
     </td>
     <td>
         <input class="default" type="text" value=""
             name="Documento"  maxlength="10" placeholder="digite Documento"
             required onfocus="this.select();"/>
     </td>
    </tr>
       
     <tr>
     <td class="oce-first">
                    	Nombres:
     </td>
     <td>
         <input class="default" type="text" value=""
             name="Nombres"  maxlength="45" placeholder="digite Nombres"
             required onfocus="this.select();"/>
     </td>
    </tr>
   
     <tr>
     <td class="oce-first">
                    	Apellidos:
     </td>
     <td>
         <input class="default" type="text" value=""
             name="Apellidos"  maxlength="45" placeholder="digite Apellidos"
             required onfocus="this.select();"/>
     </td>
    </tr>
   
       
    <tr>
     <td class="oce-first">
                    	Usuario:
     </td>
     <td>
         <input class="default" type="text" value=""
             name="usuario"  maxlength="50" placeholder="usuario@gmail.com"
             required onfocus="this.select();"/>
     </td>
    </tr>
    <tr>
     <td class="oce-first">
                    	Password:
     </td>
     <td>
         <input class="default" type="password" value=""
             name="password"  maxlength="16" placeholder="digite la contraseña"
             required onfocus="this.select();">
     </td>
    </tr>
    
    <tr>
     <td class="oce-first">
                    	Fecha:
     </td>
     <td>
          
         <input class="default" type="date"  value=""
             name="fecha" required onfocus="this.select();">
     </td>
    </tr>
   <a href="index.jsp">Inicio De Sesion</a>
					
                <button type="submit" onclick="MM_popupMsg('Registro exitosamente')">Registrate</button>
   </table>
  </form>
     
                </body>
</html>
	</script>
</div>
<div id="pie">
  <strong>.:: Servicio Nacional de Aprendizaje SENA ::.<br />
Centro de Servicios Financieros - Regional Distrito Capital<br />
Teléfono: (01)546 1500 Dirección: Carrera 13 No. 65 - 10</strong></div>

<script type="text/javascript">
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
</script>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>
