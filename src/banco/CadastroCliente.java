package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {
    private AvlTree arvoreCliente = new AvlTree();
    private Scanner enter = new Scanner(System.in);
    private ArrayList<Cliente> list = new ArrayList<Cliente>();
    private Cliente cliente;
    public void cadastrarCliente(){
        boolean valida;
        String nome,cpf,fone,email;
        System.out.println("CPF: ");
        cpf = enter.nextLine();//Verifica se o cpf está cadastrado e se é um  cpf válido
        System.out.println("Nome: ");
        nome = enter.nextLine();
        System.out.println("Email:");
        email = enter.nextLine();
        System.out.println("Telefone: ");
        fone = enter.nextLine();
        cliente = new Cliente(nome,cpf,fone,email);
        arvoreCliente.inserir(cliente);
    }
    public void removerCadastroCliente(){
        
    }
    public void consultarCadastroCliente(){
        
    }
    public void alterarCadastroClienter(){
        
    }
    
}
