/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingexample;
import java.util.Scanner;

/**
 *
 * @author MC03353
 */
public class CastingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = menu();
        int i;
        double d;
        Scanner sc = new Scanner(System.in);
                
        while (choice != 0) {
            switch(choice){
                case 1: 
                    System.out.print("Enter an integer: ");
                    i = sc.nextInt();
                    narrowingExample(i);
                    choice = menu();
                    break;
                case 2: 
                    System.out.print("Enter a double: ");
                    d = sc.nextDouble();
                    wideningExample(d);
                    choice = menu();
                    break; 
                case 3: 
                    System.out.print("Enter an integer: ");
                    i = sc.nextInt();
                    forLoop(i);
                    choice = menu();
                    break;                  
            }//end of switch
        }//end of while 
    }//end of main
    
     static int menu(){ //displays the main menu and returns user choice to the switch in main method
        int iChoice;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Select an option \n" +
                          "1.  Narrowing Example \n" +
                          "2.  Widening Example \n" +
                          "3.  For Loop \n" +
                          "0. Exit");
            
            iChoice = sc.nextInt();
        } while (iChoice < 0 || iChoice > 3); //when the user input is equal to 0, the program will close
        
        return iChoice;//returning menu choice 
    }
    
    public static void narrowingExample(int i){
        
        double d = i;
        System.out.print(i + " is being cast to " + d + "\n");
    }// end of narrowingExample
    
    public static void wideningExample(double d){
   
        int i = (int)d;
        System.out.print(d + " is being cast to " + i + "\n");
    }// end of wideningExample
    
    public static void forLoop(int j){
        
        for(int i = 0; i < j; i++){
            int total = i + j;
            System.out.println(i + " + " + j + " = " + total);
        }//end of loop
    }//end of forLoop
    
}// end of castingExample
