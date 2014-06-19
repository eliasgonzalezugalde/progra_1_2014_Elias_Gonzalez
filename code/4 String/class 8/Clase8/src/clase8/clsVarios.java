/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *
 * @author estudiante
 */
public class clsVarios {

    private String cadena;
    private String texto;

    public String alRevez() {
        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String palindromo1() {
        String retorno = "";
        retorno = getCadena();
        for (int i = getCadena().length() - 2; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String buscaPalabra() {
        String retorno = "";
        int pos = texto.indexOf(cadena);
//        for (int i = getTexto().length(); i > 0; i--) {
//            retorno = texto.substring(0, pos) + "-" + texto.substring(pos);
//        }
        if (pos != -1) {
            for (int i = getTexto().length(); i > 0; i--) {
                retorno = texto.substring(0, pos) + "-" + texto.substring(pos);
            }
        } else {
            retorno = " No fue encontrado el string " + cadena + " en el texto.";
        }

        return retorno;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getTexto() {
        return cadena;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
