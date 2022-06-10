
package vista;

/**
 *
 * @author USER
 */
public class Principal {

    public static void main(String[] args) {
        
        var v1 = new AutoVentana();
        var v2 = new PropietarioVentana();
        var v3 = new MatriculaVentana();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
    }
}
