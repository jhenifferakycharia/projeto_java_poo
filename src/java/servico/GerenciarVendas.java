package java.servico;

import java.modelo.Venda;

public interface GerenciarVendas {
    void registrarVenda(Venda venda);
    void gerarRelatorioVendas();
}

