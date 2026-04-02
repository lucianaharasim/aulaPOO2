public class Produto {
    private int idProduto;
    public String nomeProduto;
    public String descriçao;
    protected double preco;
    public Categoria categoria;

    public Produto(int idProduto,String nomeProduto,
                   String descricao,double preco, Categoria categoria){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descriçao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }
    public double getPreco(){
        return preco;
    }
    public String getNomeProduto(){
        return nomeProduto;
    }
}
