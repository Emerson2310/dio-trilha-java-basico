package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    List<Livro> livrosList = new ArrayList<>();

    public Catalogo() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livrosList.add(new Livro(titulo,autor,ano));
    }

    public List<Livro> pesquisarPorAutor (String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> livrosPorIntervaloDeTempo(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getAno()>= anoInicial && l.getAno()<= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if (!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        Catalogo c1 = new Catalogo();
        c1.adicionarLivro("Honra ou vendetta","Silvio Lancellotti", 2001);
        c1.adicionarLivro("O Iluminado","Stephen King", 1980);
        c1.adicionarLivro("Carrie a estranha", "Stephen King", 1961);
        c1.adicionarLivro("Guerra civil", "Steven Mcniven", 2007);

        System.out.println(c1.pesquisarPorAutor("Stephen King"));
        System.out.println(c1.livrosPorIntervaloDeTempo(1980,2004));
        System.out.println(c1.pesquisarPorTitulo("carrie a estranha"));

    }
}
