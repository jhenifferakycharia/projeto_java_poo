package projeto.servico;

import projeto.modelo.Produto;

public interface GerenciarEstoque {
    void adicionarProduto(Produto produto);
    void removerProduto(int produtoId);
    void atualizarProduto(Produto produto);
    Produto pesquisarProduto(int produtoId);
}
 
