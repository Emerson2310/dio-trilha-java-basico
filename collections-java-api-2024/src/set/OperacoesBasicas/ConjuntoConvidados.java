package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado (String nome, String codigoDoConvite){
        convidadosSet.add(new Convidado(nome, codigoDoConvite));
    }

    public void removerConvidadoPorCodigo (String codigo){
        Convidado convidadoParaRemover = null;
        if(!convidadosSet.isEmpty()){
            for(Convidado c: convidadosSet){
                if(c.getCodigoDoConvite() == codigo){
                    convidadoParaRemover = c;
                    break;
                }
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contagemDeConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados cc1 = new ConjuntoConvidados();

        cc1.adicionarConvidado("Emerson", "451612");
        cc1.adicionarConvidado("Jorge", "451613");
        cc1.adicionarConvidado("Lucas", "451614");
        cc1.adicionarConvidado("Carlos", "451615");
        cc1.adicionarConvidado("Charles", "451616");
        cc1.adicionarConvidado("Julio", "451617");


        System.out.println(cc1.contagemDeConvidados());

    }

}
