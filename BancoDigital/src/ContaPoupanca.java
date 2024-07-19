import java.util.function.Consumer;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        operacao = 003;
    }

    public void imprimirExtrato() {
        System.out.println("\nExtrato conta poupança");
        super.imprimirExtrato();
    }
}
