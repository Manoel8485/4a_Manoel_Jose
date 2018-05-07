/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author manoel8485
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label resultado;
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        resultado.setText(String.valueOf(Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText())));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
