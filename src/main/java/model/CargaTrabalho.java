
package model;

import java.security.Timestamp;

public class CargaTrabalho {
    private Funcionario funcionario;
    private Timestamp horaInicio;
    private Timestamp horaFim;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timestamp getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Timestamp horaFim) {
        this.horaFim = horaFim;
    }

    @Override
    public String toString() {
        return "CargaTrabalho{" + "funcionario=" + funcionario + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + '}';
    }
    
}
