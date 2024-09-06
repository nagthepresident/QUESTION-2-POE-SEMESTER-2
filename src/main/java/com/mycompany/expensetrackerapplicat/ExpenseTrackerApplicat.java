/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expensetrackerapplicat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseTrackerApplicat {
    private List<Expense> expenses;
    private List<Budget> budgets;
    private Scanner scanner;

    public ExpenseTrackerApplicat() {
        expenses = new ArrayList<>();
        budgets = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addExpense() {
        System.out.print("Enter expense name: ");
        String name = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        expenses.add(new Expense(name, amount, category));
        System.out.println("Expense added successfully.");
    }

    public void setBudget() {
        System.out.print("Enter category for budget: ");
        String category = scanner.nextLine();
        System.out.print("Enter budget limit: ");
        double limit = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        budgets.add(new Budget(category, limit));
        System.out.println("Budget set successfully.");
    }

    public void generateReport() {
        System.out.println("\n---- Expense Report ----");
        double totalSpent = 0;

        for (Expense expense : expenses) {
            System.out.printf("Name: %s, Amount: %.2f, Category: %s%n", expense.getName(), expense.getAmount(), expense.getCategory());
            totalSpent += expense.getAmount();
        }

        System.out.println("Total Spent: " + totalSpent);
        System.out.println("\n---- Budget Report ----");

        for (Budget budget : budgets) {
            double spentInCategory = expenses.stream()
                                                .filter(e -> e.getCategory().equals(budget.getCategory()))
                                                .mapToDouble(Expense::getAmount)
                                                .sum();
            System.out.printf("Category: %s, Budget: %.2f, Spent: %.2f, Remaining: %.2f%n",
                              budget.getCategory(),
                              budget.getLimit(),
                              spentInCategory,
                              budget.getLimit() - spentInCategory);
        }
    }

    public void run() {
        while (true) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. Set Budget");
            System.out.println("3. Generate Report");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    setBudget();
                    break;
                case 3:
                    generateReport();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ExpenseTrackerApplicat app = new ExpenseTrackerApplicat();
        app.run();
    }
}
