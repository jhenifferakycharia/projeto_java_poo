class Fornecedor extends Usuario {
    public Fornecedor(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Fornecedor: " + getNome() + ", Email: " + getEmail());
    }
}