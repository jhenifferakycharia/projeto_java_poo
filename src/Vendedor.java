class Vendedor extends Usuario {
    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Vendedor: " + getNome() + ", Email: " + getEmail());
    }
}
