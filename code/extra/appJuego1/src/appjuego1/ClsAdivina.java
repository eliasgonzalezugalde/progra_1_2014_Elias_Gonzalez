/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appjuego1;

/**
 *
 * @author Elías
 */
public class ClsAdivina {
    
    private int num;
    
    //metodo contrusctor
    public ClsAdivina(int pNum)
    {
        this.num = pNum;
    }
    
   public boolean adivinaNum(int adi)
    {       
        if( this.num == adi || adi < 0) {
            return(true);
        } else {
            return(false);
        } 
    }
   
   public String Pista(int adi)
   {
       String pista="";
       if (this.num > adi) {
           pista = "Type a higher number.";
       } else {
           pista = "Type a lower number.";
       }
       return (pista);
   }
   
   public boolean termina(int intent)
    {       
        if( intent == 0 ) {
            return(true);
        } else {
            return(false);
        } 
    }
   
}
