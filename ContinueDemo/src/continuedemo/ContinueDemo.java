/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continuedemo;

/**
 *
 * @author zurei
 */
/*public class ContinueDemo {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        String searchMe = "peter piper picked a peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;
        for (int i = 0;i< max;i++){//interested only in p's
            if(searchMe.charAt(i)!='p')
                continue;
            //process p's
            numPs++;}
        System.out.println("Found"+numPs + "p's in the string.");}}  */
       

import java.util.Scanner;
public class ContinueDemo {

    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        String searchMe = "To begin to toboggan first buy a toboggan, but don't buy too big a toboggan. Too big a toboggan is too big a toboggan to buy to begin to toboggan.";
        int max = searchMe.length();
        int numBs = 0;
        for (int i = 0;i< max;i++){//interested only in b's
            if(searchMe.charAt(i)!='b')
                continue;
            //process b's
            numBs++;}
        System.out.println("Found " +numBs + "B's in the string.");}} */




    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Even numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenSum += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nOdd numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                oddSum += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);}} */

 
    /*public static void main(String[] args) {
        int sum = 0;

        System.out.println("The Squares of numbers between 1 and 10 is:");
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            sum += square;
            System.out.println(i + "^2 = " + square);
        }

        System.out.println("\nSum of squares: " + sum);
    }}*/
    

    /*public static void main(String[] args) {
        // Start from 99 and decrement by 11 in each iteration
        System.out.println("Sequence of numbers:");
        for (int i = 99; i >= 11; i -= 11) {
            System.out.print(i + " ");
        }
    }
}*/
       
	/*public static void main(String[] args) {
        // Predefined password
        final String correctPassword = "zuzu9904";
        // Maximum number of attempts allowed
        final int maxAttempts = 4;
        
        // Scanner object to get user input
        Scanner imbas = new Scanner(System.in);
        
        boolean isAuthenticated = false; // Track whether the user is authenticated
        int attempts = 0; // Number of attempts made
        
        System.out.println("Welcome to the Password System!");

        // Loop until the user is authenticated or max attempts are reached
        while (attempts < maxAttempts && !isAuthenticated) {
            System.out.print("Enter your password: ");
            String enteredPassword = imbas.nextLine();
            attempts++; // Increment attempts counter
            
            // Check if the entered password is correct
            if (enteredPassword.equals(correctPassword)) {
                isAuthenticated = true;
                System.out.println("Access granted. Welcome to LittleZuzu.co!");
            } else {
                // Check if maximum attempts have been reached
                if (attempts < maxAttempts) {
                    System.out.println("Incorrect password. Try again. (" + (maxAttempts - attempts) + " attempts left)");
                } else {
                    System.out.println("Incorrect password. No attempts left. Access denied.");
                }
            }
        }
        
        imbas.close(); // Close the scanner
    }

	

}*/



    /*public static void main(String[] args) {
        Scanner imbas = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = imbas.nextInt();

        int passed = 0;
        int failed = 0;

        // Loop to get test results for each student
        for (int i = 1; i < numStudents + 1; i++) {
            System.out.print("Enter the result for student " + i + " (pass/fail): ");
            String result = imbas.next();

            // Check if the student passed or failed
            if (result.equalsIgnoreCase("pass")) {
                passed++;
            } else if (result.equalsIgnoreCase("fail")) {
                failed++;
            } else {
                System.out.println("Invalid input. Please enter 'pass' or 'fail'.");
                i--; // Reduce the counter to retry the input for this student
            }
        }

        // Display the number of students who passed and failed
        System.out.println("\nNumber of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);

        // Check if more than 50% of students passed
        if (passed > numStudents / 2) {
            System.out.println("Bonus to instructor!");
        }

        imbas.close();
    }
}*/


/*public static void main(String[] args) {
        // Constants
        final double baseSalary = 600.00;
        final double commissionRate = 0.05;
        
        // Scanner object to get user input
        Scanner imbas = new Scanner(System.in);
        
        // Input: Ask for the number of items sold and the price per item
        System.out.print("Enter the number of items sold by the salesman last week: ");
        int itemsSold = imbas.nextInt();
        
        System.out.print("Enter the price per item: RM ");
        double pricePerItem = imbas.nextDouble();
        
        // Calculate gross sales
        double grossSales = itemsSold * pricePerItem;
        
        // Calculate commission
        double commission = grossSales * commissionRate;
        
        // Calculate total earnings
        double totalEarnings = baseSalary + commission;
        
        // Display the results
        System.out.printf("Gross sales for the week: RM %.2f\n", grossSales);
        System.out.printf("Commission earned: RM %.2f\n", commission);
        System.out.printf("Total earnings for the week: RM %.2f\n", totalEarnings);
        
        // Close the scanner
        imbas.close();
    }

}*/
    


