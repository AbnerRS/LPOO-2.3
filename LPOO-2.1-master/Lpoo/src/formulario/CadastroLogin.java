package formulario;
import java.util.Scanner;
import java.util.ArrayList;

//CLASSE DE CADASTRO DE USUARIOS...
public class CadastroLogin {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
        System.out.println("Digite os dados: "+"\nNome: ");
        String nome = i.nextLine();
        System.out.println("CPF: ");
        String login = i.nextLine();
        System.out.println("Curso: ");
        String cargo = i.nextLine();
        System.out.println("Senha de acesso:");
        String senha = i.nextLine();
        Dados usuario;
        usuario = new Dados();
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setCargo(cargo);
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        usuarios.add(usuario);
        System.out.println(usuario.getNome()+"\n"+usuario.getLogin()+"\n"+usuario.getCargo());
     }
}


