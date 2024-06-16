class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Gerente: " + getNome() + ", Email: " + getEmail());
    }
}