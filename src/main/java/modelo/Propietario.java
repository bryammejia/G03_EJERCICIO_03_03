
package modelo;

/**
 *
 * @author USER
 */
public class Propietario {

    private String nombre;
    private int edad;
    private String cedula;
    private String direccion;
    private int celular;

    public Propietario(String nombre, int edad, String cedula, String direccion, int celular) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
        this.celular = celular;
    }

    public Propietario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", direccion=" + direccion + ", celular=" + celular + '}';
    }
    
    
    
}
