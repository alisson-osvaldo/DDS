
package model;

public class TipoServico {
    private String servico;
    private Integer minutosDuracao;
    private Double valorServico;

    public Integer getMinutosDuracao() {
        return minutosDuracao;
    }

    public void setMinutosDuracao(Integer minutosDuracao) {
        this.minutosDuracao = minutosDuracao;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    @Override
    public String toString() {
        return "TipoServico{" + "servico=" + servico + ", minutosDuracao=" + minutosDuracao + ", valorServico=" + valorServico + '}';
    }

}
