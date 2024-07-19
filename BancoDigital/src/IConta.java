import java.util.function.Consumer;

public interface IConta {

    void depositar(double deposito);
    void sacar(double saque);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
