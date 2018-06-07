package br.com.poli.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import br.com.poli.usuario.Aluno;
import br.com.poli.sistema.Cadastro;

public class ControllerTelaCadastroAluno {
	
	private Aluno aluno = new Aluno(null, null, null, null, null);

	@FXML
    private TextField txtcpfAluno;

    @FXML
    private TextField txtCursoAluno;

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField txtTurmaAluno;

    @FXML
    private PasswordField txtSenhaAluno;

    @FXML
    private TextField txtNomeAluno;

    @FXML
    public void clickVoltar(MouseEvent event) throws Exception  {
    	try {
            new SegundaTela("TelaSelecaodeCadastro.fxml").start(MainApp.stage);
        } 
    	
    	catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void clickCadastrar (ActionEvent event) throws Exception{
    	
    	try {
    		
    		aluno.setNome(txtNomeAluno.getText());
    		aluno.setCpf(txtcpfAluno.getText());
    		aluno.setCurso(txtCursoAluno.getText());
    		aluno.setTurma(txtTurmaAluno.getText());
    		aluno.setSenha(txtSenhaAluno.getText());
    		Cadastro.add(aluno, aluno.getSenha());
    		Cadastro.mostrar();
    		System.out.println();
    		System.out.print(aluno);
    	}
    	
    	catch(IllegalArgumentException e){
    		
    	}
    }
}

