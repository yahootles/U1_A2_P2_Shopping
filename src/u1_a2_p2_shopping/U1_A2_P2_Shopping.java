/*
 * Andrew Thompson
 * October 3, 2018
 * This program calculates and displays the price of a number of items
 */

package u1_a2_p2_shopping;

/**
 *
 * @author antho6229
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class U1_A2_P2_Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare constant
        final double TAX_RATE = 0.13;
        
        //declare variables
        int numUSB, numKeyboard, numMice;
        double purPrice, taxAmount, totalPrice;
        double usbPrice = 19.99;
        double keyboardPrice = 49.99;
        double mousePrice = 25.99;
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$###.##");
        
        //ask for number of each
        System.out.println("Enter the number of USBs you wish to purchase:");
        numUSB = keyedInput.nextInt();
        
        System.out.println("Enter the number of keyboards you wish to purchase:");
        numKeyboard = keyedInput.nextInt();
        
        System.out.println("Enter the number of mice you wish to purchase:");
        numMice = keyedInput.nextInt();
        
        //calculate
        purPrice = (numUSB * usbPrice) + (numKeyboard * keyboardPrice) + (numMice * mousePrice);
        taxAmount = purPrice * TAX_RATE;
        totalPrice = purPrice + taxAmount;
        
        //output
        System.out.println("\n\nBill\n*************\n\nPrice:\t\t" + df.format(purPrice) + "\nHST:\t\t" + df.format(taxAmount) + "\nTotal price:\t" + df.format(totalPrice));
    }
    
}
