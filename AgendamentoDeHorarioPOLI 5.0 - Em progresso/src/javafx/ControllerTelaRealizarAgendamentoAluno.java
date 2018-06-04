package javafx;

import com.sun.glass.events.MouseEvent;

import br.com.poli.view.MainApp;
import br.com.poli.view.SegundaTela;
import javafx.fxml.FXML;

public class ControllerTelaRealizarAgendamentoAluno {

    @FXML
    void clickTelaPrincipalAluno(MouseEvent event) {

    }
    
    @FXML
    void clickTelaLogin(MouseEvent event) {

    }

    
    public void clickTelaPrincipalAluno() throws Exception  {
    	try {
            new SegundaTela("TelaPrincipalAluno.fxml").start(MainApp.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickTelaLogin() throws Exception  {
    	try {
            new SegundaTela("TelaLogin.fxml").start(MainApp.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
