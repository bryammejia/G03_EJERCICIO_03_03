
package servicio;

import java.util.List;
import modelo.Propietario;

/**
 *
 * @author USER
 */
public interface IPropietarioServicio {
    
    public Propietario crear(Propietario propietario);
    public List<Propietario> listar();
    public Propietario buscar(int Codigo);
    public Propietario eliminar(int codigo);
    
}
