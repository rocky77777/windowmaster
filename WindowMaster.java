/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowmaster;

import java.util.Scanner;

/**
 *
 * @author Bill
 */
public class WindowMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's the height of the window?");
        int wHeight = Integer.parseInt(sc.nextLine());
        System.out.println("What's the width of the window?");
        int wWidth = Integer.parseInt(sc.nextLine());
        
        //dimension calculations
        int area = wHeight * wWidth;
        int perimeter = (wHeight * 2) + (wWidth * 2);
        
        //cost calculations
        double windowCost = area * 3.50;
        double trimCost = perimeter * 2.25;
        
        double total = windowCost + trimCost;
        
        System.out.println("Your windows cost: " + windowCost);
        System.out.println("and your trim costs: " + trimCost);
        System.out.println("Your total cost is: " + total);
        System.out.println("Thank you.");
        System.out.println("Thank you.");
        
    }
    
}
