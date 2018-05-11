/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author manoel8485
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private Label resultado;
    @FXML
    private TextField num2;
    @FXML
    private TextField num1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
      resultado.setText(String.valueOf(Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText())));
    }

    @FXML
    private void abrirCadastroAlunos(ActionEvent event) {
       try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
       Scene scene = new Scene(fxmlLoader.load(),900,682);
       Stage stage = new Stage();
    stage.setTitle("Cadastrar Aluno");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){
    System.out.println("erro: "+ e);
}
    }

    @FXML
    private void fechar(ActionEvent event) {
    }
    
}
