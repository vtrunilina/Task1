package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    
    public TextField Calculate;
    
    public Label Percent15;
    public Label Percent10;
    public Label Percent5;
    
    private Percent perc = new Percent();
    @FXML
    protected void onHelloButtonClick() 
    {
        double text=Double.parseDouble(Calculate.getText());
        perc.countSumTrunc(text,15);
        Percent15.setText(perc.toString());
        perc.countSumTrunc(text, 10);
        Percent10.setText(perc.toString());
        perc.countSumTrunc(text, 5);
        Percent5.setText(perc.toString());

    }
}