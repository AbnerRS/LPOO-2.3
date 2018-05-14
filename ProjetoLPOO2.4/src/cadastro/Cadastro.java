package cadastro;

import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;
import java.lang.SecurityException;
import java.io.*;
import java.util.Scanner;

public class Cadastro { //Classe a ser melhorada, separar arquivos de cadastro de cada tipo usuário 
	
	//método para abrir arquivo
    public static void abrir(String nomearquivo, Formatter arquivo){
        try{
            arquivo = new Formatter(nomearquivo + ".txt");
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
    public static void escrever(String dados, Formatter arquivo){
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
    
    //Método para verificar se o usuário já é cadastrado
    public static boolean jaEstaCadastrado(String nome) throws IOException {
    	
    	FileInputStream entrada = new FileInputStream("Cadastro.txt");
		InputStreamReader entradaFormatada = new InputStreamReader(entrada);
		BufferedReader entradaString = new BufferedReader(entradaFormatada);   
		String linha = entradaString.readLine();
			
		while(linha != null){
			linha = entradaString.readLine();
			if(linha.equals(nome))
				entradaString.close();
				return true;
		}
		entradaString.close();
		return false;
    }
    
    //método para mostrar o que está cadastrado
    public static void ler(Scanner entrada)
    {
        try
        {
            while(entrada.hasNext())          
                System.out.printf("%s - %d\n",entrada.next(), entrada.nextInt());
        }
        catch(NoSuchElementException entradaDiferente)
        {
            System.err.println("Entrada diferente da esperada");
            entrada.close();
            System.exit(1);
        }
        catch(IllegalStateException erroLeitura)
        {
            System.err.println("Erro de leitura. Scanner foi fechada antes da input");
            System.exit(1);
        }
    }
}
