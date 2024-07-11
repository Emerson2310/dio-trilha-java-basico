package set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno (Long matricula){
        Aluno alunoParaRemover = null;
        if(!alunos.isEmpty()){
            for(Aluno al: alunos){
                if(al.getMatricula() == matricula) {
                    alunoParaRemover = al;
                    break;
                }
            }
            alunos.remove(alunoParaRemover);
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
        if(alunoParaRemover == null){
            System.out.println("A matrícula não foi encontrada");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        if(!alunos.isEmpty()){
            System.out.println(alunosPorNome);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunos.isEmpty()) {
            alunosPorNota.addAll(alunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Enzo", 120L, 4.5);
        alunos.adicionarAluno("Maria", 121L, 8.5);
        alunos.adicionarAluno("João", 122L, 9.5);
        alunos.adicionarAluno("Raul", 123L, 10.0);
        alunos.adicionarAluno("José", 124L, 7.4);
        alunos.adicionarAluno("Jorge", 125L, 8.2);

        alunos.exibirAlunosPorNome();
        alunos.exibirAlunosPorNota();
        alunos.removerAluno(125L);
        alunos.exibirAlunos();
    }
}
