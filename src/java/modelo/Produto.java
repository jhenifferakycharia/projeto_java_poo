package java.modelo;

public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private Fornecedor fornecedor;
    private double preco;
    private int quantidadeEmEstoque;
    private String descricao;

    public Produto(int id, String nome, String categoria, Fornecedor fornecedor, double preco, int quantidadeEmEstoque, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.descricao = descricao;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public Fornecedor getFornecedor() { return fornecedor; }
    public double getPreco() { return preco; }
    public int getQuantidadeEmEstoque() { return quantidadeEmEstoque; }
    public String getDescricao() { return descricao; }

    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) { this.quantidadeEmEstoque = quantidadeEmEstoque; }
}
 
