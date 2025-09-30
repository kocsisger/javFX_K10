package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label seasonLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void handleLoadButtonClicked() {

    }

    @FXML
    void handleClick() {
        System.out.println("Hello world!!!");
        if (seasonLabel.getText().equals("Summer"))
            seasonLabel.setText("Autumn");
        else seasonLabel.setText("Summer");
    }

    @FXML
    private void initialize() {

    }
}
