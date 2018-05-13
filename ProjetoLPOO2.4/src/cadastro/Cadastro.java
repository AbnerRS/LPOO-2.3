package cadastro;

import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;
import java.lang.SecurityException;
import java.io.*;

public class Cadastro {
	
	private Formatter arquivo;
	
	//m�todo para abrir arquivo
    public void abrir(){
        try{
            arquivo = new Formatter("Cadastro.txt");
        }
        catch(SecurityException semPermissao){
            System.err.println("Sem permissao para escrever no arquivo");
            System.exit(1); 
        }
        catch(FileNotFoundException arquivoInexistente){
            System.err.println("Arquivo inexistente ou arquivo n�o pode ser criado");
            System.exit(1);
        }
    }
    
    //m�todo para escrever no arquivo
    public void escrever(String dados){
        try{
            arquivo.format("%s", dados);
        }
        catch(FormatterClosedException formatoDesconhecido){
        	System.err.println("Erro ao escrever");
            return;
        }
        catch(NoSuchElementException excecaoElemento){
            System.err.println("Entrada invalida");
        }
    } 
    
    //m�todo para fechar o arquivo
    public void fechar(){
    	arquivo.close();
    }
    
    //M�todo para verificar se o usu�rio j� � cadastrado
    public boolean jaEstaCadastrado(String nome) throws IOException {
    	
    	FileInputStream entrada = new FileInputStream("Cadastro.txt");
		InputStreamReader entradaFormatada = new InputStreamReader(entrada);
		BufferedReader entradaString = new BufferedReader(entradaFormatada);   
		String linha = entradaString.readLine();
			
		while(linha != null){
			linha = entradaString.readLine();
			if(linha.equals(nome))
				return true;
		}
		return false;
    }
}
