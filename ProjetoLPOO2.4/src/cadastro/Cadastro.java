package cadastro;

import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;
import java.lang.SecurityException;
import java.io.*;

public class Cadastro {
	
	private Formatter arquivo;
	
	//método para abrir arquivo
    public void abrir(){
        try{
            arquivo = new Formatter("Cadastro.txt");
        }
        catch(SecurityException semPermissao){
            System.err.println("Sem permissao para escrever no arquivo");
            System.exit(1); 
        }
        catch(FileNotFoundException arquivoInexistente){
            System.err.println("Arquivo inexistente ou arquivo não pode ser criado");
            System.exit(1);
        }
    }
    
    //método para escrever no arquivo
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
    
    //método para fechar o arquivo
    public void fechar(){
    	arquivo.close();
    }
    
    //Método para verificar se o usuário já é cadastrado
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
