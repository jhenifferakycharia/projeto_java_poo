package projeto.servico;

import projeto.modelo.Cliente;
import projeto.modelo.Desconto;
import projeto.modelo.Fornecedor;
import projeto.modelo.Produto;
import projeto.modelo.Venda;
import projeto.modelo.Vendedor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        SistemaLoja sistemaLoja = new SistemaLoja();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema de Gestão de Loja");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Pesquisar Produto");
            System.out.println("5. Registrar Venda");
            System.out.println("6. Gerar Relatório de Vendas");
            System.out.println("7. Gerar Relatório de Estoque");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("ID do Produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Categoria do Produto: ");
                    String categoria = scanner.nextLine();
                    System.out.print("ID do Fornecedor: ");
                    int fornecedorId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Fornecedor: ");
                    String nomeFornecedor = scanner.nextLine();
                    System.out.print("Email do Fornecedor: ");
                    String emailFornecedor = scanner.nextLine();
                    Fornecedor fornecedor = new Fornecedor(fornecedorId, nomeFornecedor, emailFornecedor);
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em Estoque: ");
                    int quantidadeEmEstoque = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Descrição do Produto: ");
                    String descricao = scanner.nextLine();

                    Produto produto = new Produto(id, nome, categoria, fornecedor, preco, quantidadeEmEstoque, descricao);
                    sistemaLoja.adicionarProduto(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("ID do Produto a remover: ");
                    int produtoIdRemover = scanner.nextInt();
                    sistemaLoja.removerProduto(produtoIdRemover);
                    System.out.println("Produto removido com sucesso!");
                    break;

                case 3:
                    System.out.print("ID do Produto a atualizar: ");
                    int produtoIdAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo Nome do Produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Nova Categoria do Produto: ");
                    String novaCategoria = scanner.nextLine();
                    System.out.print("Novo ID do Fornecedor: ");
                    int novoFornecedorId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo Nome do Fornecedor: ");
                    String novoNomeFornecedor = scanner.nextLine();
                    System.out.print("Novo Email do Fornecedor: ");
                    String novoEmailFornecedor = scanner.nextLine();
                    Fornecedor novoFornecedor = new Fornecedor(novoFornecedorId, novoNomeFornecedor, novoEmailFornecedor);
                    System.out.print("Novo Preço do Produto: ");
                    double novoPreco = scanner.nextDouble();
                    System.out.print("Nova Quantidade em Estoque: ");
                    int novaQuantidadeEmEstoque = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nova Descrição do Produto: ");
                    String novaDescricao = scanner.nextLine();

                    Produto produtoAtualizado = new Produto(produtoIdAtualizar, novoNome, novaCategoria, novoFornecedor, novoPreco, novaQuantidadeEmEstoque, novaDescricao);
                    sistemaLoja.atualizarProduto(produtoAtualizado);
                    System.out.println("Produto atualizado com sucesso!");
                    break;

                case 4:
                    System.out.print("ID do Produto a pesquisar: ");
                    int produtoIdPesquisar = scanner.nextInt();
                    Produto produtoEncontrado = sistemaLoja.pesquisarProduto(produtoIdPesquisar);
                    if (produtoEncontrado != null) {
                        System.out.println("Produto Encontrado:");
                        System.out.println("ID: " + produtoEncontrado.getId());
                        System.out.println("Nome: " + produtoEncontrado.getNome());
                        System.out.println("Categoria: " + produtoEncontrado.getCategoria());
                        System.out.println("Fornecedor: " + produtoEncontrado.getFornecedor().getNome());
                        System.out.println("Preço: " + produtoEncontrado.getPreco());
                        System.out.println("Quantidade em Estoque: " + produtoEncontrado.getQuantidadeEmEstoque());
                        System.out.println("Descrição: " + produtoEncontrado.getDescricao());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    // Lógica para registrar uma venda, similar aos casos anteriores
                    break;

                case 6:
                    sistemaLoja.gerarRelatorioVendas();
                    break;

                case 7:
                    sistemaLoja.gerarRelatorioEstoque();
                    break;

                case 8:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
