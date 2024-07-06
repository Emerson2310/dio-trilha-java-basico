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
        for(Item i: itens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itens.remove(i);
            }
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!itens.isEmpty()){
            for(Item i:itens) {
                double valorItem = i.getPreco() * i.getQtde();
                valorTotal =+ valorItem;
            }
        }else{
            System.out.println("A lista está vazia");
        }
        return valorTotal;
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

        c1.calcularValorTotal();

        c1.removerItem("roteador");

        c1.exibirItens();
    }
}
