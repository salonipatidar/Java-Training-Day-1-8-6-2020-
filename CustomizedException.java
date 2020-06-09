/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customizedexception;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class CustomizedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = sc.nextInt(); 
        if(age>60){
            throw new TooOldException("you are too old to register");
        }
        else if(age<18){
           throw new TooYoungException("You are too young to register"); 
        }
        else{
            System.out.println("You can register");
        }
    }
    
}
class TooYoungException extends RuntimeException{
    TooYoungException(String s){
        super(s);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}
