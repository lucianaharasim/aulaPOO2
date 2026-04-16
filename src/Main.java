import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Cliente> clientes = new ArrayList<>();
    private static int idCliente = 1;



    public static void main(String[] args) {
        System.out.println("=======Cadastro de Cliente ========");
        System.out.println("Digite o nome do Cliente:");
        String nome = sc.nextLine();

        System.out.println("Digite o email:");
        String email = sc.nextLine();


        System.out.println("Digite o telefone");
        String telefone = sc.nextLine();

        System.out.println("Digite o endereco:");
        String endereco = sc.nextLine();

        System.out.println("Digite o CPF:");
        String CPF = sc.nextLine();

        System.out.println("Digite o senha:");
        String senha = sc.nextLine();


        String tipoUsuario = "Cliente";


        Cliente cliente = new Cliente(idCliente,nome,CPF,email,senha,telefone,tipoUsuario,endereco);

        idCliente++;

        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("Clientes:" + cliente);


    }

}