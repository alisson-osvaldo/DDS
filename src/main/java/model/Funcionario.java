
package model;

import java.util.Objects;

public class Funcionario {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + '}';
    }
    
    
}
