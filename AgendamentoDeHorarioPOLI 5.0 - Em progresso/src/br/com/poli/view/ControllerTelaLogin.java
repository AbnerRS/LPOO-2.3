package br.com.poli.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerTelaLogin {

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    private Button btnCriarConta;
   
    @FXML
    public void clickBotaoCriarConta(ActionEvent event) {
    	try {
            new SegundaTela("TelaSelecaoDeCadastro.fxml").start(MainApp.stage);
        } 
    	
    	catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
