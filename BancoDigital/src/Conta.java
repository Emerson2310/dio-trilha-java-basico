import java.util.ArrayList;
import java.util.List;

public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int operacao;
    private int agencia;
    private int numero;
    private double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.operacao = 001;
        this.cliente = cliente;
    }
    @Override
    public void depositar(double deposito) {
        saldo += deposito;
    }

    @Override
    public void sacar(double saque) {
        if(saque <= saldo){
            saldo -= saque;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getOperacao() {
        return operacao;
    }

    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Operação: %d", this.operacao));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
