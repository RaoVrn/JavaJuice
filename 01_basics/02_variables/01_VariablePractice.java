// VariablePractice.java
// JavaJuice - Homework 1: Meaningful Variable Declarations

/*
 * 📝 Homework 1:
 * Declare meaningful variables of different data types.
 * Example:
 * - age → int
 * - temperature → float
 * - isJavaFun → boolean
 * - grade → char
 * Print all the variables with their values.
 */



public class VariablePractice {
    public static void main(String[] args) {
        // int is used for whole numbers like age, count, etc.
        int age = 21;

        // float is used for decimal values; add 'f' at the end
        float temperature = 36.6f;

        // boolean stores true or false values
        boolean isJavaFun = true;

        // char stores a single character using single quotes
        char grade = 'A';

        // Print the values to the console using println
        System.out.println("Age: " + age);                       // Prints: Age: 21
        System.out.println("Temperature: " + temperature);       // Prints: Temperature: 36.6
        System.out.println("Is Java Fun? " + isJavaFun);         // Prints: Is Java Fun? true
        System.out.println("Grade: " + grade);                   // Prints: Grade: A
    }
}