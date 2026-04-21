import java.util.Scanner;

class TicTacToe {
    char[][] board;
    char currentPlayer;
    Scanner sc = new Scanner(System.in);

    TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void placeMove() {
        System.out.println("Player " + currentPlayer + " turn");
        System.out.print("Enter row (0-2): ");
        int row = sc.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = sc.nextInt();

        if (board[row][col] == '-') {
            board[row][col] = currentPlayer;
        } else {
            System.out.println("Cell already occupied.");
        }
    }

    void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] &&
                board[i][1] == board[i][2] &&
                board[i][0] != '-') {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] &&
                board[1][j] == board[2][j] &&
                board[0][j] != '-') {
                return true;
            }
        }

        if (board[0][0] == board[1][1] &&
            board[1][1] == board[2][2] &&
            board[0][0] != '-') {
            return true;
        }

        if (board[0][2] == board[1][1] &&
            board[1][1] == board[2][0] &&
            board[0][2] != '-') {
            return true;
        }

        return false;
    }

    boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}