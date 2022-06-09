
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Auto;

/**
 *
 * @author USER
 */
public class AutoServicio implements IAutoServicio {

    private static List<Auto> autoList = new ArrayList<>();
    
    @Override
    public Auto crear(Auto auto) {
    this.autoList.add(auto);
    return auto;
    }

    @Override
    public List<Auto> listar() {
       return this.autoList;
    }

    @Override
    public Auto buscarCodigo(int i) {
       var auto = new Auto();
       for(Auto aut:this.autoList){
           if(aut.getCodigo()==i){
               auto = aut;
               break;
           }
       }
       return auto;
    }

    @Override
    public Auto eliminar(int codigo) {
       var auto = this.buscarCodigo(codigo);
       this.autoList.remove(auto);
       return auto;
    }

}
