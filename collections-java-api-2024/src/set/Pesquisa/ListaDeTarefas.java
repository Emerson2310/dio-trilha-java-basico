package set.Pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaDeTarefas {

    private Set<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa (String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao){
        if(!tarefas.isEmpty()){
            for(Tarefa t: tarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefas.remove(t);
                    break;
                }
            }
        }else{
            System.out.println("Lista vazia");
        }
    }

    public void exibirTarefas (){
        System.out.println(tarefas);
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefas.isEmpty()){
            for (Tarefa t: tarefas){
                if(t.isConcluida() == true){
                    tarefasConcluidas.add(t);
                }
            }
        }else{
            System.out.println("Lista está vazia");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefas.isEmpty()){
            for (Tarefa t: tarefas){
                if(t.isConcluida() == false){
                    tarefasPendentes.add(t);
                }
            }
        }else{
            System.out.println("Lista está vazia");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefas.isEmpty()){
            for(Tarefa t: tarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                }
            }
        }else{
            System.out.println("Lista está vazia");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefas.isEmpty()){
            for(Tarefa t: tarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                }
            }
        }else{
            System.out.println("Lista está vazia");
        }
    }

    public void limparListaTarefas(){
        tarefas.removeAll(tarefas);
    }

    public static void main(String[] args) {

        ListaDeTarefas l1 = new ListaDeTarefas();

        l1.adicionarTarefa("Comprar panelas");
        l1.adicionarTarefa("Lavar o carro");
        l1.adicionarTarefa("Estudar programação");
        l1.adicionarTarefa("Comprar comida");
        l1.adicionarTarefa("Aprender a fazer comida");

        l1.exibirTarefas();

        System.out.println(l1.contarTarefas());

        l1.removerTarefa("comprar comida");
        l1.exibirTarefas();

        System.out.println(l1.contarTarefas());

        l1.marcarTarefaConcluida("comprar panelas");

        System.out.println(l1.obterTarefasConcluidas());

        l1.marcarTarefaPendente("Comprar Panelas");
        System.out.println(l1.obterTarefasPendentes());
    }
}
