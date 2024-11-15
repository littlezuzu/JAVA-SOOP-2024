/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author zurei
 */
import java.util.Scanner;

public class HorizontalHourglass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the hourglass pattern: ");
        int rows = scanner.nextInt();

        // Print the upper part of the hourglass
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars in decreasing order
            for (int j = 0; j < (rows - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Print the lower part of the hourglass
        for (int i = rows - 2; i >= 0; i--) {
            // Print leading spaces for alignment
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars in increasing order
            for (int j = 0; j < (rows - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
