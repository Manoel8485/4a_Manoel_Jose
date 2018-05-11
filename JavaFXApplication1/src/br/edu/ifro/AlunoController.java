/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author manoel8485
 */
public class AlunoController implements Initializable {

    @FXML
    private TextField TxtNome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        try {
            Aluno al = new Aluno();
            al.setNome(TxtNome.getText());
            
            em.getTransaction().begin();
            em.persist(al);
            em.getTransaction().commit();
            System.out.println("Salvo!!");
        } catch (Exception e) {
            System.out.println("Erro!!");
        }
        
    }

    @FXML
    private void fechar(ActionEvent event) {
    }
    
}
