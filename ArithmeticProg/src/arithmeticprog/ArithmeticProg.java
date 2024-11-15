/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticprog;

/**
 *
 * @author zurei
 */
import java.util.Scanner;
/*public class ArithmeticProg {
    public static void main(String[] args) {
        int y, z, sum;
        Scanner isi = new Scanner (System.in);
        System.out.println("Type a number: ");
        y = isi.nextInt();
        
        System.out.append("type other number: ");
        z = isi.nextInt();
        
        sum = y + z;
        System.out.println("Sum is:"+ sum);
        
        
        
        
        
        // TODO code application logic here
    }
    
} */


/*public class ArithmeticProg {
    public static void main(String[] args) {
        int y, z, sum;
        Scanner isi = new Scanner (System.in);
        System.out.println("Type a number: ");
        y = isi.nextInt();
        
        System.out.append("type other number: ");
        z = isi.nextInt();
        
        sum = y - z;
        System.out.println("Sum is:" +sum);
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}*/

/*public class ArithmeticProg {
    public static void main(String[] args) {
        int A, B, sum;
        Scanner isi = new Scanner (System.in);
        System.out.println("Type a number: ");
        A = isi.nextInt();
        
        System.out.append("type other number: ");
        B = isi.nextInt();
        
        sum = A * B;
        System.out.println("Sum is:"+ sum);
        
        
        
        
        
        // TODO code application logic here
    }
    
}*/

/*public class ArithmeticProg {
    public static void main(String[] args) {
        int c, d, sum;
        Scanner isi = new Scanner (System.in);
        System.out.println("Type a number: ");
        c = isi.nextInt();
        
        System.out.append("type other number: ");
        d = isi.nextInt();
        
        sum = c / d;
        System.out.println("Sum is:"+ sum);
        
        
        
        
        
        // TODO code application logic here
    }
    
}*/

/*public class ArithmeticProg {
    public static void main(String[] args) {
        int e, f, sum;
        Scanner isi = new Scanner (System.in);
        System.out.println("Type a number: ");
        e = isi.nextInt();
        
        System.out.append("type other number: ");
        f = isi.nextInt();
        
        sum = e % f;
        System.out.println("Sum is:"+ sum);
        
        
        
        
        
        // TODO code application logic here
    }
    
}*/

/*public class ArithmeticProg {
    public static void main(String[] args) {
        int y, z;
        Scanner isi = new Scanner (System.in);
        System.out.println("Type a number: ");
        y = isi.nextInt();
        
        System.out.append("type other number: ");
        z = isi.nextInt();
        
        y++;
        z++;
                
        System.out.println("Incremented first number: " + y);
        System.out.println("Incremented second number: " + z);
        
        
        
        
        
        // TODO code application logic here
    }
    
}*/

/*public class ArithmeticProg {
    public static void main(String[] args) {
        int y, z;
        Scanner isi = new Scanner (System.in);
        System.out.println("Type a number: ");
        y = isi.nextInt();
        
        System.out.append("type other number: ");
        z = isi.nextInt();
        
        y--;
        z--;
                
        System.out.println("Decrement first number: " + y);
        System.out.println("Decrement second number: " + z);
        
        
        
        
        
        // TODO code application logic here
    }
    
}*/

/*public class ArithmeticProg {
    public static void main(String[] args) {
        
        String name,hobby,favoritefood;
        int age;
        
        Scanner isi = new Scanner(System.in);
        
        
        // Reads a single line from the console
        // and stores into name variable
        System.out.println("Name:");
        name = isi.nextLine();
        
        
        // Reads a integer from the console
        // and stores into age variable
        System.out.println("Age:");
        age=isi.nextInt();
        isi.nextLine();
        // Reads a single line from the console
        // and stores into name variable
        System.out.println("Hobby:");
        hobby = isi.nextLine();
        
        // Reads a single line from the console
        // and stores into name variable
        System.out.println("Favourite food:");
        favoritefood = isi.nextLine();
        isi.close();
        
    
        // Prints name and age to the console
        System.out.println("\n\nName :"+name);
        System.out.println("Age :"+age);
        System.out.println("Hobby :"+hobby);
        System.out.println("Favorite Food :"+favoritefood);
        
    }}*/

/*public class ArithmeticProg {
    public static void main(String[] args) {
        int y, z, sum;
        Scanner isi = new Scanner (System.in);
        System.out.println("Tahun sekarang: ");
        y = isi.nextInt();
        
        System.out.append("Tahun lahir: ");
        z = isi.nextInt();
        
        sum = y - z;
        System.out.println("umur kau (haha dah tua):" +sum);
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}*/


