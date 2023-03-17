
package Controlador;
import Vistas.*;
import Modelos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
public class ListaController implements ActionListener {
frmPrincipal VistaPrincipal;
frmListaPaciente VistaLista;
ListaModel ModeloLista;
ListaModel2 ModeloLista2;

    public ListaController(frmPrincipal VistaPrincipal, frmListaPaciente VistaLista, ListaModel ModeloLista, ListaModel2 ModeloLista2) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        this.ModeloLista2 = ModeloLista2;
        
        this.VistaPrincipal.btnMedico1.addActionListener(this);
        this.VistaPrincipal.btnMedico2.addActionListener(this);
        this.VistaPrincipal.btnListaPacientes.addActionListener(this);
        this.VistaLista.btnAtMedico1.addActionListener(this);
        this.VistaLista.btnAtMedico2.addActionListener(this);
        
        //Levantar formulario
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnMedico1)
        {
            this.ModeloLista.EncolarCliente(this.VistaPrincipal.txtApellido.getText(),this.VistaPrincipal.txtNombre.getText());
            Queue<Clientes>listaLocal = this.ModeloLista.ListarClientes();
            String Cadena = "";
            for(Clientes MiListaClientes: listaLocal)
            {
                Cadena = Cadena + MiListaClientes.getApellido()+" "+MiListaClientes.getNombre()+"\n";
            }
            
            this.VistaLista.txtAMedico1.setText(Cadena);
            this.VistaPrincipal.txtApellido.setText("");
            this.VistaPrincipal.txtNombre.setText("");
            
        }
        if(e.getSource()==this.VistaPrincipal.btnMedico2)
        {
            this.ModeloLista2.EncolarCliente(this.VistaPrincipal.txtApellido.getText(),this.VistaPrincipal.txtNombre.getText());
            Queue<Clientes>listaLocal = this.ModeloLista2.ListarClientes();
            String Cadena = "";
            for(Clientes MiListaClientes: listaLocal)
            {
                Cadena = Cadena + MiListaClientes.getApellido()+" "+MiListaClientes.getNombre()+"\n";
            }
            
            this.VistaLista.txtAMedico2.setText(Cadena);
            this.VistaPrincipal.txtApellido.setText("");
            this.VistaPrincipal.txtNombre.setText("");
            
        }
        if(e.getSource()==this.VistaPrincipal.btnListaPacientes)
        {
            this.VistaLista.setLocationRelativeTo(null);
            this.VistaLista.setVisible(true);
            
        }
        if(e.getSource()==this.VistaLista.btnAtMedico1)
        {
           
        }
        if(e.getSource()==this.VistaLista.btnAtMedico2)
        {
            
        }
    }
    
}
