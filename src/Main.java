import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaDeControle sistema = new SistemaDeControle();
        Scanner scanner = new Scanner(System.in);
        
        // Adicionar usuários
        Gerente gerente = new Gerente("Alice", "alice@loja.com", "1234");
        sistema.adicionarUsuario(gerente);
        System.out.println("Gerente adicionado: Alice");

        Vendedor vendedor = new Vendedor("Bob", "bob@loja.com", "5678");
        sistema.adicionarUsuario(vendedor);
        System.out.println("Vendedor adicionado: Bob");

        Cliente cliente = new Cliente("Charlie", "charlie@cliente.com", "abcd");
        sistema.adicionarUsuario(cliente);
        System.out.println("Cliente adicionado: Charlie");

        Fornecedor fornecedor = new Fornecedor("Empresa X", "contato@empresax.com", "12345678");
        sistema.adicionarUsuario(fornecedor);
        System.out.println("Fornecedor adicionado: Empresa X");

        // Adicionar produtos
        Produto produto1 = new Produto("Camiseta", "Roupas", fornecedor, 50.0, 100, "Camiseta 100% algodão");
        sistema.adicionarProduto(produto1);
        System.out.println("Produto adicionado: Camiseta");

        Produto produto2 = new ProdutoComDesconto("Calça Jeans", "Roupas", fornecedor, 100.0, 50, "Calça jeans unissex");
        sistema.adicionarProduto(produto2);
        System.out.println("Produto adicionado: Calça Jeans");

        // Registrar venda
        List<Produto> produtosVendidos = new ArrayList<>();
        produtosVendidos.add(produto1);
        produtosVendidos.add(produto2);

        Venda venda = new Venda(new Date(), produtosVendidos, vendedor, cliente);
        sistema.registrarVenda(venda);
        System.out.println("Venda registrada.");

        // Gerar relatórios
        System.out.println("Relatório de Vendas:");
        sistema.gerarRelatorioDeVendas();
        
        System.out.println("Relatório de Estoque:");
        sistema.gerarRelatorioDeEstoque();

        // Aplicar desconto
        ((ProdutoComDesconto) produto2).aplicarDesconto(10);
        System.out.println("Novo preço da Calça Jeans com desconto: " + produto2.getPreco());
        
        // Interação com o usuário
        System.out.println("Digite o nome do produto que deseja pesquisar:");
        String nomeProduto = scanner.nextLine();
        List<Produto> resultados = sistema.pesquisarProdutos(nomeProduto);
        
        if (resultados.isEmpty()) {
            System.out.println("Nenhum produto encontrado com o nome: " + nomeProduto);
        } else {
            System.out.println("Produtos encontrados:");
            for (Produto produto : resultados) {
                System.out.println(produto.getNome() + " - " + produto.getDescricao() + " - Preço: " + produto.getPreco());
            }
        }
    }
}
