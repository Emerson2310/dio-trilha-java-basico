import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private Conta conta;

    protected List<Conta> contasPorCliente;

    public Cliente(String nome) {
        this.nome = nome;
        this.contasPorCliente = new ArrayList<>();
    }

    public void adicionarContas(Conta c){
        contasPorCliente.add(c);
    }

    public Conta getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirContasPorTitular(){
            System.out.println("Titular: " + getNome());
        for (Conta c: contasPorCliente){
            if(c.getOperacao() == 02){
                System.out.println("\nConta Corrente");
            }else if(c.getOperacao() == 03){
                System.out.println("\nConta Poupança");
            }else{
                System.out.println("\nConta Salário");
            }
            System.out.println("\nAgencia: " + c.getAgencia());
            System.out.println("Operação: " + c.getOperacao());
            System.out.println("Número: " + c.getNumero());
            System.out.println("Saldo: " + c.getSaldo());
        }
    }
}
