import java.util.Date;
import java.util.List;

class Venda {
    private Date data;
    private List<Produto> produtos;
    private Vendedor vendedor;
    private Cliente cliente;
    private double valorTotal;

    public Venda(Date data, List<Produto> produtos, Vendedor vendedor, Cliente cliente) {
        this.data = data;
        this.produtos = produtos;
        this.vendedor = vendedor;
        this.cliente = cliente;
        calcularValorTotal();
    }

    private void calcularValorTotal() {
        valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
    }

    public Date getData() {
        return data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
