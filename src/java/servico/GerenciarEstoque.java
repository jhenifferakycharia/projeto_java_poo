package java.servico;

import java.modelo.Produto;

public interface GerenciarEstoque {
    void adicionarProduto(Produto produto);
    void removerProduto(int produtoId);
    void atualizarProduto(Produto produto);
    Produto pesquisarProduto(int produtoId);
}
 
