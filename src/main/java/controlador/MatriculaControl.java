
package controlador;

import modelo.Matricula;
import servicio.MatriculaServicio;

/**
 *
 * @author USER
 */
public class MatriculaControl {

    private final MatriculaServicio matriculaServicio = new MatriculaServicio();
    
    public Matricula crear(String [] args){
        var codigoAuto = Integer.valueOf(args[0]);
        var yearMatricula = Integer.valueOf(args [1]);
        var fechaExpira = Integer.valueOf(args [2]);
        
    }
    
}
