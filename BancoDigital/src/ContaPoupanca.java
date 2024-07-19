public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        operacao = 003;
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta poupança");
        System.out.println("\n");
        super.imprimirExtrato();
    }
}
