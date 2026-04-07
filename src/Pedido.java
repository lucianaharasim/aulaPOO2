import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;

    private Cliente cliente;
    private Entregador entregador;

    private List<ItensPedido>itens= new ArrayList<>();

    public Pedido(int idPedido,Cliente cliente){
        this.idPedido = idPedido;
        this.cliente = cliente;
    }

    public void adicionarItem(ItensPedido item){
        itens.add(item);
    }
    public double calcularTotal(){
        double total = 0;
        for (ItensPedido item : itens){
            total += item.subTotal();

        }
        return total;

    }
    public void finalizarPedido(){
        double total = calcularTotal();
    }

}
