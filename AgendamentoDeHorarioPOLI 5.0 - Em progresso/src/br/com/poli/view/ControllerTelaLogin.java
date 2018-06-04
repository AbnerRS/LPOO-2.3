package br.com.poli.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerTelaLogin {

    @FXML
    private TextField txtfLogin;

    @FXML
    private TextField txtfSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    private Button btnCriarConta;
   
    @FXML
    public void clickBotaoCriarConta() {
    	try {
            new SegundaTela("TelaSelecaoDeCadastro.fxml").start(MainApp.stage);
        } 
    	
    	catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
