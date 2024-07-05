package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List <Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao){
        List<Tarefa> listParaRemover = new ArrayList<>();
        for (Tarefa t: listaDeTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                listParaRemover.add(t);
            }
            listaDeTarefas.removeAll(listParaRemover);
        }
    }

    public int obterNumeroDeTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricaoDeTarefas(){
       System.out.println(listaDeTarefas);
    }
}

