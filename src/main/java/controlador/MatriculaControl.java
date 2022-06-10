
package controlador;

import java.util.List;
import modelo.Auto;
import modelo.Matricula;
import servicio.AutoServicio;
import servicio.MatriculaServicio;
import servicio.PropietarioServicio;

/**
 *
 * @author USER
 */
public class MatriculaControl {

    private final MatriculaServicio matriculaServicio = new MatriculaServicio();
    private final AutoServicio autoServicio = new AutoServicio();
    private final PropietarioServicio propietarioServicio= new PropietarioServicio();
    
    public Matricula crear(String [] args){
        var codigoAuto = Integer.valueOf(args[0]);
        var yearMatricula = Integer.valueOf(args [1]);
        var fechaExpira = Integer.valueOf(args [2]);
        var estaMatriculado = args[4];
        var auto = this.autoServicio.buscarCodigo(Integer.valueOf(args[4]));
        var persona = this.propietarioServicio.buscar(Integer.valueOf(args[5]));
        
        var matricula = new Matricula(codigoAuto,yearMatricula,fechaExpira,estaMatriculado,auto,persona);
        this.matriculaServicio.crear(matricula);
        return matricula;
            
    }
    
    public List<Matricula> listar(){
        return this.matriculaServicio.listar();
    }
    
}
