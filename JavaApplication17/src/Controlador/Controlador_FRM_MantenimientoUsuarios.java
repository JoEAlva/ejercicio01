/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.FRM_MantenimientoUsuarios;
/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_FRM_MantenimientoUsuarios implements ActionListener
{   
    // Referencias
    FRM_MantenimientoUsuarios fRM_MantenimientoUsuarios;
    MetodosUsuario metodosUsuario;
    
    // Contructor
    public Controlador_FRM_MantenimientoUsuarios(FRM_MantenimientoUsuarios fRM_MantenimientoUsuarios) { 
        this.fRM_MantenimientoUsuarios=fRM_MantenimientoUsuarios;
        metodosUsuario=new MetodosUsuario();
    }
    
    /*
    Método que evalua condiciones 
    */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Consultar"))
        {
            System.out.println("C");
            if(metodosUsuario.consultarUsuario(fRM_MantenimientoUsuarios.devolverInfoUsuario()))
            {
                fRM_MantenimientoUsuarios.mostrarInfoPantalla(metodosUsuario.devolverArregloUsuario());
            }
            else
            {
             fRM_MantenimientoUsuarios.limpiarCampos();
            }
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            System.out.println("A");
            metodosUsuario.agregarUsuario(fRM_MantenimientoUsuarios.devolverInfoUsuario());
            fRM_MantenimientoUsuarios.limpiarCampos();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("M");
            metodosUsuario.modificarUsuario(metodosUsuario.devolverArregloUsuario());
            fRM_MantenimientoUsuarios.limpiarCampos();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            System.out.println("E");
            metodosUsuario.eliminarUsuario(fRM_MantenimientoUsuarios.devolverInfoUsuario());
        }
    }
    
}//Fin Controlador_FRM_MantenimientoUsuarios
