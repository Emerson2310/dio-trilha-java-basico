package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private String codigoDoConvite;

    public Convidado(String nome, String codigoDoConvite) {
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoDoConvite() {
        return codigoDoConvite;
    }

    @Override
    public String toString() {
        return "\n\nConvidado{" +
                "nome='" + nome + '\'' +
                ", codigoDoConvite='" + codigoDoConvite + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return Objects.equals(getCodigoDoConvite(), convidado.getCodigoDoConvite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoDoConvite());
    }
}
