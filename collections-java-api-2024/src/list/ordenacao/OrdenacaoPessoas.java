package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> pessoas = new ArrayList<>();

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa (String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas o1 = new OrdenacaoPessoas();

        o1.adicionarPessoa("Joâo", 15, 1.90);
        o1.adicionarPessoa("Paulo", 31, 1.57);
        o1.adicionarPessoa("Christiano", 37, 1.74);
        o1.adicionarPessoa("Alex", 34, 1.58);
        o1.adicionarPessoa("Gabriel", 21, 1.90);
        o1.adicionarPessoa("Murilo", 30, 1.78);

        System.out.println(o1.ordernarPorAltura());
        System.out.println(o1.ordernarPorIdade());
    }
}
