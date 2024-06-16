class ProdutoComDesconto extends Produto implements AplicavelDesconto {
    public ProdutoComDesconto(String nome, String categoria, Fornecedor fornecedor, double preco, int quantidadeEmEstoque, String descricao) {
        super(nome, categoria, fornecedor, preco, quantidadeEmEstoque, descricao);
    }

    @Override
    public void aplicarDesconto(double percentual) {
        double novoPreco = getPreco() * (1 - percentual / 100);
        setPreco(novoPreco);
    }
}
