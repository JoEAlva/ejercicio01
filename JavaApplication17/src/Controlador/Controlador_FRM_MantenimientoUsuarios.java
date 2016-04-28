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
import Modelo.ArchivosUsuario;
/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_FRM_MantenimientoUsuarios implements ActionListener
{   
    // Referencias
    FRM_MantenimientoUsuarios fRM_MantenimientoUsuarios;
    public MetodosUsuario metodosUsuario;
    ArchivosUsuario archivosUsuario;
    
    
    // Contructor
    public Controlador_FRM_MantenimientoUsuarios(FRM_MantenimientoUsuarios fRM_MantenimientoUsuarios) { 
        this.fRM_MantenimientoUsuarios=fRM_MantenimientoUsuarios;
        archivosUsuario = new ArchivosUsuario();
        metodosUsuario=new MetodosUsuario(archivosUsuario);
        
        if(archivosUsuario.cargarArchivoUsuario())
        {
            System.out.println("Se cargó el archivo usuario correctamente(controlador)");
        }
        else
        {
            System.out.println("Error al cargar el archivo usuario(controlador)");
        }
        metodosUsuario.setArrayUsuario(archivosUsuario.leerArchivoUsuario());
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
            fRM_MantenimientoUsuarios.limpiarCampos();
        }
    }
    
}//Fin Controlador_FRM_MantenimientoUsuarios
