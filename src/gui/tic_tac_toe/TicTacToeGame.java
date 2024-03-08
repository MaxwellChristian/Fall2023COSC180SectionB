package gui.tic_tac_toe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeGame extends Application {

    private char turnOfPlayer = 'X';
    private Label lblStatus = new Label("X has turn");

    private Cell[][] boardCell = new Cell[3][3];

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane board = new GridPane();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                boardCell[row][col] = new Cell();
                boardCell[row][col].setOnMouseClicked(mouseEvent -> {
                    Cell clickedCell = (Cell) mouseEvent.getSource();
                    clickedCell.handleMouseClick();
                    checkGameStatus(clickedCell);
                });
                board.add(boardCell[row][col], col, row);
            }
        }

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(board);
        borderPane.setBottom(lblStatus);

        Scene scene = new Scene(borderPane, 450, 150);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Tic Tac Toe");

        primaryStage.show();

    }

    private void checkGameStatus(Cell clickedCell) {
        if (clickedCell.getDisplaySymbol() == ' ' && turnOfPlayer != ' ') {
            clickedCell.setDisplaySymbol(turnOfPlayer);

            // is game won
            if (hasWon(turnOfPlayer)) {
                lblStatus.setText(turnOfPlayer + " won!");
                turnOfPlayer = ' ';
            } else {
                if (isBoardFull()) {
                    lblStatus.setText("Game Draw");
                    turnOfPlayer = ' ';
                } else {
                    turnOfPlayer = (turnOfPlayer == 'X') ? 'O' : 'X';
                    lblStatus.setText(turnOfPlayer + " has turn");
                }
            }

        }
    }

    public boolean isBoardFull() {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (boardCell[row][col].getDisplaySymbol() == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean hasWon(char playerSymbol) {

        // logic to check if the player with the specified symbol has won the game

        int row;
        int col;

        // check for row win
        for (row = 0; row < 3; row++) {
            if (boardCell[row][0].getDisplaySymbol() == playerSymbol
                    && boardCell[row][1].getDisplaySymbol() == playerSymbol
                    && boardCell[row][2].getDisplaySymbol() == playerSymbol
            ) {
                return true;
            }
        }

        // check for col win
        for (col = 0; col < 3; col++) {
            if (boardCell[0][col].getDisplaySymbol() == playerSymbol
                    && boardCell[1][col].getDisplaySymbol() == playerSymbol
                    && boardCell[2][col].getDisplaySymbol() == playerSymbol
            ) {
                return true;
            }
        }

        // diagonal 1
        if (boardCell[0][0].getDisplaySymbol() == playerSymbol
                && boardCell[1][1].getDisplaySymbol() == playerSymbol
                && boardCell[2][2].getDisplaySymbol() == playerSymbol
        ) {
            return true;
        }

        // diagonal 2
        return boardCell[0][2].getDisplaySymbol() == playerSymbol
                && boardCell[1][1].getDisplaySymbol() == playerSymbol
                && boardCell[2][0].getDisplaySymbol() == playerSymbol;
    }
}
