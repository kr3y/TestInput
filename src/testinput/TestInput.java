/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinput;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keybroad = new Scanner(System.in);
        System.out.print("a = ");
        long a = keybroad.nextLong();
        System.out.print("b = ");
        long b = keybroad.nextLong();
        
        for (long i = a; i <= b; i++) {
            System.out.println("I = "+i);
            
        }
    }

}
