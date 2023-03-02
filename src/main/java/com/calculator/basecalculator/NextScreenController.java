package com.calculator.basecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NextScreenController {
    @FXML
    private Button ReturnButton;

    @FXML
    void ReturnButton(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("mainlanding-view.fxml"));
            ReturnButton.getScene().setRoot(root);
        } catch (Exception e) {
            System.out.println("Error! Can't load the previous page!");
        }
    }
}