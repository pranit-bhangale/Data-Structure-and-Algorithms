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
            for (int col = 1; col < row + 1; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void solidRhombus(final int num) {
        for (int row = 1; row <= num; row++) {
            // spaces
            for (int col = 1; col <= num - row; col++) {
                IO.print(" ");
            }
            // stars
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
            // Spaces
            for (int col = 1; col <= num - row; col++) {
                IO.print("  ");
            }
            // Stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void invertedPyramid(final int num) {
        for (int row = 1; row <= num; row++) {
            // spaces
            for (int col = 1; col <= row - 1; col++) {
                IO.print("  ");
            }
            // star
            for (int col = 1; col <= 2 * num - 2 * row + 1; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }


    static void hollowRectangle(final int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == num || col == 1 || col == 6) {
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
    void main() {
        final Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
            // solidRectangle(number);
            // rightAngledTriangle(number);
            // solidRhombus(number);
            // invertedTriangle(number);
            // pyramid(number);
            // invertedPyramid(number);
            // hollowRectangle(number);
            hollowRightAngledTriangle(number);
        }
        sc.close();
    }
}