package javafx;

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
    public void clickBotaoConfirmar() throws Exception{

        
        try {
            new SegundaTela("TelaSelecaodeCadastro.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
