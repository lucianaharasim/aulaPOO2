public class EntregaMoto extends Entrega{

    public EntregaMoto(Pedido pedido){
        super(pedido);
    }
    @Override
    public void  realizarEntrega(){
        System.out.println("Entrega sendo realizada por MOTO!");
    }

}

