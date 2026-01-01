// This is a simple Java program that prints "Hello, World!" to the console.

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// The following code is a complete Java program that includes comments explaining its functionality.

// public class Main{
//     public static void main(String[] args){
//         // opopver first program
//         System.out.println("hello world !!");
//         // This line prints a greeting to the console.
//     }
// }

// //////////////////////////////////////String////////////////////////////////////////////////////

// This Java program demonstrates the use of variables and prints them to the console.

// public class Main{
//     public static void main(String [] args){
//         // Variables
//         String name = "jobanpreetsingh";
//         String surname = "singh";
//         int age = 23;

//         // Use the variable 'name'
//         System.out.println("Name: " + name);
//         System.out.println("Surname: " + surname);
//         System.out.println("Age: " + age);
//     }
// }

// This Java program defines a class named Main and includes a main method.

// public class Main{
//     public static void main(String [] args)  {
//         // bytes - 1 [-128 to 127]
//         // short - 2 [-32768 to 32767]
//         // int - 4 [-2147483648 to 2147483647]
//         // long - 8 [-9223372036854775808 to 9223372036854775807]
//         // float - 4 [3.40282347E+38 to 1.40129846432481707E-45]
//         // double - 8 [1.79769313486231570E+308 to 4.94065645841246544E-324]
//         // char - 2 [0 to 65535]
//         // boolean - 1 [true or false]
//     }
// }

// This Java program demonstrates the use of different data types and their sizes in bytes.
// primitive data types in Java include byte, short, int, long, float, double, char, and boolean.

// public class Main{
//     public static void main(String[] args){
//         byte age = 23; // 1 bytes
//         short year = 2003 ; // 2 bytes
//         int phone = 1000000000; // 4 bytes
//         float pi = 3.14f; // 4 bytes
//         double e = 2.718281828459045; // 8 bytes
//         char initial = 'J'; // 2 bytes
//         boolean isStudent = true; // 1 byte
//         long phoneNumber = 12345678901L; // 8 bytes
//     }
// }

// This Java program demonstrates the use of non-primitive data types such as String, Arrays, Classes, and Interfaces.

// public class Main{
//     public static void main(String[] args) {
//         // Non primitive data types in Java include String, Arrays, Classes, and Interfaces.
//         String name = "Jobanpreet Singh"; 
//         System.out.println("Name: " + name);
//         System.out.println(name.length());

//     }
// }

// This Java program demonstrates the use of non-primitive data types, specifically String.

// public class Main{
//     public static void main(String[] args) {
//         // Non primitive data types in Java include String, Arrays, Classes, and Interfaces.
//         String name = "Jobanpreet Singh";
//         // Using a String literal to create a String object

//         String name1 = new String("Jobanpreet Singh");
//         // Using the String constructor to create a new String object

//         System.out.println("Name: " + name);
//         System.out.println(name.length());

//         System.out.println("Name1: " + name1);
//         System.out.println(name1.length());

//     }
// }

// This Java program demonstrates string concatenation using the + operator.
// funtions 

// public class Main {
//     public static void main(String[] args) {
//         // string
//         // concatenation
//         String firstName = "Jobanpreet";
//         String lastName = "Singh";
//         String fullName = firstName + " " + lastName; // Concatenating strings
//         System.out.println("Full Name: " + fullName);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // String
//         // CharAt
//         String name = "Jobanpreet Singh";
//         System.out.println(name.charAt(1)); // Prints the first character of the string

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // String
//         // Length
//         String name = "Jobanpreet Singh";
//         System.out.println(name. length()); // Prints the length of the string

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // String
//         // replace
//         String name = "Jobanpreet Singh";
//         String name2 = name.replace("Singh", "chahal"); // Replaces "Jobanpreet" with "John"
//         System.out.println(name2); // Prints the modified string
//         System.out.println(name); // Prints the original string
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // String
//         //substring
//         String name = "Jobanpreet Singh";
//         System.out.println(name.substring(0, 5)); // Prints the substring from index 0 to 5
//         System.out.println(name.substring(5 , 10)); // Prints the substring from index 6 to the end
//     }
// }

// //////////////////////////////////////////// arrays///////////////////////////////////////////////////////////////

