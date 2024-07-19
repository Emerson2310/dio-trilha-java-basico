import java.util.function.Consumer;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        operacao = 002;
    }


    public void imprimirExtrato() {
        System.out.println("\nExtrato conta corrente");
        super.imprimirExtrato();
    }
}
