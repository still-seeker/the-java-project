import java.util.*;
/**
 * This project is a game simulation of tic tac toe 
 * entirely played in the commandline
 */

public class Game{

    /**haveWon method checks for the winner
     * @param board the game board
     * @param player the player details
     * @return true
    */
    public static boolean haveWon(char[][] board, char player){
        //check the rows
        for (char[] board1 : board) {
            if (board1[0] == player && board1[1] == player && board1[2] == player) {
                return true;
            }
        }
        
        // check for col
        for (int col = 0; col < board[0].length; col++){
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        // check diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }else if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return false;
    }

    /**printBoard method to display the board in turns
     * @param board the game board
     */
    public static void printBoard(char[][] board){
        for (char[] board1 : board) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board1[col] + "|");
            }
            System.out.println();
        }
    }

    // /**gameOver method to end game if there are no left slots
    //  * @param board the game board
    //  * @return boolean
    //  */
    // public boolean gameOver(char[][] board){

    //     return false;
    // }

    /**Main driver method */
    public static void main(String[] args){
        char [][] board = new char[3][3];
        for (char[] board1 : board) {
            for (int col = 0; col < board1.length; col++) {
                board1[col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        try (Scanner input = new Scanner(System.in)) {
            while(!gameOver) {
                printBoard(board);
                System.out.print("Player " + player + " enter Row: ");
                int row = input.nextInt();
                System.out.print("Player " + player + " enter col: ");
                int col = input.nextInt();
                System.out.println();

                if (board[row][col] == ' ') {
                    board[row][col] = player; //place the element
                    gameOver = haveWon(board, player);
                    if (gameOver){
                        System.out.println("Player " + player + " has won: ");
                    } else {
                        player = (player == 'X') ? 'O' : 'X';
                    }
                }
                else {
                    break;
                }
            }
        }

        printBoard(board);
    }
}

 