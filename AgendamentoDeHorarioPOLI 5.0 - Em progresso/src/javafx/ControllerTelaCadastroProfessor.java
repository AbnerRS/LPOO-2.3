package javafx;



import br.com.poli.view.MainApp;
import br.com.poli.view.SegundaTela;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerTelaCadastroProfessor {

    @FXML
    private TextField txtfNomeProfessor;

    @FXML
    private TextField txtfCpfProfessor;

    @FXML
    private TextField txtfCoordenacaoProfessor;

    @FXML
    private TextField txtfSenhaProfessor;

    public void clickSelecaoTeladeCadastro() throws Exception  {
    	try {
            new SegundaTela("TelaSelecaodeCadastro.fxml").start(MainApp.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
