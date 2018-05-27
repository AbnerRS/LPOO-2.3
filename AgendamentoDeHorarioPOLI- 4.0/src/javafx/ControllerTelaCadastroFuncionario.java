package javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerTelaCadastroFuncionario {

    @FXML
    private Button btnCadastrarFuncionario;

    @FXML
    private TextField txtfNomeFuncionario;

    @FXML
    private TextField txtfcpfFuncionario;

    @FXML
    private TextField txtfFCargoFuncionario;

    @FXML
    private TextField txtfSenhaFuncionario;

    public void clickSelecaoTeladeCadastro() throws Exception  {
    	try {
            new SegundaTela("TelaSelecaodeCadastro.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
