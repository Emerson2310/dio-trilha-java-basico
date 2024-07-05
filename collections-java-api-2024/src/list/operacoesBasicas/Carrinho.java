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
            if(nome.equalsIgnoreCase(i.getNome())){
                itens.remove(i);
            }
        }
    }
}
