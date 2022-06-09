
package modelo;

/**
 *
 * @author USER
 */
public class Matricula {

    private String provincia;
    private String anioMatricula;
    private String fechaExpira;
    private Auto auto;
    private Propietario propietario;

    public Matricula(String provincia, String anioMatricula, String fechaExpira, Auto auto, Propietario propietario) {
        this.provincia = provincia;
        this.anioMatricula = anioMatricula;
        this.fechaExpira = fechaExpira;
        this.auto = auto;
        this.propietario = propietario;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getAnioMatricula() {
        return anioMatricula;
    }

    public void setAnioMatricula(String anioMatricula) {
        this.anioMatricula = anioMatricula;
    }

    public String getFechaExpira() {
        return fechaExpira;
    }

    public void setFechaExpira(String fechaExpira) {
        this.fechaExpira = fechaExpira;
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
        return "Matricula{" + "provincia=" + provincia + ", anioMatricula=" + anioMatricula + ", fechaExpira=" + fechaExpira + ", auto=" + auto + ", propietario=" + propietario + '}';
    }
    
    
    
}
