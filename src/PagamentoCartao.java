public class PagamentoCartao implements Pagamento {
    public boolean pago (double valor){
        System.out.println("Pagamento via Cartâo aprovado");
        return true;
    }
    public String getPagamento(){
        return "Cartão";
    }
}
