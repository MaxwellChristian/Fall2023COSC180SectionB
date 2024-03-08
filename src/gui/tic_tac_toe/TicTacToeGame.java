package gui.tic_tac_toe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeGame extends Application {

    private char turnOfPlayer = 'X';
    private Label lblStatus = new Label("X has turn") ;

    private Cell [][]boardCell = new Cell[3][3];

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane board = new GridPane();
        for (int row = 0 ; row < 3 ; row++) {
            for(int col = 0 ; col < 3 ; col++){
                board.add(boardCell[row][col] = new Cell(), col, row);
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

    public boolean isBoardFull(){

        for (int row = 0 ; row < 3 ; row++) {
            for(int col = 0 ; col < 3 ; col++){
                if(boardCell[row][col].getDisplaySymbol() == ' '){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean hasWon(char playerSymbol){

        // logic to check if the player with the specified symbol has won the game

        return false;
    }
}
