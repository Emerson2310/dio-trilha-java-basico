package list.operacoesBasicas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Comprar Leite");
        lista.adicionarTarefa("Regar as plantas");
        lista.adicionarTarefa("Fazer café");
        lista.adicionarTarefa("Pagar conta de luz");

        lista.removerTarefa("fazer café");

        System.out.println("Número de tarefas : " + lista.obterNumeroDeTarefas());

        lista.obterDescricaoDeTarefas();

    }
}