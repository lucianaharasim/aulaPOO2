public class PagamentoPix implements Pagamento{
    public boolean pago(double valor){
        System.out.println("Pagamento via Pix aprovado");
        return true;

    }
    public String getPagamento(){
        return "PIX";
    }
}
