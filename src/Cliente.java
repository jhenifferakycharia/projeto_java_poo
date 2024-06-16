class Cliente extends Usuario {
    public Cliente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Cliente: " + getNome() + ", Email: " + getEmail());
    }
}