// public class Main {
//     public static void main(String[] args) {
//         // arrays
//         int age = 23;
//         int physicsMarks = 90;
//         int chemistryMarks = 85;
//         int mathMarks = 95;
//         // Creating an array to store marks
//         int [] marks = new int[3]; // Array of size 3
//         marks [0] = physicsMarks; // Assigning values to the arrays can also add only marks
//         marks [1] = chemistryMarks; // Assigning values to the arrays can also add only marks
//         marks [2] = mathMarks; // Assigning values to the arrays can also add only marks
//         // Printing the marks
//         System.out.println("Physics Marks: " + marks[0]);
//         System.out.println("Chemistry Marks: " + marks[1]);
//         System.out.println("Math Marks: " + marks[2]);
//     }
// }

// /functioms///////////////////////////

// // This Java program demonstrates the use of arrays to store and manipulate data.

// public class Main {
//     public static void main(String[] args) {
//         // arrays
//         int age = 23;
//         int physicsMarks = 90;
//         int chemistryMarks = 85;
//         int mathMarks = 95;
//         // Creating an array to store marks
//         int[] marks = new int[3]; // Array of size 3
//         marks[0] = physicsMarks; // Assigning values to the array
//         marks[1] = chemistryMarks; // Assigning values to the array
//         marks[2] = mathMarks; // Assigning values to the array
//         // Printing the length
//         System.out.println(marks.length); // Prints the length of the array its a property in java 
//     }
// }

// import java.util.Arrays;
// public class Main {
//     public static void main(String[] args) {
//         // arrays
//         int age = 23;
//         int physicsMarks = 90;
//         int chemistryMarks = 85;
//         int mathMarks = 95;
//         // Creating an array to store marks
//         int[] marks = new int[3]; // Array of size 3
//         marks[0] = physicsMarks; // Assigning values to the array
//         marks[1] = chemistryMarks; // Assigning values to the array
//         marks[2] = mathMarks; // Assigning values to the array
//         // Printing the length
//         System.out.println(marks.length); // Prints the length of the arrays
//         // printing sorted array
//         System.out.println(marks[0]); // Prints the first element of the array
//         Arrays.sort(marks); // Sorts the array in ascending order
//         System.out.println(marks[0]); // Prints the first element of the sorted array
//     }
// }

// This Java program demonstrates the use of arrays to store and manipulate data.
// It initializes an array with values and prints specific elements from a 2D array.

// public class Main {
//     public static void main(String[] args) {
//         // arrays
//         int[] marks = {90, 85, 95}; // Initializing an array with values 
//         int [] [] marks2 = {{90, 85, 95}, {80, 75, 70}}; // Initializing a 2D array with values
//         // Printing the first element of the arrays
//         System.out.println(marks2[0][0]); // Prints the first element of the first arrays
//         System.out.println(marks2[1][0]); // Prints the first element of the second arrays
//         System.out.println(marks2[0][1]); // Prints the second element of the first arrays
//         System.out.println(marks2[1][1]); // Prints the second element of the second arrays
//         System.out.println(marks2[0][2]); // Prints the third element of the first arrays
//         System.out.println(marks2[1][2]); // Prints the third element of the aecond arrays
//     }
// }

// Casting /////////////////////////////////////
// This Java program demonstrates implicit and explicit casting between data types.

// public class Main {
//     public static void main(String[] args) {
//         // Casting
//         int num = 10; // Integer value
//         double d = num; // Implicit casting from int to double
//         System.out.println("Double value: " + d); // Prints the double value

//         double d2 = 9.78; // Double value
//         int num2 = (int) d2; // Explicit casting from double to int
//         System.out.println("Integer value: " + num2); // Prints the integer value
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // casting
//         double price = 100.00; // Double values
//         double finalprice = price + 18; // Double values

//         System.out.println("finalprice: " + finalprice); // Prints the final price
//         System.out.println("price: " + price); // Prints the original price

//         int p = 100; // Integer value
//         int f = p + (int)18.18; // Integer values
//         System.out.println("f: " + f); // Prints the final price as an integer
//         System.out.println("p: " + p); // Prints the original price as an integer 

//     }
// }

// constants /////////////////////////////////////

// public class Main {
//     public static void main(String[] args) {
//         // Constants
//         final int AGE = 23; // Constant variable
//         System.out.println("Age: " + AGE); // Prints the constant value

//         // Uncommenting the next line will cause a compilation error because AGE is a constant
//         // AGE = 24; // This line would cause an error if uncommented
//     }
// }

// //////////////////////////////operator////////////////////////////////////////
// arithmetic operators , assignment operators, logical operators , comparison operators, conditional operators

