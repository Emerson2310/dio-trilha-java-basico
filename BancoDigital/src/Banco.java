import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    protected List<Conta> contasPorBanco;

    Cliente cliente;

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarConta (Cliente cliente){
        contasPorBanco = new ArrayList<>(cliente.contasPorCliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContasPorBanco() {
        return contasPorBanco;
    }

    public void setContasPorBanco(List<Conta> contasPorBanco) {
        this.contasPorBanco = contasPorBanco;
    }

    public void imprimirContasPorBanco(){
        System.out.println("\nBanco: " + getNome());
        for (Conta c: contasPorBanco){
            System.out.println("\nTitular: " + c.cliente.getNome());
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
