
package pckMain;
import Vistas.*;
import Controlador.*;
import Modelos.*;
public class main {
    public static void main(String args[])
    {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmListaPaciente VistaListas = new frmListaPaciente(null, true);
        ListaModel ModeloLista = new ListaModel();  
        ListaModel2 ModeloLista2 = new ListaModel2();  
        ListaController ControladorLista = new ListaController(VistaPrincipal,VistaListas,ModeloLista,ModeloLista2);
    }
}
