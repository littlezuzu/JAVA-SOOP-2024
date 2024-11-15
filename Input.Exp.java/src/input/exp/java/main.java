/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input.exp.java;



import java.util.Scanner;
public class InputExp {
    public static void main(String[] args) {
        
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        
        
        // Reads a single line from the console
        // and stores into name variable
        System.out.println("Name");
        name = input.nextLine();
        
        // Reads a integer from the console
        // and stores into age variable
        System.out.println("Age");
        age=input.nextInt();
        input.close();
        
    
        // Prints name and age to the console
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        
    }}

/*import java.io.*;
public class main {
    
    public static void main (String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
        int mark;
        
        System.out.print("Enter Mark: ");
        mark = Integer.parseInt(stdin.readLine());
    }
    }*/

import javax.swing.JOptionPane;
public class Addition {
    
}