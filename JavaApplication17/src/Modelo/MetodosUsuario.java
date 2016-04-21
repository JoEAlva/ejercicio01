/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author JorgeIgnacio
 */
public class MetodosUsuario
{
    
    //Se declaran las variables
    ArrayList<Usuario> arrayUsuario;
    public String arregloUsuario[];
    
    //Constructor de la clase
    public MetodosUsuario()
    {
        arrayUsuario = new ArrayList<Usuario>();
    }
    
    
    /*
    Busca un estudiante en el arrayList 
    */
    public void consultarUsuario()
    {
        
    }
    
    
    /*
    Agrega un nuevo usuario al arrayList arrayUsurio
    */
    public void agregarUsuario(String arregloInfo[])
    {
        
        Usuario temporal = new Usuario(arregloInfo[0], arregloInfo[1],
        arregloInfo[2], arregloInfo[3], arregloInfo[4]);
        arrayUsuario.add(temporal);
        
    }
    
    /*
    Modifica un usuario del arrayList
    @param String arreglo[] arreglo de información del usuario
    */
    public void modificarUsuario(String arregloInfo[])
    {
        for(int j=0; j<arrayUsuario.size(); j++)
        {
            if(arrayUsuario.get(j).getIdUsuario().equals(arregloInfo[0]))
            {
                arrayUsuario.get(j).setNombreCompleto(arregloInfo[1]);
                arrayUsuario.get(j).setNombreUsuario(arregloInfo[2]);
                arrayUsuario.get(j).setContrasena(arregloInfo[3]);
                arrayUsuario.get(j).setContrasena(arregloInfo[4]);
                mensajejUsuario();
                j = arrayUsuario.size();
            }
        }
    }
    
    /*
    Elimina un usuario del arrayList
    @param String arreglo[] arreglo de información del usuario
    */
    public void eliminarUsuario(String arregloInfo[])
    {
        for(int j=0; j<arrayUsuario.size(); j++)
        {
            if(arrayUsuario.get(j).equals(arregloInfo[0]))
            {
                arrayUsuario.remove(j);
                mensajejUsuario();
                j = arrayUsuario.size();
            }
        }
    }
    
    /*
    Muestra un mensaje al usuario en pantalla
    */
    public void mensajejUsuario()
    {
        JOptionPane.showMessageDialog(null, "Acción realizada correctamente",
        "Universidad de Costa Rica", JOptionPane.INFORMATION_MESSAGE);
    }
    
}//Fin de MetodosUsuario
