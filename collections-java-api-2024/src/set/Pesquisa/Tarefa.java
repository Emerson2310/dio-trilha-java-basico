package set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean isConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return isConcluida;
    }

    public void setConcluida(boolean concluida) {
        isConcluida = concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public String toString() {
        return "\nTarefa{" +
                "descricao = '" + descricao + '\'' +
                ",Foi realizada = " + isConcluida +
                '}';
    }
}
