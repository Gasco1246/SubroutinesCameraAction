/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subroutinemath;

/**
 *
 * @author gasco1246
 */
import java.util.Scanner;

public class SubroutineMath {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What do you want to calculate?");
        System.out.println("Type a to calculate force");
        System.out.println("Type b to calculate gravitational potential energy");
        System.out.println("Type c to hear a joke");
        System.out.println("Type d to hear another joke");
                
        System.out.println("______________________________________________________");
        String in = keyboard.nextLine();
        
            switch(in){
                case "a": case "A":
                    force();
                    break;
                case "b": case "B":
                    gravitationalPotentialEnergy();
                    break;
                case "c": case"C":
                    sevenEightNine();
                    break;
                case "d": case"D":
                    xenophobia();
              
                    
                    break;
            }
        
    }
    
    public static void force(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your accel:");
        double a = keyboard.nextDouble();
        System.out.println("What is your mass:");
        double m = keyboard.nextDouble();
        
        double f = m*a;
        
        
        System.out.println("force:"+f);
    }
    public static void gravitationalPotentialEnergy(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your mass: ");
        double m = keyboard.nextDouble();
        System.out.println("What is the height of your object in meters");
        double h = keyboard.nextDouble();
        double g = 9.8;
        double Epot = m*g*h;
        System.out.println("Potential Energy:" + Epot);
        
    }
    public static void sevenEightNine(){
        System.out.println("WHY WAS 6 AFRAID OF 7?");
        System.out.println("BECAUSE 789 and was promply given a life scentence for cannabalism");
    }
    public static void xenophobia(){
        System.out.println("WHY DID THE CHICKEN CROSS THE ROAD?");
        System.out.println("to get away from the cops chasing him for breaking the window of a kfc");
    }
    
}
