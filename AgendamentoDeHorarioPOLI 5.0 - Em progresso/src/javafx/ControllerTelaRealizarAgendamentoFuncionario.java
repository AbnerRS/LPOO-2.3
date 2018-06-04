package javafx;

import com.sun.glass.events.MouseEvent;

import br.com.poli.view.MainApp;
import br.com.poli.view.SegundaTela;
import javafx.fxml.FXML;

public class ControllerTelaRealizarAgendamentoFuncionario {

    @FXML
    void clickTelaLogin(MouseEvent event) {

    }

    @FXML
    void clickTelaPrincipalFuncionario(MouseEvent event) {

    }
    
    public void clickTelaPrincipalFuncionario() throws Exception  {
    	try {
            new SegundaTela("TelaPrincipalFuncionario.fxml").start(MainApp.stage);
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
