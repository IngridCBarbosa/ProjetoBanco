
package banco;
import java.util.Scanner;

public class Menu {
    private CadastroCliente clente = new CadastroCliente();
    public void menuPrincipal(){
        Scanner enter = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1-Cliente");
            System.out.println("2-Conta");
            System.out.println("3-Sair do sistema");
            System.out.println("Digite a opcão:");
            opc = enter.nextInt();
            switch(opc){
                case 1:
                    meniCliente();
                    break;
                case 2:
                    menuConta();
                    break;
                case 3:
                    break;
                default:System.out.println("Opção inválida. Digite novamente:");
            }
        }while(opc != 3);
        
    }
    private void meniCliente(){
        Scanner enter = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1-Cadastrar Cliente");
            System.out.println("2-Remover cadasto do Cliente");
            System.out.println("3-Consultar Cliente");
            System.out.println("4-Alterar dados do Cliente");
            System.out.println("5-Sair do menu Cliente");
            System.out.println("Digie a opção:");
            opc = enter.nextInt();
            switch(opc){
                case 1:
                    clente.cadastrarCliente();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                default:System.out.println("Opção errada.Digite novamente:");
            }
        }while(opc != 5);
    }
    private void menuConta(){
        Scanner enter = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1-Cadastrar conta");
            System.out.println("2-Consultar Saldo");
            System.out.println("3-Realizar deposito");
            System.out.println("4-Realizar saque");
            System.out.println("5-Remover conta");
            System.out.println("6-Consultar conta");
            System.out.println("7-Sair do menu Conta");
            System.out.println("Digite uma opção:");
            opc = enter.nextInt();
            switch(opc){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:System.out.println("Opção errado. Digite uma opção:");
            }
        }while(opc != 1);
    }
}
