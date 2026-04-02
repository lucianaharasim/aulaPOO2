public class ItensPedido {
    private int idItensPedido;
    protected Produto produto;
    protected int quantidade;
    protected double precoUnitario;

    public ItensPedido(int idItensPedido,Produto produto, int quantidade){
        this.idItensPedido = idItensPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();


    }

    public double subTotal(){
        return precoUnitario * quantidade;
    }

}
