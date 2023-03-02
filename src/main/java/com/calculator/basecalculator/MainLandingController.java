package com.calculator.basecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainLandingController {
    @FXML
    private Button exitButton;
    @FXML
    private Button ClearButton;
    @FXML
    private Button BinaryButton;

    @FXML
    private Button NextScreenButton;

    @FXML
    private Label OutputPanel;

    @FXML
    private TextField UserInput;

    @FXML
    private Button OctalButton;
    @FXML
    private Button Hexadecimal;

    @FXML
    void exitButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void BinaryButton(ActionEvent event) {
        String input = UserInput.getText();
        try {
            int decimal = Integer.parseInt(input);
            String binary = Integer.toBinaryString(decimal);
            OutputPanel.setText(binary + "");
        } catch (Exception e) {
            OutputPanel.setText("                  Invalid Input");
        }
    }

    @FXML
    void Hexadecimal(ActionEvent event) {
        String input = UserInput.getText();
        try {
            int decimal = Integer.parseInt(input);
            String hexadecimal = Integer.toHexString(decimal);
            OutputPanel.setText(hexadecimal + "");
        } catch (Exception e) {
            OutputPanel.setText("                  Invalid Input");
        }
    }

    @FXML
    void OctalButton(ActionEvent event) {
        String input = UserInput.getText();
        try {
            int decimal = Integer.parseInt(input);
            String octal = Integer.toOctalString(decimal);
            OutputPanel.setText(octal + "");
        } catch (Exception e) {
            OutputPanel.setText("                  Invalid Input");
        }
    }
    @FXML
    void ClearButton(ActionEvent event) {
        UserInput.setText("");
        OutputPanel.setText("                      No Input");
    }

    @FXML
    void UserInput(ActionEvent event) {

    }
    @FXML
    void NextScreenButton(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("nextscreen-view.fxml"));
            NextScreenButton.getScene().setRoot(root);
        } catch (Exception e) {
            System.out.println("Error! Can't load the next page!");
        }
    }
}