// public class Main {
//     public static void main(String[] args) {
//         // Arithmetic Operators
//         int a = 10;
//         int b = 5;
//         System.out.println("Addition: " + (a + b)); // Addition
//         System.out.println("Subtraction: " + (a - b)); // Subtraction
//         System.out.println("Multiplication: " + (a * b)); // Multiplication
//         System.out.println("Division: " + (a / b)); // Division
//         System.out.println("Modulus: " + (a % b)); // Modulus

//         // Assignment Operators
//         int c = 20;
//         c += 5; // c = c + 5
//         System.out.println("After += : " + c);
//         c -= 3; // c = c - 3
//         System.out.println("After -= : " + c);
//         c *= 2; // c = c * 2
//         System.out.println("After *= : " + c);
//         c /= 4; // c = c / 4
//         System.out.println("After /= : " + c);
//         c %= 3; // c = c % 3.14f
//         System.out.println("After %= : " + c);
//         c ++; // Increment operators
//         System.out.println("After ++ : " + c);
//         c --; // Decrement operators
//         System.out.println("After -- : " + c);

//         // Logical Operators
//         int x = 30;
//         int y = 60;
//         if (x > 20 && y < 50) { // Logical AND
//             System.out.println("Both conditions are true");
//         }
//         if (x > 20 || y < 50) { // Logical OR
//             System.out.println("At least one condition is true");
//         }
//         if (!(x > 20 && y < 50 )) { // Logical NOT
//             System.out.println("x is not less than 20");
//         }

//         boolean isAdult = true;
//         if (!isAdult) { // Logical NOT
//             System.out.println("Not an adult");
//         } else {
//             System.out.println("Is an adult");
//         }
//         if (isAdult) { // Logical NOT
//             System.out.println("Is an adult");
//         } else {
//             System.out.println("Not an adult");
//         }

//         // Comparison Operators
//         System.out.println("Equal to: " + (a == b)); // Equal to
//         System.out.println("Not equal to: " + (a != b)); // Not equal to
//         System.out.println("Greater than: " + (a > b)); // Greater than
//         System.out.println("Less than: " + (a < b)); // Less than
//         System.out.println("Greater than or equal to: " + (a >= b)); // Greater than or equal to
//         System.out.println("Less than or equal to: " + (a <= b)); // Less than or equal to

//         // Conditional Operator (Ternary Operator)

//         boolean isSunUp= true;
//         if (isSunUp)
//             System.out.println("It's daytime");
//         else 
//             System.out.println("It's nighttime");

//         int age=23;
//         if (age >= 18) 
//             System.out.println("You are an adult");
//         else 
//             System.out.println("You are a minor");     

//         int q1=10;
//         int q2=8;
//         int q3=5;
//         int max = (q1 > q2) ? ( (q1 > q3) ? q1 : q3 ) : ( (q2 > q3) ? q2 : q3 );
//         System.out.println("Maximum: " + max); // Prints the maximum value among q1, q2, and q3

//         }
// }

// This Java program demonstrates the use of conditional statements to determine what a user can buy based on their cash.
// It uses if-else statements to check the amount of cash and prints appropriate messages.

// import java.util.Scanner; // Importing the Scanner class for input
// public class Main{
//     public static void main(String[] args){
//         // conditional statements
//         Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
//         //pen = 10; notebook = 40 
//         System.out.print("Enter your cash: "); // Prompt the user for input
//         int cash = sc.nextInt(); // Read an integer input from the user
//         if (cash < 10){
//             System.out.println("Not enough cash to buy a anything");
//             System.out.println("get more cash");
//         } 
//         else if (cash >= 10 && cash < 40) {
//             System.out.println("You can buy a pen or notebook");
//         }
//         else{
//             System.out.println("You can buy a pen, notebook or book");        }

//     }
// }

// public class Main {
//     public static void main(String[]args){
//         // condrional statements - switch case
//         int day = 1; // 1-monday;2-tuesday;3-wednesday;4-thursday;5-friday;6-saturday;7-sunday
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break; // Break statement to exit the switch case
//             case 2:
//                 System.out.println("Tuesday");
//                 break; // Break statement to exit the switch case
//             case 3:
//                 System.out.println("Wednesday");
//                 break; // Break statement to exit the switch case
//             default:
//                 System.out.println("thursday-sunday");
//                 // Default case if none of the above cases match
//         }
//     }
// }

// maths class////////////////////////////////////////////////////////

// public class Main {
//     public static void main(String[] args) {
//         // Math class
//         double num1 = 9.0;
//         double num2 = 16.0;

