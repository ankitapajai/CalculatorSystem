package com.bootcoding.User_Command_Calculator;

public class NumberCommandApp {

        public static void main(String[] args) {
            if (args.length < 2) {
                System.out.println("Usage: java NumberCommandApp <command> <numbers>");
                System.exit(1);
            }

            String command = args[0];

            try {
                switch (command) {
                    case "add":
                        add(args);
                        break;
                    case "mul":
                        multiply(args);
                        break;
                    case "div":
                        divide(args);
                        break;
                    case "sub":
                        subtract(args);
                        break;
                    case "fact":
                        factorial(args);
                        break;
                    case "palindrome":
                        checkPalindrome(args);
                        break;
                    case "prime":
                        checkPrime(args);
                        break;
                    case "pow":
                        power(args);
                        break;
                    case "square":
                        square(args);
                        break;
                    case "max":
                        findMax(args);
                        break;
                    case "avg":
                        calculateAverage(args);
                        break;
                    case "sum":
                        calculateSum(args);
                        break;
                    case "even":
                        findEven(args);
                        break;
                    case "odd":
                        findOdd(args);
                        break;
                    default:
                        System.out.println("Unknown command: " + command);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide valid numbers.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        private static void add(String[] args) {
            double sum = 0;
            for (int i = 1; i < args.length; i++) {
                sum += Double.parseDouble(args[i]);
            }
            System.out.println("Sum: " + sum);
        }

        private static void multiply(String[] args) {
            double result = 1;
            for (int i = 1; i < args.length; i++) {
                result *= Double.parseDouble(args[i]);
            }
            System.out.println("Product: " + result);
        }

        private static void divide(String[] args) {
            double quotient = Double.parseDouble(args[1]);
            for (int i = 2; i < args.length; i++) {
                double divisor = Double.parseDouble(args[i]);
                if (divisor == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                quotient /= divisor;
            }
            System.out.println("Quotient: " + quotient);
        }

        private static void subtract(String[] args) {
            if (args.length < 3) {
                System.out.println("Usage: sub <num1> <num2> ...");
                System.exit(1);
            }

            double difference = Double.parseDouble(args[1]);
            for (int i = 2; i < args.length; i++) {
                difference -= Double.parseDouble(args[i]);
            }
            System.out.println("Difference: " + difference);
        }

        private static void factorial(String[] args) {
            for (int i = 1; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                long fact = 1;
                for (int j = 1; j <= num; j++) {
                    fact *= j;
                }
                System.out.println("Factorial of " + num + ": " + fact);
            }
        }

        private static void checkPalindrome(String[] args) {
            for (int i = 1; i < args.length; i++) {
                String str = args[i];
                boolean isPalindrome = true;
                for (int j = 0; j < str.length() / 2; j++) {
                    if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println(str + " is " + (isPalindrome ? "" : "not ") + "a palindrome.");
            }
        }

        private static void checkPrime(String[] args) {
            for (int i = 1; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                boolean isPrime = true;
                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(num); j++) {
                        if (num % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                System.out.println(num + " is " + (isPrime ? "" : "not ") + "a prime number.");
            }
        }

        private static void power(String[] args) {
            if (args.length != 3) {
                System.out.println("Usage: pow <base> <exponent>");
                System.exit(1);
            }

            double base = Double.parseDouble(args[1]);
            double exponent = Double.parseDouble(args[2]);
            double result = Math.pow(base, exponent);
            System.out.println(base + " ^ " + exponent + " = " + result);
        }

        private static void square(String[] args) {
            for (int i = 1; i < args.length; i++) {
                double num = Double.parseDouble(args[i]);
                double square = Math.pow(num, 2);
                System.out.println("Square of " + num + ": " + square);
            }
        }

        private static void findMax(String[] args) {
            if (args.length < 2) {
                System.out.println("Usage: max <num1> <num2> ...");
                System.exit(1);
            }

            double max = Double.parseDouble(args[1]);
            for (int i = 2; i < args.length; i++) {
                double currentNum = Double.parseDouble(args[i]);
                if (currentNum > max) {
                    max = currentNum;
                }
            }
            System.out.println("Maximum value: " + max);
        }

        private static void calculateAverage(String[] args) {
            if (args.length < 2) {
                System.out.println("Usage: avg <num1> <num2> ...");
                System.exit(1);
            }

            double sum = 0;
            for (int i = 1; i < args.length; i++) {
                sum += Double.parseDouble(args[i]);
            }
            double average = sum / (args.length - 1);
            System.out.println("Average: " + average);
        }

        private static void calculateSum(String[] args) {
            if (args.length < 2) {
                System.out.println("Usage: sum <num1> <num2> ...");
                System.exit(1);
            }

            double sum = 0;
            for (int i = 1; i < args.length; i++) {
                sum += Double.parseDouble(args[i]);
            }
            System.out.println("Sum: " + sum);
        }

        private static void findEven(String[] args) {
            for (int i = 1; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num % 2 == 0) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is not even.");
                }
            }
        }

        private static void findOdd(String[] args) {
            for (int i = 1; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num % 2 != 0) {
                    System.out.println(num + " is odd.");
                } else {
                    System.out.println(num + " is not odd.");
                }
            }
        }
    }


