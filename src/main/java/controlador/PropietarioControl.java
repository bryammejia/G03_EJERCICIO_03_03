
package controlador;

import java.util.List;
import modelo.Propietario;
import servicio.PropietarioServicio;

/**
 *
 * @author USER
 */
public class PropietarioControl {

    private final PropietarioServicio propietarioServicio = new PropietarioServicio();
    
    public Propietario crear(String [] args){
        var codigoPropietario = Integer.valueOf(args [0]);
        var nombrePropietario = args[1];
        var edadPropietario = Integer.valueOf(args[2]);
        var cedulaPropietario = args[3];
        var celularPropietario = Integer.valueOf(args [4]);
        
        var propietario = new Propietario(codigoPropietario, nombrePropietario, edadPropietario, cedulaPropietario, celularPropietario);
        this.propietarioServicio.crear(propietario);
        return propietario;
    }
    
    public List<Propietario> listar(){
        return this.propietarioServicio.listar();
    }
    
}
