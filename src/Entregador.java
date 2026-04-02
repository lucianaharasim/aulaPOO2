public class Entregador extends Usuarios {
    public boolean disponivel;
    public Entregador(int idUsuario, String nome, String CPF, String email, String senha, String telefone, String tipoUsuario, boolean disponivel) {
        super(idUsuario, nome, CPF, email, senha, telefone, tipoUsuario);
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Disponivel:" + (disponivel ? "Sim": "Nao");
    }
}
