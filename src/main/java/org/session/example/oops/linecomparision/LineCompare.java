package org.session.example.oops.linecomparision;

public class LineCompare {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison problem statement");
        GetUserInputMethods getUserInputMethods = new GetUserInputMethods();
        double lengthOfLineOne = getUserInputMethods.getFirstLineCoordinates();
        System.out.println("Length of line 1 : "+lengthOfLineOne);
        double lengthOfLineTwo = getUserInputMethods.getSecondLineCoordinates();
        System.out.println("Length of line 2 : "+lengthOfLineTwo);
        getUserInputMethods.checkEquality(lengthOfLineOne,lengthOfLineTwo);
        getUserInputMethods.checkEqualityUsingCompareTo(lengthOfLineOne,lengthOfLineTwo);
    }
}
