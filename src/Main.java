//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente( 1,
                "Patricia", "123.564.585-55",
                "Patricia_123@gmail.com",
                 "teste123",
                "(47) 55662233",
                "Cliente",
                "Rua Otavio Linzmeier,22");
        Entregador entregador = new Entregador(2,"Jose Maria","123.569.555-21","josemaria@gmail.com","123545",
                "36445587","Entregador",true);

                System.out.println("----------Cliente----------");
                System.out.println(cliente.toString());

                System.out.println("----------Entregador----------");
                System.out.println(entregador);





    }

}