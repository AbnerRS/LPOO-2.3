package javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ControllerTelaSelecaodeCadastro {

    @FXML
    private Button btnCadastroAluno;

    @FXML
    private Button btnCadastroProfessor;

    @FXML
    private Button btnCadastroFuncionario;
    
  
    public void clickbotao() throws Exception  {
    	try {
            new SegundaTela("TelaLogin.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickCadastroAluno() throws Exception  {
    	try {
            new SegundaTela("TelaCadastroAluno.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickCadastroFuncionario() throws Exception  {
    	try {
            new SegundaTela("TelaCadastroFuncionario.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickCadastroProfessor() throws Exception  {
    	try {
            new SegundaTela("TelaCadastroProfessor.fxml").start(MainView.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
    

