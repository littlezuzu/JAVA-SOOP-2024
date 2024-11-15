/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zuzusystem;

/**
 *
 * @author zurei
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Zuzusystem {

    /**
     * @param args the command line arguments
     */ 

    public static void main(String[] args) {
                 Scanner imbas = new Scanner(System.in);
        boolean continueProgram = true;  // To allow user to continue or exit

        while (continueProgram) {
            // Step 1: Allow user to enter the number of students using JOptionPane
            String numStudentsStr = JOptionPane.showInputDialog("Enter the number of students:");
            int numStudents = Integer.parseInt(numStudentsStr);  // Convert input to integer

            // Variables to count the number of students in each grade category
            int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
            int passed = 0, failed = 0;

            // Step 2: Allow user to insert marks and calculate grades
            for (int i = 1; i <= numStudents; i++) {
                System.out.print("Enter the mark for student " + i + ": ");
                int mark = imbas.nextInt();

                // Determine the grade and count the number of students in each grade
                if (mark >= 90) {
                    gradeA++;
                    passed++;
                } else if (mark >= 80) {
                    gradeB++;
                    passed++;
                } else if (mark >= 70) {
                    gradeC++;
                    passed++;
                } else if (mark >= 60) {
                    gradeD++;
                    passed++;
                } else {
                    gradeF++;
                    failed++;
                }
            }

            // Step 3: Display the number of students in each grade category
            System.out.println("\nGrade Distribution:");
            System.out.println("Number of students with Grade A: " + gradeA);
            System.out.println("Number of students with Grade B: " + gradeB);
            System.out.println("Number of students with Grade C: " + gradeC);
            System.out.println("Number of students with Grade D: " + gradeD);
            System.out.println("Number of students with Grade F: " + gradeF);

            // Step 4: Display the pass/fail count
            System.out.println("\nNumber of students passed: " + passed);
            System.out.println("Number of students failed: " + failed);

            // Step 5: Check if more students passed than failed and display "Bonus to instructor"
            if (passed > failed) {
                System.out.println("Bonus to instructor!");
            } else {
                System.out.println("More students failed.");
            }

            // Step 6: Ask the user to continue or exit
            System.out.print("\nDo you want to continue? (yes/no): ");
            imbas.nextLine(); // Consume the leftover newline from nextInt()
            String choice = imbas.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                continueProgram = false;
            }
        }

        imbas.close();
        System.out.println("Program exited.");
    }
}
