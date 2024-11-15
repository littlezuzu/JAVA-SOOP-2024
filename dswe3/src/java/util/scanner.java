/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.util;

/**
 *
 * @author zurei
 */
public class scanner {
    public static void main(String[] args) {
      Scanner imbas = new Scanner(System.in);
       String Firstname,Lastname;
       
        System.out.println("Input your first name:");
        Firstname = imbas.nextLine();

        System.out.println("Input your last name:");
        Lastname = imbas.nextLine();

       
        System.out.println("Hello");
        System.out.println(" " + Firstname + " " + Lastname);
    
}
