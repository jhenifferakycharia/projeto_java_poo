package projeto.modelo;

public class Desconto {
    private double percentual;
    private String descricao;

    public Desconto(double percentual, String descricao) {
        this.percentual = percentual;
        this.descricao = descricao;
    }

    public double getPercentual() { return percentual; }
    public String getDescricao() { return descricao; }

    public double aplicarDesconto(double valor) {
        return valor - (valor * (percentual / 100));
    }
}
 
