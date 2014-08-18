/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_19;

/**
 *
 * @author Estudiante
 */
public class nodoDeLista {
    
    private String dato;
    private String CuentaBancaria;
    private nodoDeLista siguente;
    
    public nodoDeLista()
    {
        dato="";
        siguente=null;
    }
    
    
    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the siguente
     */
    public nodoDeLista getSiguente() {
        return siguente;
    }

    /**
     * @param siguente the siguente to set
     */
    public void setSiguente(nodoDeLista siguente) {
        this.siguente = siguente;
    }

    /**
     * @return the CuentaBancaria
     */
    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    /**
     * @param CuentaBancaria the CuentaBancaria to set
     */
    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }
    
}
