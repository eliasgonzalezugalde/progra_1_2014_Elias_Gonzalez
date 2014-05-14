/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributes;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Atributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account oAccount = new Account();
        Scanner teclado = new Scanner(System.in);
        
        boolean validar = true;
        int opt;
        char continuar;
        double monto;
        
        while (validar)
        {
            System.out.println("Digite 1 si quiere realizar un depósito." +
                    "\n" + "Digite 2 si quiere realizar un retiro." + "\n"
                    + "Digite 3 para ver el saldo de su cuenta." );
            
            opt = Integer.parseInt(teclado.nextLine());
            
            if(opt == 1)
            {
                System.out.println("Digite el monto a depositar.");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Deposito(monto);
            }
            if(opt == 2)
            {
                System.out.println("Digite el monto a retirar.");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Retiro(monto);
                if(oAccount.isHayError())
                {
                    System.out.println("El monto no puede ser retirado.");
                }
            }
            
            if(opt == 3)
            {
                
            }
            
            System.out.println("El saldo final es de: " + oAccount.getSaldoInicial());
            System.out.println("¿Desea realizar otra transacción? S/N");
            continuar = teclado.nextLine().charAt(0);
            
            if((continuar == 'S')||(continuar == 's'))
            {
               validar = true;
            }
            
            if((continuar == 'N')||(continuar == 'n'))
                validar = false;
            
        }
        
        
    }
}
