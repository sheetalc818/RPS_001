package org.mypractice;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] arr = {
                          { { 1, 2 }, { 3, 4 },{5,6} },
                          { { 7, 8 }, { 9, 10 } }
                        };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    System.out.println("arr[" + i
                            + "]["
                            + j + "]["
                            + k + "] = "
                            + arr[i][j][k]);
    }
}
