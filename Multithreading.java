/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Dell
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        //t.interrupt();
        System.out.println("End of main");
    }
    
}

class Mythread extends Thread{
    
    public void run(){
        try{
            for(int i=0 ;i<10;i++){
                System.out.println("Lazy thread");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("I got interrupted");
        
        }
    }
}
