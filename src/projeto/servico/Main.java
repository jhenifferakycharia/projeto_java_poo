package projeto.servico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import projeto.modelo.*;

public class Main {
    public static void main(String[] args) {
        SistemaLoja sistemaLoja = new SistemaLoja();

        // Criar alguns fornecedores
        Fornecedor fornecedor1 = new Fornecedor(1, "Fornecedor 1", "fornecedor1@example.com");
        Fornecedor fornecedor2 = new Fornecedor(2, "Fornecedor 2", "fornecedor2@example.com");

        // Criar alguns produtos
        Produto produto1 = new Produto(1, "Produto 1", "Categoria 1", fornecedor1, 100.0, 50, "Descrição do Produto 1");
        Produto produto2 = new Produto(2, "Produto 2", "Categoria 2", fornecedor2, 200.0, 30, "Descrição do Produto 2");

        // Adicionar produtos ao sistema
        sistemaLoja.adicionarProduto(produto1);
        sistemaLoja.adicionarProduto(produto2);

        // Criar um vendedor e um cliente
        Vendedor vendedor = new Vendedor(1, "pVendedor 1", "vendedor1@example.com");
        Cliente cliente = new Cliente(1, "Cliente 1", "cliente1@example.com");

        // Criar uma venda
        List<Produto> produtosVendidos = new ArrayList<>();
        produtosVendidos.add(produto1);
        produtosVendidos.add(produto2);

        Desconto desconto = new Desconto(10.0, "Desconto de 10%");

        Venda venda = new Venda(1, new Date(), produtosVendidos, vendedor, cliente, desconto);

        // Registrar a venda no sistema
        sistemaLoja.registrarVenda(venda);

        // Gerar relatórios
        sistemaLoja.gerarRelatorioVendas();
        sistemaLoja.gerarRelatorioEstoque();
    }
} 
