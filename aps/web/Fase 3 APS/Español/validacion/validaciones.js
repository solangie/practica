/**
 * @authorba
 */
/**
 * Funcion para validar los elementos requeridos (*)
 * @param {Object} forma
 */
function validarForma(forma){
    
         
         forma = Documento.getElementById("tipo").selectedIndex;
         if( forma == null || forma == 0 ) {
             alert("Debe seleccionar tipo");
         return false;
}
    
	//Validamos el usuario
	var Documento = forma.usuario;
        
	if( Documento.value == "" || Documento.value == "Escribir Documento"){
		alert("Debe proporcionar un Documento de usuario");
		usuario.focus();
		usuario.select();
		return false;
	}
	if(forma.nombre.value.length==0) { //comprueba que no esté vacío
    forma.nombre.focus();   
    alert('No has escrito tu nombre'); 
    return false; //devolvemos el foco
  }
  if(forma.email1.value.length==0) { //comprueba que no esté vacío
    forma.email1.focus();
    alert('No has escrito tu e-Mail');
    return false;
  }
  
	//Validamos el password
	var password = forma.password;
	if(password.value == "" || password.value.length < 3){
		alert("Debe proporcionar un password al menos de 5 caracteres");
		password.focus();
		password.select();
		return false;
	}
	
	var ano = Documento.getElementById("ano").value;
        var mes = Documento.getElementById("mes").value;
        var dia = Documento.getElementById("dia").value;
 
        valor = new Date(ano, mes, dia);
        if( !isNaN(valor) ) {
        return false;
       }

	
	//Formulario validado
	alert("Formulario valido, enviando datos...");
	return true;
}
