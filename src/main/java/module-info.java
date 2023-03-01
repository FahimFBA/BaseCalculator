module com.calculator.basecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculator.basecalculator to javafx.fxml;
    exports com.calculator.basecalculator;
}