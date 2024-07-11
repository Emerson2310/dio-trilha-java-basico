package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoDePalavrasUnicas {

    private Set<String> palavras;


    public ConjuntoDePalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra (String palavra){
        this.palavras.add(palavra);
    }

    public void removerPalavra (String palavra){
        String palavraParaRemover = null;

        if(!palavras.isEmpty()){
            for(String p: palavras){
                if(p.equalsIgnoreCase(palavra)){
                    palavraParaRemover = p;
                }
            }
        }
        palavras.remove(palavraParaRemover);
    }

    public void verificarPalavra (String palavra){
        if(!palavras.isEmpty()){
            for (String p: palavras){
                if(p.equalsIgnoreCase(palavra)){
                    System.out.println("A palavra " + p + " está no conjunto.");
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "ConjuntoDePalavrasUnicas{" +
                "palavras=" + palavras +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoDePalavrasUnicas that)) return false;
        return palavras.equals(that.palavras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavras);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }

    public static void main(String[] args) {

        ConjuntoDePalavrasUnicas c1 = new ConjuntoDePalavrasUnicas();

        c1.adicionarPalavra("Designação");
        c1.adicionarPalavra("Imaginação");
        c1.adicionarPalavra("Contaminação");
        c1.adicionarPalavra("Declaração");
        c1.adicionarPalavra("Posição");
        c1.adicionarPalavra("Armação");
        c1.adicionarPalavra("Indignação");
        c1.adicionarPalavra("Evolução");
        c1.adicionarPalavra("Poluição");
        c1.adicionarPalavra("Habitação");

        c1.removerPalavra("habitação");

        c1.verificarPalavra("Lalaland");

        c1.exibirPalavrasUnicas();
    }
}
