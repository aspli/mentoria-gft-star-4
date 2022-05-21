package models;

import models.CalculaBonificacao;
import models.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        valorBonificacao = this.valorSalario * (porcentagemBonificacao/100.0);
    }

    @Override
    public String toString() {
        return "models.Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }
}
