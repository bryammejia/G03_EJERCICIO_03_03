
package modelo;

/**
 *
 * @author USER
 */
public class Matricula {

    private int Codigo;
    private int yearMatricula;
    private int fechaExpira;
    private String estaMatriculado;
    private Auto auto;
    private Propietario propietario;

    public Matricula(int Codigo, int yearMatricula, int fechaExpira, String estaMatriculado, Auto auto, Propietario propietario) {
        this.Codigo = Codigo;
        this.yearMatricula = yearMatricula;
        this.fechaExpira = fechaExpira;
        this.estaMatriculado = estaMatriculado;
        this.auto = auto;
        this.propietario = propietario;
    }

    public Matricula(int Codigo, int yearMatricula, int fechaExpira, String estaMatriculado) {
        this.Codigo = Codigo;
        this.yearMatricula = yearMatricula;
        this.fechaExpira = fechaExpira;
        this.estaMatriculado = estaMatriculado;
    }

    
    public Matricula() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getYearMatricula() {
        return yearMatricula;
    }

    public void setYearMatricula(int yearMatricula) {
        this.yearMatricula = yearMatricula;
    }

    public int getFechaExpira() {
        return fechaExpira;
    }

    public void setFechaExpira(int fechaExpira) {
        this.fechaExpira = fechaExpira;
    }

    public String getEstaMatriculado() {
        return estaMatriculado;
    }

    public void setEstaMatriculado(String estaMatriculado) {
        this.estaMatriculado = estaMatriculado;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Matricula{" + "Codigo=" + Codigo + ", yearMatricula=" + yearMatricula + ", fechaExpira=" + fechaExpira + ", estaMatriculado=" + estaMatriculado + ", auto=" + auto + ", propietario=" + propietario + '}';
    }

    

}
