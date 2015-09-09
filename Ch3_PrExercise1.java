
import java.io.*;
import java.util.*;


public class Ch3_PrExercise1 {

    public static void main(String[] args) {
        
        // rectangle
        double length    = 10.25;
        double width     = 5.35;
        double perimeter = ((2*length) + (2*width));
        //circle
        double radius        = 15.6;
        double pi            = 3.1416;
        double area          = (Math.pow(radius, 2)*pi);
        double circumference = 2*pi*radius;
        //person info
        int age = 31;
        double beginningBalance = 18500.00;
        double interestRate = 3.50;
        double endBalance = 18553.96;
        String name = "Randy Gill";
        
        String fileName1 = "inData.txt";
        Scanner inFile = new Scanner(fileName1);
        String fileName2 = "outData.txt";
        
        try {
            PrintWriter outFile = new PrintWriter(fileName2);
            outFile.println("Rectangle: ");
            outFile.println("Length = " + length + ", Width = " + width + ", Perimeter = " + perimeter);
            outFile.println("Circle: ");
            outFile.println("Radius = " + radius + ", Area = " + area + ", Circumference = " + circumference);
            outFile.println("Person info: ");
            outFile.println("Name: " + name + ", Age: " + age);
            outFile.println("Beginning Balance = " + beginningBalance + ", Interest Rate = " + interestRate);
            outFile.println("Balance at the end of the month = " + endBalance);
            outFile.println("The letter that comes after " + ((char)65) + " in the ASCII set is " + ((char)66));
            outFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
        
    }
    
}
