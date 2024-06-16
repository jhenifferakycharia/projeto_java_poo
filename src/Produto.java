class Produto {
    private String nome;
    private String categoria;
    private Fornecedor fornecedor;
    private double preco;
    private int quantidadeEmEstoque;
    private String descricao;

    public Produto(String nome, String categoria, Fornecedor fornecedor, double preco, int quantidadeEmEstoque, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
