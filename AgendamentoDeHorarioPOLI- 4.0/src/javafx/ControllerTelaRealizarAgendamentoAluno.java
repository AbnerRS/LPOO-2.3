package javafx;

import com.sun.glass.events.MouseEvent;

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
            new SegundaTela("TelaPrincipalAluno.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickTelaLogin() throws Exception  {
    	try {
            new SegundaTela("TelaLogin.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
