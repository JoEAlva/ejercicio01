/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.FRM_UsuarioLogin;
import Modelo.MetodosLogin;


/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_FRM_UsuarioLogin implements ActionListener
{
    //Referencia
    FRM_UsuarioLogin fRM_UsuarioLogin;
    MetodosLogin metodosLogin;
   
    
    //Constructor
    public Controlador_FRM_UsuarioLogin(FRM_UsuarioLogin fRM_UsuarioLogin) {
        this.fRM_UsuarioLogin = fRM_UsuarioLogin;
        metodosLogin = new MetodosLogin();
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Login"))
        {
             
            metodosLogin.comprobarContrasena(fRM_UsuarioLogin.devolverInfoLogin());
            System.out.println("Funciona");
        }
    }
}
