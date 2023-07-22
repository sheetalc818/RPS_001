package org.practice.problems.day6functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class FP1_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns =sc.nextInt();

        int[][] array = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }

        PrintWriter consoleOutput = new PrintWriter(System.out);
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                consoleOutput.write(array[i][j] + "  ");
            }
            consoleOutput.println();
        }
        consoleOutput.flush();
        consoleOutput.close();
    }
}
