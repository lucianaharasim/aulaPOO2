import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private String status;

    //Agregação
    private Cliente cliente;
    private Entregador entregador;
    private Restaurante restaurante;

    //Abstração
    private Pagamento pagamento;
    private Entrega entrega;

    // Composição]
    private List<ItensPedido>itens= new ArrayList<>();

    // Construtor
    public Pedido(int idPedido,Cliente cliente){
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.status="EM ABERTO";

    }


    public int getId(){
        return idPedido;
    }
    public String getStatus(){
        return status;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void adicionarItem(Produto produto, int quantidade){
        if(!status.equals("EM ABERTO")){
            System.out.println(("Não é possível incluir intens em um pedido que não esta em aberto"));
        } else {
                int idItensPedido = 1;

                if(itens.isEmpty()){
                    idItensPedido= itens.size()+1;
                }
            ItensPedido item = new ItensPedido(idItensPedido,produto,quantidade);
            itens.add(item);

            System.out.println(("Item adicionado no pedido!"));
        }
    }
    public void removerItem(String nomeProduto){
        if(!status.equals("EM ABERTO")){
            System.out.println("Não é possível retirar itens pois o pedido não está aberto!");
        }else{
            boolean removido = itens.removeIf(item ->
                    item.getProduto().getNomeProduto().equalsIgnoreCase(nomeProduto));
            if (removido){
                System.out.println("Item" + nomeProduto + "removido do pedido");
            }else {
                System.out.println("Não foi encontrado no pedido o produto" + nomeProduto);
            }

        }
    }

    public void definirPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
        System.out.println("Pagamento definido:" + pagamento.getPagamento());
    }
    public void  definirEntrega(Entrega entrega){
        this.entrega = entrega;
        System.out.println("Entrega definida:" + entrega.getClass().getSimpleName());
    }
    public void definirEntregador(Entregador entregador){
        this.entregador = entregador;
        System.out.println(("Entregador definido:" + entregador.getNome()));
    }

    public void confirmarpedido(){
        if(!status.equals("EM ABERTO")){
            System.out.println("O pedido não pode ser confirmado!");
        }else {
            if(cliente == null){
                System.out.println("Cliente Inválido");
                return;
            }
            if ((itens.isEmpty())){
                System.out.println(("Adicione itens no pedido para confirmar!"));
                return;
            }
            for (ItensPedido item: itens){
                item.getProduto().reduzirEstoque(item.getQuantidade());
            }
            status= "CONFIRMADO";
            System.out.println(("Pedidos Confirmados!"));
        }

    }
    public void iniciarEntrega(){
        if(!status.equals(("CONFIRMADO")){
        System.out.println("Pedido precisa estar CONFIRMADO!");
        return;
    }
    if(entregador == null){
        System.out.println("Não foi definido entregador!");
        return;
    }

    status = "SAIU PARA ENTREGA";
    System.out.println("Pedido saiu para entrega!");

    }

    public void finalizarPedido(){
        double total= calcularTotal();

        if (!status.equals(("SAIU PARA ENTREGA")){
            System.out.println(" O pedido não saiu para entrega para ser finalizado!");
            return;
        }
        System.out.println("\n---------- FINALIZANDO O PEDIDO ----------");

        pagamento.pago(total);   /// chamando abstração , especializa o método da abstração , faz polimorfismo///
        status = "ENTREGUE";
                                 //polimorfismo(classe abstrata)//

        entrega.iniciarEntrega();
        entrega.realizarEntrega();

        System.out.println("Pedido finalizado com sucesso!");
    }
    /// //RESUMO////

    public void exibirResumo() {
        System.out.println(("\n----------RESUMO DO PEDIDO----------"));
        System.out.println("Pedido#" + idPedido);
        System.out.println("Cliente:   " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Status do pedido:" + status);

        System.out.println("Itens: ");
        for (ItensPedido item : itens) {
            System.out.println("-" + item);
        }
        System.out.println("Total: R$" + String.format("%.2f", calcularTotal()));

        if(pagamento != null){
            System.out.println( "Pagamento:" + pagamento.getPagamento());

        }

        if (entrega != null){
            System.out.println(("Entrega:" + entrega.getClass().getSimpleName()));

        }

        if(entregador != null){
            System.out.println("Entregador:" + entregador.getNome());
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (ItensPedido item : itens){
            total += item.subTotal();

        }
        return total;

    }

    }

}
