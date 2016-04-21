/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.FRM_MantenimientoUsuarios;
/**
 *
 * @author JorgeIgnacio
 */
public class Controlador_FRM_MantenimientoUsuarios implements ActionListener
{   

    FRM_MantenimientoUsuarios fRM_MantenimientoUsuarios; // Referencia
    
    public Controlador_FRM_MantenimientoUsuarios(FRM_MantenimientoUsuarios fRM_MantenimientoUsuarios) { // Contructor
        this.fRM_MantenimientoUsuarios=fRM_MantenimientoUsuarios;
    }
    
    /*
    Método que avalua condiciones 
    */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Consultar"))
        {
            System.out.println("C");
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            System.out.println("A");
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("M");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            System.out.println("E");
        }
    }
    
}//Fin Controlador_FRM_MantenimientoUsuarios
