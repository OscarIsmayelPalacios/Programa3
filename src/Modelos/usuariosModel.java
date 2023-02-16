
package Modelos;

import java.util.ArrayList;


public class usuariosModel {
    
    public ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>();
    
    public void AgregarUsuarios(String apellidos, String nombre, String telefono)
    {
        Usuarios NuevoUsuarios = new Usuarios(apellidos, nombre, telefono);
        this.ListaUsuarios.add(NuevoUsuarios);
    }
    
    public ArrayList ListarUsuarios()
    {
        return ListaUsuarios;
    }
    
}
