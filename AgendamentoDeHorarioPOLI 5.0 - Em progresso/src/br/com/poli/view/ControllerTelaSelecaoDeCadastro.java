package br.com.poli.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ControllerTelaSelecaoDeCadastro {

    @FXML
    private Button btnCadastroAluno;

    @FXML
    private Button btnCadastroProfessor;

    @FXML
    private Button btnCadastroFuncionario;
    
    @FXML
    public void clickVoltar() throws Exception  {
    	try {
            new SegundaTela("TelaLogin.fxml").start(MainApp.stage);
        } 
    	
    	catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void clickCadastroAluno() throws Exception  {
    	try {
            new SegundaTela("TelaCadastroAluno.fxml").start(MainApp.stage);
        } 
    	
    	catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void clickCadastroFuncionario() throws Exception  {
    	try {
            new SegundaTela("TelaCadastroFuncionario.fxml").start(MainApp.stage);
        } 
    	
    	catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void clickCadastroProfessor() throws Exception  {
    	try {
            new SegundaTela("TelaCadastroProfessor.fxml").start(MainApp.stage);
        } 
    	
    	catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
    