//         // Maximum and Minimum
//         System.out.println("Maximum of " + num1 + " and " + num2 + ": " + Math.max(num1, num2));
//         System.out.println("Minimum of " + num1 + " and " + num2 + ": " + Math.min(num1, num2));

//         //random number
//         System.out.println("Random number: " + (int)(Math.random()*100)); // Generates a random number between 0.0 and 1.0

//         // Square root
//         System.out.println("Square root of " + num1 + ": " + Math.sqrt(num1));
//         System.out.println("Square root of " + num2 + ": " + Math.sqrt(num2));

//         // Power
//         System.out.println(num1 + " raised to the power of 2: " + Math.pow(num1, 2));
//         System.out.println(num2 + " raised to the power of 3: " + Math.pow(num2, 3));

//         // Absolute value
//         System.out.println("Absolute value of -5: " + Math.abs(-5));

//     }
// }

// input and output////////////////////////////////////////////////////
// This Java program demonstrates how to take user input and print it to the console.

// import java.util.Scanner; // Importing the Scanner class for input
// public class Main {
//     public static void main(String[] args) {
//         // Input 
//         Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
//         System.out.print("Enter your age: "); // Prompt the user for input
//         int age = sc.nextInt(); // Read a string input from the user
//         System.out.println("your age " + age); // Print the input value to the console
//         System.out.print("Enter your height: "); // Prompt the user for input
//         float height = sc.nextFloat(); // Read a float input from the user
//         System.out.println("your height " + height); // Print the input value to the console
//         System.out.print("Enter your name: "); // Prompt the user for input
//         String name = sc.nextLine(); // Read a string input from the user
//         System.out.println("your name " + name); // Print the input value to the console
//     }
// }

// import java.util.Scanner; // Importing the Scanner class for input
// public class Main {
//     public static void main(String[] args) {
//         // Input 
//         Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
//         System.out.print("Enter your name: "); // Prompt the user for input
//         String name = sc.nextLine(); // Read a string input from the user
//         System.out.println("your name " + name); // Print the input value to the console
//         System.out.print("Enter your age: "); // Prompt the user for input
//         int age = sc.nextInt(); // Read a string input from the user
//         System.out.println("your age " + age); // Print the input value to the console
//         System.out.print("Enter your height: "); // Prompt the user for input
//         float height = sc.nextFloat(); // Read a float input from the user
//         System.out.println("your height " + height); // Print the input value to the console

//     }
// }

// loops///////////////////////////////////////////////////////

// This Java program demonstrates the use of loops to print numbers from 1 to 100 and from 100 to 1.

// public class Main{
//     public static void main(String[]agrs){
//         //for loops 
//         System.out.println(1);
//         System.out.println(2);
//         System.out.println(3);

//         //1-100
//         for (int i=1;i<=100; i++){
//             System.out.println(i); // Prints numbers from 1 to 100
//         }
//         //100-1
//         for(int i=100; i>=1; i--){
//             System.out.println(i); // Prints numbers from 100 to 1
//         }
//     }
// } 

// This Java program demonstrates the use of while loops and do-while loops to print numbers in a specific range.

// public class Main {
//     public static void main(String[] args) {
//         // while loops
//         int i = 1; // Initialize the counter variable
//         while (i <= 100) { // Loop condition
//             System.out.println(i); // Print the current value of i
//             i++; // Increment the counter variable
//         }
//         while(i >= 1) { // Loop condition
//             System.out.println(i); // Print the current value of i
//             i--; // Decrement the counter variable
//         }
//         // do while loops
//         int j = 100; // Initialize the counter variable
//         do {
//             System.out.println(j); // Print the current value of java
//             j--; // Decrement the counter variables
//         }
//         while (j >= 1); // Loop condition 
//     }
// }

// import java.util.Scanner; // Importing the Scanner class for input
// public class Main {
//     public static void main(String[] args) {
//         // loop
//         int number = 0; // Initialize the counter variable
//         do {
//         Scanner sc= new Scanner(System.in); // Create a Scanner object to read input
//         System.out.print("Enter a number: "); // Prompt the user for input
//         number = sc.nextInt(); // Assign the input value to the already declared variable
//         System.out.print("here is your numbers:"); // Print a message to the console
//         System.out.println(number); // Print the input value to the console

//     }while(number >=0); // Loop condition to continue until a negative number is entered
//         // The loop will continue to prompt the user for input until a negative number is entered
//         System.out.println("Exiting the loop !"); // Print a message when exiting the loop
//     }
// }

// This Java program demonstrates the use of break and continue statements in a while loop.

