import java.util.ArrayList;
import java.util.List;

class SistemaDeControle {
    private List<Usuario> usuarios;
    private List<Produto> produtos;
    private List<Venda> vendas;

    public SistemaDeControle() {
        usuarios = new ArrayList<>();
        produtos = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário adicionado: " + usuario.getNome());
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    public void registrarVenda(Venda venda) {
        vendas.add(venda);
        System.out.println("Venda registrada: " + venda.getData());
    }

    public List<Produto> pesquisarProdutos(String nome) {
        List<Produto> resultados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultados.add(produto);
            }
        }
        return resultados;
    }

    public void gerarRelatorioDeVendas() {
        for (Venda venda : vendas) {
            System.out.println("Data: " + venda.getData() + ", Cliente: " + venda.getCliente().getNome() + ", Valor Total: " + venda.getValorTotal());
        }
    }

    public void gerarRelatorioDeEstoque() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
        }
    }
}
