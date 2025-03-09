/**
 * IsPrime - Prime Number Checker
 * Author: Ike Iloegbu
 * IDE: Visual Studio
 *
 * This program prompts the user to enter a positive number and determines whether it is a prime number.
 * The program uses regular expressions to extract the number from the user input.
 * - It supports large numbers (e.g., 982451653).
 * - It reads only the initial numeric part if non-digit characters are included.
 * - Floating-point numbers are truncated to integers.
 * - Negative numbers and inputs without valid digits exit the program.
 *
 * The prime number check uses an optimized algorithm for efficiency.
 */

 import java.util.Scanner;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 
 /**
  * Class IsPrime provides functionality to check if a number is prime.
  */
 public class IsPrime {
 
     /**
      * Determines whether a given number is prime.
      *
      * @param n the number to check for primality
      * @return true if the number is prime; false otherwise
      */
     static Boolean primeNum(int n) {
         if (n <= 1) {
             return false;
         } else if (n <= 3) {
             return true;
         } else if (n % 2 == 0 || n % 3 == 0) {
             return false;
         } else {
             for (int i = 5; i * i <= n; i += 6) {
                 if (n % i == 0 || n % (i + 2) == 0) return false;
             }
         }
         return true;
     }
 
     /**
      * Main method to run the prime number checker program.
      *
      * It prompts the user for input, extracts a number using regex,
      * and checks whether it is a prime number.
      * The loop continues until the user enters a number less than or equal to zero
      * or provides an invalid input.
      *
      * @param args command line arguments (not used)
      */
     public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
 
         do {
             try {
                 System.out.print("Enter a positive number (0 or negative to exit): ");
                 String input = myObj.nextLine();
 
                 // Use regex to extract leading digits
                 Pattern pattern = Pattern.compile("^\\d+");
                 Matcher matcher = pattern.matcher(input);
 
                 if (matcher.find()) {
                     // Extracted number string
                     String numberStr = matcher.group();
                     int floorInt = Integer.parseInt(numberStr);
 
                     if (floorInt <= 0) break;
 
                     // Check if the number is prime and print result
                     if (primeNum(floorInt)) {
                         System.out.println(floorInt + " is a prime number.");
                     } else {
                         System.out.println(floorInt + " is not a prime number.");
                     }
                 } else {
                     // If no digit is found in the input, exit the program
                     System.exit(0);
                 }
             } catch (Exception e) {
                 System.exit(0);
             }
         } while (true);
 
         myObj.close();
     }
 }
 