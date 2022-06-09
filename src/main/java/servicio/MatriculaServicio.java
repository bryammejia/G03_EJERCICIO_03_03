package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Matricula;

/**
 *
 * @author USER
 */
public class MatriculaServicio implements IMatriculaServicio {

    private static List<Matricula> matriculaList = new ArrayList<>();

    @Override
    public Matricula crear(Matricula matricula) {
        this.matriculaList.add(matricula);
        return matricula;
    }

    @Override
    public List<Matricula> listar() {
        return this.matriculaList;
    }

    @Override
    public Matricula buscar(int i) {
        var matricula = new Matricula();
        for (Matricula mat : this.matriculaList) {
            if (mat.getCodigo() == i) {
                matricula = mat;
                break;
            }
        }
        return matricula;
    }

    @Override
    public Matricula eliminar(int codigo) {
        var matricula = this.buscar(codigo);
        this.matriculaList.remove(matricula);
        return matricula;
    }
}
