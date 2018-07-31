package javaFX_employee_DB;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    private int looserCounter = 5;

    @FXML
    private Button gameBtn;

    @FXML
    void reached(ActionEvent event) {
        if (looserCounter < 0) {
            gameBtn.setText("You are looser!");
            gameBtn.setDisable(true);
        }

        gameBtn.setText("Press me if you're not a looser. Attempts remain: " + looserCounter--);

        gameBtn.setLayoutX(Math.random() * 200);
        gameBtn.setLayoutY(Math.random() * 200);
    }

    @FXML
    void clicked(ActionEvent event) {
        gameBtn.setText("Grats. You won!");
        gameBtn.setDisable(true);
    }
}
