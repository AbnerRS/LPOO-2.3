package br.com.poli.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import br.com.poli.usuario.Aluno;
import br.com.poli.sistema.Cadastro;

public class ControllerTelaCadastroAluno {
	
	private Aluno aluno = new Aluno(null, null, null, null, null);

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

    @FXML
    public void clickVoltar() throws Exception  {
    	try {
            new SegundaTela("TelaSelecaodeCadastro.fxml").start(MainApp.stage);
        } 
    	
    	catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void clickCadastrar () throws Exception{
    	
    	try {
    		
    		aluno.setNome(txtfNomeAluno.getText());
    		aluno.setCpf(txtfcpfAluno.getText());
    		aluno.setCurso(txtfCursoAluno.getText());
    		aluno.setTurma(txtfTurmaAluno.getText());
    		aluno.setSenha(txtfSenhaAluno.getText());
    		Cadastro.add(aluno, aluno.getSenha());
    		Cadastro.mostrar();
    		System.out.println();
    		System.out.print(aluno);
    	}
    	
    	catch(IllegalArgumentException e){
    		
    	}
    }
}