// public class Main {
//     public static void main(String[] args) {
//     //break & cotinue
//     int i=0;    
//     while(true){
//         if (i == 3) {
//             i = i + 1; // Increment the counter variable
//             continue; // Skip the rest of the loop iteration when i equals 3
//         }
//         System.out.println(i); // Print the current value of i
//         i= i + 1; // Increment the counter variables
//         if(i > 5){
//             System.out.println("break the loop"); // Print a message when breaking the loop
//             break; // Exit the loop when i equals 5
//             }
//         }
//     }
// }

// exeption handling///////////////////////////////////////////////////////
// This Java program demonstrates exception handling using try-catch blocks.

// public class Main {
//     public static void main(String[] args) {
//         // Exception Handling - try-catch
//         int[] marks = {90, 85, 95}; // Array of marks
//        try{
//          System.out.println("Marks: " + marks[5]); // Print the marks at index 5
//         // This line will throw an ArrayIndexOutOfBoundsException because index 5 is out of bounds for the array
//        }
//        catch (Exception exception){
//         // do something after catching the exception
//        }
//         System.out.println("The name is Jobanpreet Singh"); // Print a messages
//         // This line will be executed even if an exception occurs in the try block
//     }
// }

// methods///////////////////////////////////////////////////////
// This Java program demonstrates the use of methods

// public class Main {
//     public static void printjava(){
//         System.out.println("hello java");
//     }
//     public static void printname(String name){
//         System.out.println(name);

//     }
//     public static void printsum(int a, int b){
//         int sum=a+b;
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         // Methods
//         printjava();
//         printname("aman");
//         printname("appu");
//         printsum(2, 8);
//     }
// }

// mini project///////////////////////////////////////////////////////////////

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//     //mini project
//     Scanner sc = new Scanner(System.in);
//     int myNumber= (int)(Math.random()*1000);
//     int userNumber=0;
//     do{
//         System.out.println("Guess my number (1-1000): ");
//         userNumber = sc.nextInt();
//         if (userNumber == myNumber){
//             System.out.println("WOOHOO .. CORRECT NUMBER !!!");
//             break;
//         }
//         else if (userNumber > myNumber){
//             System.out.println("your nunmber is too large");
//         }
//         else {
//             System.out.println("youer number is too small");
//         }
//     }
//     while(userNumber >=0);
//     System.out.println("MY NUMBER WAS :");
//     System.out.println(myNumber);

//     }
// }

// paper/////////////////////////////////////////////////////////////////////////

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int columns = sc.nextInt();
//         int c = rows * columns;
//         System.out.println("Here is your paper:" +c);
//     }
// }

// ///////////////////////

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number a ");
//         int a = sc.nextInt();
//         System.out.print("Enter the number b ");
//         int b = sc.nextInt();
//         int mul = a * b;
//         System.out.println("Here is mul of a and b :" +mul);
//     }
// }



// //////////////

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the car color: ");
//         String car = sc.nextLine();
//         System.out.println("Enter the car speed: ");
//         String speed = sc.nextLine();
//         System.out.println("car color is :" + car + "  at speed is :" + speed);
//     }
// }


// public class Main{
//     String color;
//     int speed;
//     void start(){
//         System.out.println("color of car started is" + color + "  at speed is :" + speed);
//     }

//     public static void main(String[] args) {
//         Main car1 = new Main();
//         car1.color = "red";
//         car1.speed = 100;
//         car1.start();
//     }
// }

// This Java program demonstrates exception handling using try-catch-finally blocks.
// public class Main {
//     public static void main(String[] args) {
//         // Exception Handling - try-catch-finally
// try {
//     // Code that might throw an exception
//     int result = 10 / 0;  // This throws ArithmeticException
// } catch (ArithmeticException e) {
//     // Handle the specific exception
//     System.out.println("Error: Cannot divide by zero!");
// } catch (Exception e) {
//     // Catch any other exceptions
//     System.out.println("An unexpected error occurred: " + e.getMessage());
// } finally {
//     // Always executes
//     System.out.println("Cleanup: This always executes.");
// }
//     }
// }



// public class Main{
//     public static void main(String[] args) {
//         String s1="hello";
//         String s2="Hello";
//         System.out.println(s1.equals(s2));
//         System.out.println(s1.equalsIgnoreCase(s2));
//         System.out.println(s1.startsWith("he"));
//         System.out.println(s1.endsWith("lo"));
//         System.out.println(s1.contains("el"));
//         System.out.println(s1.compareTo(s2));
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         String s1="hello world";
//         String s2="Hello";
//         System.out.println("s1 . substring(3,7) "+ s1.substring(3,7) );

