/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicatch;



/**
 *
 * @author Dell
 */
public class MultiCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            int i = 10;
            int a = 0;
            int c = i / a;
        } 
      
        catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Catch 1 executed");
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println("catch 2 executed");
        }
    }

}
