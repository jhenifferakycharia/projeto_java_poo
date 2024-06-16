class Caixa extends Usuario {
    public Caixa(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Caixa: " + getNome() + ", Email: " + getEmail());
    }
}
