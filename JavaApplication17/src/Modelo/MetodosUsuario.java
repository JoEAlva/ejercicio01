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
        arregloUsuario = new String[4];
    }
    
    
    /*
    Busca un estudiante en el arrayList 
    */
    public boolean consultarUsuario(String idUsuario)
    {
        boolean exist = false;
        for(int j=0; j<arrayUsuario.size(); j++)
        {
            if(arrayUsuario.get(j).getIdUsuario().equals(idUsuario))
            {
                arregloUsuario[0] = arrayUsuario.get(j).getNombreCompleto();
                arregloUsuario[1] = arrayUsuario.get(j).getNombreUsuario();
                arregloUsuario[2] = arrayUsuario.get(j).getContrasena();
                arregloUsuario[3] = arrayUsuario.get(j).getTipo();
                exist = true;
                j=arrayUsuario.size();
            }
        }
        return exist;
    }
    
    
    /*
    Agrega un nuevo usuario al arrayList arrayUsurio
    */
    public void agregarUsuario(String arregloInfo[])
    {
        
        Usuario temporal = new Usuario(arregloInfo[0], arregloInfo[1],
        arregloInfo[2], arregloInfo[3], arregloInfo[4]);
        arrayUsuario.add(temporal);
        JOptionPane.showMessageDialog(null, "El usuario fue agregado en el"
                + " registro.", "Universidad de Costa Rica", JOptionPane.INFORMATION_MESSAGE);
        
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
    
    public String[] devolverArregloUsuario()
    {
        return this.arregloUsuario;
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
    }//Fin eliminarUsuario
    
    /*
    Muestra un mensaje al usuario en pantalla
    */
    public void mensajejUsuario()
    {
        JOptionPane.showMessageDialog(null, "Acción realizada correctamente",
        "Universidad de Costa Rica", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mensajeConsultar()
    {
        JOptionPane.showMessageDialog(null, "El usuario no"
                        + " se encuentra registrado.", "Universidad de"
                                + " Costa Rica", JOptionPane.OK_OPTION);
    }
    
}//Fin de MetodosUsuario
