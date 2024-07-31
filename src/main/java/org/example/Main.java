package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String input = read();
        String regex = "([+-]?\\d+)\\s*([+\\-*/])\\s*(\\d+)";
        Matcher m = Pattern.compile(regex).matcher(input);
        String firstOperand = "0";
        String operator = null;
        String secondOperand = "0";
        while (m.find()) {
            firstOperand = m.group(1);
            operator = m.group(2);
            secondOperand = m.group(3);
        }

        switch (operator) {
            case "+":
                Float resultAdd = add(Float.parseFloat(firstOperand), Float.parseFloat(secondOperand));
                System.out.println("The result of " + firstOperand + " " + operator + " " + secondOperand + " is " + resultAdd + ".");
                break;
            case "-":
                Float resultSubtract = subtract(Float.parseFloat(firstOperand), Float.parseFloat(secondOperand));
                System.out.println("The result of " + firstOperand + " " + operator + " " + secondOperand + " is " + resultSubtract + ".");
                break;
            case "*":
                Float resultMultiply = multiply(Float.parseFloat(firstOperand), Float.parseFloat(secondOperand));
                System.out.println("The result of " + firstOperand + " " + operator + " " + secondOperand + " is " + resultMultiply + ".");
                break;
            case "/":
                Float resultDivide = divide(Float.parseFloat(firstOperand), Float.parseFloat(secondOperand));
                System.out.println("The result of " + firstOperand + " " + operator + " " + secondOperand + " is " + resultDivide + ".");
                break;
        }
    }

    static String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number, operation to calculate ( + - * / ), and second number.");

        return scanner.nextLine();
    }

    static Float add(Float number1, Float number2) {
        return number1 + number2;
    }

    static Float subtract(Float number1, Float number2) {
        return number1 - number2;
    }

    static Float multiply(Float number1, Float number2) {
        return number1 * number2;
    }

    static Float divide(Float number1, Float number2) throws ArithmeticException {
        if (number2 == 0F) {
            throw new ArithmeticException("Cannot divide by zero.");
        } else {
            return number1 / number2;
        }
    }
}