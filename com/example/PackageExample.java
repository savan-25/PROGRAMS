package com.example. Calculator;
public class PackageExample {  
    public static void main(String[] args) {  
        Calculator calculator = new Calculator();  
        int result = calculator.add(5, 3);  
        System.out.println("Addition: " + result);  
        result = calculator.subtract(5, 3);  
        System.out.println("Subtraction: " + result);  
        result = calculator.multiply(5, 3);  
        System.out.println("Multiplication: " + result);  
        result = calculator.divide(10, 2);  
        System.out.println("Division: " + result);  
    }  
}  