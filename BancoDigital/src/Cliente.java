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
        for (Conta c: contasPorCliente){
            System.out.println("\n");
            if(c.getOperacao() == 02){
                c.imprimirExtrato();
            }else if(c.getOperacao() == 03){
                c.imprimirExtrato();
            }else{
                c.imprimirExtrato();
            }
        }
    }
}
