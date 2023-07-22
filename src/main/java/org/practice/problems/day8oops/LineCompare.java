package org.practice.problems.day8oops;
public class LineCompare extends MethodAbstract {
    public static double length_of_line_2;
    public static double length_of_line_1;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println();
        System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM");
        System.out.println("--------------------------------------------------");
        LineCompare lineCompare = new LineCompare();

        System.out.println("LINE 1 CO-ORDINATES");
        System.out.println();

        length_of_line_1 = lineCompare.getLineOneCoOrdinates();
        System.out.println("Length of a line 1 : " + length_of_line_1);
        System.out.println("--------------------------------------------------");

        System.out.println("LINE 2 CO-ORDINATES");
        length_of_line_2 = lineCompare.getLineTwoCoOrdinates();
        System.out.println("Length of a line 2 : " + length_of_line_2);
        System.out.println("--------------------------------------------------");
        System.out.println();

        lineCompare.checkLength(length_of_line_1,length_of_line_2);
        lineCompare.equalAndCompareTo(length_of_line_1,length_of_line_2);
    }
}
