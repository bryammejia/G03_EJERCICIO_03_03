
package controlador;

import java.util.List;
import modelo.Auto;
import servicio.AutoServicio;

/**
 *
 * @author USER
 */
public class AutoControl {

    private final AutoServicio autoServicio = new AutoServicio();
    
    public Auto crear(String [] args){
         var codigoAuto = Integer.valueOf(args[0]);
         var marcaAuto = args[1];
         var colorAuto = args[2];
         var yearAuto = Integer.valueOf(args[3]);
         var precioAuto = Integer.valueOf(args[4]);
         
         var auto = new Auto(codigoAuto,marcaAuto,colorAuto,yearAuto,precioAuto);
         this.autoServicio.crear(auto);
         return auto;
    }
    
    public List<Auto> listar(){
        return this.autoServicio.listar();
    }
}
