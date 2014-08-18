/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;

/**
 *
 * @author estudiante
 */
public class MetodosOrdenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arreglo = {56, 4, 85, 85, 42};
        int[] arregloOrdenado;
        OrdenamientoSeleccion os = new OrdenamientoSeleccion();
        arregloOrdenado = os.OrdenS(arreglo, "A");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        }
    }
}
