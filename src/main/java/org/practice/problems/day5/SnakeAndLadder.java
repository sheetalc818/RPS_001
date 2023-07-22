package org.practice.problems.day5;

public class SnakeAndLadder {
    static int SnakeLadderP1P2(int playerPosition, int count) {
        while (playerPosition != 100) {
            count++;
            int dieCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Player Rolls The Die & Get The Number :" + dieCheck);
            int optionCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (optionCheck) {
                case 0:
                    playerPosition += dieCheck;
                    System.out.println("Player Gets a Ladder & Player Moves ahead By Number Of Position :" + dieCheck);
                    if (playerPosition == 100)
                        break;

                    if (playerPosition > 100) {
                        playerPosition -= dieCheck;
                        System.out.println();
                        System.out.println("The Number Goes Beyond 100");
                        System.out.println("Therefore Player Current Position: " + playerPosition);
                        System.out.println("The Number Required By Player is: " + (100 - playerPosition));
                    }
                {
                    int dieCheck1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
                    playerPosition += dieCheck1;
                    System.out.println("Gets Ladder So Playing Again and Moves Ahead by Number of position: "+dieCheck1);
                    System.out.println("Player current position: "+playerPosition);
                }

                case 1:
                    playerPosition -= dieCheck;
                    System.out.println("Player Bites By Snake & Player Moves Behind By Number Of Position :" + dieCheck);
                    if (playerPosition < 0) {
                        playerPosition = 0;
                        System.out.println("Player Current Position :" + playerPosition);
                    }
                    break;

                case 2:
                    playerPosition += 0;
                    System.out.println("No Play - Player Stay At Same Position");
                    System.out.println("Player Current Position :" + playerPosition);
                    break;
            }
            System.out.println("The Number Required By Player is: " + (100 - playerPosition));
        }
        System.out.println();
        System.out.println("Number of times player played: " + count);
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Snake & Ladder Simulator");
        System.out.println();
        int startPosition = 0;
        int count = 0;
        System.out.println("Starting Position Of Single Player is :" + startPosition);

        int player1 = SnakeLadderP1P2(0, 0); {
            System.out.println("Number of Times player1 played: " +player1);
        }

        int player2 = SnakeLadderP1P2(0, 0); {
            System.out.println("Number of Times player2 Played: "+player2);
        }
        if (player1 > player2) {
            System.out.println("Player2 Won  The Game");
        }
        else {
            System.out.println("Player1 Won The Game");
        }
    }
}
