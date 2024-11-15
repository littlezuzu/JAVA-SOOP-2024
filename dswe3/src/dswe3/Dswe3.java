/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dswe3;

/*import java.util.Scanner;

public class Dswe3 {

    
    public static void main(String[] args) {
      Scanner imbas = new Scanner(System.in);
       String Firstname,Lastname;
       
        System.out.println("Input your first name:");
        Firstname = imbas.nextLine();

        System.out.println("Input your last name:");
        Lastname = imbas.nextLine();

       
        System.out.println("Hello");
        System.out.println(""+Firstname+" "+ Lastname);
    }
    
}*/

/*import java.util.Scanner;
/*public class Dswe3 {
    public static void main(String[] args) {
      int hasil1 = -5 + 8 * 6 ;
      int hasil2 = (55 + 9) % 9;        
      int hasil3 = 20 + -3 * 5 / 8;
      int hasil4 = 5 + 15 / 3 * 2 - 8 % 3;
      
       
        System.out.println("Here are some Calculations\n");
        System.out.println("-5 + 8 * 6             : " + hasil1);
        System.out.println("(55 + 9) % 9           : " + hasil2);
        System.out.println("20 + -3 * 5 / 8        : " + hasil3);
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 : " + hasil4);
        
        
        
        
        
        // TODO code application logic here
    }
    
}*/
import java.util.Scanner;
/*public class Dswe3 {
    public static void main(String[] args) {
    Scanner imbas = new Scanner(System.in);
    
    System.out.println("Converter available:");
    System.out.println("1.Currency (MYR-USD)");
    System.out.println("2.Mass (KG-POUND)");
    System.out.println("3.Distance (KM-M)");
    
    System.out.println("Choose your converter:"); 
    int choice = imbas.nextInt();
    
    switch (choice){
        case 1:
        
        System.out.print("Insert Amount (RM): ");
        double amountMYR = imbas.nextDouble();
        double amountUSD =amountMYR *  0.22845598;
        System.out.printf("RM%.2f = %4f USD%n",amountMYR,amountUSD);
        
        break;
        
        case 2:
        
         System.out.print("Insert Quantity (Kg):");
         double quantityKg = imbas.nextDouble();
         double quantityPounds = quantityKg * 2.20462262;
         System.out.printf("%.2f kg = %.4fpounds%n",quantityKg,quantityPounds);
         
         break;
         
         case 3:
         System.out.print("Insert Distance(km):");
         double distanceKm = imbas.nextDouble();
         double distanceMeters = distanceKm * 1000;
         System.out.printf("%.2f km = %.2f meters%n",distanceKm,distanceMeters);
         
         break;
    }
         imbas.close();
    }     
}*/

    public static void main (String[]args){
        int count = 11;
        System.out.println("printing Numbers from 11 to 50");
        do {
            System.out.println(count++);}
            while (count<=50);}
       

