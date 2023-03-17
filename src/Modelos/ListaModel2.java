/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class ListaModel2 {
    Queue<Clientes> ListaClientes = new LinkedList();
    public void EncolarCliente(String apellido, String nombre)
    {
        Clientes nuevoCliente = new Clientes(apellido, nombre);
        this.ListaClientes.add(nuevoCliente);
        
        JOptionPane.showMessageDialog(null, "Cliente Asignado");
    }
    
    public Queue ListarClientes()
    {
        
        return this.ListaClientes;
    }
    
    public void DesEncolar()
    {
        this.ListaClientes.peek();
    }
}
