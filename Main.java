public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        while (true) {
            game.printBoard();
            game.placeMove();

            if (game.checkWinner()) {
                game.printBoard();
                System.out.println("Player " + game.currentPlayer + " wins!");
                break;
            }

            if (game.isBoardFull()) {
                game.printBoard();
                System.out.println("Match Draw!");
                break;
            }

            game.switchPlayer();
        }
    }
}