//     }
// }

// import java.util.StringTokenizer;
// public class Main {
//     public static void main(String[] args) {
      
//         // Input string
//         String s = "Hello Geeks how are you";

//         // Create a StringTokenizer object 
//         // with space as the delimiter
//         StringTokenizer st = new StringTokenizer(s," ");

//         // Tokenize the string and print each token
//         while (st.hasMoreTokens()) {
//             System.out.println(st.nextToken());
//         }
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         String s1="hello world";
//         String s2="Hello";
//         System.out.println(s1.toUpperCase());
//         System.out.println(s1.toLowerCase());
//         System.out.println(s1.charAt(2));
//         System.out.println(s1.equals(s2));
//         System.out.println(s1.concat(s2));
//         System.out.println(s1.indexOf("o"));
//         System.out.println(s1.length());
//         System.out.println(s1.substring(3,5));
//         System.out.println(s1.compareTo(s2));
//         System.out.println(s1.replace("world", "java"));
//     }

// }

// public class Main {
//     public static void main(String[] args) {

//             int a = 10;
//             int b = 2;
//             int c = 0;

//         try {
//             c = a / b;
//             System.out.println("Result: " + c);
//         } 
//         finally
//         {
//             System.out.println("Execution completed.");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//             int a = 10;
//             int b = 2;
//             int c = 0;
//             int [] num= {1,2,3};
//         try {
//             c = a / b;
//             System.out.println("Result: " + c);
//             System.out.println(num[5]);
//         } 
//         catch (ArithmeticException e) {
//             System.out.println("Error: Cannot divide by zero!");
//         }
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Error: Array index is out of bounds!");
//         }
//         finally
//         {
//             System.out.println("Execution completed.");
//         }
//     }
// }

// public class Main {
//     static void checkAge(int a) {
//         if (a < 18) {
//             throw new ArithmeticException("access denied");
//     }
//         else{
//             System.out.println("access granted");
//         }
// }
//     public static void main(String[] args){
//         checkAge(10);
//     }
// }

// import java.io.*;
// class checkedexample{
//     public static void main(String[] args) {
//         try{
//             FileReader fr = new FileReader("abc.txt");
//         }
//         catch (IOException e){ {
//             System.out.println("File not found: " + e);
//         }
//     }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         String s1="hell0";    // stored in String contant pool
//         String s2=new String("Hello"); // stored in heap memory
//         System.out.println(s1.equals(s2));
//         System.out.println(s2.equalsIgnoreCase(s2));
//         System.out.println(s1.startsWith("he"));;
//         System.out.println(s1.endsWith("lo"));
//         System.out.println(s1.contains("el"));
//         System.out.println(s1.compareTo(s2));

//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         String s1="helloworld";
//         String s2=" Hello ";
//         System.out.println(s1.length());
//         System.out.println(s1.toUpperCase());
//         System.out.println(s1.toLowerCase());
//         System.out.println(s1.substring(2,5));
//         System.out.println(s1.replace("world", "java"));
//         System.out.println("[" + s2 + "]");
//         System.out.println("["+s2.trim()+"]");
//         System.out.println(s2.trim());
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         String s1="hello world";
//         String s2="Hello";
//         System.out.println("adding strings:" + s1 + s2);
//         System.out.println(s1.concat(s2));
//         System.out.println(s1.concat(" ") .concat(s2));
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         String s1="hello world";
//         String s2="Hello";
//         System.out.println(s1.substring(2));
//         System.out.println(s1.substring(2,7));
//     }
// }

// public class Main{
//         public static void main(String[] args) {
//             String S1="helloworld";
//             String S2="Helloworld";
//             System.out.println(S1==S2);
//             System.out.println(S1.equals(S2));
//             System.out.println(S1.equalsIgnoreCase(S2));

//             String S3=new String("helloworld");
//             System.out.println(S1==S3);

//         }

// }


// public class Main{
//     public static void main(String[] args){
//         try{
//             int a=10;
//             int b=0;
//             int c=a/b;
//             System.out.println("Result: " + c);
//             int [] num={1,2,3};
//             System.out.println(num[5]);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Error: Cannot divide by zero!");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Error: Array index is out of bounds!");
//         }
//     }
// }

