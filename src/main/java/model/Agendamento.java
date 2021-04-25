
package model;

import java.security.Timestamp;
import java.util.ArrayList;

public class Agendamento {
    private Timestamp dataHoraInicio;
    private ArrayList<TipoServico> tipoServicos;
    private Cliente cliente;
    private Funcionario funcionario;

    public Timestamp getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Timestamp dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public ArrayList<TipoServico> getTipoServicos() {
        return tipoServicos;
    }

    public void setTipoServicos(ArrayList<TipoServico> tipoServicos) {
        this.tipoServicos = tipoServicos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "dataHoraInicio=" + dataHoraInicio + ", tipoServicos=" + tipoServicos + ", cliente=" + cliente + ", funcionario=" + funcionario + '}';
    }
    
    
}
