package org.session.example;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] myNumbers = {{1,2,3},
                             {4,5,6}
                            };

        for(int[] row : myNumbers){
            for (int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }

        int[][][] myNumbers1 = { };

        //Changing element
        System.out.println(myNumbers[1][1]);//5
        System.out.println(myNumbers[0][2]);//3

        myNumbers[1][1] = 7;
        System.out.println(myNumbers[1][1]);

        System.out.println("Array Element");

        for (int i=0; i <myNumbers.length; i++){
            for(int j=0 ; j<myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
            System.out.println("\n");
        }
    }
}
