package javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerTelaCadastroAluno {

    @FXML
    private TextField txtfNomeAluno;

    @FXML
    private TextField txtfcpfAluno;

    @FXML
    private TextField txtfCursoAluno;

    @FXML
    private TextField txtfTurmaAluno;

    @FXML
    private TextField txtfSenhaAluno;

    @FXML
    private Button btnCadastrar;

    public void clickSelecaoTeladeCadastro() throws Exception  {
    	try {
            new SegundaTela("TelaSelecaodeCadastro.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

