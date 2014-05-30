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
    
    public String guion(){
        String retorno="";
        
        for(int i=0; i < getCadena().length(); i++){
            if(getCadena().length()-1==i){
                retorno+=getCadena().charAt(i);
            } else {
                retorno+=getCadena().charAt(i)+"-";
            }
        }
        return retorno;
    }
    
    public int Vocales() 
    {
        int cantidadVocales = 0;
        for (int i = 0; i < getCadena().length(); i++) {

            if ((getCadena().charAt(i) == 'a')
                    || (getCadena().charAt(i) == 'A')
                    || (getCadena().charAt(i) == 'e')
                    || (getCadena().charAt(i) == 'E')
                    || (getCadena().charAt(i) == 'i')
                    || (getCadena().charAt(i) == 'I')
                    || (getCadena().charAt(i) == 'o')
                    || (getCadena().charAt(i) == 'O')
                    || (getCadena().charAt(i) == 'u')
                    || (getCadena().charAt(i) == 'U')) {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }
        
        public boolean palindromo(){
            String palabraAlRevez="";
            for (int i = getCadena().length()-1; i >= 0; i--) {
                palabraAlRevez+=getCadena().charAt(i);
            }
            
            if(getCadena().equals(palabraAlRevez))
                return true;
            else
                return false;
                
        }
        
    }
    
    

