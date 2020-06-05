package edu.citytech.tax.gui;

import com.jbbwebsolutions.cst3613.utility.URLUtility;

import edu.citytech.tax.gui.model.Grade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ScoreController {

    @FXML
    private TextField txtScore;

    @FXML
    private Label lbMessage;

    @FXML
    private Button btnCalculate;

    @FXML
    void clickCalculate(ActionEvent event) {
    	String score = txtScore.getText();
    	String url = "http://localhost:4567/grade?score=" + score;
    	Grade grade = URLUtility.get(url, Grade.class);
    	
    	lbMessage.setText("QPA:" + grade.qpa + " Letter Grade: " + grade.letter);
    	System.out.println(url);
    	System.out.println(grade);

    }

}
