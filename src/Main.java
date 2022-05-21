import models.Endereco;
import models.Gerente;
import models.OperadorDeCaixa;
import models.Vendedor;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua Benedito Barbosa, 41",
                "Casa", "Cohab Francisco Merlini");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Alexandre Siqueira Pereira");
        vendedor.setDocumento("122.123.234-34");
        vendedor.setValorSalario(1222.00);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2.0);
        System.out.println(vendedor);
        System.out.println("---- ----- -------");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Poliana Alves Pereira",
                "111.111.111-11", 1600.00, endereco);
        System.out.println(operadorDeCaixa);

        System.out.println("---- ----- -------");

        Gerente gerente = new Gerente();
        gerente.setNome("Jesuino Alves Pereira");
        gerente.setDocumento("222.222.222-22");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(40);
        gerente.setValorHora(180.00);
        gerente.caculaRemuneracao();
        gerente.calculaBonificacao(3.0);
        System.out.println(gerente);

    }
}
