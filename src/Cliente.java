public class Cliente extends Usuarios {
    protected String endereco;


    public Cliente(int idUsuario, String nome, String CPF, String email, String senha, String telefone, String tipoUsuario, String endereco) {
        super(idUsuario, nome, CPF, email, senha, telefone, tipoUsuario);
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Endereco:" + endereco;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}