// public class Main{
//     static void fun(int a) throws ArithmeticException{
//         if(a<18){
//             throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//         }
//         else{
//             System.out.println("Access granted - You are old enough!");
//         }
//     }
//     public static void main(String[] args){
//         fun(15);
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         try{
//             FileReader fr = new FileReader("abc.txt");
//         }
//         catch (IOException e){
//             System.out.println("File not found: " + e);
//         }
//         finally{
//             System.out.println("Execution completed.");
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         try{
//             int a=10;
//             int b=0;
//             int c=a/b;
//             System.out.println("Result: " + c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Error: Cannot divide by zero!");
//         }
//         finally{
//             System.out.println("Execution completed.");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//     String s1="hello";
//     String s2="Hello";
//     System.out.println(s1.equals(s2));
//     System.out.println(s1.equalsIgnoreCase(s2));
//     System.out.println(s1.startsWith("he"));
//     System.out.println(s1.endsWith("lo"));
//     }
// }

// import java.util.StringTokenizer;
// public class Main {
//     public static void main(String[] args) {
//         String name = "I , am ,Joban , preet , Singh";
//         StringTokenizer st = new StringTokenizer(name, ",");
//         while (st.hasMoreTokens()) {
//             System.out.println(st.nextToken());
//         }
//         StringTokenizer s1 = new StringTokenizer("Lets practice at GeeksforGeeks");
//         System.out.println(s1.countTokens());
//         while (s1.hasMoreElements()) {
//             System.out.println(s1.nextToken());
//         }

//     }
// }

// class Animal {
//     void sound1() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal {
//     void sound2() {
//         System.out.println("Dog barks");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Dog obj= new Dog(); // Upcasting
//         obj.sound1(); 
//         obj.sound2(); 
//     }
// }

// class Animal {
//     void sound1() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal {
//     void sound2() {
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Dog {
//     void sound3() {
//         System.out.println("Cat meows");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Cat myAnimal = new Cat(); // Upcasting
//         myAnimal.sound1(); 
//         myAnimal.sound2(); 
//         myAnimal.sound3();  
//     }
// }


// class Animal {
//     void sound1() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal {
//     void sound2() {
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Animal {
//     void sound3() {
//         System.out.println("Cat meows");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Dog myDog = new Dog(); // Upcasting
//         myDog.sound1();
//         myDog.sound2();
//         Cat myCat = new Cat(); // Upcasting
//         myCat.sound1();
//         myCat.sound3();
//     }
// }

// class Animal {
//     void sound1() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal {
//     void sound1() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog myAnimal = new Dog(); // Upcasting
//         myAnimal.sound1();
//     }
// }

// class Animal {
//     int sound1(int a , int b) {
//         System.out.println("Animal makes a sound");
//         return a + b;
//     }
// }
// class Dog extends Animal {
//     int sound1(int a , int b , int c) {
//         System.out.println("Dog barks");
//         return a + b + c;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Dog myAnimal = new Dog(); // Upcasting
//         System.out.println(myAnimal.sound1(2,3));
//         System.out.println(myAnimal.sound1(2,3,4));
//     }
// }

// import static java.lang.Math.max;
// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         System.out.println("Maximum value is: " + max(a, b));
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         System.out.println("Maximum value is: " + Math.max(a, b));
//     }
// }




// class aaim{
//     final int num = 10;
// } 
// class bbb extends aaim{
//     @Override 
//     void display(){
//         // num = 20; // This line would cause an error if uncommented
//         System.out.println("num: " + num);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         bbb obj = new bbb();
//         obj.display();
//     }
// }


// import java.io.*;
// public class Main {
//     public static void main(String[] args) {
//         try{
//             FileInputStream fin = new FileInputStream("abc.txt");
//             FileOutputStream fout = new FileOutputStream("abc.txt");
//             int i;
//             String s="";
//             while((i=fin.read()) != -1){
//                 s = s + (char)i;
//             }
//             System.out.println("file content is :" + s);
//             fout.write(s.getBytes());
//             fout.close();
//             fin.close();

//         }
//         catch (IOException e){
//             System.out.println("File not found: " + e);
//         }

//     }
// }

// import java.io.*;
// public class Main {
//     public static void main(String[] args) {
//         try{
//             FileOutputStream fout = new FileOutputStream("abc.txt");
//             BufferedOutputStream bout = new BufferedOutputStream(fout);
//             String s="hello world";
//             byte b[]=s.getBytes();
//             bout.write(b);
//             bout.flush();--
//             bout.close();
//             fout.close();

//         }
//         catch (IOException e){
//             System.out.println("File not found: " + e);
//         }

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         String s1="hello world";
//         String s2="hello world";
//         System.out.println(s1==s2);
//         System.out.println(s1.equals(s2));
//         String s3=new String("hello world");
//         System.out.println(s1==s3);
//         System.out.println(s1.equals(s3));
//         System.out.println(s1.compareTo(s3));
//         System.out.println(s1.startsWith("hel"));
//         System.out.println(s1.endsWith("rld"));
//         S
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         String s1="hello world";
//         String s2=" Hello ";
//         System.out.println(s1 + s2);
//         System.out.println(s1.concat(s2));     
//     }
//   }

// public class Main {
//     public static void main(String[] args) {
//         String s1="hello world";
//         String s2=" Hello ";
//         System.out.println(s1.substring(2));
//         System.out.println(s1.substring(2,7));
//     }
//   }

// import java.util.StringTokenizer;
// public class Main {
//     public static void main(String[] args) {
//         String name = "I , am ,Joban , preet , Singh";
//         StringTokenizer st= new StringTokenizer(name, ",");
//         while (st.hasMoreTokens()) {
//             System.out.println(st.nextToken());
//         }
//     }
// }

// import java.util.StringTokenizer;
// public class Main {
//     public static void main(String[] args) {
//         String name = "I am Joban preet Singh";
//         StringTokenizer st= new StringTokenizer(name, " ");
//         while (st.hasMoreTokens()) {
//             System.out.println(st.nextToken());
//         }
//     }
// }

// import java.util.StringTokenizer;
// public class Main {
//     public static void main(String[] args) {
//         String name = "I , am ,Joban , preet , Singh";
//         StringTokenizer st= new StringTokenizer(name, ",");
//         while (st.hasMoreElements()) {
//             System.out.println(st.nextElement());
//         }
//     }
// }

// import java.util.StringTokenizer;
// public class Main {
//     public static void main(String[] args) {
//         String name = "I , am ,Joban , preet , Singh";
//         StringTokenizer st= new StringTokenizer(name, ",");
//         System.out.println(st.countTokens());
//         while (st.hasMoreTokens()) {
//             System.out.println(st.nextToken());
//         }
//     }
// }

// interface Main {
//     void display();
// }
// interface InnerMain extends Main {
//     void show();  
// }
// class Demo implements InnerMain {
//     public void display() {
//         System.out.println("Display method implementation");
//     }
//     public void show() {
//         System.out.println("Show method implementation");
//     }
// }
// public class Test {
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.display();
//         obj.show();
//     }
// }

// interface aaim{
//     void display();    
// }
// interface bbb{
//     void show();  
// }
// interface ccc extends aaim, bbb {
//     void print();
// }
// class demo implements ccc {
//     public void display() {
//         System.out.println("Display method implementation");
//     }
//     public void show() {
//         System.out.println("Show method implementation");
//     }
//     public void print() {
//         System.out.println("Print method implementation");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         demo obj = new demo();
//         obj.display();
//         obj.show();
//         obj.print();
//     }
// }

// class AA{
//     int price=700000;
//     final void display(){
//         System.out.println("swift car price is :" + price);
//     }
// }
// class BB extends AA{
//     int price=1500000;
//     final void show(){
//         System.out.println("honda car price is :"+ this.price);
//         System.out.println("swift car price((using superkeyword)) is :"+ super.price);
//     }   
// }
// public class Main {
//     public static void main(String[] args) {
//         BB obj = new BB();
//         obj.display();
//         obj.show();
//     }
// }

// class vahicle{
//     vahicle(){
//         System.out.println("vahicle is created");
//     }
    
// }
// class ain extends vahicle{
//     ain(){
//     super();
//     System.out.println("car is running");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         ain obj = new ain();
//     }
// }

// abstract class Animal {
//     abstract void sound();
//     void sleep() {
//         System.out.println("Animal is sleeping");
//     }
// }
// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Dog myAnimal = new Dog(); // Upcasting
//         myAnimal.sound();
//         myAnimal.sleep();
//     }
// }

// interface aa{
//     void display();
// }
// interface bb{
//     void show();
// }
// interface cc extends aa, bb{
//     void print();
// }
// class demo implements cc{
//     public void display(){
//         System.out.println("display method implementation");
//     }
//     public void show(){
//         System.out.println("show method implementation");
//     }
//     public void print(){
//         System.out.println("print method implementation");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         demo obj = new demo();
//         obj.display();
//         obj.show();
//         obj.print();
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         int a=10;
//         int b=20;
//         System.out.println("Maximum value is: " + Math.max(a, b));
//     }
// }