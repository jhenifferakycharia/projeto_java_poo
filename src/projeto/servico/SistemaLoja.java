package projeto.servico;

import java.util.ArrayList;
import java.util.List;

import projeto.modelo.*;

public class SistemaLoja implements GerenciarEstoque, GerenciarVendas {
    private List<Produto> produtos;
    private List<Venda> vendas;

    public SistemaLoja() {
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(int produtoId) {
        produtos.removeIf(produto -> produto.getId() == produtoId);
    }

    @Override
    public void atualizarProduto(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == produto.getId()) {
                produtos.set(i, produto);
                break;
            }
        }
    }

    @Override
    public Produto pesquisarProduto(int produtoId) {
        for (Produto produto : produtos) {
            if (produto.getId() == produtoId) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public void registrarVenda(Venda venda) {
        vendas.add(venda);
        // Atualiza a quantidade em estoque dos produtos vendidos
        for (Produto produto : venda.getProdutos()) {
            Produto produtoEmEstoque = pesquisarProduto(produto.getId());
            if (produtoEmEstoque != null) {
                produtoEmEstoque.setQuantidadeEmEstoque(produtoEmEstoque.getQuantidadeEmEstoque() - 1);
            }
        }
    }

    @Override
    public void gerarRelatorioVendas() {
        System.out.println("Relatório de Vendas:");
        for (Venda venda : vendas) {
            System.out.println("ID da Venda: " + venda.getId());
            System.out.println("Data: " + venda.getData());
            System.out.println("Vendedor: " + venda.getVendedor().getNome());
            System.out.println("Cliente: " + venda.getCliente().getNome());
            System.out.println("Produtos Vendidos:");
            for (Produto produto : venda.getProdutos()) {
                System.out.println(" - " + produto.getNome() + " | Preço: " + produto.getPreco());
            }
            if (venda.getDesconto() != null) {
                System.out.println("Desconto Aplicado: " + venda.getDesconto().getDescricao() + " (" + venda.getDesconto().getPercentual() + "%)");
            }
            System.out.println("Valor Total: " + venda.getValorTotal());
            System.out.println("-----------");
        }
    }

    public void gerarRelatorioEstoque() {
        System.out.println("Relatório de Estoque:");
        for (Produto produto : produtos) {
            System.out.println("ID do Produto: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Fornecedor: " + produto.getFornecedor().getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("-----------");
        }
    }
}
 
