package gui.tic_tac_toe;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Cell extends Pane {

    private char displaySymbol = ' ';

    public Cell() {
        setStyle("-fx-border-color: BLACK;");
        setPrefSize(2000, 2000);
        this.setOnMouseClicked(mouseEvent -> handleMouseClick());
    }

    public void handleMouseClick() {
        if( displaySymbol == ' ' ){
            setDisplaySymbol(this.displaySymbol);
        }
    }

    public char getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(char displaySymbol) {
        this.displaySymbol = displaySymbol;
        this.getChildren().add(new Label(""+this.displaySymbol));
    }
}
