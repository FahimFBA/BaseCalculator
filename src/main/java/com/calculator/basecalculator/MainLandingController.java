package com.calculator.basecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainLandingController {
    @FXML
    private Button exitButton;

    @FXML
    void exitButton(ActionEvent event) {
        System.exit(0);
    }
}