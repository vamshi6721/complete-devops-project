package com.devops;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int passed = 0;
        int failed = 0;

        try {
            int result = calc.add(5, 3);
            if (result == 8) {
                System.out.println(" Addition test passed");
                passed++;
            } else {
                System.out.println(" Addition test failed");
                failed++;
            }
        } catch (Exception e) {
            failed++;
        }

        try {
            calc.divide(5, 0);
            failed++;
        } catch (ArithmeticException e) {
            System.out.println(" Division by zero test passed");
            passed++;
        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);

        if (failed > 0) {
            System.exit(1);
        }
    }
}
