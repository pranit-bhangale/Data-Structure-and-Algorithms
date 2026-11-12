package CodePatterns;

import java.util.Scanner;

class Rectangle {

    static void solidRectangle(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= 6; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void rightAngledTriangle(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void solidRhombus(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row; col++) {
                IO.print(" ");
            }
            for (int col = 1; col <= num; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void invertedTriangle(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row + 1; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void pyramid(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row; col++) {
                IO.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void invertedPyramid(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col < row; col++) {
                IO.print("  ");
            }
            for (int col = 1; col <= 2 * num - 2 * row + 1; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void hollowRectangle(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == num ||
                    col == 1 || col == 6) {
                    IO.print("* ");
                } else {
                    IO.print("  ");
                }
            }
            IO.println();
        }
    }

    static void hollowRightAngledTriangle(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row || row == num) {
                    IO.print("* ");
                } else {
                    IO.print("  ");
                }
            }
            IO.println();
        }
    }

    static void hollowPyramid(final int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row; col++) {
                IO.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == num) {
                    IO.print("* ");
                } else {
                    IO.print("  ");
                }
            }
            IO.println();
        }
    }

    static void displayMenu() {
        IO.println("---------- PATTERN MENU ----------");
        IO.println("1. Solid Rectangle");
        IO.println("2. Right-Angled Triangle");
        IO.println("3. Solid Rhombus");
        IO.println("4. Inverted Right-Angled Triangle");
        IO.println("5. Pyramid");
        IO.println("6. Inverted Pyramid");
        IO.println("7. Hollow Rectangle");
        IO.println("8. Hollow Right-Angled Triangle");
        IO.println("9. Hollow Pyramid");
        IO.println("0. Exit");
        IO.println("-----------------------------------");
    }

    static void printPattern(int choice, int number) {
        switch (choice) {
            case 1 -> solidRectangle(number);
            case 2 -> rightAngledTriangle(number);
            case 3 -> solidRhombus(number);
            case 4 -> invertedTriangle(number);
            case 5 -> pyramid(number);
            case 6 -> invertedPyramid(number);
            case 7 -> hollowRectangle(number);
            case 8 -> hollowRightAngledTriangle(number);
            case 9 -> hollowPyramid(number);
            default -> IO.println("Invalid pattern selection!");
        }
    }

    void main() {
        final var sc = new Scanner(System.in);
        while (true) {
            displayMenu();
            IO.print("\nSelect a pattern (0-9): ");
            final int choice = sc.nextInt();
            if (choice == 0) {
                IO.println("\nThank you for using Pattern Printer!");
                break;
            }
            if (choice < 1 || choice > 9) {
                IO.println("\nInvalid choice! Please select between 1 and 9.");
                continue;
            }
            IO.print("Enter the number of rows: ");
            final int number = sc.nextInt();
            if (number <= 0) {
                IO.println("Please enter a positive number.");
                continue;
            }
            IO.println("\n---------- PATTERN OUTPUT ----------");
            IO.println();
            printPattern(choice, number);
            IO.println("------------------------------------");
            IO.println();
        }
        sc.close();
    }
}