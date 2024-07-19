public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        operacao = 002;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente");
        System.out.println("\n");
        super.imprimirExtrato();
    }
}
