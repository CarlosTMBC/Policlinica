
package Modelos;


public class Clientes {
    String Apellido;
    String Nombre;

    public Clientes(String Apellido, String Nombre) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
