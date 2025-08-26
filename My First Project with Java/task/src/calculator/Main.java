package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        double income = 5405.0;
        System.out.println("Income: $" + income);
        System.out.println("Staff expenses:");
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses:");
        double other = scanner.nextDouble();
        double net = income - staffExpenses - other;
        System.out.printf("Net income: $%f",net);
    }
}