/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author JorgeIgnacio
 */

public class MetodosLogin {

    ArrayList<Usuario> arrayUsuarioLogin;
    MetodosUsuario metodosUsuario;
    public MetodosLogin() {
         arrayUsuarioLogin = new ArrayList<Usuario>();
         
    }
      
    /*
    
    */
    public boolean comprobarContrasena(String arregloLogin[])
    {
        
        System.out.println("Entró al método comprobarConstrasena");
        arrayUsuarioLogin = metodosUsuario.getArrayUsuario();
        boolean correcta = false;
        for(int contador = 0; contador<arrayUsuarioLogin.size(); contador++)
        {
            if(arrayUsuarioLogin.get(contador).getNombreUsuario().equals(arregloLogin[0]) && arrayUsuarioLogin.get(contador).getContrasena().equals(arregloLogin[1]))
            {
                correcta = true;
                System.out.println("Está dentro del método comprobarConstrasena");
                System.out.println("correcta " + correcta);
            }
            
        }
        return correcta;
    }//Fin comprobarContrasena
    
    public boolean prueba() {
        boolean existe = true;
        return true;
    }
    
    
    
}
