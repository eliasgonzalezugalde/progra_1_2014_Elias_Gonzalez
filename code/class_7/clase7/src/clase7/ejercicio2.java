/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Estudiante
 */
public class ejercicio2 {
    
    private String cadena;
    
    public String mediaCadena(){
        String retorno="";
        
        for(int i=0; i < getCadena().length()/2; i++){
            retorno+=getCadena().charAt(i);
        }
        return retorno;
    }
    
    public String ultimoValor(){
        return getCadena().charAt(getCadena().length()-1)+"";
    }
    
    public String alRevez(){
        String retorno="";
        for(int i=getCadena().length()-1; i >= 0; i--){
            retorno+=getCadena().charAt(i);
        }
        return retorno;
    }

    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
}
