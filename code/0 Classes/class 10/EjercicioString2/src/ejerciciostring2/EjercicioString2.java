/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostring2;

/**
 *
 * @author Estudiante
 */
public class EjercicioString2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        StringUp oStringUp=new StringUp();
        oStringUp.setHilera("hOlA mUnDo");
        System.out.println(oStringUp.SubString(2, 4));
        System.out.println(oStringUp.toUpperCase()); 
    }
    
}