/*public class ArithmeticProg {

    public static void main(String[] args) {
        String name, subject, favouriteFood,ID;
        
        Scanner isi = new Scanner(System.in);

        System.out.println("Name:");
        name = isi.nextLine();

        System.out.println("ID:");
        ID = isi.nextLine();
      

        System.out.println("Subject:");
        subject = isi.nextLine();

        System.out.println("Favourite food:");
        favouriteFood = isi.nextLine();

        isi.close();

        System.out.println("\n\nName: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Subject: " + subject);
        System.out.println("Favourite food: " + favouriteFood);
    }
}*/
    

/*public class ArithmeticProg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name,id,subject;
        double UJ1,UJ2;
     
        System.out.println("Apa nama pelajar:");
        name = scanner.nextLine();

        System.out.println("Apa ID pelajar:");
        id = scanner.nextLine();

        System.out.println("Enter subject:");
        subject = scanner.nextLine();

        System.out.println("Enter marks for UJ 1 (/100):");
        UJ1 = scanner.nextDouble();

        System.out.println("Enter marks for UJ 2 (/100):");
        UJ2 = scanner.nextDouble();

     
        double average = (UJ1 + UJ2) / 2;

       
        System.out.println("\nStudent Info=");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Mark (bersyukur seadanya): " + average);
    }
}*/



/*public class ArithmeticProg {

    public static void main(String[] args) {
        Scanner Mehsini = new Scanner(System.in);

        String name = Mehsini.nextLine();
        System.out.println("Welcome to the BMI Calculator!");
        System.out.print("Enter your name: ");
        
        double weight = Mehsini.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        
        float height = Mehsini.nextFloat(); 
        System.out.print("Enter your height in CM: ");
        

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Display BMI and interpretation
        System.out.println("\nBMI Result:");
        System.out.println("Name: " + name);
        System.out.printf("Weight: %.2f kg\n", weight);
        System.out.printf("Height: %.2f CM\n", height);
        System.out.printf("BMI: %.2f\n", bmi);
        interpretBMI(bmi);

        Mehsini.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, float height) { 
        return weight / (height * height);
    }

    // Method to interpret BMI
    public static void interpretBMI(double bmi) {
        System.out.print("BMI Interpretation: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}*/

/*public class ArithmeticProg {
    
    public static void main(String[] args) {
        Scanner Mehsini = new Scanner(System.in);

        System.out.println("Welcome to the BMI Calculator!");
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = Mehsini.nextDouble();
        
        System.out.print("Enter your height in centimeters: ");
        float height = Mehsini.nextFloat();
        
        // Convert height from centimeters to meters
        height = height / 100;

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Display BMI and interpretation
        System.out.println("\nBMI Result:");
        System.out.printf("Weight: %.2f kg\n", weight);
        System.out.printf("Height: %.2f centimeters\n", height);
        System.out.printf("BMI: %.2f\n", bmi);
        interpretBMI(bmi);

        Mehsini.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, float height) { 
        return weight / (height * height);
    }

    // Method to interpret BMI
    public static void interpretBMI(double bmi) {
        System.out.print("BMI Interpretation: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}*/

/*public class ArithmeticProg {
    public static void main(String[] args) {
        Scanner imbas = new Scanner(System.in);
        String itemName;
        int quantity;
        double price,discountRate,totalPrice,discountAmount,priceAfterDiscount;

        
        System.out.println("Enter item name:");
        itemName = imbas.nextLine();

        System.out.println("Enter item price:");
        price = imbas.nextDouble();

        System.out.println("Enter quantity:");
        quantity = imbas.nextInt();

        System.out.println("Enter discount rate (in %):");
        discountRate = imbas.nextDouble();

        
        totalPrice = price * quantity;

        
        discountAmount = totalPrice * (discountRate / 100);

        
        priceAfterDiscount = totalPrice - discountAmount;

        
        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price After Discount: RM" + priceAfterDiscount);
    }
}*/

public class ArithmeticProg {
    public static void main(String[] args) {
        
        int z = 20;

        
        System.out.println("Initial value of z: " + z);
        System.out.println("Pre-increment (++z): " + (++z)); 
        System.out.println("Value of z after pre-increment: " + z);
        System.out.println("Pre-increment ++z, increments the value first, then uses it ");

        
        System.out.println("Post-increment (z++): " + (z++));
        System.out.println("Value of z after post-increment: " + z);
        System.out.println("Post-increment z++,Uses the value first,then increments it.");

        
        System.out.println("Pre-decrement (--z): " + (--z)); 
        System.out.println("Value of z after pre-decrement: " + z);
        System.out.println("Pre-decrement --z, decrements the value first,then uses it");

        
        System.out.println("Post-decrement (z--): " + (z--));
        System.out.println("Value of z after post-decrement: " + z);
        System.out.println("Post-decrement z--, uses the value first, then decrements it");
    }
    
}