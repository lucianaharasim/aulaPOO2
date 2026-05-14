import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Cliente> clientes = new ArrayList<>();
    private static final List<Categoria> categorias = new ArrayList<>();
    private static final List<Entregador> entregadores = new ArrayList<>();
    private static final List<Pedido> pedidos = new ArrayList<>();
    private static final List<Restaurante> restaurantes = new ArrayList<>();

    private static int idCliente = 1;



    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            System.out.println("\n------------------------");
            System.out.println("  SISTEMA DE DELIVERY  ");
            System.out.println("-------------------------");
            System.out.println("1 - Area do ADM");
            System.out.println("2 - Area do Cliente");
            System.out.println("3 - Area do Entregador");
            System.out.println(("0 -Sair"));
            System.out.println("Escolha uma opção");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    menuAdm();
                    break;

                case 2:
                    menuCliente();
                    break;

                case 3:
                    menuEntregador();
                    break;

                case 0:
                    executando = false;
                    System.out.println("Encerrando o sistema...");
                    break;

                    default:
                    System.out.println("Opcao invalida!");


            }

        }

    sc.close();;

    }

    public static void  menuAdm(){
        boolen voltar = false;
        while (!voltar){
            System.out.println("\n ----------------------");
            System.out.println(" Area do Administrador ");
            System.out.println("----------------------");
            System.out.println("1 - Cadastrar categoria");
            System.out.println("2 - Cadastrar restaurante");
            System.out.println("3 - Cadastrar produto no restaurante");
            System.out.println("4 - Cadastrar entregadores");
            System.out.println("5 - Listar pedidos ");
            System.out.println("6 - Listar entregadores ");
            System.out.println("7 - Listar pedidos ");
            System.out.println("0 - Voltar ");
            System.out.println("Escolha uma opção ");

            int opcao = Integer.parseInt(sc. nextLine());
            switch (opcao){

                case 1:
                    cadastrarCategoria();
                    break;
                case 2:
                    cadastrarRestaurante();
                    break;
                case 3:
                    cadastrarProdutoNoRestaurante();
                    break;
                case 4:
                    cadastrarEntregador();
                    break;
                case 5:
                    listarRestaurante();
                    break;
                case 6:
                    listarEntregador();
                    break;
                case 7:
                    listarPedidos();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
    public static void cadastrarCtaegoria()
    {

        System.out.println("Digite o nome da categoria");
        String nome = sc. nextLine();
        Categoria categoria = new Categoria(nome);

        categorias.add(categoria);
        System.out.println("Categoria adicionada!");
        System.out.println("Categoria criada: " + categoria.getNomeCategoria());

    }

}