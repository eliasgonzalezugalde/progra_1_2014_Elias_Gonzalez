/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributes;

/**
 *
 * @author Estudiante
 */
public class Account {
    
    private double saldoInicial;
    private boolean hayError;
    
    public Account()
    {
        saldoInicial = 0;
    }
    
    //this method increases the user's account
    public void Deposito(double monto)
    {
        setSaldoInicial(getSaldoInicial() + monto);
    }
    
    //this method reduces the user's account
    public void Retiro(double monto)
    {
        if(getSaldoInicial() >= monto) 
            setSaldoInicial(getSaldoInicial() - monto);
        else
            setHayError(true);
    }
    
    //get and set to saldoInicial
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
    //get and set to hayError
    public boolean isHayError() {
        return hayError;
    }
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
    
}
