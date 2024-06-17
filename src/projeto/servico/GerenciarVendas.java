package projeto.servico;

import projeto.modelo.Venda;

public interface GerenciarVendas {
    void registrarVenda(Venda venda);
    void gerarRelatorioVendas();
}

