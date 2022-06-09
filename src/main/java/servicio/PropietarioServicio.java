
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Propietario;

/**
 *
 * @author USER
 */
public class PropietarioServicio implements IPropietarioServicio {

    public static List<Propietario> propietarioList = new ArrayList<>();
    
    @Override
    public Propietario crear(Propietario propietario) {
        this.propietarioList.add(propietario);
        return propietario;
    }

    @Override
    public List<Propietario> listar() {
        return this.propietarioList;
    }

    @Override
    public Propietario buscar(int i) {
        var propietario = new Propietario();
        for(Propietario pro:this.propietarioList){
            if(pro.getCodigo()==i){
               propietario = pro;
               break;
            }
        }
        return propietario;
    }

    @Override
    public Propietario eliminar(int codigo) {
        var propietario = this.buscar(codigo);
        this.propietarioList.remove(propietario);
        return propietario;
    }

}
