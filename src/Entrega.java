public abstract class Entrega {
    protected Pedido pedido;

    public Entrega(Pedido pedido){
        this.pedido = pedido;
    }
    public void iniciarEntrega(){
        System.out.println("preparando entrega do pedido #"+ pedido.getId());

        }
        public abstract void realizarEntrega();

    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }
}

