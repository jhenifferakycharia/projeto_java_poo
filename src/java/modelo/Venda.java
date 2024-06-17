package java.modelo;

import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private Date data;
    private List<Produto> produtos;
    private Vendedor vendedor;
    private Cliente cliente;
    private double valorTotal;
    private Desconto desconto;

    public Venda(int id, Date data, List<Produto> produtos, Vendedor vendedor, Cliente cliente, Desconto desconto) {
        this.id = id;
        this.data = data;
        this.produtos = produtos;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.desconto = desconto;
        this.valorTotal = calcularValorTotal();
    }

    public int getId() { return id; }
    public Date getData() { return data; }
    public List<Produto> getProdutos() { return produtos; }
    public Vendedor getVendedor() { return vendedor; }
    public Cliente getCliente() { return cliente; }
    public double getValorTotal() { return valorTotal; }
    public Desconto getDesconto() { return desconto; }

    private double calcularValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        if (desconto != null) {
            total = desconto.aplicarDesconto(total);
        }
        return total;
    }
}
 
