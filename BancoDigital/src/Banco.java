import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    protected List<Conta> contasPorBanco;

    Cliente cliente;

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarContas (Cliente cliente){
        contasPorBanco = new ArrayList<>(cliente.contasPorCliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirContasPorBanco(){
        System.out.println("\nBanco: " + getNome());
        contasPorBanco.stream().forEach(Conta::imprimirExtrato);
    }

}
