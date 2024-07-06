package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens;
    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem (String nome, double preco, int qtde){
        itens.add(new Item(nome, preco, qtde));
    }

    public void removerItem (String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                   itensParaRemover.add(i);
                }
            }
            itens.removeAll(itensParaRemover);
        }else{
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itens.isEmpty()) {
            for (Item item : itens) {
                double valorItem = item.getPreco() * item.getQtde();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
       if (!itens.isEmpty()){
           System.out.println(itens.toString());
       }
    }

    public static void main(String[] args) {
        Carrinho c1 = new Carrinho();

        c1.adicionarItem("Notebook", 2545.45, 1);
        c1.adicionarItem("Roteador", 154.16, 2);
        c1.adicionarItem("Smartphone", 1500.45, 4);

        System.out.println(c1.calcularValorTotal());

        c1.removerItem("roteador");

        c1.exibirItens();
    }
}
